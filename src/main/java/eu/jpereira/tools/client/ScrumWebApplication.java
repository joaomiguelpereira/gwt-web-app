package eu.jpereira.tools.client;

import com.google.gwt.user.client.Window;

import eu.jpereira.tools.client.logging.ApplicationLogger;

public class ScrumWebApplication implements WebApplication {

	private final static ApplicationLogger LOG = ApplicationLogger.getLogger(ScrumWebApplication.class);

	public void start(WebApplicationProperties properties) {
		Window.alert("hey..");
		LOG.debug("Hey, Im starting");
	}

}
