package com.sapient.util;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Parser {
	private static Parser parser;
	static {
		Logger log = Logger.getLogger(Parser.class.getClass().getName());
		BasicConfigurator.configure();
		log.setLevel(Level.TRACE);
		log.trace("Parser Object created");
		parser = new Parser();
	}

	private Parser() {

	}

	public static Parser getInstance() {
		return parser;
	}
}
