package medizin.client.a_nonroo.app.client.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import medizin.client.a_nonroo.app.client.McAppConstant;
import medizin.client.managed.request.InstitutionProxy;

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
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

public class InstitutionViewImpl extends Composite implements InstitutionView  {

	private static InstitutionViewImplUiBinder uiBinder = GWT
			.create(InstitutionViewImplUiBinder.class);

	interface InstitutionViewImplUiBinder extends
			UiBinder<Widget, InstitutionViewImpl> {
	}
    private Delegate delegate;
    
    @UiField
    TextBox institutionName;
	@UiField
    Button addInstitution;
	@UiField
	SimplePanel slidingPanel;
	
	@UiHandler("addInstitution")
	void addInstitutionClicked(ClickEvent event) {
		delegate.newClicked(institutionName.getText());
		institutionName.setText("");
	}
	


	private Presenter presenter;

	private String name;

	public InstitutionViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
		DOM.setElementAttribute(this.getElement(), "style", "position: absolute; left: 5px; top: 0px; right: 0px; bottom: 0px; overflow: auto;");
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
    CellTable<InstitutionProxy> table;
    
    protected Set<String> paths = new HashSet<String>();

    public void init() {
    	editableCells = new ArrayList<AbstractEditableCell<?, ?>>();
    	

      /*  paths.add("id");
        table.addColumn(new TextColumn<InstitutionProxy>() {

            Renderer<java.lang.Long> renderer = new AbstractRenderer<java.lang.Long>() {

                public String render(java.lang.Long obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(InstitutionProxy object) {
                return renderer.render(object.getId());
            }
        }, "Id");
        paths.add("version");
        table.addColumn(new TextColumn<InstitutionProxy>() {

            Renderer<java.lang.Integer> renderer = new AbstractRenderer<java.lang.Integer>() {

                public String render(java.lang.Integer obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(InstitutionProxy object) {
                return renderer.render(object.getVersion());
            }
        }, "Version");*/
    	


        paths.add("institutionName");
        table.addColumn(new TextColumn<InstitutionProxy>() {

            Renderer<java.lang.String> renderer = new AbstractRenderer<java.lang.String>() {

                public String render(java.lang.String obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(InstitutionProxy object) {
                return renderer.render(object.getInstitutionName());
            }
        }, "Name der Institution");
        
    	addColumn(new ActionCell<InstitutionProxy>(
    			McAppConstant.DECLINE_ICON, new ActionCell.Delegate<InstitutionProxy>() {
    	            public void execute(InstitutionProxy institution) {
    	              //Window.alert("You clicked " + institution.getInstitutionName());
    	              delegate.deleteClicked(institution);
    	            }
    	          }), "", new GetValue<InstitutionProxy>() {
    	        public InstitutionProxy getValue(InstitutionProxy contact) {
    	          return contact;
    	        }
    	      }, null);
    	
    	table.addColumnStyleName(1, "iconColumn");
    	table.addColumnStyleName(0, "questionTextColumn");
    }
    
    
    
    
	@Override
	public CellTable<InstitutionProxy> getTable() {

		return table;
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
	      final GetValue<C> getter, FieldUpdater<InstitutionProxy, C> fieldUpdater) {
	    Column<InstitutionProxy, C> column = new Column<InstitutionProxy, C>(cell) {
	      @Override
	      public C getValue(InstitutionProxy object) {
	        return getter.getValue(object);
	      }
	    };
	    column.setFieldUpdater(fieldUpdater);
	    if (cell instanceof AbstractEditableCell<?, ?>) {
	      editableCells.add((AbstractEditableCell<?, ?>) cell);
	    }
	    table.addColumn(column, headerText);
	  }

	  /**
	   * Get a cell value from a record.
	   *
	   * @param <C> the cell type
	   */
	  private static interface GetValue<C> {
	    C getValue(InstitutionProxy contact);
	  }
	  
	  private List<AbstractEditableCell<?, ?>> editableCells;

	@Override
	public SimplePanel getDetailsPanel() {
		
		return slidingPanel;
	}

	  



}
