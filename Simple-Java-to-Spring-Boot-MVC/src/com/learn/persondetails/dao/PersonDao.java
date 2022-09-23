package com.learn.persondetails.dao;

import com.learn.persondetails.Person;

public interface PersonDao {
	void createPersonTable();

	void savePersonData(Person person);

	Person getPersonDetailsByPersonNumber(int personNumber);

	void updatePersonDetails(Person person, int personNumber);

	void deletePerson(int personNumber);

	void deletePersonTable();
}
