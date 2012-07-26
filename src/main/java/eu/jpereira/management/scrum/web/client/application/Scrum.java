package eu.jpereira.management.scrum.web.client.application;

import java.util.HashMap;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.shared.GWT;

import eu.jpereira.management.scrum.web.client.injection.WebApplicationInjector;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Scrum implements EntryPoint {

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		WebApplicationInjector injector = GWT.create(WebApplicationInjector.class);
		
		WebApplication application = injector.getWebApplication();
	
		application.start(new ObjectMapProperties(new HashMap<String, Object>()));
	}
}
