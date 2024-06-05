package com.intersphere.learn.apipersonacore.konos.actions;

import com.intersphere.learn.apipersonacore.konos.ApiPersonaCoreBox;
import io.intino.alexandria.exceptions.*;
import java.time.*;
import java.util.*;
import com.intersphere.learn.apipersonacore.konos.schemas.*;
import org.apache.http.HttpStatus;

public class PostPersonaAction implements io.intino.alexandria.rest.RequestErrorHandler {
	public ApiPersonaCoreBox box;
	public io.intino.alexandria.http.spark.SparkContext context;
	public com.intersphere.learn.apipersonacore.konos.schemas.PersonModel request;

	public ResponseModel execute() throws BadRequest, NotFound {
		PersonModel request = this.request;
		if(request != null) {
			if(request.age() == 0) {
				ResponseModel responseModel = new ResponseModel();
				responseModel.statusCode(400);
				responseModel.statusMessage("La edad no puede ser 0");
				return responseModel;
			}
		} else {
			throw new BadRequest("Json Malformado");
//			ResponseModel responseModel = new ResponseModel();
//			responseModel.statusCode(400);
//			responseModel.statusMessage("Json MalFormado");
//			return responseModel;
		}
		ResponseModel responseModel = new ResponseModel();
		responseModel.statusCode(HttpStatus.SC_CREATED);
		responseModel.statusMessage("Se creo Persona");
		box.addPerson(request);
		return responseModel;
	}

	public void onMalformedRequest(Throwable e) throws AlexandriaException {
		//TODO
		throw new BadRequest("Malformed request");
	}
}