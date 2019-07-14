package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.Annotations;

public class CreateLeadPage extends Annotations {
	
	public CreateLeadPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.ID, using="createLeadForm_companyName") WebElement companyName;
	@FindBy(how=How.ID, using="createLeadForm_firstName") WebElement firstName;
	@FindBy(how=How.ID, using="createLeadForm_lastName") WebElement lastName;
	@FindBy(how=How.XPATH, using="//input[@name='submitButton']") WebElement submitbutton;
	
	public CreateLeadPage typecompanyname() {
		clearAndType(companyName,"Accenture");
		return this;
	}

	public CreateLeadPage typefirstName() {
		clearAndType(firstName,"Pugazh");
		return this;
	}

	public CreateLeadPage typelastName() {
		clearAndType(lastName,"Pieter");
		return this;
	}
	
	public ViewLeadPage clicksubmit() {
		click(submitbutton);
		return new ViewLeadPage();
	}
	
}
