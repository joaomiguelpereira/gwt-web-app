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

package eu.jpereira.management.scrum.web.client.view;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.RootPanel;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: jpereira
 * Date: 7/26/12
 * Time: 10:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class HTMLClientView implements ClientView {




	@Override
	public void render() {

		//Hook here with parent container
		RootLayoutPanel rootLayoutPanel = RootLayoutPanel.get();
		Label label = new Label("Test");
		rootLayoutPanel.add(label);
		Window.alert("Hello there");
	}
}
