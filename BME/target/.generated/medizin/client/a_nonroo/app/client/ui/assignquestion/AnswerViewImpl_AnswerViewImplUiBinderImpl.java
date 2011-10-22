package medizin.client.a_nonroo.app.client.ui.assignquestion;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class AnswerViewImpl_AnswerViewImplUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, medizin.client.a_nonroo.app.client.ui.assignquestion.AnswerViewImpl>, medizin.client.a_nonroo.app.client.ui.assignquestion.AnswerViewImpl.AnswerViewImplUiBinder {

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final medizin.client.a_nonroo.app.client.ui.assignquestion.AnswerViewImpl owner) {

    medizin.client.a_nonroo.app.client.ui.assignquestion.AnswerViewImpl_AnswerViewImplUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (medizin.client.a_nonroo.app.client.ui.assignquestion.AnswerViewImpl_AnswerViewImplUiBinderImpl_GenBundle) GWT.create(medizin.client.a_nonroo.app.client.ui.assignquestion.AnswerViewImpl_AnswerViewImplUiBinderImpl_GenBundle.class);
    medizin.client.a_nonroo.app.client.ui.assignquestion.AnswerViewImpl_AnswerViewImplUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label lblIcon = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label lblAnswerText = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    java.lang.String domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label lblDel = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    java.lang.String domId3 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label lblCheck = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.HTMLPanel answerPanel = new com.google.gwt.user.client.ui.HTMLPanel("<table cellpadding='0' cellspacing='0' style='valign: top;'> <tr> <td class='" + "" + style.validity() + "" + "'> <span id='" + domId0 + "'></span> </td> <td class='" + "" + style.maxWidth() + "" + "'> <span id='" + domId1 + "'></span> </td> <td class='" + "" + style.validity() + "" + "'> <span id='" + domId2 + "'></span> <span id='" + domId3 + "'></span> </td> </tr> </table>");

    lblIcon.setStyleName("ui-icon " + style.validity() + "");
    lblAnswerText.setStyleName("" + style.fill() + "");
    lblDel.setStyleName("ui-icon ui-icon-check " + style.right() + "");
    lblDel.setVisible(false);
    lblCheck.setStyleName("ui-icon ui-icon-closethick " + style.right() + "");
    answerPanel.setStyleName("" + style.answer() + "");

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(answerPanel.getElement());
    com.google.gwt.user.client.Element domId0Element = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    com.google.gwt.user.client.Element domId1Element = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    com.google.gwt.user.client.Element domId2Element = com.google.gwt.dom.client.Document.get().getElementById(domId2).cast();
    com.google.gwt.user.client.Element domId3Element = com.google.gwt.dom.client.Document.get().getElementById(domId3).cast();
    attachRecord0.detach();
    answerPanel.addAndReplaceElement(lblIcon, domId0Element);
    answerPanel.addAndReplaceElement(lblAnswerText, domId1Element);
    answerPanel.addAndReplaceElement(lblDel, domId2Element);
    answerPanel.addAndReplaceElement(lblCheck, domId3Element);


    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.lblCheckClicked(event);
      }
    };
    lblCheck.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);
    lblDel.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);
    lblIcon.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);
    lblAnswerText.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

    owner.answerPanel = answerPanel;
    owner.lblAnswerText = lblAnswerText;
    owner.lblCheck = lblCheck;
    owner.lblDel = lblDel;
    owner.lblIcon = lblIcon;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return answerPanel;
  }
}
