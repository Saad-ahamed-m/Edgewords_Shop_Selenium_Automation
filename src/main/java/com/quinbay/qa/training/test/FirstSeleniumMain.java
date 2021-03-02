package com.quinbay.qa.training.test;

public class FirstSeleniumMain {
    public  static  void main(String args[]) throws InterruptedException {
        FirstSelenium obj=new FirstSelenium("webdriver.chrome.driver","src/main/resources/driver/chromedriver");
        obj.dismissbutton();
        obj.searchboxmethod("T shirt");
        obj.vneckselect();
        obj.addcart();
        obj.viewcartmethod();
        obj.checkoumethod();
        obj.adddetails("Saad","Ahamed","Quinbay TEchnologies","India","40,Sivasubramaniam Road","Coimbatore","Tamil Nadu","641002","youremail@gmail.com","89797979","fdfdfdfdfdfdf");
        obj.payandplace();
    }
}
