package thePackage;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.sun.javafx.image.IntPixelGetter;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import com.aventstack.extentreports.*;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.concurrent.TimeUnit;


public class Main {
    private WebDriver webDriver;
    private AutoTrader autoTrader;
    private ScreenShott screenshot;
    //    private static ExtentReportManager reportManager;
    private static ExtentReports report;
    private ExtentTest test;
    private static String reportFilePath = "Test Report.HTML";

    @BeforeClass
    public static void init(){
        System.out.println("Before Class");
        report= new ExtentReports();
        ExtentHtmlReporter extentHtmlReporter = new ExtentHtmlReporter(reportFilePath);
        extentHtmlReporter.config().setReportName("Friday Project Report");
        extentHtmlReporter.config().setDocumentTitle("Document");
        report.attachReporter(extentHtmlReporter);
    }

    @Before
    public void bef() throws IOException {
        System.out.println("Before");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        test = report.createTest("Will it Run?");
        webDriver = new ChromeDriver(options);
        autoTrader= PageFactory.initElements(webDriver,AutoTrader.class);
        screenshot = PageFactory.initElements(webDriver, ScreenShott.class);
    }
//    @Test
//    public void searchForCar() {
//        Actions mousey = new Actions(webDriver);
//        SheetReader sheetReader = new SheetReader("C:\\Users\\Administrator\\IdeaProjects\\TheTest\\src\\main\\resources\\TestWorksheet.xlsx");
//        System.out.println("test started");
//        List<String> row = sheetReader.readRow(1, "Sheet1");
//        webDriver.navigate().to(row.get(2));
//        mousey.moveToElement(webDriver.findElement(By.xpath("//*[@id=\'postcode\']"))).click();
//        try {
//            TimeUnit.SECONDS.sleep(2);
//        } catch (Exception e) {
//            e.fillInStackTrace();
//        }
//        autoTrader.enterPostcode(row.get(3));
//        autoTrader.pickDistance(row.get(4));
//        try {
//            test.addScreenCaptureFromPath(screenshot.take(webDriver, "take1")); //because take returns a filepath!!!!
//        } catch (IOException e) {
//            e.fillInStackTrace();
//        }
//
////        test.log(Status.INFO, "Info Level");
//        test.pass("Pass");
//    }

//    @Test
//    public void valueCar() {
//        Actions mousey = new Actions(webDriver);
//        SheetReader sheetReader = new SheetReader("C:\\Users\\Administrator\\IdeaProjects\\TheTest\\src\\main\\resources\\TestWorksheet.xlsx");
//        System.out.println("test started");
//        List<String> row = sheetReader.readRow(2, "Sheet1");
//        webDriver.navigate().to(row.get(2));
//        autoTrader.sellCarClick();
//        autoTrader.valueCarClick();
//        autoTrader.enterRegist(row.get(3));
//        autoTrader.enterMilage(row.get(4));
//        autoTrader.getEvaluation();
//
//        try {
//            test.addScreenCaptureFromPath(screenshot.take(webDriver, "take1")); //because take returns a filepath!!!!
//        } catch (IOException e) {
//            e.fillInStackTrace();
//        }
//        if (webDriver.findElement(By.xpath("/html/body/div[1]/div/section[1]/div/section/span/text()")).getText() == "Not your car?" ) { //sort out the assert statement
//            test.pass("Pass");
//        } else {
//            test.fail("Fail");
//        }
//
//    }
//    @Test
//        public void signInSignOut() {
//        Actions mousey = new Actions(webDriver);
//        SheetReader sheetReader = new SheetReader("C:\\Users\\Administrator\\IdeaProjects\\TheTest\\src\\main\\resources\\TestWorksheet.xlsx");
//        System.out.println("test started");
//        List<String> row = sheetReader.readRow(3, "Sheet1");
//        webDriver.navigate().to(row.get(2));
//        autoTrader.signinbutt();
//        autoTrader.enterEmails(row.get(3));
//        autoTrader.enterPasswd(row.get(4));
//        autoTrader.signingInNow();
//        mousey.moveToElement(webDriver.findElement(By.xpath("//*[@id=\'js-header-nav\']/ul/li[5]/div[1]/a/i"))).perform();
//        autoTrader.signoutButt();
//        System.out.println("did we do it?");
//        if (webDriver.findElement(By.xpath("//*[@id=\'js-header-nav\']/ul/li[5]/div[2]/a")).getText() == "Sign in") { //sort out the assert statement
//            System.out.println("we did it");
//            test.pass("Pass");
//        } else {
//            System.out.println("We didnt do it");
//            test.fail("Fail");
//        }
//
//        try {
//            test.addScreenCaptureFromPath(screenshot.take(webDriver, "take1")); //because take returns a filepath!!!!
//        } catch (IOException e) {
//            e.fillInStackTrace();
//        }
//
//    }



    @After
    public void aft(){
        System.out.println("After");
//        try {test.addScreenCaptureFromPath(screenshot.take(webDriver, "take1")); //because take returns a filepath!!!!
//        } catch (IOException e) {e.fillInStackTrace();}
        test.log(Status.INFO, "Info Level");
        webDriver.quit();
        report.flush();
    }
    @AfterClass
    public static void aftcla(){
        System.out.println("After Class");

    }



}
