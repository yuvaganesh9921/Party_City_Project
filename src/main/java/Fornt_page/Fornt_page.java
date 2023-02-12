package Fornt_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base_class.Base_Class_Ipt2;

public class Fornt_page extends Base_Class_Ipt2 {
   public Fornt_page(WebDriver xdriver) {
	   this.driver=xdriver;
	   PageFactory.initElements(driver, this);
   }
   
@FindBy(xpath = "(//ul[@id='pc-navigation-collapse']//following::button[@aria-expanded='false'])[1]")
public WebElement birthday_Party ;
	
@FindBy(xpath="//a[text()='Pokemon Birthday Party']")
public WebElement pokemon;

@FindBy(xpath = "//label[@for='filter-sort']")
public WebElement scroll;

@FindBy(xpath="(//div[@class='pc-product-tile '])[5]")
public WebElement product1;

@FindBy(xpath = "//span[text()='Product Details']")
public WebElement dowrn;
@FindBy(xpath = "(//div[@class='pc-product-service__actions']//following::button[@type=\"button\"])[6]")
public WebElement shrit;
@FindBy(css = "[class=\"pc-cart-tray__footer\"]")
public WebElement add_card;
}
