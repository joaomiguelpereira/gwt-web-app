package eu.jpereira.management.scrum.web.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

/**
 *
 */
public class ApplicationLayout extends Composite {


    interface ApplicationLayoutUiBinder extends UiBinder<Widget, ApplicationLayout> {
    }

    private static ApplicationLayoutUiBinder ourUiBinder = GWT.create(ApplicationLayoutUiBinder.class);

    @UiField
    Label name;

    public ApplicationLayout() {
        initWidget(ourUiBinder.createAndBindUi(this));
    }

    public void setName(String name) {
        this.name.setText(name);
    }
}