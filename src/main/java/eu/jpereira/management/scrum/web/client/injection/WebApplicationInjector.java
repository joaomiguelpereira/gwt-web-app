package eu.jpereira.management.scrum.web.client.injection;

import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;

import eu.jpereira.management.scrum.web.client.application.WebApplication;

@GinModules(WebApplicationModule.class)
public interface WebApplicationInjector extends Ginjector {

	WebApplication getWebApplication();

}
