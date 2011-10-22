package medizin.client.a_nonroo.app.client.dnd3.ui;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
/**
 * A popUp-Panel, which shows an animated gif. The panel hides when the animated gif or something
 * outside the panel is clicked. 
 * @author masterthesis
 *
 */
public class LoadingPopUp extends PopupPanel {

	public LoadingPopUp(){
		Image loadingImg = new Image("img/ajax-loader-gross.gif");
		VerticalPanel loadingPanelContents = new VerticalPanel();
		
		this.setAnimationEnabled(true);
		this.setGlassEnabled(false);
		this.setAutoHideEnabled(true);
		this.center();
		
		loadingPanelContents.add(loadingImg);
		
		this.setWidget(loadingPanelContents);
		loadingImg.addClickHandler(new ClickHandler(){

			@Override
			public void onClick(ClickEvent event) {
				hideLoadingPopup();
				
			}
			
		});
		

		
	}
	
	public void hideLoadingPopup(){
		this.hide();
	}
	

}
