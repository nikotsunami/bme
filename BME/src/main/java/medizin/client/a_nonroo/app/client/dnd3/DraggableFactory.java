package medizin.client.a_nonroo.app.client.dnd3;


import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Widget;

import com.allen_sauer.gwt.dnd.client.DragController;

import medizin.client.a_nonroo.app.client.dnd3.RedBoxDraggableWidget;

/**
 * Shared utility methods to produce draggable widgets.
 */
public class DraggableFactory {

  /**
   * Create a new draggable pumpkin image.
   *
   * @param dragController the drag controller
   * @return the new widget
   */
  public static Widget createDraggablePumpkinImage(DragController dragController) {
    Image image = new Image("images/99pumpkin2-65x58.jpg");
    dragController.makeDraggable(image);
    return image;
  }

  /**
   * Create a new draggable red box widget.
   *
   * @param dragController the drag controller
   * @return the new widget
   */
  public static Widget createDraggableRedBox(DragController dragController) {
    Widget redBox = new RedBoxDraggableWidget();
    dragController.makeDraggable(redBox);
    return redBox;
  }
}