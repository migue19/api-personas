package com.intersphere.learn.apipersonacore.konos.actions;

import com.intersphere.learn.apipersonacore.konos.ApiPersonaCoreBox;
import com.intersphere.learn.apipersonacore.konos.schemas.PersonModel;
import io.intino.alexandria.exceptions.*;
import java.time.*;
import java.util.*;


public class GetPersonaAction implements io.intino.alexandria.rest.RequestErrorHandler {
	public ApiPersonaCoreBox box;
	public io.intino.alexandria.http.spark.SparkContext context;

	public List<PersonModel> execute() throws BadRequest, NotFound {
		List<PersonModel> list = new ArrayList();
		PersonModel person = new PersonModel();
		person.name("Miguel");
		person.lastName("Mexicano");
		person.age(32);
		PersonModel person2 = new PersonModel();
		person2.name("Juan");
		person2.lastName("Perez");
		person2.age(18);
		list.add(person);
		list.add(person2);
		return list;
	}

	public void onMalformedRequest(Throwable e) throws AlexandriaException {
		//TODO
		throw new BadRequest("Malformed request");
	}
}