package eu.jpereira.management.scrum.web.client.view;

import com.google.gwt.user.client.Window;
import eu.jpereira.management.scrum.web.client.view.ClientView;

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

		Window.alert("Hello there");
	}
}
