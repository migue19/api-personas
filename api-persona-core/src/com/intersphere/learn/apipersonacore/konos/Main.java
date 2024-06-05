package com.intersphere.learn.apipersonacore.konos;

public class Main {
	public static void main(String[] args) {
		ApiPersonaCoreBox box = new ApiPersonaCoreBox(args);
		io.intino.magritte.framework.Graph graph = new io.intino.magritte.framework.Graph().loadStashes("ApiPersonaCore");
		box.start();
		Runtime.getRuntime().addShutdownHook(new Thread(box::stop));
	}
}