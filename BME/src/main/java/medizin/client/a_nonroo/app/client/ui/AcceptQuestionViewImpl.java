package medizin.client.a_nonroo.app.client.ui;

import java.util.HashSet;
import java.util.Set;


import medizin.client.a_nonroo.app.client.DeclineEmailPopup;
import medizin.client.a_nonroo.app.client.DeclineEmailPopupDelagate;
import medizin.client.a_nonroo.app.client.McAppConstant;
import medizin.client.managed.request.QuestionProxy;

import com.google.gwt.cell.client.AbstractCell;
import com.google.gwt.cell.client.ActionCell;
import com.google.gwt.cell.client.Cell;
import com.google.gwt.cell.client.FieldUpdater;
import com.google.gwt.core.client.GWT;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.text.shared.AbstractRenderer;
import com.google.gwt.text.shared.Renderer;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class AcceptQuestionViewImpl extends Composite implements AcceptQuestionView  {

	private static AcceptQuestionViewImplUiBinder uiBinder = GWT
			.create(AcceptQuestionViewImplUiBinder.class);

	interface AcceptQuestionViewImplUiBinder extends
			UiBinder<Widget, AcceptQuestionViewImpl> {
	}

	private Presenter presenter;


	public AcceptQuestionViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
		DOM.setElementAttribute(this.getElement(), "style", "position: absolute; left: 5px; top: 0px; right: 0px; bottom: 0px; overflow: auto;");
		init();
	}





	private void init() {
	     paths.add("id");
	        table.addColumn(new TextColumn<QuestionProxy>() {

	            Renderer<java.lang.Long> renderer = new AbstractRenderer<java.lang.Long>() {

	                public String render(java.lang.Long obj) {
	                    return obj == null ? "" : String.valueOf(obj);
	                }
	            };

	            @Override
	            public String getValue(QuestionProxy object) {
	                return renderer.render(object.getId());
	            }
	        }, "Id");
	       
		     	
		     	
	        paths.add("keywords");
	        paths.add("comment");
	        paths.add("previosVersion");
	     	table.addColumn(new Column<QuestionProxy, QuestionProxy>(new QuestionTextCell()) {
	    	      @Override
	    	      public QuestionProxy getValue(QuestionProxy object) {
	    	        return object;
	    	      }
	    	    },  McAppConstant.QUESTION_TEXT);

	     	
	     	paths.add("rewiewer");
	     	paths.add("autor");
	     	paths.add("questEvent");
	     	paths.add("mcs");
	     	paths.add("questionType");
		     	table.addColumn(new Column<QuestionProxy, QuestionProxy>(new SimpleAttributeCell()) {
		    	      @Override
		    	      public QuestionProxy getValue(QuestionProxy object) {
		    	        return object;
		    	      }
		    	    },  "");
		     	

		     	
		
		    	addColumn(new ActionCell<QuestionProxy>( McAppConstant.DECLINE_ICON, new ActionCell.Delegate<QuestionProxy>() {
		    	            public void execute(QuestionProxy questionProxy) {
		    	            	DeclineEmailPopup popup = new DeclineEmailPopup(questionProxy);
		    	            	popup.setDelegate(delegate);
//		    	            	Log.debug("hinterPupup");
		    	             // delegate.rejectClicked(questionProxy, "verweigert");
		    	            }
		    	          }), "Ablehnen", new GetValue<QuestionProxy>() {
		    	        public QuestionProxy getValue(QuestionProxy questionProxy) {
		    	          return questionProxy;
		    	        }
		    	      }, null);
		    	
		    	addColumn(new ActionCell<QuestionProxy>( McAppConstant.ACCEPT_ICON, new ActionCell.Delegate<QuestionProxy>() {
    	            public void execute(QuestionProxy questionProxy) {
    	              delegate.acceptClicked(questionProxy);
    	            }
    	          }), "Annehmen", new GetValue<QuestionProxy>() {
    	        public QuestionProxy getValue(QuestionProxy questionProxy) {
    	          return questionProxy;
    	        }
    	      }, null);
		    	
		    	table.addColumnStyleName(0, "iconColumn");
		    	table.addColumnStyleName(1, "questionTextColumnAccept");
		    	table.addColumnStyleName(3, "deleteColumn");	
		    	table.addColumnStyleName(4, "deleteColumn");
		    	table.getRowContainer().setClassName("tableBody");
		    	
	}





	@Override
	public void setPresenter(Presenter presenter) {
		this.presenter = presenter;
		
	}
	
	@Override
	public CellTable<QuestionProxy> getTable() {

		return table;
	}
	@Override
	public String[] getPaths() {

        return paths.toArray(new String[paths.size()]);
	
}


	@Override
	public void setDelegate(DeclineEmailPopupDelagate delegate) {
		this.delegate= delegate;

		
	}

	  
	  private static class SimpleAttributeCell extends AbstractCell<QuestionProxy> {

		  


			@Override
			public void render(com.google.gwt.cell.client.Cell.Context context,
					QuestionProxy value, SafeHtmlBuilder sb) {
			      // Always do a null check on the value. Cell widgets can pass null to cells
			      // if the underlying data contains a null, or if the data arrives out of order.
			      if (value == null) {
			        return;
			      }
			      sb.appendHtmlConstant("<table>");
			      
			      if(value.getRewiewer()!=null){
			    	  sb.appendHtmlConstant(getTableRow("Reviewer:", value.getRewiewer().getPrename() + " " + value.getRewiewer().getName()));
			    	 // sb.appendHtmlConstant("<tr><td><strong>Reviewer: </strong></td><td>" + value.getRewiewer().getPrename() + " " + value.getRewiewer().getName() + " " + "</td></tr>");
			    	  
			      }
			      if(value.getRewiewer()!=null){
			    	  sb.appendHtmlConstant(getTableRow("Autor:",value.getAutor().getPrename() + " " + value.getAutor().getName()));
			    	 // sb.appendHtmlConstant("<tr><td><strong>Autor: </strong></td><td>" + value.getAutor().getPrename() + " " + value.getAutor().getName() + " " + "</td></tr>");
			      }
			      if(value.getQuestEvent()!=null){
			    	  sb.appendHtmlConstant(getTableRow("Themenbereich:",value.getQuestEvent().getEventName()));
			    	  // sb.appendHtmlConstant("<tr><td><strong>Themenbereich: </strong></td><td>" + value.getQuestEvent().getEventName() + "</td></tr>");
			      }
			      if(value.getMcs()!=null){
			    	  sb.appendHtmlConstant(getTableRow("Mc:", medizin.client.scaffold.place.CollectionRenderer.of(medizin.client.managed.ui.McProxyRenderer.instance()).render(value.getMcs())));
			    	  
			      }
			     
			      if( value.getQuestionType()!=null){
			    	  sb.appendHtmlConstant(getTableRow("Fragetyp:", value.getQuestionType().getQuestionTypeName()));
			    	  
			      }
			      
			      sb.appendHtmlConstant("</table>");
				
			}

			private String getTableRow(String title, String value) {
				
				return "<tr style=\"vertical-align: top;\"><td><strong>"+ title +"&nbsp;</strong></td><td>" + value + "</td></tr>";
			}
		  }
    @UiField
    CellTable<QuestionProxy> table;
	

	protected Set<String> paths = new HashSet<String>();

	private DeclineEmailPopupDelagate delegate;

	
	
	  /**
	   * Add a column with a header.
	   *
	   * @param <C> the cell type
	   * @param cell the cell used to render the column
	   * @param headerText the header string
	   * @param getter the value getter for the cell
	   */
	  private <C> void addColumn(Cell<C> cell, String headerText,
	      final GetValue<C> getter, FieldUpdater<QuestionProxy, C> fieldUpdater) {
	    Column<QuestionProxy, C> column = new Column<QuestionProxy, C>(cell) {
	      @Override
	      public C getValue(QuestionProxy object) {
	        return getter.getValue(object);
	      }
	    };
	    column.setFieldUpdater(fieldUpdater);
	  
	    table.addColumn(column, headerText);
	  }
	  
	  /**
	   * Get a cell value from a record.
	   *
	   * @param <C> the cell type
	   */
	  private static interface GetValue<C> {
	    C getValue(QuestionProxy contact);
	  }
	  
	  
	  private static class QuestionTextCell extends AbstractCell<QuestionProxy> {


			@Override
			public void render(com.google.gwt.cell.client.Cell.Context context,
					QuestionProxy value, SafeHtmlBuilder sb) {
			      // Always do a null check on the value. Cell widgets can pass null to cells
			      // if the underlying data contains a null, or if the data arrives out of order.
			      if (value == null) {
			        return;
			      }
			      sb.appendHtmlConstant("<table>");
			      
			      if(value.getQuestionText() != null){
			    	  sb.appendHtmlConstant(getTableRow("Fragentext:", value.getQuestionText()));
			    	 // sb.appendHtmlConstant("<tr><td><strong>Reviewer: </strong></td><td>" + value.getRewiewer().getPrename() + " " + value.getRewiewer().getName() + " " + "</td></tr>");
			    	  
			      }
			      if(value.getPreviousVersion() != null){
			    	  sb.appendHtmlConstant(getTableRow("Text der vorgeriegen Version:", value.getPreviousVersion().getQuestionText()));
			    	 // sb.appendHtmlConstant("<tr><td><strong>Autor: </strong></td><td>" + value.getAutor().getPrename() + " " + value.getAutor().getName() + " " + "</td></tr>");
			      }
			      if(value.getComment() != null){
			    	  sb.appendHtmlConstant(getTableRow("Kommentar:", value.getComment().getComment()));
			    	 // sb.appendHtmlConstant("<tr><td><strong>Autor: </strong></td><td>" + value.getAutor().getPrename() + " " + value.getAutor().getName() + " " + "</td></tr>");
			      }
			      if(value.getKeywords() != null){
			    	  sb.appendHtmlConstant(getTableRow("Keywords:", medizin.client.scaffold.place.CollectionRenderer.of(medizin.client.managed.ui.KeywordProxyRenderer.instance()).render(value.getKeywords())));
			    	 // sb.appendHtmlConstant("<tr><td><strong>Autor: </strong></td><td>" + value.getAutor().getPrename() + " " + value.getAutor().getName() + " " + "</td></tr>");
			      }
			      
			      sb.appendHtmlConstant("</table>");
				
			}
			
			private String getTableRow(String title, String value) {
				
				return "<tr style=\"vertical-align: top;\"><td><strong>"+ title +"&nbsp;</strong></td></tr><tr><td>" + value + "</td></tr>";
			}
		  }
	  
	



}
