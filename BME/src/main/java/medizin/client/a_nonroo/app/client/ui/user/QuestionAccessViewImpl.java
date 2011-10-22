package medizin.client.a_nonroo.app.client.ui.user;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import medizin.client.a_nonroo.app.client.ui.EventView.Delegate;
import medizin.client.a_nonroo.app.client.ui.EventView.Presenter;
import medizin.client.managed.request.QuestionAccessProxy;

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
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

public class QuestionAccessViewImpl extends Composite implements QuestionAccessView {

	private static QuestionAccessViewImplUiBinder uiBinder = GWT
			.create(QuestionAccessViewImplUiBinder.class);

	interface QuestionAccessViewImplUiBinder extends
			UiBinder<Widget, QuestionAccessViewImpl> {
	}

	public QuestionAccessViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
		init();
	}


    private Delegate delegate;
    

	@UiField
    Button newQuestionAccess;

	
	@UiHandler("newQuestionAccess")
	void addEventClicked(ClickEvent event) {
		delegate.addNewQuestionAccessClicked();
	}
	


	private Presenter presenter;

	private String name;




	@Override
	public void setName(String helloName) {
		this.name = name;
		
	}


	@Override
	public void setPresenter(Presenter presenter) {
		this.presenter = presenter;
		
	}
	
    @UiField
    CellTable<QuestionAccessProxy> tableEvent;
    
    protected Set<String> paths = new HashSet<String>();

    public void init() {
    	
    	Log.debug("Im EventViewImpl.init() ");
    	

//        paths.add("id");
//        tableEvent.addColumn(new TextColumn<QuestionAccessProxy>() {
//
//            Renderer<java.lang.Long> renderer = new AbstractRenderer<java.lang.Long>() {
//
//                public String render(java.lang.Long obj) {
//                    return obj == null ? "" : String.valueOf(obj);
//                }
//            };
//
//            @Override
//            public String getValue(QuestionAccessProxy object) {
//                return renderer.render(object.getId());
//            }
//        }, "Id");
//        paths.add("version");
//        tableEvent.addColumn(new TextColumn<QuestionAccessProxy>() {
//
//            Renderer<java.lang.Integer> renderer = new AbstractRenderer<java.lang.Integer>() {
//
//                public String render(java.lang.Integer obj) {
//                    return obj == null ? "" : String.valueOf(obj);
//                }
//            };
//
//            @Override
//            public String getValue(QuestionAccessProxy object) {
//                return renderer.render(object.getVersion());
//            }
//        }, "Version");
//        paths.add("eventName");
//        tableEvent.addColumn(new TextColumn<QuestionAccessProxy>() {
//
//            Renderer<java.lang.String> renderer = new AbstractRenderer<java.lang.String>() {
//
//                public String render(java.lang.String obj) {
//                    return obj == null ? "" : String.valueOf(obj);
//                }
//            };
//
//            @Override
//            public String getValue(QuestionAccessProxy object) {
//                return renderer.render(object.getEventName());
//            }
//        }, "Event Name");
//        paths.add("institution");
//        tableEvent.addColumn(new TextColumn<QuestionAccessProxy>() {
//
//            Renderer<medizin.client.managed.request.InstitutionProxy> renderer = medizin.client.managed.ui.InstitutionProxyRenderer.instance();
//
//            @Override
//            public String getValue(QuestionAccessProxy object) {
//                return renderer.render(object.getInstitution());
//            }
//        }, "Institution");
    	


        paths.add("questionText");
        tableEvent.addColumn(new TextColumn<QuestionAccessProxy>() {

            Renderer<java.lang.String> renderer = new AbstractRenderer<java.lang.String>() {

                public String render(java.lang.String obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(QuestionAccessProxy object) {
                return renderer.render(object.getQuestion().getQuestionText());
            }
        }, "Fragentext");
        paths.add("accRights");
        tableEvent.addColumn(new TextColumn<QuestionAccessProxy>() {

            Renderer<java.lang.String> renderer = new AbstractRenderer<java.lang.String>() {

                public String render(java.lang.String obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(QuestionAccessProxy object) {
                return renderer.render(object.getAccRights().toString());
            }
        }, "Zugriffsrecht");
        
    	addColumn(new ActionCell<QuestionAccessProxy>(
    	        "Entf.", new ActionCell.Delegate<QuestionAccessProxy>() {
    	            public void execute(QuestionAccessProxy question) {
    	              Log.debug("You clicked " + question.getQuestion().getQuestionText());
    	              delegate.deleteQuestionAccessClicked(question);
    	            }
    	          }), "Entfernen", new GetValue<QuestionAccessProxy>() {
    	        public QuestionAccessProxy getValue(QuestionAccessProxy contact) {
    	          return contact;
    	        }
    	      }, null);
    	
    	tableEvent.addColumnStyleName(0, "questionTextColumn");
    	tableEvent.addColumnStyleName(1, "accessRightColumn");
    	tableEvent.addColumnStyleName(2, "deleteColumn");
    }
	@Override
	public CellTable<QuestionAccessProxy> getTable() {

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
	      final GetValue<C> getter, FieldUpdater<QuestionAccessProxy, C> fieldUpdater) {
	    Column<QuestionAccessProxy, C> column = new Column<QuestionAccessProxy, C>(cell) {
	      @Override
	      public C getValue(QuestionAccessProxy object) {
	        return getter.getValue(object);
	      }
	    };
	    column.setFieldUpdater(fieldUpdater);
//	    if (cell instanceof AbstractEditableCell<?, ?>) {
//	      editableCells.add((AbstractEditableCell<?, ?>) cell);
//	    }
	    tableEvent.addColumn(column, headerText);
	  }

	  /**
	   * Get a cell value from a record.
	   *
	   * @param <C> the cell type
	   */
	  private static interface GetValue<C> {
	    C getValue(QuestionAccessProxy contact);
	  }
	  
	 



}
