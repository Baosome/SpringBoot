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
     *  Make System list page []
     *  Add list of system to user name []
     *  Thus need to fix system entity to incude username as key []
     *  Add For Each table in welcome jsp []
     * 
     */
}
