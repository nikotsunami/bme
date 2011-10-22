package medizin.client.a_nonroo.app.ioc;


import medizin.client.a_nonroo.app.McApplication;

import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;

@GinModules(value = {McGinModule.class})
public interface McInjector extends Ginjector {

	McApplication getApplication();
}