package eu.jpereira.tools.client.injection;

import com.google.gwt.inject.client.AbstractGinModule;

import eu.jpereira.tools.client.ScrumWebApplication;
import eu.jpereira.tools.client.WebApplication;

public class WebApplicationModule extends AbstractGinModule {

	@Override
	protected void configure() {
		//TODO: review
		bind(WebApplication.class).to(ScrumWebApplication.class).asEagerSingleton();
	}

}
