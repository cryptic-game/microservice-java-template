package net.cryptic_game.microservice.template;

import net.cryptic_game.microservice.MicroService;
import net.cryptic_game.microservice.db.Database;
import org.apache.log4j.BasicConfigurator;

public class App extends MicroService {

	private App() {
		super("template");

		// if needed
		new Database();
	}

	public static void main(String[] args) {
		BasicConfigurator.configure();

		new App();
	}

}
