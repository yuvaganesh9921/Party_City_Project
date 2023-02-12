package com.amazon.setdefniation;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base_class.Base_Class_Ipt2;
import io.cucumber.java.en.Given;
import pom.pageobjectmanager;

public class setp_def extends Base_Class_Ipt2{
pageobjectmanager pom = new pageobjectmanager(driver);

@Given("User launch broser")
public void user_launch_broser() {
    browser_Launch1();
}
@Given("User navigate url")
public void user_navigate_url() {
  get("https://www.partycity.com/");
}
@Given("User click birthday")
public void user_click_birthday() {
	select(pom.getAdd_card().birthday_Party);
	
}
@Given("User  click pokemon")
public void user_click_pokemon() {
  select(pom.getAdd_card().pokemon);
   
   
}
@Given("User scroll down element")
public void user_scroll_down_element() {
   scrollUpandScrollDownusingElement(pom.getAdd_card().scroll);
}
@Given("User Seclect product")
public void user_seclect_product() {
  select(pom.getAdd_card().product1);
}

@Given("User Select down move")
public void user_select_down_move() {
  scrollUpandScrollDownusingElement(pom.getAdd_card().dowrn);
}
@Given("User Select shrit option")
public void user_select_shrit_option() {
  select(pom.getAdd_card().shrit);
}
@Given("User Select Viewcart")
public void user_select_viewcart() {
    select(pom.getAdd_card().add_card);
}

}
