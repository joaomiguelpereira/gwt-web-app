package eu.jpereira.management.scrum.web.client.injection;

import com.google.gwt.inject.client.AbstractGinModule;

import eu.jpereira.management.scrum.web.client.view.ClientView;
import eu.jpereira.management.scrum.web.client.view.HTMLClientView;
import eu.jpereira.management.scrum.web.client.application.ScrumWebApplication;
import eu.jpereira.management.scrum.web.client.application.WebApplication;

public class WebApplicationModule extends AbstractGinModule {

	@Override
	protected void configure() {
		//TODO: review
		bind(WebApplication.class).to(ScrumWebApplication.class).asEagerSingleton();
		bind(ClientView.class).to(HTMLClientView.class);
	}

}
