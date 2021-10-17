package Testcases.mystore_practice;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class mystore_6_addCart {

    String[] itemsNeeded = {"Faded Short Sleeve T-shirts", "Blouse", "Printed Chiffon Dress"};

    public static void addItems(WebDriver driver, String[] whatToBuyList) throws InterruptedException{
        int j = 0;
        List<WebElement> products = driver.findElements(By.cssSelector("a.product-name"));
        for (int i = 0; i < products.size(); i++) {
            String productName = products.get(i).getText();
            List itemsNeededList = Arrays.asList(whatToBuyList);
            if (itemsNeededList.contains(productName)) {
                j++;
                driver.findElements(By.xpath("//a[@title='Add to cart']")).get(i).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//span[@title='Continue shopping']")).click();
				Thread.sleep(3000);
                if (j == whatToBuyList.length) {
                    break;
                }
            }
        }
    }

    @Test
    public void TC6_addCart() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\IdeaImportModules\\chromedriver93\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        Thread.sleep(3000);

        addItems(driver, itemsNeeded);

        String productsInCart = driver.findElement(By.xpath("//span[ contains(@class, 'ajax_cart_quantity')]")).getText();

        assertTrue(productsInCart.equals("3"));

    }


}
