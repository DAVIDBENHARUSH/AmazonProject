package utilities;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.SoftAssert;
import org.w3c.dom.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.concurrent.TimeUnit;


public class CommonOps extends Base {


    public static String getData(String nodeName){
        File fXmlFile;
        DocumentBuilderFactory dbFactory;
        DocumentBuilder dbBuilder;
        Document doc = null;
        try {
            fXmlFile = new File("./Configuration/DataConfig.xml");
            dbFactory = DocumentBuilderFactory.newInstance();
            dbBuilder = dbFactory.newDocumentBuilder();
            doc = dbBuilder.parse(fXmlFile);
            doc.getDocumentElement().normalize();
        }
        catch (Exception e){
            System.out.println("Error Reading xml file :" + e);
        }
        finally {
            return doc.getElementsByTagName(nodeName).item(0).getTextContent();
        }
    }

    public static void initBrowser(String browserType){

        if (browserType.equalsIgnoreCase("chrome"))
            driver = initChromeDriver();
        else if (browserType.equalsIgnoreCase("firefox"))
            driver = initFirefoxDriver();
        else if (browserType.equalsIgnoreCase("ie"))
            driver = initIEDriver();
        else
            throw new RuntimeException("Invalid Browser Type");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver,5);
        driver.get(getData("url"));
        ManagePages.initNopcommerce();
        action = new Actions(driver);
        softAssert = new SoftAssert();
    }

    public static WebDriver initChromeDriver(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        return driver;
    }
    public static WebDriver initFirefoxDriver(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        return driver;
    }
    public static WebDriver initIEDriver(){
        WebDriverManager.iedriver().setup();
        WebDriver driver = new InternetExplorerDriver();
        return driver;
    }

    @BeforeClass
    public void StartSession() {
        if (getData("PlatformName").equalsIgnoreCase("web"))
            initBrowser(getData("BrowserName"));
      // else if (getData("PlatformName").equalsIgnoreCase("mobile"))
         //  initMobile();
        else
            throw new RuntimeException("Invalid platform name");


    }

    @AfterClass
    public void CloseSession(){
        driver.quit();
    }


    @AfterMethod

    public void AfterMethod(){
        driver.navigate().refresh();
    }

}




