package medizin.client.a_nonroo.app.client.ui;

import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.VerticalPanel;

public interface AcceptAnswerView extends IsWidget {


    void setDelegate(Delegate delegate);

    public interface Delegate {
       
    }

	VerticalPanel getQuestionPanel();

}
