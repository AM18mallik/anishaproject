package com.electronicstore.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.electronicstore.entity.User;
import com.electronicstore.repository.UserRepository;
@SpringBootTest
class UserServiceTestImpl {
@Mock
UserRepository userRepository;
@InjectMocks
UserServiceImpl userServiceImpl;
	@Test
	@Disabled
	void testAddUser() {
		fail("Not yet implemented");
	}

	@Test
	void testGetAllUser() throws Exception {
		 User sampleInput = new User("A", "A", "user");
	        User expectedOutput = new User("A", "A", "user");
	        // Object obj = new Object();
	        BDDMockito.given(userServiceImpl.addUser(sampleInput)).willReturn(expectedOutput);

	       // when
	        User actualOutput = userServiceImpl.addUser(sampleInput);

	       // verify
	        assertEquals(expectedOutput, actualOutput);
	}

	@Test
	@Disabled
	void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	@Disabled
	void testGetUserByUserName() {
		fail("Not yet implemented");
	}

	@Test
	@Disabled
	void testGetUserByRole() {
		fail("Not yet implemented");
	}

}
