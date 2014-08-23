package com.github.neverbolt.bserver.commands;

/**
 * 
 * @author Neverbolt
 * @version 0.1
 * 
 * Select one or more bots via flags or ID's
 */
public class Select implements Command {

	@Override
	public void run(String... params) {
		if(params.length<2||params.length>3) {
			System.out.println("usage: select [-flag | -id] selector ...");
			return;
		}
		
		System.out.println(params.length-1);
	}
}
