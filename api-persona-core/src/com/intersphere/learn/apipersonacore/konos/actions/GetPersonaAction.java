package com.intersphere.learn.apipersonacore.konos.actions;

import com.intersphere.learn.apipersonacore.konos.ApiPersonaCoreBox;
import io.intino.alexandria.exceptions.*;
import java.time.*;
import java.util.*;


public class GetPersonaAction implements io.intino.alexandria.rest.RequestErrorHandler {
	public ApiPersonaCoreBox box;
	public io.intino.alexandria.http.spark.SparkContext context;

	public com.intersphere.learn.apipersonacore.konos.schemas.PersonModel execute() throws BadRequest, NotFound {
		return "Soy Api Persona";
	}

	public void onMalformedRequest(Throwable e) throws AlexandriaException {
		//TODO
		throw new BadRequest("Malformed request");
	}
}