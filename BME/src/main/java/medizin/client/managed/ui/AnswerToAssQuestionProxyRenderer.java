// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package medizin.client.managed.ui;

import com.google.gwt.requestfactory.ui.client.ProxyRenderer;
import medizin.client.managed.request.AnswerProxy;
import medizin.client.managed.request.AnswerToAssQuestionProxy;
import medizin.client.managed.request.AssesmentQuestionProxy;

public class AnswerToAssQuestionProxyRenderer extends ProxyRenderer<AnswerToAssQuestionProxy> {

    private static medizin.client.managed.ui.AnswerToAssQuestionProxyRenderer INSTANCE;

    protected AnswerToAssQuestionProxyRenderer() {
        super(new String[] { "id" });
    }

    public static medizin.client.managed.ui.AnswerToAssQuestionProxyRenderer instance() {
        if (INSTANCE == null) {
            INSTANCE = new AnswerToAssQuestionProxyRenderer();
        }
        return INSTANCE;
    }

    public String render(AnswerToAssQuestionProxy object) {
        if (object == null) {
            return "";
        }
        return object.getId() + " (" + object.getId() + ")";
    }
}
