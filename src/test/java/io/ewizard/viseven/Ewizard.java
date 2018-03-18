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
    private static WebDriverWait wait = null;
    private static String cobaltId = "cobalt";
    private static String cobaltId2 = "cobalt_copy2";
    private static String cobaltId3 = "cobalt_copy3";

    @BeforeClass
    public static void setup() {
        //  TODO: 03.03.2018  load WebDriver
//		System.setProperty("webdriver.chrome.driver", "c:\chromedriver\chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver", "c:/chromedriver/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

        String url = "https://viseven.ewizard.io/sharing/#/NWE2MWVhZjBkYWE1ZmMwMDJmZDdlYWU2fDAuMC45MA==";

        driver = new ChromeDriver();

//        wait
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        wait = new WebDriverWait(driver, 20);
        // TODO: 18.03.2018 add error message to webDriverWait
//        wait = new WebDriverWait(driver, 20).withMessage("Error the element coudn't found");
        // TODO: 18.03.2018 use typecasting
        wait = (WebDriverWait) new WebDriverWait(driver, 10).withMessage("Error the element coudn't found");


        driver.get(url);

        System.out.println("Connect to site: " + url);
    }


    // TODO: 02.03.2018 case #1
    @Test
//    public void test() {
////        String urlTitle = "cobalt";
//        String urlTitle = "eWizard";
//        String siteTitle = "";
////        String cobaltId = "cobalt";
////        String cobaltId2 = "cobalt_copy2";
//
//        // TODO: 08.03.2018  wait
////        WebDriverWait wait = new WebDriverWait(driver, 20);
//
////        get site title
////        driver.findElement(By.tagName("title"));
////        siteTitle = driver.findElement(By.tagName("title")).getText();
//        siteTitle = driver.getTitle();
//
//        // TODO: 03.03.2018  check title of site
////        if (urlTitle.contentEquals(siteTitle)) {
//////            "right" title
////            System.out.println("Test passed! The site have title: " + siteTitle);
////        } else {
//////            different title
////            System.out.println("Test failed! Site have wrong title: " + siteTitle);
////        }
//        Assert.assertEquals(siteTitle, urlTitle);
//
////		System.out.println("Full page source: " + driver.getPageSource());
////        System.out.println("Wait to iframes.");
////        wait.until(ExpectedConditions.visibilityOfElementLocated((By.tagName("iframe"))));
//        waitUntillElementBecomeVisible("iframe");
//
//        // TODO:  03.03.2018  check if iframe used
////        List<WebElement> list = driver.findElements(By.tagName("iframe"));
////        int size = list.size();
////        System.out.println("Was founded frame(s) " + size);
//
//        // TODO:  03.03.2018  switch to iframe
////        System.out.println("Check for iframes.");
////        System.out.println("Was founded frame(s) " + driver.findElements(By.tagName("iframe")).size());
//
////        System.out.println("Switch to iframes.");
//        driver.switchTo().frame(0);
//
//        // TODO: 07.03.2018  need to check for loading DOM!!!
////        System.out.println("Wait to iframes.");
////        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
////        wait.until(ExpectedConditions.visibilityOfElementLocated((By.tagName("iframe"))));
////        wait.until(ExpectedConditions.visibilityOfElementLocated((By.id(cobaltId))));
//        waitUntillElementBecomeVisible("iframe");
//
//        // TODO: 05.03.18 check for more frame
//        // TODO: 09.03.2018 maybe need to write the check if list has iframe with id="cobalt"
////         System.out.println("Check for more iframes.");
////        List<WebElement> list = driver.findElements(By.tagName("iframe"));
////        int size = list.size();
////        System.out.println("Was founded frame(s) " + size);
////        System.out.println("Was founded frame(s) " + driver.findElements(By.tagName("iframe")).size());
//
//        // TODO: 05.03.18 switch to cobalt iframe
////        System.out.println("Switch to iframes " + cobaltId );
////          #cobalt
////         //*[@id="cobalt"]
////        driver.switchTo().frame("#cobalt");
////        driver.switchTo().frame(driver.findElement(By.id("#cobalt")));
////        System.out.println("Switch to iframes.");
////        driver.switchTo().frame(list.get(0));
////        body > div > div > div > div > md-content > ewizard-viewer-presentation > div.scroll-space > div > iframe
////                /html/body/div/div/div/div/md-content/ewizard-viewer-presentation/div[2]/div/iframe
//
//       // TODO: 11.03.2018  switch to frame cobalt
////        driver.switchTo().frame(cobaltId);
//        // TODO: 12.03.2018 use switchToFrame method
//        switchToFrame(cobaltId);
//
////        System.out.println("source " + driver.getPageSource());
////		  System.out.println("Was founded frame(s) " + driver.findElements(By.tagName("iframe")).size());
//
//        // TODO: 03.03.2018 locate element which will be click
//        // TODO: STILL DIDN'T WORK!!!
//        // #co-image_b777afd9 > div
////		//*[@id="co-image_b777afd9"]/div
////      #co-image_b777afd9
////		//*[@id="co-image_b777afd9"]
////        WebElement element = driver.findElement(By.tagName("article"));
////        WebElement element = driver.findElement(By.className("slide"));
////        WebElement element = driver.findElement(By.id("co-image_b777afd9"));
////        WebElement element = driver.findElement(By.cssSelector("#co-image_b777afd9 > div"));
////        WebElement element = driver.findElement(By.cssSelector("co-image[id='co-image_b777afd9'"));
////        WebElement element = driver.findElement(By.cssSelector("co-image[id^='co-image_']"));
//
//        // TODO: 07.03.2018 need to use xpath!!! or
//        // TODO: 10.03.2018 id > tagName > cssSelector > xpath
////        moon
////        WebElement element = driver.findElement(By.xpath("//*[@id='co-image_b777afd9']"));
////        WebElement element = driver.findElement(By.id("co-image_b777afd9"));
////
//////        WebElement element = driver.findElement(By.xpath("//*[@id=\"co-image_1b9210c1\"]"));
////        try {
//////            System.out.println("The element is: " + element.getTagName());
////            element.click();
//////            System.out.println("Click success!");
////        } catch (Exception e) {
////            System.out.println("Click problem with " + element.getTagName() + "!");
////        }
//        // TODO: 12.03.2018 rewrite use testUserClickOnElement
//        testUserClickOnElement("co-image_b777afd9");
//
////		TODO: TEST with google try too google WORK FINE!!!
////		WebElement element = driver.findElement(By.tagName("input"));
////		WebElement element = driver.findElement(By.name("q"));
////		element.sendKeys("facebook");
//
//        // TODO: 08.03.2018 need to locate element in iframe co-popup
//        // TODO: 09.03.2018 and check if element has class "visible" to be sure
//
//        // TODO: 10.03.2018 check for co-popup elements
////        System.out.println("Popups " + driver.findElements(By.tagName("co-popup")).size());
////        List <WebElement> popups = driver.findElements(By.tagName("co-popup"));
////        for (WebElement popup :
////             popups) {
//////            popup.getAttribute("id");
////            String clss = popup.getAttribute("class");
////            String[] splitClss = clss.split(" ");
//////            List <String> splitClss = clss.split(" ");
////            for (String s:
////                 splitClss) {
////                if (s.equals("visible")) {
////                    System.out.println(popup.getAttribute("id"));
////                }
////            }
////        }
//        // TODO: 12.03.2018 PROBLEM sometimes coudn't load co-popup
////        waitUntillElementBecomeVisible("co-popup[class=\"visible\"]");
////        try {
//////        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//////            wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("co-text_a46e9e59"))));
//////        wait.until(ExpectedConditions.visibilityOfElementLocated((By.tagName("co-popup"))));
//////            waitUntillElementBecomeVisible("irame");
//////            waitUntillElementBecomeVisible("co-popup[class=\"visible\"]");
////            waitUntillElementBecomeVisible("co-popup");
////        } catch (Exception e ) {
////            System.out.println("Error! Element didn't load!");
////        }
//        waitUntillElementBecomeVisible("co-popup");
//
//        WebElement visibleEl = driver.findElement(By.className("visible"));
//
//        // TODO: 12.03.2018 rewrite to use method checkElementForEqualTitle
////        Assert.assertEquals(visibleEl.getAttribute("id"), "co-popup_eb73c9af");
//        checkIfTheElementForHasEqualTitle(visibleEl, "id","co-popup_eb73c9af");
//
////        WebElement popup =  driver.findElement(By.xpath("*[@id=\"co-popup_eb73c9af\"]"));
////        String classes = popup.getAttribute("class");
////        for (String clss :
////             classes.split(" ")) {
////            if (clss.equals("visible")) {
////                System.out.println(classes.toString());
////            }
////        }
////        System.out.println("Find element " + driver.findElement(By.xpath("*[@id=\"co-popup_eb73c9af\"]")).getTagName());
////        driver.findElement(By.xpath("*[@id=\"co-popup_eb73c9af\"]")).getText();
////        driver.findElement(By.xpath("*[@id=\"co-popup_eb73c9af\"]")).getAttribute("class");
//        // check if is a Moon
////        <u>MOON</u>
////        #co-text_a729dc3a > span > div:nth-child(1) > span > font > u
////        //*[@id="co-text_a729dc3a"]/span/div[1]/span/font/u
//
////        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
//
//        // TODO: 08.03.2018 get list of elements
////        List<WebElement> elements = driver.findElements(By.xpath("//*[@id='co-text_a729dc3a']/span/div[1]/span/font/u"));
////        System.out.println(elements.size());
//
//        // TODO: 08.03.2018 find element
//        WebElement element2 = driver.findElement(By.xpath("//*[@id='co-text_a729dc3a']/span/div[1]/span/font/u"));
////        String u = driver.findElements(By.xpath("//*[@id='co-text_a729dc3a']/span/div[1]/span/font/u")).toString();
////        System.out.println(element2.toString());
////        System.out.println(element2.getTagName());
////        System.out.println(element2.getText());
//
//        // TODO: 08.03.2018 and check if it's the "moon"
//        // TODO: 09.03.2018 use method getAttribute and attribute "innerHTML"
////        System.out.println("The tag value is " + element2.getText());
////        System.out.println("The tag value is " + element2.getAttribute("value"));
////        System.out.println("The tag value is " + element2.getAttribute("innerHTML"));
//
//        // check if is a Moon
//        // TODO: 12.03.2018 rewrite to use checkIfTheElementForHasEqualTitle
////        Assert.assertEquals(element2.getText(), "<u>MOON</u>");
////        Assert.assertEquals(element2.getText(), "MOON");
////        Assert.assertEquals(element2.getAttribute("innerHTML"), "MOON");
//        checkIfTheElementForHasEqualTitle(element2, "innerHTML","moon");
//
//        // TODO: 10.03.2018 find link more info... and click
//        // find more info and click
//        //*[@id="co-text_a46e9e59"]/span/span
////        #co-text_a46e9e59 > span > span
//
////        driver.findElement(By.xpath("//*[@id=\"co-text_a46e9e59\"]/span/span")).click();
////        driver.findElement(By.cssSelector("#co-text_a46e9e59 > span")).click();
////        wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("co-text_a46e9e59"))));
////        wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("co-popup_eb73c9af"))));
////        driver.findElement(By.id("co-text_a46e9e59")).click();
//        // TODO: 12.03.2018 use testUserClickOnElement
//        testUserClickOnElement("co-text_a46e9e59");
////        driver.findElement(By.linkText("more information ...")).click();
////        driver.findElement(By.cssSelector("#co-text_a46e9e59")).click();
//
//        // TODO: 11.03.2018 check for iframe locate elements close or back and formation
////        driver.switchTo().parentFrame();
//        driver.switchTo().defaultContent();
//////        System.out.println(driver.getPageSource());
//
//        driver.switchTo().frame(0);
////        List iframe = driver.findElements(By.tagName("iframe"));
////        System.out.println("iframe count: " + iframe.size() );
//
//        // TODO: 11.03.2018  switch to frame cobalt_copy2
////        driver.switchTo().frame(cobaltId2);
//        // TODO: 12.03.2018 use switchToFrame method
//        switchToFrame(cobaltId2);
//
//        // TODO: 10.03.2018 locate element "Formation" and click
//        // TODO: 12.03.2018 PROBLEM! coudn't locate element
//        //*[@id="co-tabs_ebb8d143"]/co-tab-group/co-container[1]/co-menu/co-iscroll/div/co-select/co-collection/co-collection-item[1]/co-container/co-option/co-container[2]/co-text/span/b
//        //*[@id="co-tabs_ebb8d143"]/co-tab-group/co-container[1]/co-menu/co-iscroll/div/co-select/co-collection/co-collection-item[2]/co-container/co-option
//
////        System.out.println(driver.getPageSource());
//
////        #co-tabs_ebb8d143
////        try {
////            wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("co-tabs_ebb8d14"))));
////        } catch (Exception e) {
////            System.out.println("Error! Element didn't load!2");
////        }
////        List<WebElement> coll = driver.findElements(By.id("co-tabs_ebb8d14"));
////
////        System.out.println("Coll " + coll.size() );
//
////        driver.findElement(By.xpath("//*[@id=\"co-tabs_ebb8d143\"]/co-tab-group/co-container[1]/co-menu/co-iscroll/div/co-select/co-collection/co-collection-item[2]/co-container/co-option"))
////                .click();
////        driver.findElement(By.tagName());
//
//        // TODO: 10.03.2018  back to main
////        /html/body/div/div/div/div/md-content/ewizard-viewer-presentation/div[1]/button[2]/i
////        /html/body/div/div/div/div/md-content/ewizard-viewer-presentation/div[1]/button[2]
////        System.out.println(driver.getPageSource());
//
////        driver.findElement(By.cssSelector("button[class=\"ew-button\"]")).click();
////        driver.findElement(By.xpath("/html/body/div/div/div/div/md-content/ewizard-viewer-presentation/div[1]/button[2]")).click();
//
////        // TODO: 11.03.2018  locate close button
//        // TODO: 12.03.2018 didn't work
////        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
////        wait.until(ExpectedConditions.visibilityOfElementLocated((By.tagName(""))));
//
////        //*[@id="co-image_b2b71d8f"]
////        WebElement back = driver.findElement(By.id("co-image_b2b71d8f"));
////////        WebElement back = driver.findElement(By.cssSelector("//*[@id='co-image_b777afd9']"));
////////        WebElement back = driver.findElement(By.xpath("//*[@id='co-image_b777afd9']"));
//////
//////        try {
//////            System.out.println("The element is: " + back.getTagName());
//////            back.click();
//////            System.out.println("Click success!");
//////        } catch (Exception e) {
//////            System.out.println("Click problem with " + back.getTagName() + "!");
//////        }
//        // TODO: 12.03.2018 rewrite to use testUserClickOnElement
//        testUserClickOnElement("co-image_b2b71d8f");
//
////        List <WebElement> list = driver.findElements(By.tagName("button"));
////        System.out.println("There are " + list.size() + " Button!");
//
////        List<WebElement> list = driver.findElements(By.tagName("iframe"));
////        int size = list.size();
////        System.out.println("Was founded frame(s) " + size);
////        System.out.println("Was founded frame(s) " + driver.findElements(By.tagName("iframe")).size());
//
////        wait.until(ExpectedConditions.visibilityOfElementLocated((By.tagName("iframe"))));
//        //*[@id="co-tabs_ebb8d143"]/co-tab-group/co-container[1]/co-menu/co-iscroll/div/co-select
//        //*[@id="co-image_7745e6b5"]
////        wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"co-image_b2b71d8f\"]"))));
////        driver.findElement(By.xpath("//*[@id=\"co-image_b2b71d8f\"]")).click();
//
////        WebElement back = driver.findElement(By.xpath("//*[@id='co-image_b777afd9']"));
////
//////        WebElement element = driver.findElement(By.xpath("//*[@id=\"co-image_1b9210c1\"]"));
////        try {
//////            System.out.println("The element is: " + element.getTagName());
////            back.click();
//////            System.out.println("Click success!");
////        } catch (Exception e) {
////            System.out.println("Click problem with " + back.getTagName() + "!");
////        }
//    }

    // TODO: 11.03.2018  case #2
    public void test2 (){

//        calculateNumberOfElements("iframe");
        wait.until(ExpectedConditions.visibilityOfElementLocated((By.tagName("iframe"))));
//        waitUntillElementBecomeVisible("iframe");

        driver.switchTo().frame(0);

//        calculateNumberOfElements("iframe");

//        waitUntillElementBecomeVisible("iframe");
        wait.until(ExpectedConditions.visibilityOfElementLocated((By.tagName("iframe"))));
//        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(cobaltId))));

        switchToFrame(cobaltId);

        testUserClickOnElement("co-image_1b9210c1");

//        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("co-text_30f6873f"))));
//        WebElement element2 = driver.findElement(By.xpath("//*[@id=\"co-text_30f6873f\"]/span/div[1]/font/b/u"));
        WebElement element2 = driver.findElement(By.cssSelector(" #co-text_30f6873f > span > div:nth-child(1) > font > b > u"));

        checkIfTheElementForHasEqualTitle(element2, "innerHTML","sun");

//        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("co-text_187ed57b"))));
//        waitUntillElementBecomeVisible("co-text_187ed57b");
        testUserClickOnElement("co-text_187ed57b");

//        driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();

//        waitUntillElementBecomeVisible("iframe");
        wait.until(ExpectedConditions.visibilityOfElementLocated((By.tagName("iframe"))));

        driver.switchTo().frame(0);
//        waitUntillElementBecomeVisible("iframe");
//        waitUntillElementBecomeVisible(cobaltId3);
        // TODO: 18.03.2018 use until method
//        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(cobaltId3))));
        waitUntillElementBecomeVisible(cobaltId3);

        switchToFrame(cobaltId3);

//        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("cobalt_copy3"))));
//        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("co-card_de4cd4be"))));
//        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("co-card_5288fd0e"))));
//        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.tagName("co-card"))));
//        waitUntillElementBecomeVisible("co-card_de4cd4be");
        // TODO: 18.03.2018  if user click on left element "Energy transfer"
        testUserClickOnElement("co-card_de4cd4be");

        // TODO: 18.03.2018 locate co-popup and check if it is visible
        Boolean coCardValue = driver.findElement(By.id("co-popup_e5eff596")).getAttribute("class").contains("visible");
        System.out.println(coCardValue);

//        waitUntillElementBecomeVisible("co-popup_e5eff596");

        // TODO: 18.03.2018  if user click on right element "Composition"
        testUserClickOnElement("co-card_5288fd0e");

        // TODO: 18.03.2018 check to user click on close button
//        testUserClickOnElement("co-image_b2b71d8f");
//        #co-image_e6ba1752 > div
//        //*[@id="co-image_e6ba1752"]/div
//        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("co-image_e6ba1752"))));
//        testUserClickOnElement("co-image_e6ba1752");

//        /html/body/div/div/div/div/md-content/ewizard-viewer-presentation/div[1]/button[2]
    }

    // TODO: 12.03.2018 create method to vereficate title
    private void checkIfTheElementForHasEqualTitle(WebElement elementToCheck, String elementAttribute, String stringToCheck) {
        Assert.assertEquals(elementToCheck.getAttribute(elementAttribute).toLowerCase(), stringToCheck);
//        System.out.println("TEST checkElementForEqualTitle");
    }
    // TODO: 11.03.2018 create method witch calculate size of element
    private void calculateNumberOfElements (String typeOfElement) {
        List iframe = driver.findElements(By.tagName(typeOfElement));
        System.out.println("There are elements: " + iframe.size() + " tagName " +  typeOfElement);
    }
    // TODO: 12.03.2018 write method click on element
    private void testUserClickOnElement (String theIdOfElement) {
//        waitUntillElementBecomeVisible("co-image");
        waitUntillElementBecomeVisible(theIdOfElement);
        //*[@id="co-image_b2b71d8f"]
//        WebElement element = driver.findElement(By.id("co-image_b2b71d8f"));
        WebElement element = driver.findElement(By.id(theIdOfElement));
//        WebElement back = driver.findElement(By.cssSelector("//*[@id='co-image_b777afd9']"));
//        WebElement back = driver.findElement(By.xpath("//*[@id='co-image_b777afd9']"));

        try {
            System.out.println("The element is: " + element.getTagName());
            element.click();
            System.out.println("Click success!");
        } catch (Exception e) {
            System.out.println("Click problem with " + theIdOfElement + "!");
        }
    }

    // TODO: 12.03.2018 create method what will be check for frame
    // TODO: 11.03.2018 create method switch to frame
    private void switchToFrame(String nameOfFrame) {
//        driver.switchTo().frame(cobaltId);
        driver.switchTo().frame(nameOfFrame);
    }
    // TODO: 11.03.2018 create method wait for element
//    private void waitUntillElementBecomeVisible(String nameOfSearchingElement) {
    private void waitUntillElementBecomeVisible(String idOfSearchingElement) {
//        wait.until(ExpectedConditions.visibilityOfElementLocated((By.tagName("iframe"))));
//        wait.until(ExpectedConditions.visibilityOfElementLocated((By.tagName(nameOfSearchingElement))));

        try {
//        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//            wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("co-text_a46e9e59"))));
//        wait.until(ExpectedConditions.visibilityOfElementLocated((By.tagName("co-popup"))));
//            wait.until(ExpectedConditions.visibilityOfElementLocated((By.tagName(nameOfSearchingElement))));
            wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(idOfSearchingElement))));
        } catch (Exception e ) {
            System.out.println("Error! Element " + idOfSearchingElement + " didn't load!");
        }

    }

    // TODO: 12.03.2018 getPageSource
    private void getPageSource() {
        System.out.println("Full page source: " + driver.getPageSource());
    }

    // TODO: 10.03.2018 create methods
//    @AfterClass
    public static void tearDown() {
        driver.close();
        driver.quit();
    }
}
