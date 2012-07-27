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

package eu.jpereira.management.scrum.web.client.application;

import eu.jpereira.management.scrum.web.client.logging.ApplicationLogger;
import eu.jpereira.management.scrum.web.client.view.ClientView;

import javax.inject.Inject;
import java.util.HashMap;

public class ScrumWebApplication implements WebApplication {

	private final static ApplicationLogger LOG = ApplicationLogger.getLogger(ScrumWebApplication.class);
	private WebApplicationProperties properties;


	private ClientView clientView;

	@Inject
	public ScrumWebApplication(ClientView clientView) {
		   this.clientView = clientView;



	}

	public void start(WebApplicationProperties properties) {
		this.properties = properties;
		clientView.render();
	}

	@Override
	public void start() {
		this.start(new ObjectMapProperties(new HashMap<String, Object>()));

	}

}
