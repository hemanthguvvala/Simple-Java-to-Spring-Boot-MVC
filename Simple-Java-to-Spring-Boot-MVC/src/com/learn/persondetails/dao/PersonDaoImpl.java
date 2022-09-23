package com.learn.persondetails.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.learn.persondetails.Person;

public class PersonDaoImpl implements PersonDao {

	Connection connection = null;
	PreparedStatement stmt = null;
	ResultSet rs = null;

	public Connection getConnection() {

		String userName = "root";
		String password = "hemanth";
		String url = "jdbc:mysql://localhost:3306/hemanth";
		String className = "com.mysql.cj.jdbc.Driver";
		try {
			Class.forName(className);
			connection = DriverManager.getConnection(url, userName, password);
		} catch (Exception e) {

		}

		return connection;
	}

	@Override
	public void createPersonTable() {
		// TODO Auto-generated method stub

	}

	@Override
	public void savePersonData(Person person) {
		// TODO Auto-generated method stub

	}

	@Override
	public Person getPersonDetailsByPersonNumber(int personNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updatePersonDetails(Person person, int personNumber) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePerson(int personNumber) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePersonTable() {
		// TODO Auto-generated method stub

	}

}
