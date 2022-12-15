package com.electronicstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.electronicstore.entity.Profile;
@Repository
public interface ProfileRepository extends JpaRepository<Profile, Integer>,ProfileCustomRepository{

}
