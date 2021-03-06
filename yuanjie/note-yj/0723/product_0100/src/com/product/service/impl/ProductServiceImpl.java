package com.product.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.product.connection.ConnectionDB;
import com.product.model.ProductModel;
import com.product.service.ProductService;

public class ProductServiceImpl implements ProductService {

	public ProductServiceImpl() {
		ConnectionDB conndb = new ConnectionDB();
		conn = conndb.getConnection();
	}

	Connection conn;
	PreparedStatement ps;
	ResultSet result;
	int ret;

	@Override
	public Boolean add() {
		return null;
	}

	@Override
	public Boolean delete(int id) {
		String sql = "delete from tb_product where id=?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1,id);
			ret = ps.executeUpdate();
			if(ret>0){
				return true; 
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
	}

	@Override
	public Boolean update(int count,int id) {
		String sql = "update tb_product set count=? where id=?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1,count);
			ps.setInt(2,id);
			ret = ps.executeUpdate();
			if(ret > 0){
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	@Override
	public List<ProductModel> queryAll() {
		String sql = "select * from tb_product";
		List<ProductModel> list = new ArrayList<ProductModel>();
		try {
			ps = conn.prepareStatement(sql);
			result = ps.executeQuery();
			while(result.next()){
				ProductModel model = new ProductModel();
				model.setId(result.getInt("ID"));
				model.setCode(result.getString("CODE"));
				model.setCount(result.getInt("COUNT"));
				model.setPrice(result.getDouble("PRICE"));
				model.setName(result.getString("NAME"));
				list.add(model);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			result.close();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<ProductModel> queryByName(String name) {
		String sql = "select * from tb_product where name=?";
		List<ProductModel> list = new ArrayList<ProductModel>();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1,name);
			result = ps.executeQuery();
			while(result.next()){
				ProductModel model = new ProductModel();
				model.setId(result.getInt("ID"));
				model.setCode(result.getString("CODE"));
				model.setCount(result.getInt("COUNT"));
				model.setPrice(result.getDouble("PRICE"));
				model.setName(result.getString("NAME"));
				list.add(model);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			result.close();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public ProductModel queryByCode(String code) {
		
		String sql = "select * from tb_product where code=?";
		ProductModel model = new ProductModel();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1,code);
			result = ps.executeQuery();
			while(result.next()){
				model.setId(result.getInt("ID"));
				model.setCode(result.getString("CODE"));
				model.setCount(result.getInt("COUNT"));
				model.setPrice(result.getDouble("PRICE"));
				model.setName(result.getString("NAME"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			result.close();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return model;
	}
	
	

}
