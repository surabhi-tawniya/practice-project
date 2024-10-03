package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;


public class FlipkartSearch {
     public static void main(String[] args){
         WebDriver driver = new ChromeDriver();
         driver.get("https://www.flipkart.com/");
         driver.manage().window().maximize();

         WebElement searchBoxElement = driver.findElement(By.xpath("//input[@title=\"Search for Products, Brands and More\"]"));
         searchBoxElement.sendKeys("iphone 16");
         searchBoxElement.submit();

         List<WebElement> listOfProducts = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
         List<WebElement> listOfProductPrice = driver.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));
         for(int i=0;i<listOfProducts.size()-1;i++){
             System.out.println("Product Name : " + listOfProducts.get(i).getText() + "," + "Price :" + listOfProductPrice.get(i).getText());
         }
     }
}
