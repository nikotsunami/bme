package medizin.client.a_nonroo.app;

import medizin.client.a_nonroo.app.ioc.McInjector;

import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.DeferredCommand;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
/**
 * Startingpoint of the application, starts application.
 * @author masterthesis
 *
 */

public class ApplicationEntry implements EntryPoint {

	final private McInjector injectorWrapper = GWT.create(McInjector.class);

	@SuppressWarnings("deprecation")
	@Override
	public void onModuleLoad() {

		/*
		 * Install an UncaughtExceptionHandler which will produce
		 * <code>FATAL</code> log messages
		 */
		Log.setUncaughtExceptionHandler();

		/*
		 * Use a deferred command so that the UncaughtExceptionHandler catches
		 * any exceptions in onModuleLoad2()
		 */
		DeferredCommand.addCommand(new Command() {
			public void execute() {
				onModuleLoad2();
			}

		});

	}

	private void onModuleLoad2() {
		Log.debug("Application starts...");
		injectorWrapper.getApplication().run();
		// new McAppFactory().getMcApp().run(RootLayoutPanel.get());

	}
}
