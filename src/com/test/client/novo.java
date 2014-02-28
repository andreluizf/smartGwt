package com.test.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.event.dom.client.ClickEvent;

public class novo extends Composite {

	private static novoUiBinder uiBinder = GWT.create(novoUiBinder.class);

	interface novoUiBinder extends UiBinder<Widget, novo> {
	}

	public novo() {
		initWidget(uiBinder.createAndBindUi(this));
	}
}
