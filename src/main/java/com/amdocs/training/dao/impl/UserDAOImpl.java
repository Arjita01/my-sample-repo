package com.amdocs.training.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.amdocs.training.dao.UserDAO;
import com.amdocs.training.model.User;
import com.amdocs.training.util.DBUtil;

public class UserDAOImpl implements UserDAO {

	Connection conn = DBUtil.getConnection();

	public List<User> findAll() {
		List<User> users = new ArrayList<User>();
		String sql = "select * from user";
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				long id = rs.getLong("user_id");
				String name = rs.getString("name");
				String password = rs.getString("password");
				String email = rs.getString("email");
				String photo = rs.getString("upload_photo");
				String address = rs.getString("address");
				String regdate = rs.getString("reg_date");
				Long phone = rs.getLong("phone_no");
				User user = new User(id,name,phone,email,address,regdate,password,photo);
	
				users.add(user);
			}
			return users;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public boolean addUser(User user) {
		String query = "insert into user values(?,?,?,?,?,?,?,?)";

		try {
			PreparedStatement ps = conn.prepareStatement(query);
            ps.setLong(1, user.getUser_id());
			ps.setString(2, user.getName());
			ps.setLong(3, user.getPhone_no());
			ps.setString(4, user.getEmail());
			ps.setString(5, user.getAddress());
			ps.setString(8, user.getUpload_photo());
			ps.setString(6, user.getReg_date());
			ps.setString(7, user.getPassword());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public User getUserById(Long id) {
		String query="select * FROM user WHERE user_id = ?";
		try {
			PreparedStatement ps = conn.prepareStatement(query);
            ps.setLong(1, id);
           ResultSet rs=ps.executeQuery();
           rs.next();
         long userid = rs.getLong("user_id");
		String name = rs.getString("name");
		String password = rs.getString("password");
		String email = rs.getString("email");
		String photo = rs.getString("upload_photo");
		String address = rs.getString("address");
		String regdate = rs.getString("reg_date");
		long phone = rs.getLong("phone_no");
		
		User user = new User(userid,name,phone,email,address,regdate,password,photo);
           return user;
           
      } catch (SQLException e) {
			e.printStackTrace();
	}
	return null;
	}

	public boolean deleteUser(Long id) {
		String query="DELETE FROM user WHERE user_id = ?";
		try {
			PreparedStatement ps = conn.prepareStatement(query);
            ps.setLong(1, id);
            if (ps.executeUpdate() > 0)
                return true;
         
      } catch (SQLException e) {
			e.printStackTrace();
	}
	return false;
	}

	public boolean updateUser(User user) {
		String query="update user set name=?, address=? ,password=? ,email=?, reg_date=?,phone_no=?,upload_photo=? WHERE user_id = ?";
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, user.getName());
		 	ps.setString(2, user.getAddress());
		    ps.setString(3, user.getPassword());
		    ps.setString(4, user.getEmail());
		    ps.setString(5, user.getReg_date());
		    ps.setLong(6, user.getPhone_no());
		    ps.setString(7, user.getUpload_photo());
		    ps.setLong(8, user.getUser_id());
            ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
				
		return false;
	}
	}




