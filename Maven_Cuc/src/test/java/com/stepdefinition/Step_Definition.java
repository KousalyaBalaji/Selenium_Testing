package com.stepdefinition;

import java.io.IOException;

import com.Maven_Cuc.BaseClass;
import com.manager.Page_Object_Manager;
import com.properties.File_Reader_Manager;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends BaseClass {
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	@Before
	public void beforeHooks(Scenario s) {
		String name = s.getName();
		System.out.println("Scenario name is " + name);
	}

	@After
	public void afterHooks(Scenario s) throws IOException {
		String status = s.getStatus();
		System.out.println("Status is " + status);

		if (s.isFailed()) {
			takeScreenshot("C:\\Users\\Lenovo\\eclipse-workspace\\Maven_Cuc\\Screenshots\\error.png");
		}

	}

	@Given("^user Should Launch The URL$")
	public void user_Should_Launch_The_URL() throws Throwable {

		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().geturl();
		urlLaunch(url);
	}

	@When("^user Enter The \"([^\"]*)\" In Username Field$")
	public void user_Enter_The_In_Username_Field(String username) throws Throwable {
		passInput(pom.getlp().getUsername(), username);
	}

	@When("^user Enter The \"([^\"]*)\" In Password Field$")
	public void user_Enter_The_In_Password_Field(String password) throws Throwable {
		passInput(pom.getlp().getPassword(), password);
	}

	@Then("^user Will Click On Login Button$")
	public void user_Will_Click_On_Login_Button() throws Throwable {
		clickOnElement(pom.getlp().getLogin());
	}

	@When("^user Select \"([^\"]*)\" In The Location Field$")
	public void user_Select_In_The_Location_Field(String loc) throws Throwable {
		selectByValue(pom.getsearch().getLocation(), loc);
	}

	@When("^user Select  \"([^\"]*)\" In The Hotel Field$")
	public void user_Select_In_The_Hotel_Field(int hotels) throws Throwable {
		byIndex(pom.getsearch().getHotels(), hotels);
	}

	@When("^user Select  \"([^\"]*)\" In The Room Type Field$")
	public void user_Select_In_The_Room_Type_Field(String Type) throws Throwable {
		visibleText(pom.getsearch().getRoom_type(), Type);
	}

	@When("^user Select \"([^\"]*)\" In The No Of Rooms Field$")
	public void user_Select_In_The_No_Of_Rooms_Field(String Roomno) throws Throwable {
		selectByValue(pom.getsearch().getRoom_nos(), "2");
	}

	@When("^user Select \"([^\"]*)\" In The Adults Field$")
	public void user_Select_In_The_Adults_Field(String adults) throws Throwable {
		visibleText(pom.getsearch().getChild_room(), adults);
	}

	@When("^user Select \"([^\"]*)\" In The Children Field$")
	public void user_Select_In_The_Children_Field(String child) throws Throwable {
		visibleText(pom.getsearch().getChild_room(), child);
	}

	@Then("^user Will Click On Search Button$")
	public void user_Will_Click_On_Search_Button() throws Throwable {
		clickOnElement(pom.getsearch().getSubmit());
	}

	@When("^user Select The Hotel Information$")
	public void user_Select_The_Hotel_Information() throws Throwable {
		clickOnElement(pom.getselect().getRadiobutton_0());
	}

	@Then("^user Will Click On Continue Button$")
	public void user_Will_Click_On_Continue_Button() throws Throwable {
		clickOnElement(pom.getselect().getSubmit());
	}

	@When("^user Enters The First Name In The Firstname Field$")
	public void user_Enters_The_First_Name_In_The_Firstname_Field() throws Throwable {
		String firstname = File_Reader_Manager.getInstanceFRM().getInstanceCR().getFirstname();
		passInput(pom.getbh().getFs(), firstname);
	}

	@When("^user Enters The Last Name In The Lastname Field$")
	public void user_Enters_The_Last_Name_In_The_Lastname_Field() throws Throwable {
		String lastname = File_Reader_Manager.getInstanceFRM().getInstanceCR().getLastname();
		passInput(pom.getbh().getLs(), lastname);
	}

	@When("^user Enters The Address In The Address Field$")
	public void user_Enters_The_Address_In_The_Address_Field() throws Throwable {
		String address = File_Reader_Manager.getInstanceFRM().getInstanceCR().getAddress();
		passInput(pom.getbh().getAddress(), address);
	}

	@When("^user Enters The Creditcard No In The Creditcard Field$")
	public void user_Enters_The_Creditcard_No_In_The_Creditcard_Field() throws Throwable {
		String ccnum = File_Reader_Manager.getInstanceFRM().getInstanceCR().getcc_num();
		passInput(pom.getbh().getCcnum(), ccnum);
	}

	@When("^user Select The \"([^\"]*)\" Type In The Creditcard Type  Field$")
	public void user_Select_The_Type_In_The_Creditcard_Type_Field(String ctype) throws Throwable {
		visibleText(pom.getbh().getCctype(), ctype);
	}

	@When("^user Select The \"([^\"]*)\" In The Expiry Date  Field$")
	public void user_Select_The_In_The_Expiry_Date_Field(String month) throws Throwable {
		visibleText(pom.getbh().getMonth(), month);
	}

	@When("^user Select The \"([^\"]*)\" In The Expiry Year  Field$")
	public void user_Select_The_In_The_Expiry_Year_Field(String year) throws Throwable {
		visibleText(pom.getbh().getYear(), year);
	}

	@When("^user Enters The Cvv Number No In The Cvv Number Field$")
	public void user_Enters_The_Cvv_Number_No_In_The_Cvv_Number_Field() throws Throwable {
		String cvv = File_Reader_Manager.getInstanceFRM().getInstanceCR().getcc_cvv();
		passInput(pom.getbh().getcvv(), cvv);
	}

	@Then("^user Will Click On Booknow Button$")
	public void user_Will_Click_On_Booknow_Button() throws Throwable {
		clickOnElement(pom.getbh().getBook_now());
	}

	@When("^user Will Click On Logout Button$")
	public void user_Will_Click_On_Logout_Button() throws Throwable {
		clickOnElement(pom.getbh().getLogout());
		
	}

}
