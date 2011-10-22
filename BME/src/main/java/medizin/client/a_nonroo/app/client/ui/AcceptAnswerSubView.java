package medizin.client.a_nonroo.app.client.ui;

import medizin.client.a_nonroo.app.client.DeclineEmailPopupDelagate;
import medizin.client.managed.request.AnswerProxy;
import medizin.client.managed.request.QuestionProxy;

import com.google.gwt.place.shared.Place;
import com.google.gwt.user.cellview.client.AbstractHasData;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.VerticalPanel;

public interface AcceptAnswerSubView extends IsWidget {


    void setDelegate(Delegate delegate);

    public interface Delegate {

		void onRangeChanged(QuestionProxy questionProxy,
				AbstractHasData<AnswerProxy> table);

		void acceptClicked(AnswerProxy answerProxy);
       
    }


	AbstractHasData<AnswerProxy> getTable();


	void setProxy(QuestionProxy questionProxy);


	void setDelegatePopup(DeclineEmailPopupDelagate delegate);

}
