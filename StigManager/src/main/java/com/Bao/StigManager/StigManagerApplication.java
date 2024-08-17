package com.Bao.StigManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StigManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StigManagerApplication.class, args);
	}
    /*
     * TODOS:
     *  Added user name [X]
     *  Make user name persistance [X]
     *  Make System list page [X]
     *  Add list of system to user name [X]
     *  Thus need to fix system entity to incude username as key [X]
     *  Add For Each table in welcome jsp [X]
     * 
     */
}
