package com.furnitureapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.furnitureapp.exceptions.FurnitureNotFoundException;
import com.furnitureapp.model.Furniture;
import com.furnitureapp.repository.IFurnitureRepository;
@Service
public class FurnitureServiceImpl implements IFurnitureService{

	@Autowired
	private IFurnitureRepository furnitureRepository;
	
	
	public FurnitureServiceImpl(IFurnitureRepository furnitureRepository) {
		super();
		this.furnitureRepository=furnitureRepository;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addFurniture(Furniture furniture) {
		furnitureRepository.addFurniture(furniture);
		
	}

	@Override
	public void updateFurniture(int furnitureId, double price) {
		furnitureRepository.updateFurniture(furnitureId, price);
	}

	@Override
	public void deleteFurniture(int furnitureId) {
		furnitureRepository.deleteFurniture(furnitureId);
		
	}

	@Override
	public List<Furniture> getAll() {
		List<Furniture>furnitures=furnitureRepository.findAll();
		return furnitures;
	}

	@Override
	public Optional<Furniture> getById(int FurnitureId) throws FurnitureNotFoundException {
		Object furnitures=furnitureRepository.findById(FurnitureId);
		if(furnitures==null)
			throw new FurnitureNotFoundException();
		return null;
	}

	@Override
	public List<Furniture> getByCategory(String category) throws FurnitureNotFoundException {
		
		List<Furniture> furnitures=furnitureRepository.findByCategory(category);
		if(furnitures.isEmpty())
			throw new FurnitureNotFoundException();
		return furnitures;
	}

	@Override
	public List<Furniture> getByPriceLessThan(double price) throws FurnitureNotFoundException {
		List<Furniture> furnitures=furnitureRepository.findByPriceLessThan(price);
		if(furnitures.isEmpty())
			throw new FurnitureNotFoundException();
		return furnitures;
	}

	@Override
	public List<Furniture> getByColorAndBrand(String color, String brand) throws FurnitureNotFoundException {
		List<Furniture> furnitures=furnitureRepository.findByColorAndBrand(color, brand);
		if(furnitures.isEmpty())
			throw new FurnitureNotFoundException();
		return furnitures;
	}

	@Override
	public List<Furniture> getByMaterialAndPrice(String material, double price) throws FurnitureNotFoundException {
		List<Furniture> furnitures=furnitureRepository.findByMaterialAndPrice(material, price);
		if(furnitures.isEmpty())
			throw new FurnitureNotFoundException();
		return furnitures;
	}

}