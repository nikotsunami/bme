package medizin.client.a_nonroo.app.client.ui;

import medizin.client.a_nonroo.app.activities.ActivityAcceptAnswer;
import medizin.client.a_nonroo.app.client.DeclineEmailPopup;
import medizin.client.a_nonroo.app.client.DeclineEmailPopupDelagate;
import medizin.client.a_nonroo.app.client.McAppConstant;

import medizin.client.managed.request.AnswerProxy;
import medizin.client.managed.request.QuestionProxy;

import com.google.gwt.cell.client.AbstractCell;
import com.google.gwt.cell.client.AbstractEditableCell;
import com.google.gwt.cell.client.ActionCell;
import com.google.gwt.cell.client.Cell;
import com.google.gwt.cell.client.FieldUpdater;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.AbstractHasData;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.cellview.client.Header;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.RangeChangeEvent;

public class AcceptAnswerSubViewImpl extends Composite implements AcceptAnswerSubView  {

	private static AcceptAnswerViewImplUiBinder uiBinder = GWT
			.create(AcceptAnswerViewImplUiBinder.class);

	interface AcceptAnswerViewImplUiBinder extends
			UiBinder<Widget, AcceptAnswerSubViewImpl> {
	}
	
	
	@UiField
	CellTable<AnswerProxy> table;

	
	@Override
	public AbstractHasData<AnswerProxy> getTable(){
		return table;
	}

	private  Delegate delegate;
	private QuestionProxy questionProxy;


	public AcceptAnswerSubViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
		init();

	}

	private DeclineEmailPopupDelagate delegatePopup;


	private void init() {

		table.addColumn(new Column<AnswerProxy, AnswerProxy>(new ValidityTextCell()) {
    	      @Override
    	      public AnswerProxy getValue(AnswerProxy object) {
    	        return object;
    	      }
    	    },  new Header<String>(new ValidityHeader()){

    			@Override
    			public String getValue() {
    				
    				return "hallo";
    			}});
        
        
        
		table.addColumn(new Column<AnswerProxy, AnswerProxy>(new AnswerTextCell()) {
  	      @Override
  	      public AnswerProxy getValue(AnswerProxy object) {
  	        return object;
  	      }
  	    },  McAppConstant.ANSWER_TEXT);
        

		addColumn(new ActionCell<AnswerProxy>( McAppConstant.DECLINE_ICON, new ActionCell.Delegate<AnswerProxy>() {
            

			public void execute(AnswerProxy answerProxy) {
            	DeclineEmailPopup popup = new DeclineEmailPopup(answerProxy);
            	popup.setDelegate(delegatePopup);
//            	Log.debug("hinterPupup");
             // delegate.rejectClicked(answerProxy, "verweigert");
            }
          }), "Ablehnen", new GetValue<AnswerProxy>() {
        public AnswerProxy getValue(AnswerProxy answerProxy) {
          return answerProxy;
        }
      }, null);

addColumn(new ActionCell<AnswerProxy>( McAppConstant.ACCEPT_ICON, new ActionCell.Delegate<AnswerProxy>() {
    public void execute(AnswerProxy answerProxy) {
      delegate.acceptClicked(answerProxy);
    }
  }), "Annehmen", new GetValue<AnswerProxy>() {
public AnswerProxy getValue(AnswerProxy answerProxy) {
  return answerProxy;
}
}, null);
    	
    	table.addColumnStyleName(0, "iconColumn");
    	table.addColumnStyleName(1, "questionTextColumn");
    	table.addColumnStyleName(2, "deleteColumn");
		
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
	      final GetValue<C> getter, FieldUpdater<AnswerProxy, C> fieldUpdater) {
	    Column<AnswerProxy, C> column = new Column<AnswerProxy, C>(cell) {
	      @Override
	      public C getValue(AnswerProxy object) {
	        return getter.getValue(object);
	      }
	    };
	    column.setFieldUpdater(fieldUpdater);
//	    if (cell instanceof AbstractEditableCell<?, ?>) {
//	      editableCells.add((AbstractEditableCell<?, ?>) cell);
//	    }
	    table.addColumn(column, headerText);
	  }

	  /**
	   * Get a cell value from a record.
	   *
	   * @param <C> the cell type
	   */
	  private static interface GetValue<C> {
	    C getValue(AnswerProxy contact);
	  }


	@Override
	public void setDelegatePopup(DeclineEmailPopupDelagate delegate) {
		this.delegatePopup = delegate;
		
	}

@UiField
DivElement questionText;


	@Override
	public void setProxy(final QuestionProxy questionProxy) {
		this.questionProxy = questionProxy;
		table.addRangeChangeHandler(new RangeChangeEvent.Handler() {
			   
			public void onRangeChange(RangeChangeEvent event) {
				
				delegate.onRangeChanged(questionProxy, table);
			}
		});
		delegate.onRangeChanged(questionProxy, table);
		
		questionText.setInnerHTML(questionProxy.getQuestionText());
		
	}


	  private static class AnswerTextCell extends AbstractCell<AnswerProxy> {


			@Override
			public void render(com.google.gwt.cell.client.Cell.Context context,
					AnswerProxy value, SafeHtmlBuilder sb) {
			      // Always do a null check on the value. Cell widgets can pass null to cells
			      // if the underlying data contains a null, or if the data arrives out of order.
			      if (value == null) {
			        return;
			      }
			      String beginn = "<div style=\"";
			      String end = "</div>";
			      if(!value.getIsAnswerAcceptedAdmin())
			      {
			    	  beginn += "color:red; ";		    	  
			      }
			      if(!value.getIsAnswerAcceptedReviewWahrer()){
			    	  beginn += "font-style:italic; ";			    	  
			      }
			      if(!value.getIsAnswerActive()){
			    	  beginn += "text-decoration: line-through; ";		    	  
			      }

			      beginn += "\">";
			      sb.appendHtmlConstant(beginn);
			      sb.appendHtmlConstant(value.getAnswerText());
			      sb.appendHtmlConstant(end);
				
			}
		  }

	  
	  private static class ValidityTextCell extends AbstractCell<AnswerProxy> {


			@Override
			public void render(com.google.gwt.cell.client.Cell.Context context,
					AnswerProxy value, SafeHtmlBuilder sb) {
			      // Always do a null check on the value. Cell widgets can pass null to cells
			      // if the underlying data contains a null, or if the data arrives out of order.
			      if (value == null) {
			    	  sb.appendHtmlConstant("<span class=\"ui-icon ui-icon-help\"></span>");
			        return;
			      }
			      String validityIcon = "";
			      switch (value.getValidity()) {
					case Wahr: ; validityIcon += "<span class=\"ui-icon ui-icon-plus\"></span>";
							     break;
							
					case Falsch: validityIcon += "<span class=\"ui-icon ui-icon-minus\"></span>";
							     break;
							     
					case Weil:	 validityIcon += "<span class=\"ui-icon ui-icon-refresh\"></span>";	
								break;
							     
					default:	  validityIcon += "<span class=\"ui-icon ui-icon-help\"></span>";	
							     break;
					}

			      
			      sb.appendHtmlConstant(validityIcon);
			      
				
			}
		  }
	  
	  private static class ValidityHeader extends AbstractCell<String> {


			@Override
			public void render(com.google.gwt.cell.client.Cell.Context context,
					String value, SafeHtmlBuilder sb) {
			      // Always do a null check on the value. Cell widgets can pass null to cells
			      // if the underlying data contains a null, or if the data arrives out of order.
			      
			    	  sb.appendHtmlConstant("<span class=\"ui-icon ui-icon-help\"></span>");
			
			      
				
			}
		  }


	@Override
	public void setDelegate(Delegate delegate) {
		this.delegate = delegate;
		
	}





}
