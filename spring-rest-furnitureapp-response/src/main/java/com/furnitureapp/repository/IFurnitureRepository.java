package com.furnitureapp.repository;

import java.util.List;
import java.util.Optional;

import com.furnitureapp.model.Furniture;

public interface IFurnitureRepository {
	void addFurniture(Furniture furniture);
	void updateFurniture(int furnitureId,double price);
	void deleteFurniture(int furnitureId);
List<Furniture>findAll();
Object findById(int furnitureId);
List<Furniture>findByCategory(String category);
List<Furniture>findByPriceLessThan(double price);
List<Furniture>findByColorAndBrand(String color,String brand);
List<Furniture>findByMaterialAndPrice(String material,double price);

}
