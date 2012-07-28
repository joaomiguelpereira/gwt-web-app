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

package eu.jpereira.management.scrum.web.client.injection;

import com.google.gwt.inject.client.AbstractGinModule;
import com.google.inject.Provides;
import eu.jpereira.management.scrum.web.client.application.ScrumWebApplication;
import eu.jpereira.management.scrum.web.client.application.WebApplication;
import eu.jpereira.management.scrum.web.client.view.ClientView;
import eu.jpereira.management.scrum.web.client.view.LayoutClientView;

public class WebApplicationModule extends AbstractGinModule {

    @Override
    protected void configure() {
        bind(WebApplication.class).to(ScrumWebApplication.class).asEagerSingleton();
    }

    @Provides
    protected ClientView provideSingletonClientView() {
        return new LayoutClientView();
    }

}
