package com.leafBot.pages;

import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.Annotations;

public class ViewLeadPage extends Annotations{

	
	public ViewLeadPage() {
		PageFactory.initElements(driver, this);
	}
	public void result() {
		System.out.println("PASSED");
	}
}
