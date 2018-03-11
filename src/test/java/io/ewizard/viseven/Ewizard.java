package io.ewizard.viseven;

import org.apache.http.util.Asserts;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Ewizard {
    private static WebDriver driver;

    @BeforeClass
    public static void setup() {
        //  TODO: 03.03.2018  load WebDriver
//		System.setProperty("webdriver.chrome.driver", "c:\chromedriver\chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver", "c:/chromedriver/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

        String url = "https://viseven.ewizard.io/sharing/#/NWE2MWVhZjBkYWE1ZmMwMDJmZDdlYWU2fDAuMC45MA==";

        driver = new ChromeDriver();
        driver.get(url);

//        wait
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        System.out.println("Connect to site: " + url);
    }

    @Test
    public void test() {
        String siteTitle = "";
//        String urlTitle = "cobalt";
        String cobaltId = "cobalt";
        String urlTitle = "eWizard";

        // TODO: 08.03.2018  wait
        WebDriverWait wait = new WebDriverWait(driver, 10);

//        get site title
//        driver.findElement(By.tagName("title"));
//        siteTitle = driver.findElement(By.tagName("title")).getText();
        siteTitle = driver.getTitle();

        // TODO: 03.03.2018  check title of site
//        if (urlTitle.contentEquals(siteTitle)) {
////            "right" title
//            System.out.println("Test passed! The site have title: " + siteTitle);
//        } else {
////            different title
//            System.out.println("Test failed! Site have wrong title: " + siteTitle);
//        }
        Assert.assertEquals(siteTitle, urlTitle);

//		System.out.println("Full page source: " + driver.getPageSource());
//        System.out.println("Wait to iframes.");
        wait.until(ExpectedConditions.visibilityOfElementLocated((By.tagName("iframe"))));

        // TODO:  02.03.2018  check if iframe used
//        List<WebElement> list = driver.findElements(By.tagName("iframe"));
//        int size = list.size();
//        System.out.println("Was founded frame(s) " + size);

        // TODO:  02.03.2018  switch to iframe
//        System.out.println("Check for iframes.");
//        System.out.println("Was founded frame(s) " + driver.findElements(By.tagName("iframe")).size());

//        System.out.println("Switch to iframes.");
        driver.switchTo().frame(0);

        // TODO: 07.03.2018  need to check for loading DOM!!!
//        System.out.println("Wait to iframes.");
//        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
//        wait.until(ExpectedConditions.visibilityOfElementLocated((By.tagName("iframe"))));
        wait.until(ExpectedConditions.visibilityOfElementLocated((By.id(cobaltId))));

        // TODO: 05.03.18 check for more frame
        // TODO: 09.03.2018 maybe need to write the check if list has iframe with id="cobalt"
//         System.out.println("Check for more iframes.");
//        List<WebElement> list = driver.findElements(By.tagName("iframe"));
//        int size = list.size();
//        System.out.println("Was founded frame(s) " + size);
//        System.out.println("Was founded frame(s) " + driver.findElements(By.tagName("iframe")).size());

        // TODO: 05.03.18 switch to cobalt iframe
//        System.out.println("Switch to iframes " + cobaltId );
//          #cobalt
//         //*[@id="cobalt"]
//        driver.switchTo().frame("#cobalt");
//        driver.switchTo().frame(driver.findElement(By.id("#cobalt")));
//        System.out.println("Switch to iframes.");
//        driver.switchTo().frame(list.get(0));
//        body > div > div > div > div > md-content > ewizard-viewer-presentation > div.scroll-space > div > iframe
//                /html/body/div/div/div/div/md-content/ewizard-viewer-presentation/div[2]/div/iframe
//        driver.switchTo().frame(cobaltId);
        driver.switchTo().frame(cobaltId);

//        System.out.println("source " + driver.getPageSource());
//		  System.out.println("Was founded frame(s) " + driver.findElements(By.tagName("iframe")).size());

        // TODO: 01.03.2018 locate element witch will be click
        // TODO: STILL DIDN'T WORK!!!
        // #co-image_b777afd9 > div
//		//*[@id="co-image_b777afd9"]/div
//      #co-image_b777afd9
//		//*[@id="co-image_b777afd9"]
//        WebElement element = driver.findElement(By.tagName("article"));
//        WebElement element = driver.findElement(By.className("slide"));
//        WebElement element = driver.findElement(By.id("co-image_b777afd9"));
//        WebElement element = driver.findElement(By.cssSelector("#co-image_b777afd9 > div"));
//        WebElement element = driver.findElement(By.cssSelector("co-image[id='co-image_b777afd9'"));
//        WebElement element = driver.findElement(By.cssSelector("co-image[id^='co-image_']"));

        // TODO: 07.03.2018 need to use xpath!!!
        WebElement element = driver.findElement(By.xpath("//*[@id='co-image_b777afd9']"));
        try {
//            System.out.println("The element is: " + element.getTagName());
            element.click();
//            System.out.println("Click success!");
        } catch (Exception e) {
            System.out.println("Click problem with " + element.getTagName() + "!");
        }

//		TODO: try too google WORK FINE!!!
//		WebElement element = driver.findElement(By.tagName("input"));
//		WebElement element = driver.findElement(By.name("q"));
//		element.sendKeys("facebook");

        // TODO: 08.03.2018 need to locate element in iframe co-popup
        // TODO: 09.03.2018 and check if element has class "visible" to be sure
        //*[@id="co-popup_eb73c9af"]
//        #co-popup_eb73c9af
        // check class
        // check if is a Moon
        WebElement popup =  driver.findElement(By.xpath("*[@id=\"co-popup_eb73c9af\"]"));
        String classes = popup.getAttribute("class");
        for (String clss :
             classes.split(" ")) {
            if (clss.equals("visible")) {
                System.out.println(classes.toString());
            }
        }
//        System.out.println("Find element " + driver.findElement(By.xpath("*[@id=\"co-popup_eb73c9af\"]")).getTagName());
//        driver.findElement(By.xpath("*[@id=\"co-popup_eb73c9af\"]")).getText();
//        driver.findElement(By.xpath("*[@id=\"co-popup_eb73c9af\"]")).getAttribute("class");
        // check if is a Moon
//        <u>MOON</u>
//        #co-text_a729dc3a > span > div:nth-child(1) > span > font > u
//        //*[@id="co-text_a729dc3a"]/span/div[1]/span/font/u

//        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);

        // TODO: 08.03.2018 get list of elements
//        List<WebElement> elements = driver.findElements(By.xpath("//*[@id='co-text_a729dc3a']/span/div[1]/span/font/u"));
//        System.out.println(elements.size());

        // TODO: 08.03.2018 find element
        WebElement element2 = driver.findElement(By.xpath("//*[@id='co-text_a729dc3a']/span/div[1]/span/font/u"));
//        String u = driver.findElements(By.xpath("//*[@id='co-text_a729dc3a']/span/div[1]/span/font/u")).toString();
//        System.out.println(element2.toString());
//        System.out.println(element2.getTagName());
//        System.out.println(element2.getText());

        // TODO: 08.03.2018 and check if it's the "moon"
        // TODO: 09.03.2018 use method getAttribute and attribute "innerHTML"
//        System.out.println("The tag value is " + element2.getText());
//        System.out.println("The tag value is " + element2.getAttribute("value"));
//        System.out.println("The tag value is " + element2.getAttribute("innerHTML"));

//        Assert.assertEquals(element2.getText(), "<u>MOON</u>");
//        Assert.assertEquals(element2.getText(), "MOON");
        Assert.assertEquals(element2.getAttribute("innerHTML"), "MOON");

//        driver.findElement()
        // check class
        // check if is a Moon
        // find more info and click


    }

//    @AfterClass
    public static void tearDown() {
//        driver.close();
//        driver.quit();
    }
}
