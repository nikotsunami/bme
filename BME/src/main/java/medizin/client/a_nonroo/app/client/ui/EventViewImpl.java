package medizin.client.a_nonroo.app.client.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import medizin.client.a_nonroo.app.client.McAppConstant;
import medizin.client.managed.request.QuestionEventProxy;

import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.cell.client.AbstractEditableCell;
import com.google.gwt.cell.client.ActionCell;
import com.google.gwt.cell.client.Cell;
import com.google.gwt.cell.client.FieldUpdater;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.text.shared.AbstractRenderer;
import com.google.gwt.text.shared.Renderer;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

public class EventViewImpl extends Composite implements EventView  {

	private static EventViewImplUiBinder uiBinder = GWT
			.create(EventViewImplUiBinder.class);

	interface EventViewImplUiBinder extends
			UiBinder<Widget, EventViewImpl> {
	}
    private Delegate delegate;
    
    @UiField
    TextBox eventName;
	@UiField
    Button addEvent;

	
	@UiHandler("addEvent")
	void addEventClicked(ClickEvent event) {
		delegate.newClicked(eventName.getText());
		eventName.setText("");
	}
	


	private Presenter presenter;

	private String name;

	public EventViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
		//DOM.setElementAttribute(this.getElement(), "style", "position: absolute; left: 5px; top: 0px; right: 0px; bottom: 0px; overflow: auto;");
		init();


	}


	@Override
	public void setName(String helloName) {
		this.name = name;
		
	}


	@Override
	public void setPresenter(Presenter presenter) {
		this.presenter = presenter;
		
	}
	
    @UiField
    CellTable<QuestionEventProxy> tableEvent;
    
    protected Set<String> paths = new HashSet<String>();

    public void init() {
    	
    	Log.debug("Im EventViewImpl.init() ");
    	
    	editableCells = new ArrayList<AbstractEditableCell<?, ?>>();

//        paths.add("id");
//        tableEvent.addColumn(new TextColumn<QuestionEventProxy>() {
//
//            Renderer<java.lang.Long> renderer = new AbstractRenderer<java.lang.Long>() {
//
//                public String render(java.lang.Long obj) {
//                    return obj == null ? "" : String.valueOf(obj);
//                }
//            };
//
//            @Override
//            public String getValue(QuestionEventProxy object) {
//                return renderer.render(object.getId());
//            }
//        }, "Id");
//        paths.add("version");
//        tableEvent.addColumn(new TextColumn<QuestionEventProxy>() {
//
//            Renderer<java.lang.Integer> renderer = new AbstractRenderer<java.lang.Integer>() {
//
//                public String render(java.lang.Integer obj) {
//                    return obj == null ? "" : String.valueOf(obj);
//                }
//            };
//
//            @Override
//            public String getValue(QuestionEventProxy object) {
//                return renderer.render(object.getVersion());
//            }
//        }, "Version");
//        paths.add("eventName");
//        tableEvent.addColumn(new TextColumn<QuestionEventProxy>() {
//
//            Renderer<java.lang.String> renderer = new AbstractRenderer<java.lang.String>() {
//
//                public String render(java.lang.String obj) {
//                    return obj == null ? "" : String.valueOf(obj);
//                }
//            };
//
//            @Override
//            public String getValue(QuestionEventProxy object) {
//                return renderer.render(object.getEventName());
//            }
//        }, "Event Name");
//        paths.add("institution");
//        tableEvent.addColumn(new TextColumn<QuestionEventProxy>() {
//
//            Renderer<medizin.client.managed.request.InstitutionProxy> renderer = medizin.client.managed.ui.InstitutionProxyRenderer.instance();
//
//            @Override
//            public String getValue(QuestionEventProxy object) {
//                return renderer.render(object.getInstitution());
//            }
//        }, "Institution");
    	
  

        paths.add("eventName");
        tableEvent.addColumn(new TextColumn<QuestionEventProxy>() {

            Renderer<java.lang.String> renderer = new AbstractRenderer<java.lang.String>() {

                public String render(java.lang.String obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(QuestionEventProxy object) {
                return renderer.render(object.getEventName());
            }
        }, "Name des Themenbereichs");
        
      	addColumn(new ActionCell<QuestionEventProxy>(
      			McAppConstant.DECLINE_ICON, new ActionCell.Delegate<QuestionEventProxy>() {
    	            public void execute(QuestionEventProxy questionEvent) {
    	              Log.debug("You clicked " + questionEvent.getEventName());
    	              delegate.deleteClicked(questionEvent);
    	            }
    	          }), "", new GetValue<QuestionEventProxy>() {
    	        public QuestionEventProxy getValue(QuestionEventProxy contact) {
    	          return contact;
    	        }
    	      }, null);
      	
      	tableEvent.addColumnStyleName(1, "iconColumn");
      	tableEvent.addColumnStyleName(0, "questionTextColumn");
    }
	@Override
	public CellTable<QuestionEventProxy> getTable() {

		return tableEvent;
	}
	@Override
	public String[] getPaths() {
		Log.debug("im EventViewImpl.getPaths");

        return paths.toArray(new String[paths.size()]);
	}
	@Override
	public void setDelegate(Delegate delegate) {
		this.delegate = delegate;
		
	}

	  /**
	   * Add a column with a header.
	   *
	   * @param <C> the cell type
	   * @param cell the cell used to render the column
	   * @param headerText the header string
	   * @param getter the value getter for the cell
	   */
	  private <C> void addColumn(Cell<C> cell, String headerText,
	      final GetValue<C> getter, FieldUpdater<QuestionEventProxy, C> fieldUpdater) {
	    Column<QuestionEventProxy, C> column = new Column<QuestionEventProxy, C>(cell) {
	      @Override
	      public C getValue(QuestionEventProxy object) {
	        return getter.getValue(object);
	      }
	    };
	    column.setFieldUpdater(fieldUpdater);
	    if (cell instanceof AbstractEditableCell<?, ?>) {
	      editableCells.add((AbstractEditableCell<?, ?>) cell);
	    }
	    tableEvent.addColumn(column, headerText);
	  }

	  /**
	   * Get a cell value from a record.
	   *
	   * @param <C> the cell type
	   */
	  private static interface GetValue<C> {
	    C getValue(QuestionEventProxy contact);
	  }
	  
	  private List<AbstractEditableCell<?, ?>> editableCells;



	  



}
