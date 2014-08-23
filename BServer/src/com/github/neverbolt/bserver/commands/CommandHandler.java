package com.github.neverbolt.bserver.commands;

import java.util.HashMap;

public class CommandHandler {
	private HashMap<String, Command> commands;
	
	/**
	 * Initialize the command list
	 */
	public CommandHandler() {
		commands = new HashMap<String, Command>();
		commands.put("select", new Select());
	}
	
	public void run(String input) {
		String[] parts = input.split(" ");
		// Check if any parameter has been passed at all
		if(parts.length>=1&&!input.trim().isEmpty()) {
			// Check for if the command exists
			if(commands.containsKey(parts[0].toLowerCase())) {
				// Fetch the command and execute
				commands.get(parts[0].toLowerCase()).run(parts);
			} else {
				System.out.println(parts[0] + ": command not found");
			}
		}
	}
}
