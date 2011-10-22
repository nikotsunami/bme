package medizin.client.a_nonroo.app.client.ui.question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


import medizin.client.a_nonroo.app.client.McAppConstant;
import medizin.client.managed.request.AnswerProxy;
import medizin.client.managed.request.QuestionProxy;


import com.google.gwt.user.cellview.client.Header;
import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.cell.client.AbstractCell;
import com.google.gwt.cell.client.AbstractEditableCell;
import com.google.gwt.cell.client.ActionCell;
import com.google.gwt.cell.client.Cell;
import com.google.gwt.cell.client.FieldUpdater;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.text.client.DateTimeFormatRenderer;
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
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

public class AnswerListViewImpl extends Composite implements  AnswerListView {

	private static AnswerViewImplUiBinder uiBinder = GWT
			.create(AnswerViewImplUiBinder.class);

	interface AnswerViewImplUiBinder extends
			UiBinder<Widget, AnswerListViewImpl> {
	}

	public AnswerListViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
		init();
	}


    private Delegate delegate;
    

	@UiField
    Button newAnswer;

	
	@UiHandler("newAnswer")
	void addEventClicked(ClickEvent event) {
		Log.info("event");
		delegate.addNewAnswerClicked();
	}


	private String name;


	
    @UiField
    CellTable<AnswerProxy> tableAnswer;
    
    protected Set<String> paths = new HashSet<String>();

    public void init() {
    	
    	Log.debug("Im AnswerListView.init() ");
    	
    	editableCells = new ArrayList<AbstractEditableCell<?, ?>>();

    	
//        paths.add("dateAdded");
//        tableAnswer.addColumn(new TextColumn<AnswerProxy>() {
//
//            Renderer<java.util.Date> renderer = new DateTimeFormatRenderer(DateTimeFormat.getFormat(DateTimeFormat.PredefinedFormat.DATE_SHORT));
//
//            @Override
//            public String getValue(AnswerProxy object) {
//                return renderer.render(object.getDateAdded());
//            }
//        }, "Date Added");
//        paths.add("dateChanged");
//        tableAnswer.addColumn(new TextColumn<AnswerProxy>() {
//
//            Renderer<java.util.Date> renderer = new DateTimeFormatRenderer(DateTimeFormat.getFormat(DateTimeFormat.PredefinedFormat.DATE_SHORT));
//
//            @Override
//            public String getValue(AnswerProxy object) {
//                return renderer.render(object.getDateChanged());
//            }
//        }, "Date Changed");
//        paths.add("rewiewer");
//        tableAnswer.addColumn(new TextColumn<AnswerProxy>() {
//
//            Renderer<medizin.client.managed.request.PersonProxy> renderer = medizin.client.managed.ui.PersonProxyRenderer.instance();
//
//            @Override
//            public String getValue(AnswerProxy object) {
//                return renderer.render(object.getRewiewer());
//            }
//        }, "Rewiewer");
//        paths.add("autor");
//        tableAnswer.addColumn(new TextColumn<AnswerProxy>() {
//
//            Renderer<medizin.client.managed.request.PersonProxy> renderer = medizin.client.managed.ui.PersonProxyRenderer.instance();
//
//            @Override
//            public String getValue(AnswerProxy object) {
//                return renderer.render(object.getAutor());
//            }
//        }, "Autor");
    	
//        paths.add("validity");
//        tableAnswer.addColumn(new TextColumn<AnswerProxy>() {
//
//            Renderer<medizin.client.shared.Validity> renderer = new AbstractRenderer<medizin.client.shared.Validity>() {
//
//                public String render(medizin.client.shared.Validity obj) {
//                    return obj == null ? "" : String.valueOf(obj);
//                }
//            };
//
//            @Override
//            public String getValue(AnswerProxy object) {
//                return renderer.render(object.getValidity());
//            }
//        }, "Validity");
        
 
        tableAnswer.addColumn(new Column<AnswerProxy, AnswerProxy>(new ValidityTextCell()) {
    	      @Override
    	      public AnswerProxy getValue(AnswerProxy object) {
    	        return object;
    	      }
    	    },  new Header<String>(new ValidityHeader()){

    			@Override
    			public String getValue() {
    				
    				return "hallo";
    			}});
        
        
        
        tableAnswer.addColumn(new Column<AnswerProxy, AnswerProxy>(new AnswerTextCell()) {
  	      @Override
  	      public AnswerProxy getValue(AnswerProxy object) {
  	        return object;
  	      }
  	    },  McAppConstant.ANSWER_TEXT);
        
//        paths.add("answerText");
//        tableAnswer.addColumn(new TextColumn<AnswerProxy>() {
//
//            Renderer<java.lang.String> renderer = new AbstractRenderer<java.lang.String>() {
//
//                public String render(java.lang.String obj) {
//                    return obj == null ? "" : String.valueOf(obj);
//                }
//            };
//
//            @Override
//            public String getValue(AnswerProxy object) {
//            	
//                return renderer.render(object.getAnswerText());
//            }
//        }, "Answer Text");
//        paths.add("isAnswerActive");
//        tableAnswer.addColumn(new TextColumn<AnswerProxy>() {
//
//            Renderer<java.lang.Boolean> renderer = new AbstractRenderer<java.lang.Boolean>() {
//
//                public String render(java.lang.Boolean obj) {
//                    return obj == null ? "" : String.valueOf(obj);
//                }
//            };
//
//            @Override
//            public String getValue(AnswerProxy object) {
//                return renderer.render(object.getIsAnswerActive());
//            }
//        }, "Is Answer Active");
//        paths.add("isPicture");
//        tableAnswer.addColumn(new TextColumn<AnswerProxy>() {
//
//            Renderer<java.lang.Boolean> renderer = new AbstractRenderer<java.lang.Boolean>() {
//
//                public String render(java.lang.Boolean obj) {
//                    return obj == null ? "" : String.valueOf(obj);
//                }
//            };
//
//            @Override
//            public String getValue(AnswerProxy object) {
//                return renderer.render(object.getIsPicture());
//            }
//        }, "Is Picture");
//        paths.add("isAnswerAcceptedReviewWahrer");
//        tableAnswer.addColumn(new TextColumn<AnswerProxy>() {
//
//            Renderer<java.lang.Boolean> renderer = new AbstractRenderer<java.lang.Boolean>() {
//
//                public String render(java.lang.Boolean obj) {
//                    return obj == null ? "" : String.valueOf(obj);
//                }
//            };
//
//            @Override
//            public String getValue(AnswerProxy object) {
//                return renderer.render(object.getIsAnswerAcceptedReviewWahrer());
//            }
//        }, "Is Answer Accepted Review Wahrer");
//        paths.add("isAnswerAcceptedAutor");
//        tableAnswer.addColumn(new TextColumn<AnswerProxy>() {
//
//            Renderer<java.lang.Boolean> renderer = new AbstractRenderer<java.lang.Boolean>() {
//
//                public String render(java.lang.Boolean obj) {
//                    return obj == null ? "" : String.valueOf(obj);
//                }
//            };
//
//            @Override
//            public String getValue(AnswerProxy object) {
//                return renderer.render(object.getIsAnswerAcceptedAutor());
//            }
//        }, "Is Answer Accepted Autor");
//        paths.add("isAnswerAcceptedAdmin");
//        tableAnswer.addColumn(new TextColumn<AnswerProxy>() {
//
//            Renderer<java.lang.Boolean> renderer = new AbstractRenderer<java.lang.Boolean>() {
//
//                public String render(java.lang.Boolean obj) {
//                    return obj == null ? "" : String.valueOf(obj);
//                }
//            };
//
//            @Override
//            public String getValue(AnswerProxy object) {
//                return renderer.render(object.getIsAnswerAcceptedAdmin());
//            }
//        }, "Is Answer Accepted Admin");

//        paths.add("picturePath");
//        
//        
//        
//        tableAnswer.addColumn(new TextColumn<AnswerProxy>() {
//
//            Renderer<java.lang.String> renderer = new AbstractRenderer<java.lang.String>() {
//
//                public String render(java.lang.String obj) {
//                    return obj == null ? "" : String.valueOf(obj);
//                }
//            };
//
//            @Override
//            public String getValue(AnswerProxy object) {
//                return renderer.render(object.getPicturePath());
//            }
//        }, "Picture Path");
//        paths.add("question");
//        tableAnswer.addColumn(new TextColumn<AnswerProxy>() {
//
//            Renderer<medizin.client.managed.request.QuestionProxy> renderer = medizin.client.managed.ui.QuestionProxyRenderer.instance();
//
//            @Override
//            public String getValue(AnswerProxy object) {
//                return renderer.render(object.getQuestion());
//            }
//        }, "Question");
    	addColumn(new ActionCell<AnswerProxy>(
    	        "Entf.", new ActionCell.Delegate<AnswerProxy>() {
    	            public void execute(AnswerProxy answer) {
    	              delegate.deleteAnswerClicked(answer);
    	            }
    	          }), "Entfernen", new GetValue<AnswerProxy>() {
    	        public AnswerProxy getValue(AnswerProxy contact) {
    	          return contact;
    	        }
    	      }, null);
    	
    	tableAnswer.addColumnStyleName(0, "iconColumn");
    	tableAnswer.addColumnStyleName(1, "questionTextColumn");
    	tableAnswer.addColumnStyleName(2, "deleteColumn");


    }
	@Override
	public CellTable<AnswerProxy> getTable() {

		return tableAnswer;
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
	      final GetValue<C> getter, FieldUpdater<AnswerProxy, C> fieldUpdater) {
	    Column<AnswerProxy, C> column = new Column<AnswerProxy, C>(cell) {
	      @Override
	      public C getValue(AnswerProxy object) {
	        return getter.getValue(object);
	      }
	    };
	    column.setFieldUpdater(fieldUpdater);
	    if (cell instanceof AbstractEditableCell<?, ?>) {
	      editableCells.add((AbstractEditableCell<?, ?>) cell);
	    }
	    tableAnswer.addColumn(column, headerText);
	  }

	  /**
	   * Get a cell value from a record.
	   *
	   * @param <C> the cell type
	   */
	  private static interface GetValue<C> {
	    C getValue(AnswerProxy contact);
	  }
	  
	  private List<AbstractEditableCell<?, ?>> editableCells;


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




}
