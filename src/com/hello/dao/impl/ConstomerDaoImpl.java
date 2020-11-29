package com.hello.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.common.util.JdbcUtil;
import com.hello.dao.ConstomerDao;
import com.hello.pojo.Constomer;

public class ConstomerDaoImpl implements ConstomerDao {

	public ConstomerDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Constomer find(Integer id) {
		// TODO Auto-generated method stub
		String sql = "select * from constomer where id=" + id;

		Connection con = JdbcUtil.getConnection();
		PreparedStatement ps;
		Constomer result = null;
		try {
			ps = con.prepareStatement(sql);
			ResultSet eq = ps.executeQuery();
			if (eq.next()) {
				result = new Constomer();
				result.setId(eq.getInt("ID"));
				result.setAccount(eq.getString("account"));
				result.setPasswd(eq.getString("Passwd"));
				result.setNickname(eq.getString("Nicname"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public Constomer findByAccount(String account) {
		// TODO Auto-generated method stub
		String acc = "select * from Constomer where account='" + account + "'";
		Connection con = JdbcUtil.getConnection();
		Constomer result1 = null;
		PreparedStatement pr;
		try {
			pr = con.prepareStatement(acc);
			ResultSet eq1 = pr.executeQuery();
			
			if (eq1.next()) {
				result1=new Constomer();
				result1.setId(eq1.getInt("ID"));
				result1.setAccount(eq1.getString("account"));
				result1.setPasswd(eq1.getString("Passwd"));
				result1.setNickname(eq1.getString("Nicname"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result1;

	}

}
