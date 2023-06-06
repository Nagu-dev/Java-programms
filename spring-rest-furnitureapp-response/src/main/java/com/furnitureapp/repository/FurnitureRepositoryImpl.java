package com.furnitureapp.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import com.furnitureapp.model.Furniture;
@Repository
public class FurnitureRepositoryImpl implements IFurnitureRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void addFurniture(Furniture furniture) {
		String sql="insert into Furniture(name,color,brand,category,price,material,furnitureId)"
				+"values(?,?,?,?,?,?,FURNITURESEQ.NEXTVAL)";
		Object[] furnitureArray= {furniture.getName(),furniture.getColor(),furniture.getBrand(),furniture.getCategory(),furniture.getPrice(),furniture.getMaterial()};
		jdbcTemplate.update(sql,furnitureArray);
		
	}

	@Override
	public void updateFurniture(int furnitureId, double price) {
		String sql="update furniture set furnitureId=? where price=?";
		jdbcTemplate.update(sql,furnitureId,price);
		
	}

	@Override
	public void deleteFurniture(int furnitureId) {
		String sql="delete furniture where furnitureId=?";
		jdbcTemplate.update(sql,furnitureId);
		
	}

	@Override
	public List<Furniture> findAll() {
		String sql="select * from furniture";
		
		return jdbcTemplate.query(sql, new FurnitureMapper());
	}

	@Override
	public Furniture findById(int furnitureId) {
		String sql="select * from where furnitureId=?";
return jdbcTemplate.queryForObject(sql, (rs,rownum)->   //using lambda expression
		
		{
			Furniture furniture=new Furniture();
			furniture.setName(rs.getString("name"));
			furniture.setFurnitureId(rs.getInt("furnitureId"));
			furniture.setBrand(rs.getString("brand"));
			furniture.setCategory(rs.getString("category"));
			furniture.setPrice(rs.getDouble("price"));
			furniture.setMaterial(rs.getString("material"));
			furniture.setColor(rs.getString("color"));
			return furniture;
		},furnitureId
				);
	}

	@Override
	public List<Furniture> findByCategory(String category) {
		String sql="select * from where category=?";
		return (List<Furniture>) jdbcTemplate.queryForObject(sql, (rs,rownum)->   //using lambda expression
				
				{
					Furniture furniture=new Furniture();
					furniture.setName(rs.getString("name"));
					furniture.setFurnitureId(rs.getInt("furnitureId"));
					furniture.setBrand(rs.getString("brand"));
					furniture.setCategory(rs.getString("category"));
					furniture.setPrice(rs.getDouble("price"));
					furniture.setMaterial(rs.getString("material"));
					furniture.setColor(rs.getString("color"));
					return furniture;
				},category
						);	
	}

	@Override
	public List<Furniture> findByPriceLessThan(double price) {
		String sql="select * from furniture where price<?";
		return jdbcTemplate.query(sql, new FurnitureMapper(),price); 
	}

	@Override
	public List<Furniture> findByColorAndBrand(String color, String brand) {
		String sql="select * from book where color=? and brand like?";
		return jdbcTemplate.query(sql, new FurnitureMapper(),color,"%"+brand+"%");  
	}

	@Override
	public List<Furniture> findByMaterialAndPrice(String material, double price) {
		String sql="select * from book where material=? and price like?";
		return jdbcTemplate.query(sql, new FurnitureMapper(),material,"%"+price+"%");  
	}
	
	
}