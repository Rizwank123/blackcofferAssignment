package com.blackcoffer.repositroy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blackcoffer.entity.UserData;

public interface UserDataRepo extends JpaRepository<UserData, Long> {

}
