package pom;

import org.openqa.selenium.WebDriver;

import Fornt_page.Fornt_page;
import base_class.Base_Class_Ipt2;

public class pageobjectmanager extends Base_Class_Ipt2{
public pageobjectmanager(WebDriver xdriver) {
	this.driver=xdriver;
	
}
private Fornt_page Fornt_page;
public Fornt_page getAdd_card() {
	if(Fornt_page==null) {
		Fornt_page= new Fornt_page(driver);
	}
	return Fornt_page;
}
	

}
