package com.springjpademo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springjpademo.entity.FacebookUser;

public interface FacebookDAOInterface extends JpaRepository<FacebookUser, Long>{

	@Query("from com.springjpademo.entity.FacebookUser fu where fu.name=:uname")
	public List<FacebookUser> findByName(String uname);
	
}
