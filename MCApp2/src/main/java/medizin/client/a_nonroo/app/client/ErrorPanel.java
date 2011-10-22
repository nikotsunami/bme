package medizin.client.a_nonroo.app.client;



import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.animation.client.Animation;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.VerticalPanel;
/**
 * Used to display errors throughout the application.
 * @author masterthesis
 *
 */

public class ErrorPanel extends PopupPanel  {

	
	private final LayoutPanel layoutPanel = new LayoutPanel();

	VerticalPanel panel = new VerticalPanel();
	
	public ErrorPanel() {
		//initWidget(layoutPanel);
		//super();
		this.setWidget(panel);
		setVisible(false);

		Log.debug("Errorpanel erstellt");

		
	}
	
	public void setErrorMessage(String message){
		Log.debug("Errormessage ausgeben");
		removeStylesAndWidhet();
		addStyleName("ui-state-error ui-widget ui-corner-all");
		panel.add(new HTML(message));
		
		display();
	}


	public void setWarnMessage(String message){
		removeStylesAndWidhet();
		addStyleName("ui-state-highlight ui-widget ui-corner-all");
		panel.add(new HTML(message));
		display();
	}
	public void setInfoMessage(String message){
		removeStylesAndWidhet();
		addStyleName("ui-state-info ui-widget ui-corner-all");
		panel.add(new HTML(message));
		display();
	}

	private void removeStylesAndWidhet() {
		
		panel.clear();
		Button closeButton = new Button();
		
		closeButton.setHTML("<span class=\"ui-icon ui-icon-closethick\"></span>");
		closeButton.setStyleName("ui-button ui-button-icon");
		DOM.setElementAttribute(closeButton.getElement(), "style", "position: absolute; top: 5px; right: 5px;");
		closeButton.addClickHandler(new ClickHandler(){

			@Override
			public void onClick(ClickEvent event) {
				ErrorPanel.this.hide();
				
			}});
		panel.add(closeButton);
		
		removeStyleName("ui-state-highlight ui-widget ui-corner-all");
		removeStyleName("ui-state-info ui-widget ui-corner-all");
		removeStyleName("ui-state-error ui-widget ui-corner-all");
	}
	private void display() {
		DOM.setElementAttribute(getElement(), "style", "position: fixed; left: 200px; top: -50px; right: 200px; border: 1px solid #cccccc; padding: 20px;");
		setVisible(true);
		show();
		Animation animation = new Animation() {
		    @Override
		    protected void onUpdate(double progress) {
		    	
		    	
		    	
		    	int topPixels = (int)( progress*100.00 - 50) ;
		    	DOM.setElementAttribute(getElement(), "style", "position: fixed; left: 200px; top: "+topPixels+"px; right: 200px; border: 1px solid #cccccc; padding: 20px;");
		    	/*if (isOpen) {
		        DOM.setStyleAttribute(FeedbackContainer.this.getElement(), "left", 
		            (int)(-600*(progress)) + "px");
		      } else {
		        DOM.setStyleAttribute(FeedbackContainer.this.getElement(), "left", 
		            (int)(-600*(1-progress)) + "px");
		      }*/
		    }
		 
		    @Override
		    protected void onComplete() {
		      super.onComplete();
		      
		      
		      Timer timer = new Timer() {

		          public void run() {
		              hidePanel();
		          }

		      };

		      timer.schedule(9000);

		     

		    }
		  };
		  animation.run(1000);

		
	}
	
	private void hidePanel(){
		Animation animation = new Animation() {
		    @Override
		    protected void onUpdate(double progress) {
		    	

		    	
		    	int topPixels = (int)( 50 - progress*100.00) ;
		    	DOM.setElementAttribute(getElement(), "style", "position: fixed; left: 200px; top: "+topPixels+"px; right: 200px; border: 1px solid #cccccc; padding: 20px;");
		    	/*if (isOpen) {
		        DOM.setStyleAttribute(FeedbackContainer.this.getElement(), "left", 
		            (int)(-600*(progress)) + "px");
		      } else {
		        DOM.setStyleAttribute(FeedbackContainer.this.getElement(), "left", 
		            (int)(-600*(1-progress)) + "px");
		      }*/
		    	
		    	if(progress==1) hide();
		    }
		 
		    @Override
		    protected void onComplete() {
		      super.onComplete();
		     // isOpen = !isOpen;
             
		    }
		  };
		  animation.run(1000);
		
		setVisible(false);
		
	}

}
