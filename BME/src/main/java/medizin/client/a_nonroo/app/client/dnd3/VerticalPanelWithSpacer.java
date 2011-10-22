package medizin.client.a_nonroo.app.client.dnd3;

import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class VerticalPanelWithSpacer extends VerticalPanel {
	 private static final String CSS_DEMO_INSERT_PANEL_EXAMPLE_SPACER = "demo-InsertPanelExample-spacer";

	  public VerticalPanelWithSpacer() {
	    Label spacerLabel = new Label("");
	    spacerLabel.setStylePrimaryName(CSS_DEMO_INSERT_PANEL_EXAMPLE_SPACER);
	    super.add(spacerLabel);
	  }

	  @Override
	  public void add(Widget w) {
	    super.insert(w, getWidgetCount() - 1);
	  }

	  @Override
	  public void insert(Widget w, int beforeIndex) {
	    if (beforeIndex == getWidgetCount()) {
	      beforeIndex--;
	    }
	    super.insert(w, beforeIndex);
	  }
}
