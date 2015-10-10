package com.example.helloworld.view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.part.ViewPart;

public class SampleView extends ViewPart {

	Label label;
	public SampleView() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent) {
		// TODO Auto-generated method stub
		label = new Label(parent, SWT.WRAP);
        label.setText("Hello from SampleView.java");

	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}
