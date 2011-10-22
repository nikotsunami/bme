package medizin.client.a_nonroo.app.client.ui.assesment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import medizin.client.a_nonroo.app.client.McAppConstant;
import medizin.client.a_nonroo.app.client.ui.EventView.Delegate;
import medizin.client.a_nonroo.app.client.ui.EventView.Presenter;
import medizin.client.a_nonroo.app.client.ui.user.QuestionAccessView;
import medizin.client.managed.request.QuestionTypeCountPerExamProxy;



import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.cell.client.AbstractCell;
import com.google.gwt.cell.client.AbstractEditableCell;
import com.google.gwt.cell.client.ActionCell;
import com.google.gwt.cell.client.Cell;
import com.google.gwt.cell.client.FieldUpdater;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.text.shared.AbstractRenderer;
import com.google.gwt.text.shared.Renderer;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.cellview.client.Header;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

public class QuestionTypeCountViewImpl extends Composite implements QuestionTypeCountView {

	private static QuestionTypeCountViewImplUiBinder uiBinder = GWT
			.create(QuestionTypeCountViewImplUiBinder.class);

	interface QuestionTypeCountViewImplUiBinder extends
			UiBinder<Widget, QuestionTypeCountViewImpl> {
	}

	public QuestionTypeCountViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
		init();
	}


    private Delegate delegate;
    

	@UiField
    Button newQuestionTypeCount;

	
	@UiHandler("newQuestionTypeCount")
	void addEventClicked(ClickEvent event) {
		delegate.addNewQuestionTypeCountClicked();
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
    CellTable<QuestionTypeCountPerExamProxy> tableQuestionTypeCount;
    
    protected Set<String> paths = new HashSet<String>();

    public void init() {
    	
    	Log.debug("Im EventViewImpl.init() ");
    	
    	editableCells = new ArrayList<AbstractEditableCell<?, ?>>();

    	
    

        paths.add("questionTypesAssigned");
        tableQuestionTypeCount.addColumn(new TextColumn<QuestionTypeCountPerExamProxy>() {

            Renderer<java.util.Set> renderer = medizin.client.scaffold.place.CollectionRenderer.of(medizin.client.managed.ui.QuestionTypeProxyRenderer.instance());

            @Override
            public String getValue(QuestionTypeCountPerExamProxy object) {
                return renderer.render(object.getQuestionTypesAssigned());
            }
        }, "Question Types Assigned");
//        paths.add("assesment");
//        tableQuestionTypeCount.addColumn(new TextColumn<QuestionTypeCountPerExamProxy>() {
//
//            Renderer<medizin.client.managed.request.AssesmentProxy> renderer = medizin.client.managed.ui.AssesmentProxyRenderer.instance();
//
//            @Override
//            public String getValue(QuestionTypeCountPerExamProxy object) {
//                return renderer.render(object.getAssesment());
//            }
//        }, "Assesment");
        paths.add("questionTypeCount");
        tableQuestionTypeCount.addColumn(new TextColumn<QuestionTypeCountPerExamProxy>() {

            Renderer<java.lang.Integer> renderer = new AbstractRenderer<java.lang.Integer>() {

                public String render(java.lang.Integer obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(QuestionTypeCountPerExamProxy object) {
                return renderer.render(object.getQuestionTypeCount());
            }
        }, new Header<String>(new IconHeader()){

			@Override
			public String getValue() {
				
				return "contact";
			}});
        paths.add("sort_order");
        tableQuestionTypeCount.addColumn(new TextColumn<QuestionTypeCountPerExamProxy>() {

            Renderer<java.lang.Integer> renderer = new AbstractRenderer<java.lang.Integer>() {

                public String render(java.lang.Integer obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(QuestionTypeCountPerExamProxy object) {
                return renderer.render(object.getSort_order());
            }
        }, new Header<String>(new IconHeader()){

			@Override
			public String getValue() {
				
				return "carat-2-n-s";
			}});
        
    	addColumn(new ActionCell<QuestionTypeCountPerExamProxy>(
    			McAppConstant.DELETE_ICON, new ActionCell.Delegate<QuestionTypeCountPerExamProxy>() {
    	            public void execute(QuestionTypeCountPerExamProxy questionTypeCount) {
    	              delegate.deleteQuestionTypeCountClicked(questionTypeCount);
    	            }
    	          }), "", new GetValue<QuestionTypeCountPerExamProxy>() {
    	        public QuestionTypeCountPerExamProxy getValue(QuestionTypeCountPerExamProxy contact) {
    	          return contact;
    	        }
    	      }, null);
    	addColumn(new ActionCell<QuestionTypeCountPerExamProxy>(
    			McAppConstant.UP_ICON, new ActionCell.Delegate<QuestionTypeCountPerExamProxy>() {
    	            public void execute(QuestionTypeCountPerExamProxy questionTypeCount) {
    	              delegate.moveUp(questionTypeCount);
    	            }
    	          }), "", new GetValue<QuestionTypeCountPerExamProxy>() {
    	        public QuestionTypeCountPerExamProxy getValue(QuestionTypeCountPerExamProxy contact) {
    	          return contact;
    	        }
    	      }, null);
    	addColumn(new ActionCell<QuestionTypeCountPerExamProxy>(
    			McAppConstant.DOWN_ICON, new ActionCell.Delegate<QuestionTypeCountPerExamProxy>() {
    	            public void execute(QuestionTypeCountPerExamProxy questionTypeCount) {
    	              delegate.moveDown(questionTypeCount);
    	            }
    	          }), "", new GetValue<QuestionTypeCountPerExamProxy>() {
    	        public QuestionTypeCountPerExamProxy getValue(QuestionTypeCountPerExamProxy contact) {
    	          return contact;
    	        }
    	      }, null);
    	
    	tableQuestionTypeCount.addColumnStyleName(0, "questionTextColumn");

    	tableQuestionTypeCount.addColumnStyleName(2, "iconColumn");	
    	tableQuestionTypeCount.addColumnStyleName(3, "iconColumn");
    	tableQuestionTypeCount.addColumnStyleName(4, "iconColumn");
    	tableQuestionTypeCount.addColumnStyleName(5, "iconColumn");
    }
	@Override
	public CellTable<QuestionTypeCountPerExamProxy> getTable() {

		return tableQuestionTypeCount;
	}
	@Override
	public String[] getPaths() {
		

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
	      final GetValue<C> getter, FieldUpdater<QuestionTypeCountPerExamProxy, C> fieldUpdater) {
	    Column<QuestionTypeCountPerExamProxy, C> column = new Column<QuestionTypeCountPerExamProxy, C>(cell) {
	      @Override
	      public C getValue(QuestionTypeCountPerExamProxy object) {
	        return getter.getValue(object);
	      }
	    };
	    column.setFieldUpdater(fieldUpdater);
	    if (cell instanceof AbstractEditableCell<?, ?>) {
	      editableCells.add((AbstractEditableCell<?, ?>) cell);
	    }
	    tableQuestionTypeCount.addColumn(column, headerText);
	  }

	  /**
	   * Get a cell value from a record.
	   *
	   * @param <C> the cell type
	   */
	  private static interface GetValue<C> {
	    C getValue(QuestionTypeCountPerExamProxy contact);
	  }
	  
	  private List<AbstractEditableCell<?, ?>> editableCells;

	  private static class IconHeader extends AbstractCell<String> {


			@Override
			public void render(com.google.gwt.cell.client.Cell.Context context,
					String value, SafeHtmlBuilder sb) {
			      // Always do a null check on the value. Cell widgets can pass null to cells
			      // if the underlying data contains a null, or if the data arrives out of order.
			      
			    	  sb.appendHtmlConstant("<span class=\"ui-icon ui-icon-"+value+"\"></span>");
			
			      
				
			}
		  }

}
