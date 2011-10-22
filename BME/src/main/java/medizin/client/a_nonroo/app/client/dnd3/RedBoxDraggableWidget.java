package medizin.client.a_nonroo.app.client.dnd3;

import com.google.gwt.user.client.ui.HTML;

/**
 * @deprecated
 * Demonstrate a draggable widget.
 */
public final class RedBoxDraggableWidget extends HTML {

        private static int counter;

        private static final String CSS_DEMO_RED_BOX_DRAGGABLE_WIDGET = "demo-red-box-draggable-widget";

        private static final int DRAGGABLE_SIZE = 65;

        public RedBoxDraggableWidget() {
                this.setPixelSize(DRAGGABLE_SIZE, DRAGGABLE_SIZE);
                this.setHTML("<i>drag me!</i> draggable widget #" + ++counter);
        }

        @Override
        protected void onLoad() {
                super.onLoad();
                this.addStyleName(CSS_DEMO_RED_BOX_DRAGGABLE_WIDGET);
        }
}