package com.intersphere.learn.apipersonacore.konos;

import com.intersphere.learn.apipersonacore.konos.schemas.PersonModel;

import java.util.ArrayList;
import java.util.List;

public class ApiPersonaCoreBox extends AbstractBox {
	private List<PersonModel> personList = new ArrayList();
	public ApiPersonaCoreBox(String[] args) {
		this(new ApiPersonaCoreConfiguration(args));
	}

	public ApiPersonaCoreBox(ApiPersonaCoreConfiguration configuration) {
		super(configuration);
	}

	@Override
	public io.intino.alexandria.core.Box put(Object o) {
		super.put(o);
		return this;
	}

	public void beforeStart() {

	}

	public void afterStart() {

	}

	public void beforeStop() {

	}

	public void afterStop() {

	}

	public List<PersonModel> getPersonList() {
		return personList;
	}

	public void setPersonList(List<PersonModel> personList) {
		this.personList = personList;
	}
	public  void addPerson(PersonModel personModel) {
		personList.add(personModel);
	}
}