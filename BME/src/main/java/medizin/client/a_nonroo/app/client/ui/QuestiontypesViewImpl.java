package medizin.client.a_nonroo.app.client.ui;

import java.util.HashSet;
import java.util.Set;

import medizin.client.managed.request.QuestionTypeProxy;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.text.shared.AbstractRenderer;
import com.google.gwt.text.shared.Renderer;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.SplitLayoutPanel;
import com.google.gwt.user.client.ui.Widget;

public class QuestiontypesViewImpl extends Composite implements QuestiontypesView  {

	private static QuestiontypesViewImplUiBinder uiBinder = GWT
			.create(QuestiontypesViewImplUiBinder.class);

	interface QuestiontypesViewImplUiBinder extends
			UiBinder<Widget, QuestiontypesViewImpl> {
	}

	private Presenter presenter;


	public QuestiontypesViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
		init();
	}

	
//    @Override
//    public RequestFactoryEditorDriver<medizin.client.managed.request.QuestionTypeProxy, QuestiontypesViewImpl> createEditorDriver() {
//        RequestFactoryEditorDriver<QuestionTypeProxy, QuestiontypesViewImpl> driver = GWT.create(Driver.class);
//        driver.initialize(this);
//        return driver;
//    }
//    
//    interface Driver extends RequestFactoryEditorDriver<QuestionTypeProxy, QuestiontypesViewImpl> {
//    }





	@Override
	public void setPresenter(Presenter presenter) {
		this.presenter = presenter;
		
	}
	protected Set<String> paths = new HashSet<String>();
	
	@UiField
	CellTable<QuestionTypeProxy> table;
	
	@UiField
	Button newQuestiontype;

    @UiHandler("newQuestiontype")
    public void onDeleteClicked(ClickEvent e) {
        delegate.newClicked();
    }
    
	private Delegate delegate;
	

	
	@Override
	public CellTable<QuestionTypeProxy> getTable() {
		
		return table;
	}
	@Override
	public String[] getPaths() {
		// TODO Auto-generated method stub
		return paths.toArray(new String[paths.size()]);
	}
	@UiField
	SplitLayoutPanel splitLayoutPanel;
	public void init() {
		DOM.setElementAttribute(splitLayoutPanel.getElement(), "style", "position: absolute; left: 0px; top: 0px; right: 5px; bottom: 0px;");
//		 paths.add("qeustionTypeName");
//	        
//		 
//		 
//		 
//		 table.addColumn(new TextColumn<QuestionTypeProxy>() {
//	        	/**
//	        	 * Abstract implementation of a renderer to make implementation of rendering simpler.
//	        	 */
//	            Renderer<java.lang.String> renderer = new AbstractRenderer<java.lang.String>() {
//
//	                public String render(java.lang.String obj) {
//	                    return obj == null ? "" : String.valueOf(obj);
//	                }
//	            };
//
//	            @Override
//	            public String getValue(QuestionTypeProxy object) {
//	                return renderer.render(object.getQuestionTypeName());
//	            }
//	        }, "Name der Pr�fung");
		
	    paths.add("questionTypeName");
        table.addColumn(new TextColumn<QuestionTypeProxy>() {

            Renderer<java.lang.String> renderer = new AbstractRenderer<java.lang.String>() {

                public String render(java.lang.String obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(QuestionTypeProxy object) {
                return renderer.render(object.getQuestionTypeName());
            }
        }, "Bezeichnung");
       
        paths.add("trueAnswers");
        table.addColumn(new TextColumn<QuestionTypeProxy>() {

            Renderer<java.lang.Integer> renderer = new AbstractRenderer<java.lang.Integer>() {

                public String render(java.lang.Integer obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(QuestionTypeProxy object) {
                return renderer.render(object.getTrueAnswers());
            }
        }, "wahr");
        paths.add("falseAnswers");
        table.addColumn(new TextColumn<QuestionTypeProxy>() {

            Renderer<java.lang.Integer> renderer = new AbstractRenderer<java.lang.Integer>() {

                public String render(java.lang.Integer obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(QuestionTypeProxy object) {
                return renderer.render(object.getFalseAnswers());
            }
        }, "falsch");
        paths.add("sumAnswers");
        table.addColumn(new TextColumn<QuestionTypeProxy>() {

            Renderer<java.lang.Integer> renderer = new AbstractRenderer<java.lang.Integer>() {

                public String render(java.lang.Integer obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(QuestionTypeProxy object) {
                return renderer.render(object.getSumAnswers());
            }
        }, "gesammt");
        
        paths.add("isWeil");
        table.addColumn(new TextColumn<QuestionTypeProxy>() {

            Renderer<java.lang.Boolean> renderer = new AbstractRenderer<java.lang.Boolean>() {

                public String render(java.lang.Boolean obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(QuestionTypeProxy object) {
                return renderer.render(object.getIsWeil());
            }
        }, "weil");
//        paths.add("maxLetters");
//        table.addColumn(new TextColumn<QuestionTypeProxy>() {
//
//            Renderer<java.lang.Integer> renderer = new AbstractRenderer<java.lang.Integer>() {
//
//                public String render(java.lang.Integer obj) {
//                    return obj == null ? "" : String.valueOf(obj);
//                }
//            };
//
//            @Override
//            public String getValue(QuestionTypeProxy object) {
//                return renderer.render(object.getMaxLetters());
//            }
//        }, "Max Letters");
	    }
	@Override
	public void setDelegate(Delegate delegate) {
		this.delegate = delegate;
		
	}
	
	@UiField
	SimplePanel slidingPanel;
	@Override
	public SimplePanel getDetailsPanel() {
		
		return slidingPanel;
	}




}
