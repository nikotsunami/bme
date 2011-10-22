package medizin.client.a_nonroo.app.client.ui.assesment;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


import medizin.client.a_nonroo.app.client.McAppConstant;
import medizin.client.a_nonroo.app.client.ui.assesment.AssesmentView.Delegate;

import medizin.client.managed.request.AssesmentProxy;
import medizin.client.managed.request.QuestionProxy;

import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.cell.client.AbstractCell;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
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
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.SplitLayoutPanel;
import com.google.gwt.user.client.ui.Widget;

public class AssesmentViewImpl extends Composite implements AssesmentView  {

	private static AssesmentViewImplUiBinder uiBinder = GWT
			.create(AssesmentViewImplUiBinder.class);

	interface AssesmentViewImplUiBinder extends
			UiBinder<Widget, AssesmentViewImpl> {
	}

	private Presenter presenter;

	private String name;
	
	@UiField
	SplitLayoutPanel splitLayoutPanel;

	public AssesmentViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
		DOM.setElementAttribute(splitLayoutPanel.getElement(), "style", "position: absolute; left: 0px; top: 0px; right: 5px; bottom: 0px;");
		init();

	}


	@Override
	public void setName(String helloName) {
		// TODO Auto-generated method stub
		
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
    CellTable<AssesmentProxy> table;
	

	protected Set<String> paths = new HashSet<String>();

	private Delegate delegate;
	

		
		   public void init() {
//		        paths.add("id");
//		        table.addColumn(new TextColumn<AssesmentProxy>() {
//
//		            Renderer<java.lang.Long> renderer = new AbstractRenderer<java.lang.Long>() {
//
//		                public String render(java.lang.Long obj) {
//		                    return obj == null ? "" : String.valueOf(obj);
//		                }
//		            };
//
//		            @Override
//		            public String getValue(AssesmentProxy object) {
//		                return renderer.render(object.getId());
//		            }
//		        }, "Id");
//		        paths.add("version");
//		        table.addColumn(new TextColumn<AssesmentProxy>() {
//
//		            Renderer<java.lang.Integer> renderer = new AbstractRenderer<java.lang.Integer>() {
//
//		                public String render(java.lang.Integer obj) {
//		                    return obj == null ? "" : String.valueOf(obj);
//		                }
//		            };
//
//		            @Override
//		            public String getValue(AssesmentProxy object) {
//		                return renderer.render(object.getVersion());
//		            }
//		        }, "Version");
			   
			   table.addColumn(new Column<AssesmentProxy, AssesmentProxy>(new AssesmentTextCell()) {
		    	      @Override
		    	      public AssesmentProxy getValue(AssesmentProxy object) {
		    	        return object;
		    	      }
		    	    },  "Name");
			   
			   
		        paths.add("name");
//		        table.addColumn(new TextColumn<AssesmentProxy>() {
//
//		            Renderer<java.lang.String> renderer = new AbstractRenderer<java.lang.String>() {
//
//		                public String render(java.lang.String obj) {
//		                    return obj == null ? "" : String.valueOf(obj);
//		                }
//		            };
//
//		            @Override
//		            public String getValue(AssesmentProxy object) {
//		                return renderer.render(object.getName());
//		            }
//		        }, "Name");
		        paths.add("dateOfAssesment");
		        table.addColumn(new TextColumn<AssesmentProxy>() {

		            Renderer<java.util.Date> renderer = new DateTimeFormatRenderer(DateTimeFormat.getFormat(DateTimeFormat.PredefinedFormat.DATE_SHORT));

		            @Override
		            public String getValue(AssesmentProxy object) {
		                return renderer.render(object.getDateOfAssesment());
		            }
		        }, "Prüfung am");
//		        paths.add("dateOpen");
//		        table.addColumn(new TextColumn<AssesmentProxy>() {
//
//		            Renderer<java.util.Date> renderer = new DateTimeFormatRenderer(DateTimeFormat.getFormat(DateTimeFormat.PredefinedFormat.DATE_SHORT));
//
//		            @Override
//		            public String getValue(AssesmentProxy object) {
//		                return renderer.render(object.getDateOpen());
//		            }
//		        }, "Date Open");
//		        paths.add("dateClosed");
//		        table.addColumn(new TextColumn<AssesmentProxy>() {
//
//		            Renderer<java.util.Date> renderer = new DateTimeFormatRenderer(DateTimeFormat.getFormat(DateTimeFormat.PredefinedFormat.DATE_SHORT));
//
//		            @Override
//		            public String getValue(AssesmentProxy object) {
//		                return renderer.render(object.getDateClosed());
//		            }
//		        }, "Date Closed");
//		        paths.add("place");
//		        table.addColumn(new TextColumn<AssesmentProxy>() {
//
//		            Renderer<java.lang.String> renderer = new AbstractRenderer<java.lang.String>() {
//
//		                public String render(java.lang.String obj) {
//		                    return obj == null ? "" : String.valueOf(obj);
//		                }
//		            };
//
//		            @Override
//		            public String getValue(AssesmentProxy object) {
//		                return renderer.render(object.getPlace());
//		            }
//		        }, "Place");
//		        paths.add("logo");
//		        table.addColumn(new TextColumn<AssesmentProxy>() {
//
//		            Renderer<java.lang.String> renderer = new AbstractRenderer<java.lang.String>() {
//
//		                public String render(java.lang.String obj) {
//		                    return obj == null ? "" : String.valueOf(obj);
//		                }
//		            };
//
//		            @Override
//		            public String getValue(AssesmentProxy object) {
//		                return renderer.render(object.getLogo());
//		            }
//		        }, "Logo");
//		        paths.add("isClosed");
//		        table.addColumn(new TextColumn<AssesmentProxy>() {
//
//		            Renderer<java.lang.Boolean> renderer = new AbstractRenderer<java.lang.Boolean>() {
//
//		                public String render(java.lang.Boolean obj) {
//		                    return obj == null ? "" : String.valueOf(obj);
//		                }
//		            };
//
//		            @Override
//		            public String getValue(AssesmentProxy object) {
//		                return renderer.render(object.getIsClosed());
//		            }
//		        }, "Is Closed");
//		        paths.add("assesmentVersion");
//		        table.addColumn(new TextColumn<AssesmentProxy>() {
//
//		            Renderer<java.lang.Integer> renderer = new AbstractRenderer<java.lang.Integer>() {
//
//		                public String render(java.lang.Integer obj) {
//		                    return obj == null ? "" : String.valueOf(obj);
//		                }
//		            };
//
//		            @Override
//		            public String getValue(AssesmentProxy object) {
//		                return renderer.render(object.getAssesmentVersion());
//		            }
//		        }, "Assesment Version");
		        paths.add("mc");
		        table.addColumn(new TextColumn<AssesmentProxy>() {

		            Renderer<medizin.client.managed.request.McProxy> renderer = medizin.client.managed.ui.McProxyRenderer.instance();

		            @Override
		            public String getValue(AssesmentProxy object) {
		                return renderer.render(object.getMc());
		            }
		        }, "Mc");
		        paths.add("repeFor");
		        table.addColumn(new TextColumn<AssesmentProxy>() {

		            Renderer<medizin.client.managed.request.AssesmentProxy> renderer = medizin.client.managed.ui.AssesmentProxyRenderer.instance();

		            @Override
		            public String getValue(AssesmentProxy object) {
		                return object.getRepeFor() == null? "" : "ja";
		            }
		        }, "Repe");
//		        paths.add("percentSameQuestion");
//		        table.addColumn(new TextColumn<AssesmentProxy>() {
//
//		            Renderer<java.lang.Integer> renderer = new AbstractRenderer<java.lang.Integer>() {
//
//		                public String render(java.lang.Integer obj) {
//		                    return obj == null ? "" : String.valueOf(obj);
//		                }
//		            };
//
//		            @Override
//		            public String getValue(AssesmentProxy object) {
//		                return renderer.render(object.getPercentSameQuestion());
//		            }
//		        }, "Percent Same Question");
	    }
	
		@Override
		public CellTable<AssesmentProxy> getTable() {

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

			return detailsPanel;
		}
		
		  private static class AssesmentTextCell extends AbstractCell<AssesmentProxy> {


				@Override
				public void render(com.google.gwt.cell.client.Cell.Context context,
						AssesmentProxy value, SafeHtmlBuilder sb) {
				      // Always do a null check on the value. Cell widgets can pass null to cells
				      // if the underlying data contains a null, or if the data arrives out of order.
				      if (value == null) {
				        return;
				      }
				      String beginn = "<div style=\"";
				      String end = "</div>";
				      if(value.getIsClosed())
				      {
				    	  beginn += "color:grey; ";		    	  
				      }
				      else if(value.getDateOpen().before(new Date()) && value.getDateClosed().after(new Date())){
				    	  beginn += "color:green; ";			    	  
				      }
				      if(!value.getDateOfAssesment().after(new Date())){
				    	 
				    	  beginn += "text-decoration: line-through; ";		    	  
				      }
				      
	 
				      beginn += "\">";
				      sb.appendHtmlConstant(beginn);
				      sb.appendHtmlConstant(value.getName());
				      sb.appendHtmlConstant(end);
					
				}
			  }

}
