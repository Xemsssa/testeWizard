/**
 * created by xemsss@gmail.com
 *
 * Solved. How to create order
 * How to remove class from webElement
 * Need find how operate with video
 * Maybe need to move all methods to separated class?
 *
 **/


package io.ewizard.viseven;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Ewizard {
    private static WebDriver driver;
    private static WebDriverWait wait = null;
    private static String cobaltId = "cobalt";
    private static String cobaltId2 = "cobalt_copy2";
    private static String cobaltId3 = "cobalt_copy3";
    private static String cobaltId4 = "cobalt_copy4";


    @BeforeTest

    public static void setup() {
        //  TODO: 03.03.2018  load WebDrive
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

        String url = "https://viseven.ewizard.io/sharing/#/NWE2MWVhZjBkYWE1ZmMwMDJmZDdlYWU2fDAuMC45MA==";

        driver = new ChromeDriver();

//        wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = (WebDriverWait) new WebDriverWait(driver, 20).withMessage("Error the element coudn't found");

        driver.get(url);

        System.out.println("Connect to site: " + url);
    }

    @Test(priority = 0)
    public void verificatePageTitle() {
        String urlTitle = "eWizard";
        String siteTitle = "";

//        get site title
        siteTitle = driver.getTitle();

        // TODO: 03.03.2018  check title of site
        Assert.assertEquals(siteTitle, urlTitle);
    }

//     TODO: 02.03.2018 case #1
    @Test(priority = 1)
    public void testUserClickOnMoon() {

        System.out.println("Run testUserClickOnMoon() method");

        // TODO:  03.03.2018  switch to iframe
        wait.until(ExpectedConditions.visibilityOfElementLocated((By.tagName("iframe"))));

        driver.switchTo().frame(0);

        wait.until(ExpectedConditions.visibilityOfElementLocated((By.tagName("iframe"))));

        // TODO: 12.03.2018 use switchToFrame method
        switchToFrame(cobaltId);

        // TODO: 03.03.2018 locate element which will be click
        // #co-image_b777afd9 > div
//		//*[@id="co-image_b777afd9"]/div
        // TODO: 07.03.2018 need to use xpath!!! or
        // TODO: 10.03.2018 id > tagName > cssSelector > xpath
        testUserClickOnElement("co-image_b777afd9");

        // TODO: 08.03.2018 need to locate element in iframe co-popup and check if element has class "visible" to be sure
        WebElement visibleEl = driver.findElement(By.className("visible"));

        // TODO: 12.03.2018 rewrite to use method checkElementForEqualTitle
//        Assert.assertEquals(visibleEl.getAttribute("id"), "co-popup_eb73c9af");
        checkIfTheElementForHasEqualTitle(visibleEl, "id","co-popup_eb73c9af");

        // TODO: 08.03.2018 find element
        WebElement element2 = driver.findElement(By.xpath("//*[@id='co-text_a729dc3a']/span/div[1]/span/font/u"));

        // TODO: 08.03.2018 and check if it's the "moon"
        checkIfTheElementForHasEqualTitle(element2, "innerHTML","moon");

        // TODO: 10.03.2018 find link "more info..." and click
        testUserClickOnElement("co-text_a46e9e59");

        // TODO: 11.03.2018 check for iframe locate elements close or back and formation
//        driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();

//        System.out.println(driver.getPageSource());

        driver.switchTo().frame(0);

        // TODO: 11.03.2018  switch to frame cobalt_copy2
        switchToFrame(cobaltId2);

       // TODO: 11.03.2018  locate close button
//        waitUntillElementBecomeVisible("co-image_b2b71d8f");
        wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("co-image_b2b71d8f"))));

        // TODO: 12.03.2018 rewrite to use testUserClickOnElement
        testUserClickOnElement("co-image_b2b71d8f");

        driver.switchTo().defaultContent();
    }


    // TODO: 21.03.2018 case #2
    @Test(priority = 2)
    public void testUserClickOnNeptune() {

        System.out.println("Run testUserClickOnNeptune() method");

        // TODO: switch to frame
        wait.until(ExpectedConditions.visibilityOfElementLocated((By.tagName("iframe"))));

        driver.switchTo().frame(0);

            wait.until(ExpectedConditions.visibilityOfElementLocated((By.tagName("iframe"))));

        switchToFrame(cobaltId);

        /* Here in testUserClickOnNeptune use method to click on "SUN" element for checking other code */
        // TODO: for neptune
//        testUserClickOnElement("co-image_1b9210c1");
        // TODO: for sun
        testUserClickOnElement("co-image_fd3edee9");

        WebElement visibleEl = driver.findElement(By.className("visible"));
//
//        // TODO: 21.03.2018 rewrite to use method checkElementForEqualTitle
        checkIfTheElementForHasEqualTitle(visibleEl, "id","co-popup_68ae027a");
//        checkIfTheElementForHasEqualTitle(visibleEl, "id", "co-popup_c876a99f");

        // TODO: locate heading
//        #co-text_5a4bf337 > span > div:nth-child(1) > font > b > font > u
        WebElement element2 = driver.findElement(By.cssSelector("#co-text_5a4bf337 > span > div:nth-child(1) > font > b > font > u"));
//        WebElement element2 = driver.findElement(By.cssSelector("#co-text_30f6873f > span > div:nth-child(1) > font > b > u"));

        // TODO: check if the heading is neptune
        checkIfTheElementForHasEqualTitle(element2, "innerHTML", "neptune");
//        checkIfTheElementForHasEqualTitle(element2, "innerHTML", "sun");
        // TODO: wait and click on element "more information..." for more
//        wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("co-text_d9601b24"))));
        waitUntillElementBecomeVisible("co-text_d9601b24");

        testUserClickOnElement("co-text_d9601b24");
//        testUserClickOnElement("co-text_187ed57b");

        // TODO: change driver frame view
        //        driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();

//        waitUntillElementBecomeVisible("iframe");
        wait.until(ExpectedConditions.visibilityOfElementLocated((By.tagName("iframe"))));

        driver.switchTo().frame(0);

        // TODO: 21.03.2018 use until method
//        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(cobaltId4))));
        waitUntillElementBecomeVisible(cobaltId4);
//        waitUntillElementBecomeVisible(cobaltId3);

        switchToFrame(cobaltId4);
//        switchToFrame(cobaltId3);

//        System.out.println(driver.getPageSource());

        // TODO: check if we get right pop-up window with information
//        wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("co-popup_5580654d"))));
        wait.until(ExpectedConditions.visibilityOfElementLocated((By.className("visible"))));
        WebElement visibleEl2 = driver.findElement(By.className("visible"));
//
        checkIfTheElementForHasEqualTitle(visibleEl2, "id","co-popup_5580654d");

        // TODO: click close button
//        wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("co-image_e6ba1752"))));
        waitUntillElementBecomeVisible("co-image_3db3bcfa");

//        testUserClickOnElement("co-image_e6ba1752");
        testUserClickOnElement("co-image_3db3bcfa");

        driver.switchTo().defaultContent();
    }


    // TODO: 11.03.2018  case #3
//    @Test
    @Test(priority = 3)
    public void testUserClickOnSun () {
        System.out.println("Run testUserClickOnSun() method");

        // TODO: wait for frame loading and switch to it
        wait.until(ExpectedConditions.visibilityOfElementLocated((By.tagName("iframe"))));

        driver.switchTo().frame(0);

        wait.until(ExpectedConditions.visibilityOfElementLocated((By.tagName("iframe"))));
//        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(cobaltId))));

        switchToFrame(cobaltId);

        /* Here in testUserClickOnSun use method to click on "NEPTUNE" element for checking other code */
        // TODO: for neptune
         testUserClickOnElement("co-image_1b9210c1");
//        // TODO: for sun
//        testUserClickOnElement("co-image_fd3edee9");

        // TODO: 08.03.2018 need to locate element in iframe co-popup and check if element has class "visible" to be sure
        WebElement visibleEl = driver.findElement(By.className("visible"));

        // TODO: 12.03.2018 rewrite to use method checkElementForEqualTitle
        checkIfTheElementForHasEqualTitle(visibleEl, "id","co-popup_c876a99f");

        // TODO: 18.03.2018 check the title of planet
        //*[@id="co-text_30f6873f"]/span/div[1]/font/b/u
//        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("co-text_30f6873f"))));
        waitUntillElementBecomeVisible("co-text_30f6873f");

        WebElement element2 = driver.findElement(By.cssSelector(" #co-text_30f6873f > span > div:nth-child(1) > font > b > u"));

        checkIfTheElementForHasEqualTitle(element2, "innerHTML", "sun");

        // TODO: 18.03.2018 check user click on "more info...." to get more about planet
//        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("co-text_187ed57b"))));
        testUserClickOnElement("co-text_187ed57b");

        driver.switchTo().defaultContent();

        wait.until(ExpectedConditions.visibilityOfElementLocated((By.tagName("iframe"))));

        driver.switchTo().frame(0);

        // TODO: 18.03.2018 use until method
//        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(cobaltId3))));
        waitUntillElementBecomeVisible(cobaltId3);

        switchToFrame(cobaltId3);

        waitUntillElementBecomeVisible("co-card_de4cd4be");

        // TODO: 18.03.2018  if user click on left element "Energy transfer"
//        testUserClickOnElement("co-card_de4cd4be");

//        // TODO: 18.03.2018  if user click on right element "Composition"
//        testUserClickOnElement("co-card_5288fd0e");
//        WebElement coCard2 = driver.findElement(By.className("visible"));
//        checkIfTheElementForHasEqualTitle(coCard2, "id", "co-card_5288fd0e");

        WebElement videoButton = driver.findElement(By.id("co-image_b5d68f28"));
        videoButton.click();

//        // TODO: 18.03.2018 check user click on close button
        testUserClickOnElement("co-image_e6ba1752");

        driver.switchTo().defaultContent();
    }

    // TODO: 22.03.2018  maybe need create class with all this method

//
//    // TODO: 21.03.2018 maybe need create after method
//    @AfterMethod
//    public void goBackTomMainPage() {
////        driver.switchTo().parentFrame();
//        driver.switchTo().defaultContent();
//    }

    // TODO: 12.03.2018 create method to verificate title
    private void checkIfTheElementForHasEqualTitle(WebElement elementToCheck, String elementAttribute, String stringToCheck) {
        System.out.println("TEST checkElementForEqualTitle");
        String attribute = elementToCheck.getAttribute(elementAttribute).toLowerCase();
        try {
            Assert.assertEquals(stringToCheck, attribute);
            System.out.println(stringToCheck + " == " + attribute);
        } catch (AssertionError e) {
            System.out.println("Assertion error: " + e);
            System.out.println(stringToCheck + " != " + attribute);
            System.out.println("Wrong element!!!");
            // TODO: 15.03.2018  implement stop
            driver.close();
            driver.quit();
        }
    }

    // TODO: 11.03.2018 create method witch calculate size of element
    private void calculateNumberOfElements (String typeOfElement) {
        List iframe = driver.findElements(By.tagName(typeOfElement));
        System.out.println("There are elements: " + iframe.size() + " tagName " +  typeOfElement);
    }

    // TODO: 12.03.2018 write method click on element
    private void testUserClickOnElement (String theIdOfElement) {
        waitUntillElementBecomeVisible(theIdOfElement);
        WebElement element = driver.findElement(By.id(theIdOfElement));

        try {
            System.out.println("The element is: " + element.getTagName());
            element.click();
            System.out.println("Click success!");
        } catch (Exception e) {
            System.out.println("Click problem with " + theIdOfElement + "!");
            driver.close();
            driver.quit();
        }
    }

    // TODO: 12.03.2018 create method what will be check for frame
    // TODO: 11.03.2018 create method switch to frame
    private void switchToFrame(String nameOfFrame) {
        driver.switchTo().frame(nameOfFrame);
    }

    // TODO: 11.03.2018 create method wait for element
    private void waitUntillElementBecomeVisible(String idOfSearchingElement) {
        try {
            wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(idOfSearchingElement))));
        } catch (Exception e ) {
            System.out.println("Error! Element " + idOfSearchingElement + " didn't load!");
        }

    }

    // TODO: 12.03.2018 getPageSource
    private void getPageSource() {
        System.out.println("Full page source: " + driver.getPageSource());
    }

//    // TODO: 10.03.2018 create methods
    @AfterTest
    public static void afterTest() {
        driver.close();
        driver.quit();
    }

}
