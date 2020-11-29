package com.hello.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.common.util.JdbcUtil;
import com.hello.dao.ProductDao;
import com.hello.pojo.Product;

public class ProductDaoImpl implements ProductDao {

	@Override
	public List<Product> listAll() {
		String sql = "select * from Product";
		Connection conn = JdbcUtil.getConnection();
		ArrayList<Product> result = new ArrayList<Product>();
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Product p = new Product();
				p.setId(rs.getInt("id"));
				p.setName(rs.getString("name"));
				p.setPrice(rs.getFloat("price"));
				result.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

}
