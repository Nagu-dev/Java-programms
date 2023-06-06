package com.furnitureapp.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.furnitureapp.model.Furniture;

public class FurnitureMapper implements RowMapper<Furniture>{

	@Override
	public Furniture mapRow(ResultSet rs, int rowNum) throws SQLException {
		Furniture furniture=new Furniture();
		furniture.setName(rs.getString("name"));
		furniture.setFurnitureId(rs.getInt("FurnitureId"));
		furniture.setColor(rs.getString("color"));
		furniture.setCategory(rs.getString("category"));
		furniture.setPrice(rs.getDouble("price"));
		furniture.setBrand(rs.getString("brand"));
		furniture.setMaterial(rs.getString("category"));
		return furniture;
	}

}
