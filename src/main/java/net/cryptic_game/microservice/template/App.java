package net.cryptic_game.microservice.template;

import net.cryptic_game.microservice.MicroService;
import org.apache.log4j.BasicConfigurator;

public class App extends MicroService {

	private App() {
		super("template");
	}

	public static void main(String[] args) {
		BasicConfigurator.configure();

		new App();
	}

}
