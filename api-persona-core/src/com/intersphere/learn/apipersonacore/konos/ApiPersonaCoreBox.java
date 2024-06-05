package com.intersphere.learn.apipersonacore.konos;

public class ApiPersonaCoreBox extends AbstractBox {

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
}