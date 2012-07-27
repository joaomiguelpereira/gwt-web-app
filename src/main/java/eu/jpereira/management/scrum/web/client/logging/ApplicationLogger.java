/*
 * Copyright (c) 2012 Joao Pereira
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package eu.jpereira.management.scrum.web.client.logging;

public class ApplicationLogger implements Logger {

	private ApplicationLogger() {

	}

	
	public static ApplicationLogger getLogger(@SuppressWarnings("rawtypes") Class clazz) {
		// TODO: Provide a decent implementation of some kind of logger that
		// will send stuff to anywhere i want
		return new ApplicationLogger();
	}


	public void debug(String string) {
	    System.out.println("Starting application");
	    
    }

}
