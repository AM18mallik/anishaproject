package com.electronicstore.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.electronicstore.entity.Profile;
import com.electronicstore.repository.ProfileRepository;

@SpringBootTest
class ProfileServiceImpl {
	@Mock
	ProfileRepository profileRepository;
	
	@InjectMocks
	ProfileServiceImpl profileServiceImpl;
	@Test
	void testAddProfile() {
		fail("Not yet implemented");
	}

	@Test
	void testGetProfileByFullName() {
		fail("Not yet implemented");
	}

	@Test
	void testGetAllProfiless() {
		fail("Not yet implemented");
	}

	@Test
	void testGetProfileByCity() {
		fail("Not yet implemented");
	}

	@Test
	void testGetProfileByCountry() {
		fail("Not yet implemented");
	}

	@Test
	void testGetProfileByState() {
		fail("Not yet implemented");
	}

	@Test
	void testGetProfileByFullNameAndCity() {
		fail("Not yet implemented");
	}

	@Test
	void testDelete() {
		fail("Not yet implemented");
	}

}
