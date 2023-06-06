package com.furnitureapp.service;

import java.util.List;
import java.util.Optional;


import com.furnitureapp.exceptions.FurnitureNotFoundException;
import com.furnitureapp.model.Furniture;



public interface IFurnitureService {
	void addFurniture(Furniture furniture);
	void updateFurniture(int furnitureId,double price);
	void deleteFurniture(int furnitureId);
List<Furniture>getAll();
Optional<Furniture> getById(int FurnitureId) throws FurnitureNotFoundException;
List<Furniture>getByCategory(String category)throws FurnitureNotFoundException;
List<Furniture>getByPriceLessThan(double price)throws FurnitureNotFoundException;
List<Furniture>getByColorAndBrand(String color,String brand)throws FurnitureNotFoundException;
List<Furniture>getByMaterialAndPrice(String material,double price)throws FurnitureNotFoundException;


}
