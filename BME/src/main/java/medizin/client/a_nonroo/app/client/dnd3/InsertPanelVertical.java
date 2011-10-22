package medizin.client.a_nonroo.app.client.dnd3;

import com.google.gwt.user.client.Random;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

import com.allen_sauer.gwt.dnd.client.PickupDragController;
import com.allen_sauer.gwt.dnd.client.drop.HorizontalPanelDropController;
import com.allen_sauer.gwt.dnd.client.drop.VerticalPanelDropController;

import medizin.client.a_nonroo.app.client.dnd3.InsertPanelVertical;
import medizin.client.a_nonroo.app.client.dnd3.VerticalPanelWithSpacer;
import medizin.client.a_nonroo.app.client.dnd3.DemoDragHandler;
import medizin.client.a_nonroo.app.client.dnd3.Example;

/**
 * @deprecated
 * Example of columns that can be rearranged, with widget that can be moved
 * within a column or between columns.
 */
public final class InsertPanelVertical extends Example {

	private static final int COLUMNS = 3;

	private static final String CSS_DEMO_INSERT_PANEL_EXAMPLE = "demo-InsertPanelExample";

	private static final String CSS_DEMO_INSERT_PANEL_EXAMPLE_COLUMN_COMPOSITE = "demo-InsertPanelExample-column-composite";

	private static final String CSS_DEMO_INSERT_PANEL_EXAMPLE_CONTAINER = "demo-InsertPanelExample-container";

	private static final String CSS_DEMO_INSERT_PANEL_EXAMPLE_HEADING = "demo-InsertPanelExample-heading";

	private static final String CSS_DEMO_INSERT_PANEL_EXAMPLE_WIDGET = "demo-InsertPanelExample-widget";

	private static final String CSS_MCAPPP_DRAGGABLE_QUESTION = "draggableQuestion";

	private static final String CSS_DRAGGABLE_QUESTION_PANEL = "draggableQuestionPanel";

	private static final String CSS_HEADINGDRAGGABLETOPIC = "headingDraggableTopic";

	private static final int ROWS = 4;

	private static final int SPACING = 0;

	public InsertPanelVertical(DemoDragHandler demoDragHandler) {
		int count = 0;
		int topics = 1;

		// use the boundary panel as this composite's widget
		AbsolutePanel questionTopicTypeboundary = new AbsolutePanel();
		questionTopicTypeboundary.setSize("710px", "100%");
		setWidget(questionTopicTypeboundary);

		// initialize our column drag controller
		PickupDragController columnDragController = new PickupDragController(
				questionTopicTypeboundary, false);
		columnDragController.setBehaviorMultipleSelection(false);
		columnDragController.addDragHandler(demoDragHandler);

		// initialize our widget drag controller
		PickupDragController widgetDragController = new PickupDragController(
				questionTopicTypeboundary, false);
		widgetDragController.setBehaviorMultipleSelection(false);
		widgetDragController.addDragHandler(demoDragHandler);

		Label headingDraggableQuestionType = new Label("Fragetyp xy");
		headingDraggableQuestionType.addStyleName(CSS_HEADINGDRAGGABLETOPIC);
//vertical Panel Saffold for Themengruppen, questionTypePanels
		
		VerticalPanel questionTypeScaffold = new VerticalPanel();
		questionTypeScaffold.addStyleName(CSS_DRAGGABLE_QUESTION_PANEL);		
		VerticalPanelDropController scaffoldQtypeDropController = new VerticalPanelDropController(questionTypeScaffold);
		columnDragController.registerDropController(scaffoldQtypeDropController);
		
		
		
		
			

		// ala
		//F�r die Anzahl Themengruppen wiederholen
	for (int i = 1; i <= 3; i++){	
		//questionTypePanel Themengruppe		
		VerticalPanel questionTypePanel = new VerticalPanel();
		questionTypePanel.addStyleName(CSS_DRAGGABLE_QUESTION_PANEL);
		questionTopicTypeboundary.add(headingDraggableQuestionType);
		questionTopicTypeboundary.add(questionTypeScaffold);

		VerticalPanelDropController questionTypeDropController = new VerticalPanelDropController(
				questionTypePanel);
		columnDragController.registerDropController(questionTypeDropController);	
		
			Label headingDraggableTopic = new Label("Themengruppe: "+i);
			headingDraggableTopic.addStyleName(CSS_HEADINGDRAGGABLETOPIC);
			VerticalPanel questionPanel = new VerticalPanel();
			questionTypePanel.add(questionPanel);
			questionPanel.addStyleName(CSS_DRAGGABLE_QUESTION_PANEL);
			questionPanel.setSpacing(SPACING);
			questionTypePanel.add(headingDraggableTopic);
			
			
			// make the Themengruppe draggable by its heading
			columnDragController.makeDraggable(questionPanel,
					headingDraggableTopic);
			
			//wire Themengruppe to scaffold
			questionTypeScaffold.add(questionTypePanel);
			
	

			// initialize our Themngruppe drop controller
			VerticalPanelDropController columnDropController = new VerticalPanelDropController(
					questionPanel);
			columnDragController.registerDropController(columnDropController);

//Ende Defintion Themengruppe

			for (int col = 1; col <= COLUMNS; col++) {
				// initialize a vertical panel to hold the heading and a second
				// vertical
				// panel
				VerticalPanel columnCompositePanel = new VerticalPanel();
				columnCompositePanel
						.addStyleName(CSS_DEMO_INSERT_PANEL_EXAMPLE_COLUMN_COMPOSITE);

				// initialize inner vertical panel to hold individual widgets
				VerticalPanel verticalPanel = new VerticalPanelWithSpacer();
				verticalPanel
						.addStyleName(CSS_DEMO_INSERT_PANEL_EXAMPLE_CONTAINER);
				verticalPanel.setSpacing(SPACING);
				// horizontalPanel.add(columnCompositePanel);
				questionPanel.add(columnCompositePanel);
				// initialize a widget drop controller for the current column
				VerticalPanelDropController widgetDropController = new VerticalPanelDropController(
						verticalPanel);
				widgetDragController
						.registerDropController(widgetDropController);

				// Put together the column pieces
				Label heading = new Label("Question " + col);
				heading.addStyleName(CSS_DEMO_INSERT_PANEL_EXAMPLE_HEADING);
				columnCompositePanel.add(heading);
				columnCompositePanel.add(verticalPanel);

				// make the column draggable by its heading
				columnDragController.makeDraggable(columnCompositePanel,
						heading);

				for (int row = 1; row <= ROWS; row++) {
					// initialize a widget
					HTML widget = new HTML("Answer&nbsp;#" + ++count);
					widget.addStyleName(CSS_MCAPPP_DRAGGABLE_QUESTION);
					// widget.setHeight(Random.nextInt(4) + 2 + "em");
					widget.setHeight("100%");
					verticalPanel.add(widget);

					// make the widget draggable
					widgetDragController.makeDraggable(widget);
				}
			}
		}
	}

	@Override
	public String getDescription() {
		return "Allows drop to occur anywhere among the children of a supported <code>InsertPanel</code>.";
	}

	@Override
	public Class<?>[] getInvolvedClasses() {
		return new Class[] { InsertPanelVertical.class,
				VerticalPanelDropController.class,
				VerticalPanelWithSpacer.class,
				HorizontalPanelDropController.class,
				PickupDragController.class, };
	}
}
