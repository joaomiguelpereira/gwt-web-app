package eu.jpereira.management.scrum.web.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.HTMLPanel;

/**
 *
 */
public class ApplicationLayout {
	interface ApplicationLayoutUiBinder extends UiBinder<HTMLPanel, ApplicationLayout> {
	}

	private static ApplicationLayoutUiBinder ourUiBinder = GWT.create(ApplicationLayoutUiBinder.class);



	public ApplicationLayout() {
		this.setElement(ourUiBinder.createAndBindUi(this));

		HTMLPanel rootElement = ourUiBinder.createAndBindUi(this);

	}

	private void setElement(HTMLPanel andBindUi) {

	}
}