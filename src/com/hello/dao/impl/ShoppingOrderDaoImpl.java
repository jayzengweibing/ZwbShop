package com.hello.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.common.util.JdbcUtil;
import com.hello.dao.ShoppingOrderDao;
import com.hello.pojo.ShoppingOrder;

public class ShoppingOrderDaoImpl implements ShoppingOrderDao {

	@Override
	public List<ShoppingOrder> listAllShoppingOrder() {
		String sql1 = "select * from  ShoppingOrder";
		Connection conn1 = JdbcUtil.getConnection();
		List<ShoppingOrder> result1 = new ArrayList<ShoppingOrder>();
		try {
			PreparedStatement ps1 = conn1.prepareStatement(sql1);
			ResultSet rs1 = ps1.executeQuery();
			while (rs1.next()) {
				ShoppingOrder p1 = new ShoppingOrder();
				p1.setId(rs1.getInt("id"));
				p1.setCustomer_id(rs1.getInt("customer_id"));
				p1.setProduct_id(rs1.getInt("product_id"));

				p1.setStatus(rs1.getInt("status"));
				p1.setAddress(rs1.getString("address"));
				p1.setTelephone(rs1.getString("telephone"));
				result1.add(p1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result1;
	}

	@Override
	public boolean insert(ShoppingOrder order) {
		String sql = String.format("insert into ShoppingOrder(%s,%s,%s,%s,%s) values(%d,'%s','%s',%d,%d)",
				"customer_id", "address", "telephone", "product_id", "status", order.getCustomer_id(),
				order.getAddress(), order.getTelephone(), order.getProduct_id(), order.getStatus());
		return false;
	}

}
