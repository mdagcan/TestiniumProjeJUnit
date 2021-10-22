package test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GittiGidiyorTest extends TestBase{
    @Test
    public void test1() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        driver.get("https://www.gittigidiyor.com/");
        WebElement searchArea = driver.findElement(By.xpath("//input[@placeholder='Keşfetmeye Bak']"));
        searchArea.sendKeys("bilgisayar");

        WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
        submitButton.click();
        
        WebElement secondPage = driver.findElement(By.cssSelector("a[title='2. sayfa'] span"));
        wait.until(ExpectedConditions.elementToBeClickable(secondPage));
        secondPage.click();
        Assert.assertTrue(driver.getTitle().contains("sf=2"));

        WebElement selectUrun = driver.findElement(By.xpath("//h2[contains(text(),'Zeiron Fx45 İ5-3470 8GB 240GB')]"));
        selectUrun.click();
Thread.sleep(5000);
        WebElement urunFiyat = driver.findElement(By.xpath("(//div[@id='sp-price-discountPrice'])[1]"));

        WebElement urunBilgi = driver.findElement(By.xpath("(//tbody[1])[2]"));

        WebElement sepeteEkle = driver.findElement(By.id("add-to-basket"));

        WebElement sepeteGit = driver.findElement(By.xpath("//a[@class='header-cart-hidden-link']"));

        WebElement sepetteFiyat = driver.findElement(By.xpath("//p[@class='new-price']"));

        WebElement urunAdet = driver.findElement(By.xpath("//select[@class='amount']"));

        WebElement urunAdetKont = driver.findElement(By.xpath("//div[contains(text(),'Sepet Tutarı (2 Adet)')]"));

        WebElement urunSilme = driver.findElement(By.xpath("(//i[@class='gg-icon gg-icon-bin-medium'])[1]"));

        WebElement sepetBos = driver.findElement(By.xpath("//h2[contains(text(),'Sepetinizde ürün bulunmamaktadır.')]"));





    }
}
