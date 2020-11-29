package com.common.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hello.dao.ConstomerDao;
import com.hello.pojo.Constomer;

public class TestJdbcUtil {

	public TestJdbcUtil() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Connection con = JdbcUtil.getConnection();

		assert con != null;
		String sql = "select * from Constomer";
		List<Constomer> list = new ArrayList<Constomer>();
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet result_set = ps.executeQuery();
			while (result_set.next()) {
				Constomer c = new Constomer();
				c.setId(result_set.getInt("id"));
				c.setAccount(result_set.getString("account"));
				c.setNickname(result_set.getString("Nickname"));
				c.setPasswd(result_set.getString("Passwd"));
				list.add(c);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(Constomer c:list) {
			System.out.println(c);
		}

	}
}
