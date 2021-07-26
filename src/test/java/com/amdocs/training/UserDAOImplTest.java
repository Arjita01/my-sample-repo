package com.amdocs.training;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.amdocs.training.dao.UserDAO;
import com.amdocs.training.dao.impl.UserDAOImpl;
import com.amdocs.training.model.User;

class UserDAOImplTest {
	static UserDAO dao=null;
	@BeforeAll
	public static void init() {
		dao=new UserDAOImpl();
	}
	@AfterAll
	public static void destroy() {
		dao=null;
	}
	@Test
public void test_find_all_users_success() {
		List<User> users=dao.findAll();
		assertEquals(5,users.size());
	}
}
