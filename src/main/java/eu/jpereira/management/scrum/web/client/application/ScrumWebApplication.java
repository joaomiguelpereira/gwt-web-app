package eu.jpereira.management.scrum.web.client.application;

import eu.jpereira.management.scrum.web.client.logging.ApplicationLogger;
import eu.jpereira.management.scrum.web.client.view.ClientView;

import javax.inject.Inject;

public class ScrumWebApplication implements WebApplication {

	private final static ApplicationLogger LOG = ApplicationLogger.getLogger(ScrumWebApplication.class);

	@Inject
	private ClientView clientView;

	public void start(WebApplicationProperties properties) {

		LOG.debug("Hey, initializing Client view...");
		//get the main client container
		clientView.render();
	}

}
