package com.furnitureapp.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.furnitureapp.model.Furniture;
import com.furnitureapp.service.IFurnitureService;

@RestController
@RequestMapping("/furnitures-api")
public class FurnitureController {
	
	
	@Autowired
	private IFurnitureService furnitureService;

	public FurnitureController(IFurnitureService furnitureService) {
		super();
		// TODO Auto-generated constructor stub
		this.furnitureService=furnitureService;
	}
//	http://localhost:8080/furnitures-api/furnitures
//	{
//
//		"name":"chair",
//		"color":"black",
//		"price":23434.89,
//		"material":"plastic",
//		"category":"hall",
//		"brand":"fabrics"
//
//		}
	@PostMapping("/furnitures")
	ResponseEntity<Void> addFurniture(@RequestBody Furniture furniture) {
		furnitureService.addFurniture(furniture);
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("info", "adding one furniture all furniture");
		return ResponseEntity.status(HttpStatus.CREATED).headers(httpHeaders).build();

	}
	@PutMapping("/furnitures")
	ResponseEntity<Void> updateAllFurniture(@RequestBody Furniture furniture) {
		furnitureService.updateFurniture(furniture.getFurnitureId(), furniture.getPrice());
		return ResponseEntity.accepted().build();
	}
	

	@PatchMapping("/furnitures/furnituresId/{furnituresId}/price/{price}")
	ResponseEntity<Void> updateFurinture(@PathVariable("furnitureId") int furnitureId, @PathVariable("price") double price) {
		furnitureService.updateFurniture(furnitureId, price);
		return ResponseEntity.accepted().build();
	}
	
	@PostMapping("/furnitures/furnitureId/{furnitureId}")
	ResponseEntity<Void> deleteFurniture(@PathVariable("furnitureId") int furnitureId) {
		furnitureService.deleteFurniture(furnitureId);
		return ResponseEntity.accepted().build();
	}
	
	
	@GetMapping("/furnitures")
	ResponseEntity<List<Furniture>> getAll() {
		List<Furniture> furnitures = furnitureService.getAll();
		HttpHeaders headers = new HttpHeaders();
		headers.add("info", "returning all furnitures");
		headers.add("desc", "furniture from database");
		ResponseEntity<List<Furniture>> responseEntity = new ResponseEntity<List<Furniture>>(furnitures, headers,HttpStatus.OK);
		return responseEntity;
	}
	
	@GetMapping("/furnitures/furnitureId/{furnitureId}")
	public ResponseEntity<Optional<Furniture>> gteById(@PathVariable("furnitureId") int furnitureId) {
		Optional<Furniture> furniture = furnitureService.getById(furnitureId);
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("info", "returning one furniture by id");
		return ResponseEntity.status(HttpStatus.OK).headers(httpHeaders).body(furniture);

	}


	@GetMapping("/furnitures/category/{category}")
	ResponseEntity<List<Furniture>> getByCategory(@PathVariable("category") String category) {
		List<Furniture> furnitures = furnitureService.getByCategory(category);
		return ResponseEntity.ok(furnitures);

	}
	
	@GetMapping("/furnitures/price/{price}")
	ResponseEntity<List<Furniture>> getByPriceLessThan(@PathVariable("price") double price) {
		List<Furniture> furnitures = furnitureService.getByPriceLessThan(price);
		return ResponseEntity.ok(furnitures);
	}

	
	@GetMapping("/furnitures/color/{color}/brand/{brand}")
	ResponseEntity<List<Furniture>> getByColorAndBrand(@PathVariable("color") String color,@PathVariable("brand") String brand) {
		
		
		List<Furniture>furnitures=furnitureService.getByColorAndBrand(color, brand);
		return ResponseEntity.ok(furnitures);
	}

	@GetMapping("/furnitures/material/{material}/price/{price}")
	ResponseEntity<List<Furniture>>getByMaterialAndPrice(@PathVariable("material") String material,@PathVariable("price") double price)
	{
		List<Furniture>furnitures=furnitureService.getByMaterialAndPrice(material, price);
		return ResponseEntity.ok(furnitures);
	}
	}

