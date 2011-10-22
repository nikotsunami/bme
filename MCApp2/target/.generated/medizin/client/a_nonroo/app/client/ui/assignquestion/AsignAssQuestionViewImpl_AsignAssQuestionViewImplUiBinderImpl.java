package medizin.client.a_nonroo.app.client.ui.assignquestion;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class AsignAssQuestionViewImpl_AsignAssQuestionViewImplUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, medizin.client.a_nonroo.app.client.ui.assignquestion.AsignAssQuestionViewImpl>, medizin.client.a_nonroo.app.client.ui.assignquestion.AsignAssQuestionViewImpl.AsignAssQuestionViewImplUiBinder {

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final medizin.client.a_nonroo.app.client.ui.assignquestion.AsignAssQuestionViewImpl owner) {

    medizin.client.a_nonroo.app.client.ui.assignquestion.AsignAssQuestionViewImpl_AsignAssQuestionViewImplUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (medizin.client.a_nonroo.app.client.ui.assignquestion.AsignAssQuestionViewImpl_AsignAssQuestionViewImplUiBinderImpl_GenBundle) GWT.create(medizin.client.a_nonroo.app.client.ui.assignquestion.AsignAssQuestionViewImpl_AsignAssQuestionViewImplUiBinderImpl_GenBundle.class);
    medizin.client.a_nonroo.app.client.ui.assignquestion.AsignAssQuestionViewImpl_AsignAssQuestionViewImplUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    medizin.client.a_nonroo.app.client.ui.assignquestion.AssesmentTabPanelImpl assementTabPanel = (medizin.client.a_nonroo.app.client.ui.assignquestion.AssesmentTabPanelImpl) GWT.create(medizin.client.a_nonroo.app.client.ui.assignquestion.AssesmentTabPanelImpl.class);
    medizin.client.a_nonroo.app.client.ui.assignquestion.AssesmentQuestionPanelImpl assementQuestionPanel = (medizin.client.a_nonroo.app.client.ui.assignquestion.AssesmentQuestionPanelImpl) GWT.create(medizin.client.a_nonroo.app.client.ui.assignquestion.AssesmentQuestionPanelImpl.class);
    com.google.gwt.user.client.ui.VerticalPanel f_VerticalPanel2 = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);
    com.google.gwt.user.client.ui.ScrollPanel f_ScrollPanel1 = (com.google.gwt.user.client.ui.ScrollPanel) GWT.create(com.google.gwt.user.client.ui.ScrollPanel.class);
    medizin.client.a_nonroo.app.client.ui.assignquestion.AddQuestionsTabPanelImpl addQuestionsTabPanel = (medizin.client.a_nonroo.app.client.ui.assignquestion.AddQuestionsTabPanelImpl) GWT.create(medizin.client.a_nonroo.app.client.ui.assignquestion.AddQuestionsTabPanelImpl.class);
    medizin.client.a_nonroo.app.client.ui.assignquestion.QuestionPanelImpl questionPanel = (medizin.client.a_nonroo.app.client.ui.assignquestion.QuestionPanelImpl) GWT.create(medizin.client.a_nonroo.app.client.ui.assignquestion.QuestionPanelImpl.class);
    com.google.gwt.user.client.ui.VerticalPanel f_VerticalPanel4 = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);
    com.google.gwt.user.client.ui.ScrollPanel f_ScrollPanel3 = (com.google.gwt.user.client.ui.ScrollPanel) GWT.create(com.google.gwt.user.client.ui.ScrollPanel.class);
    com.google.gwt.user.client.ui.SplitLayoutPanel splitLayoutPanel = (com.google.gwt.user.client.ui.SplitLayoutPanel) GWT.create(com.google.gwt.user.client.ui.SplitLayoutPanel.class);

    f_VerticalPanel2.add(assementTabPanel);
    f_VerticalPanel2.add(assementQuestionPanel);
    f_VerticalPanel2.setStyleName("" + style.panelLeft() + "");
    f_ScrollPanel1.add(f_VerticalPanel2);
    splitLayoutPanel.addWest(f_ScrollPanel1, 500);
    f_VerticalPanel4.add(addQuestionsTabPanel);
    f_VerticalPanel4.add(questionPanel);
    f_VerticalPanel4.setStyleName("" + style.panelRight() + "");
    f_ScrollPanel3.add(f_VerticalPanel4);
    splitLayoutPanel.add(f_ScrollPanel3);
    splitLayoutPanel.setStyleName("" + style.panelHTML() + "");



    owner.addQuestionsTabPanel = addQuestionsTabPanel;
    owner.assementQuestionPanel = assementQuestionPanel;
    owner.assementTabPanel = assementTabPanel;
    owner.questionPanel = questionPanel;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return splitLayoutPanel;
  }
}
