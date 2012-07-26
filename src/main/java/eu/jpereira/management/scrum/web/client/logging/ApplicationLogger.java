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
