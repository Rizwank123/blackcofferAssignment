package com.blackcoffer.repositroy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blackcoffer.entity.UserData;

@Repository
public interface UserDataRepo extends JpaRepository<UserData, Long> {

}
