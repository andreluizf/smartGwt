package com.test.client;

import com.smartgwt.client.types.Alignment;  
		import com.smartgwt.client.types.Overflow;  
		import com.smartgwt.client.widgets.Canvas;  
		import com.smartgwt.client.widgets.Label;  
		import com.smartgwt.client.widgets.layout.HLayout;  
		import com.smartgwt.client.widgets.layout.VLayout;  
		  
		import com.google.gwt.core.client.EntryPoint;  
/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Teste1 implements EntryPoint {
	/**
	 * The message displayed to the user when the server cannot be reached or
	 * returns an error.
	 */
	
	public void onModuleLoad() {
		
		  
		        HLayout mainLayout = new HLayout();  
		        mainLayout.setWidth100();  
		        mainLayout.setHeight100();  
		  
		        Label navigationLabel = new Label();  
		        navigationLabel.setContents("Navigation");  
		        navigationLabel.setAlign(Alignment.CENTER);  
		        navigationLabel.setOverflow(Overflow.HIDDEN);  
		        navigationLabel.setWidth("30%");  
		        navigationLabel.setShowResizeBar(true);  
		  
		        mainLayout.addMember(navigationLabel);  
		  
		        VLayout vLayout = new VLayout();  
		        vLayout.setWidth("70%");  
		  
		        Label listingLabel = new Label();  
		        listingLabel.setContents("Listing");  
		        listingLabel.setAlign(Alignment.CENTER);  
		        listingLabel.setOverflow(Overflow.HIDDEN);  
		        listingLabel.setHeight("30%");  
		        listingLabel.setShowResizeBar(true);  
		  
		        Label detailsLabel = new Label();  
		        detailsLabel.setContents("Details");  
		        detailsLabel.setAlign(Alignment.CENTER);  
		        detailsLabel.setOverflow(Overflow.HIDDEN);  
		        detailsLabel.setHeight("70%");  
		  
		        vLayout.addMember(listingLabel);  
		        vLayout.addMember(detailsLabel);  
		  
		        mainLayout.addMember(vLayout);  
		        mainLayout.draw();  
		    }  
		  
}
