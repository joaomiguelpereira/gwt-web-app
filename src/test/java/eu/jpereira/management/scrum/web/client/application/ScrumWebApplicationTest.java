package eu.jpereira.management.scrum.web.client.application;

import eu.jpereira.management.scrum.web.client.view.ClientView;
import org.testng.annotations.Test;

import java.util.HashMap;

import static org.mockito.Mockito.*;


/**
 *
 */
public class ScrumWebApplicationTest {

	@Test
	public void when_application_start_message_view_to_render() {

		//Mockery
		ClientView mockView = mock(ClientView.class);
		WebApplication application = new ScrumWebApplication(mockView);

		//Exercising

		application.start();

		//verifying
		verify(mockView).render();
	}
}
