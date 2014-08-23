package com.github.neverbolt.bserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.github.neverbolt.bserver.commands.CommandHandler;

public class InputHandler {
	private BufferedReader clIn;
	private CommandHandler commands;
	
	public InputHandler() {
		clIn = new BufferedReader(new InputStreamReader(System.in));
		commands = new CommandHandler();
	}
	
	public void run() {
		String temp;
		System.out.print("> ");
		while(!(temp = readLine()).toLowerCase().equals("exit")) {
			execute(temp);
			
			System.out.print("> ");
		}
		
		System.out.println("Shutting down!");
	}
	
	public String readLine() {
		String temp = null;
		try {
			temp = clIn.readLine();
		} catch (IOException e) {
			System.out.println("There has been an error with your command");
		}
		return temp;
	}
	
	private void execute(String input) {
		commands.run(input);
	}
}
