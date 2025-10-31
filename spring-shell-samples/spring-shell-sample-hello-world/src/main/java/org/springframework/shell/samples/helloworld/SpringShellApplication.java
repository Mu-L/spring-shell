package org.springframework.shell.samples.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.shell.core.command.annotation.Command;
import org.springframework.shell.core.command.annotation.EnableCommand;
import org.springframework.shell.core.command.annotation.Option;

@SpringBootApplication
@EnableCommand(SpringShellApplication.class)
@Command
public class SpringShellApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringShellApplication.class, args);
	}

	@Command
	public String hello(@Option(defaultValue = "World") String name) {
		return "Hello " + name + "!";
	}

}