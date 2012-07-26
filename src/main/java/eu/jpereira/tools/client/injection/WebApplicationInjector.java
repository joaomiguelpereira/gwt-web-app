package eu.jpereira.tools.client.injection;

import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;

import eu.jpereira.tools.client.WebApplication;

@GinModules(WebApplicationModule.class)
public interface WebApplicationInjector extends Ginjector {

	WebApplication getWebApplication();

}
