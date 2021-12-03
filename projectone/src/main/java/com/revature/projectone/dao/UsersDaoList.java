package com.revature.projectone.dao;

import java.util.List;

import com.revature.projectone.pojo.UsersPojo;

import exception.ApplicationException;

public interface UsersDaoList {

	UsersPojo userProfile(int Id)throws ApplicationException;
	UsersPojo updateUserProfile(UsersPojo userPojo)throws ApplicationException;
	UsersPojo logIn(UsersPojo userPojo)throws ApplicationException;
	UsersPojo register(UsersPojo userPojo)throws ApplicationException;
	List<UsersPojo> allEmployees()throws ApplicationException;
	UsersPojo getUserByName(UsersPojo userPojo) throws ApplicationException;

}


