package eu.jpereira.management.scrum.web.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

/**
 *
 */
public class DefaultLayout extends Composite {


    interface ApplicationLayoutUiBinder extends UiBinder<Widget, DefaultLayout> {
    }

    private static ApplicationLayoutUiBinder ourUiBinder = GWT.create(ApplicationLayoutUiBinder.class);

    public DefaultLayout() {
        initWidget(ourUiBinder.createAndBindUi(this));
    }

}