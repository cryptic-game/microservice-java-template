package net.cryptic_game.microservice.template;

import org.apache.log4j.BasicConfigurator;

import net.cryptic_game.microservice.MicroService;

public class App extends MicroService {

	public App() {
		super("template");
	}

	public static void main(String[] args) {
		BasicConfigurator.configure();

		new App();
	}

}
