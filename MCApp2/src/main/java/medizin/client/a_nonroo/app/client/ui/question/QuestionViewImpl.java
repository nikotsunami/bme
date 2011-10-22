package medizin.client.a_nonroo.app.client.ui.question;

import java.util.HashSet;
import java.util.Set;

import medizin.client.a_nonroo.app.client.McAppConstant;
import medizin.client.a_nonroo.app.client.SlidingPanel;
import medizin.client.a_nonroo.app.client.ui.assesment.AssesmentView.Delegate;
import medizin.client.a_nonroo.app.client.ui.assesment.AssesmentView.Presenter;
import medizin.client.a_nonroo.app.place.PlaceQuestionDetails;
import medizin.client.a_nonroo.app.request.McAppRequestFactory;
import medizin.client.managed.request.AnswerProxy;
import medizin.client.managed.request.AssesmentProxy;
import medizin.client.managed.request.QuestionProxy;

import com.google.gwt.cell.client.AbstractCell;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.place.shared.PlaceController;
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
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalSplitPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.SplitLayoutPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

public class QuestionViewImpl extends Composite implements QuestionView  {

	private static QuestionViewImplUiBinder uiBinder = GWT
			.create(QuestionViewImplUiBinder.class);

	interface QuestionViewImplUiBinder extends
			UiBinder<Widget, QuestionViewImpl> {
	}

//
//	  @UiField
//	  
//	  SplitLayoutPanel slidingPanel;
//	  

	  
	private Presenter presenter;
	@UiField
	SplitLayoutPanel splitLayoutPanel;


	public QuestionViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
		DOM.setElementAttribute(splitLayoutPanel.getElement(), "style", "position: absolute; left: 0px; top: 0px; right: 5px; bottom: 0px;");
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
		
		
//	       paths.add("dateAdded");
//	        table.addColumn(new TextColumn<QuestionProxy>() {
//
//	            Renderer<java.util.Date> renderer = new DateTimeFormatRenderer(DateTimeFormat.getFormat(DateTimeFormat.PredefinedFormat.DATE_SHORT));
//
//	            @Override
//	            public String getValue(QuestionProxy object) {
//	                return renderer.render(object.getDateAdded());
//	            }
//	        }, "Date Added");
//	        paths.add("dateChanged");
//	        table.addColumn(new TextColumn<QuestionProxy>() {
//
//	            Renderer<java.util.Date> renderer = new DateTimeFormatRenderer(DateTimeFormat.getFormat(DateTimeFormat.PredefinedFormat.DATE_SHORT));
//
//	            @Override
//	            public String getValue(QuestionProxy object) {
//	                return renderer.render(object.getDateChanged());
//	            }
//	        }, "Date Changed");
//	        paths.add("rewiewer");
//	        table.addColumn(new TextColumn<QuestionProxy>() {
//
//	            Renderer<medizin.client.managed.request.PersonProxy> renderer = medizin.client.managed.ui.PersonProxyRenderer.instance();
//
//	            @Override
//	            public String getValue(QuestionProxy object) {
//	                return renderer.render(object.getRewiewer());
//	            }
//	        }, "Rewiewer");
//	        paths.add("autor");
//	        table.addColumn(new TextColumn<QuestionProxy>() {
//
//	            Renderer<medizin.client.managed.request.PersonProxy> renderer = medizin.client.managed.ui.PersonProxyRenderer.instance();
//
//	            @Override
//	            public String getValue(QuestionProxy object) {
//	                return renderer.render(object.getAutor());
//	            }
//	        }, "Autor");
//	        paths.add("questionText");
//	        
//	        table.addColumn(new TextColumn<QuestionProxy>() {
//
//	            Renderer<java.lang.String> renderer = new AbstractRenderer<java.lang.String>() {
//
//	                public String render(java.lang.String obj) {
//	                    return obj == null ? "" : String.valueOf(obj);
//	                }
//	            };
//
//	            @Override
//	            public String getValue(QuestionProxy object) {
//	                return object.getQuestionText();
//	            }
//	        },  McAppConstant.QUESTION_TEXT);
//	        paths.add("picturePath");
//	        table.addColumn(new TextColumn<QuestionProxy>() {
//
//	            Renderer<java.lang.String> renderer = new AbstractRenderer<java.lang.String>() {
//
//	                public String render(java.lang.String obj) {
//	                    return obj == null ? "" : String.valueOf(obj);
//	                }
//	            };
//
//	            @Override
//	            public String getValue(QuestionProxy object) {
//	                return renderer.render(object.getPicturePath());
//	            }
//	        }, "Picture Path");
//	        paths.add("questionVersion");
//	        table.addColumn(new TextColumn<QuestionProxy>() {
//
//	            Renderer<java.lang.Double> renderer = new AbstractRenderer<java.lang.Double>() {
//
//	                public String render(java.lang.Double obj) {
//	                    return obj == null ? "" : String.valueOf(obj);
//	                }
//	            };
//
//	            @Override
//	            public String getValue(QuestionProxy object) {
//	                return renderer.render(object.getQuestionVersion());
//	            }
//	        }, "Question Version");
//	        paths.add("isAcceptedRewiever");
//	        table.addColumn(new TextColumn<QuestionProxy>() {
//
//	            Renderer<java.lang.Boolean> renderer = new AbstractRenderer<java.lang.Boolean>() {
//
//	                public String render(java.lang.Boolean obj) {
//	                    return obj == null ? "" : String.valueOf(obj);
//	                }
//	            };
//
//	            @Override
//	            public String getValue(QuestionProxy object) {
//	                return renderer.render(object.getIsAcceptedRewiever());
//	            }
//	        }, "Is Accepted Rewiever");
//	        paths.add("isAcceptedAdmin");
//	        table.addColumn(new TextColumn<QuestionProxy>() {
//
//	            Renderer<java.lang.Boolean> renderer = new AbstractRenderer<java.lang.Boolean>() {
//
//	                public String render(java.lang.Boolean obj) {
//	                    return obj == null ? "" : String.valueOf(obj);
//	                }
//	            };
//
//	            @Override
//	            public String getValue(QuestionProxy object) {
//	                return renderer.render(object.getIsAcceptedAdmin());
//	            }
//	        }, "Is Accepted Admin");
//	        paths.add("isActive");
//	        table.addColumn(new TextColumn<QuestionProxy>() {
//
//	            Renderer<java.lang.Boolean> renderer = new AbstractRenderer<java.lang.Boolean>() {
//
//	                public String render(java.lang.Boolean obj) {
//	                    return obj == null ? "" : String.valueOf(obj);
//	                }
//	            };
//
//	            @Override
//	            public String getValue(QuestionProxy object) {
//	                return renderer.render(object.getIsActive());
//	            }
//	        }, "Is Active");
//	        paths.add("previousVersion");
//	        table.addColumn(new TextColumn<QuestionProxy>() {
//
//	            Renderer<medizin.client.managed.request.QuestionProxy> renderer = medizin.client.managed.ui.QuestionProxyRenderer.instance();
//
//	            @Override
//	            public String getValue(QuestionProxy object) {
//	                return renderer.render(object.getPreviousVersion());
//	            }
//	        }, "Previous Version");
//	        paths.add("keywords");
//	        table.addColumn(new TextColumn<QuestionProxy>() {
//
//	            Renderer<java.util.Set> renderer = medizin.client.scaffold.place.CollectionRenderer.of(medizin.client.managed.ui.KeywordProxyRenderer.instance());
//
//	            @Override
//	            public String getValue(QuestionProxy object) {
//	                return renderer.render(object.getKeywords());
//	            }
//	        }, "Keywords");
//	        paths.add("questEvent");
//	        table.addColumn(new TextColumn<QuestionProxy>() {
//
//	            Renderer<medizin.client.managed.request.QuestionEventProxy> renderer = medizin.client.managed.ui.QuestionEventProxyRenderer.instance();
//
//	            @Override
//	            public String getValue(QuestionProxy object) {
//	                return renderer.render(object.getQuestEvent());
//	            }
//	        }, McAppConstant.QUESTION_EVENT);
//	        paths.add("comment");
//	        table.addColumn(new TextColumn<QuestionProxy>() {
//
//	            Renderer<medizin.client.managed.request.CommentProxy> renderer = medizin.client.managed.ui.CommentProxyRenderer.instance();
//
//	            @Override
//	            public String getValue(QuestionProxy object) {
//	                return renderer.render(object.getComment());
//	            }
//	        }, "Comment");
//	        paths.add("questionType");
//	        table.addColumn(new TextColumn<QuestionProxy>() {
//
//	            Renderer<medizin.client.managed.request.QuestionTypeProxy> renderer = medizin.client.managed.ui.QuestionTypeProxyRenderer.instance();
//
//	            @Override
//	            public String getValue(QuestionProxy object) {
//	                return renderer.render(object.getQuestionType());
//	            }
//	        }, McAppConstant.QUESTION_TYPE );
//	        paths.add("mcs");
//	        table.addColumn(new TextColumn<QuestionProxy>() {
//
//	            Renderer<java.util.Set> renderer = medizin.client.scaffold.place.CollectionRenderer.of(medizin.client.managed.ui.McProxyRenderer.instance());
//
//	            @Override
//	            public String getValue(QuestionProxy object) {
//	                return renderer.render(object.getMcs());
//	            }
//	        }, "Mcs");
//	        paths.add("answers");
//	        table.addColumn(new TextColumn<QuestionProxy>() {
//
//	            Renderer<java.util.Set> renderer = medizin.client.scaffold.place.CollectionRenderer.of(medizin.client.managed.ui.AnswerProxyRenderer.instance());
//
//	            @Override
//	            public String getValue(QuestionProxy object) {
//	                return renderer.render(object.getAnswers());
//	            }
//	        }, "Answers");
	     	table.addColumn(new Column<QuestionProxy, QuestionProxy>(new QuestionTextCell()) {
	    	      @Override
	    	      public QuestionProxy getValue(QuestionProxy object) {
	    	        return object;
	    	      }
	    	    },  McAppConstant.QUESTION_TEXT);
		
	}

	@UiField
	HasClickHandlers newButton;
	
	@UiHandler(value = { "newButton" })
	public void newButtonClicked(ClickEvent e){
		delegate.newClicked();
	}
	
	@Override
	public void setPresenter(Presenter presenter) {
		this.presenter = presenter;
		
	}
    @UiField
    CellTable<QuestionProxy> table;
	

	protected Set<String> paths = new HashSet<String>();

	private Delegate delegate;
	
	private McAppRequestFactory requests;
	private PlaceController placeController;

	@Inject
	public QuestionViewImpl(McAppRequestFactory requests, PlaceController placeController) {
		initWidget(uiBinder.createAndBindUi(this));
        this.requests = requests;
        this.placeController = placeController;

	}


	@Override
	public void setName(String helloName) {
		// TODO Auto-generated method stub
		
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
	public void setDelegate(Delegate delegate) {
		this.delegate= delegate;
		
	}


	@UiField
	SimplePanel detailsPanel;
	@Override
	public SimplePanel getDetailsPanel() {
		// TODO Auto-generated method stub
		return detailsPanel;
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
			      String beginn = "<div style=\"";
			      String end = "</div>";
			      if(!value.getIsAcceptedAdmin())
			      {
			    	  beginn += "color:red; ";		    	  
			      }
			      if(!value.getIsAcceptedRewiever()){
			    	  beginn += "font-style:italic; ";			    	  
			      }
			      if(!value.getIsActive()){
			    	  beginn += "text-decoration: line-through; ";		    	  
			      }
 
			      beginn += "\">";
			      sb.appendHtmlConstant(beginn);
			      sb.appendHtmlConstant(value.getQuestionText());
			      sb.appendHtmlConstant(end);
				
			}
		  }




}
