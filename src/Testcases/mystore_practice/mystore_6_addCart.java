package Testcases.mystore_practice;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class mystore_6_addCart {

    String[] itemsNeeded = {"Faded Short Sleeve T-shirts", "Blouse", "Printed Chiffon Dress"};


    public static void addItems(WebDriver driver, String[] whatToBuyList) throws InterruptedException{
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        int j = 0;
        List<WebElement> products = driver.findElements(By.cssSelector("a.product-name"));
        for (int i = 0; i < products.size(); i++) {
            String productName = products.get(i).getText();
            List itemsNeededList = Arrays.asList(whatToBuyList);
            if (itemsNeededList.contains(productName)) {
                j++;
                driver.findElements(By.xpath("//a[@title='Add to cart']")).get(i).click();
				driver.findElement(By.xpath("//span[@title='Continue shopping']")).click();
                if (j == whatToBuyList.length) {
                    break;
                }
            }
        }
    }

    @Test
    public void TC6_addCart() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\IdeaImportModules\\chromedriver94\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");

        addItems(driver, itemsNeeded);

        WebDriverWait w = new WebDriverWait(driver,5);
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Proceed to checkout')]")));
        String productsInCart = driver.findElement(By.xpath("//span[ contains(@class, 'ajax_cart_quantity')]")).getText();

        assertTrue(productsInCart.equals("3"));

    }


}
