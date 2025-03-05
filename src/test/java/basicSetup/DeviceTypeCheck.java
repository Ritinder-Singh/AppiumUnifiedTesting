package basicSetup;


import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;

//public class DeviceTypeCheck {
//    public static void main(String[] args) {
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("platformName", "Android"); // Modify dynamically
//        URL url = null;
//        try {
//            //noinspection deprecation
//            url = new URL("http://127.0.0.1:4723/");
//        } catch (MalformedURLException e) {
//            throw new RuntimeException(e);
//        }
//        AppiumDriver driver = null;
//
//        String platformName = capabilities.getCapability("platformName").toString();
//
//        if (platformName.equalsIgnoreCase("Android")) {
//            driver = new AppiumDriver(url,capabilities);
//            capabilities.setCapability();
//            System.out.println("Running on Android");
//        } else if (platformName.equalsIgnoreCase("iOS")) {
//            driver = new AppiumDriver(url,capabilities);
//            System.out.println("Running on iOS");
//        }
//
//        // Continue with your tests using 'driver'
//    }
//}



public class DeviceTypeCheck {

    public static void main(String[] args) throws Exception {
        // Set up desired capabilities
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium:deviceName", "your_device_name");
//        capabilities.setCapability("appium:automationName", "UiAutomator2"); // Default for Android
        capabilities.setCapability("appium:platformVersion", "your_platform_version");

        // For the purpose of the example, we’ll assume we are connecting to Appium locally
        URL appiumServerUrl = new URL("http://127.0.0.1:4723/wd/hub");

        // Initialize the driver
        AppiumDriver driver = new AppiumDriver(appiumServerUrl, capabilities);

        // Get platform name dynamically from the capabilities after the driver is initialized
        String platformName = driver.getCapabilities().getCapability("platformName").toString();

        if (platformName.equalsIgnoreCase("Android")) {
            System.out.println("Running on Android");
            capabilities.setCapability("appium:deviceName","sdk_gphone64_x86_64");
            capabilities.setCapability("appium:platformVersion","14");
            capabilities.setCapability("appium:appPackage","com.amazon.mShop.android.shopping");
            capabilities.setCapability("appium:appActivity","com.amazon.mShop.navigation.MainActivity");
            capabilities.setCapability("automationName","UiAutomator2");
            capabilities.setCapability("udid","emulator-5554");

        } else if (platformName.equalsIgnoreCase("iOS")) {
            System.out.println("Running on iOS");
            capabilities.setCapability("appium:deviceName","");
        } else {
            System.out.println("Unknown platform");
        }
//        platformName=Android
//        platformVersion=14
//        appPackage=org.simple.clinic.staging
//        appActivity=org.simple.clinic.setup.SetupActivity
//        automationName=UiAutomator2
//        deviceName=sdk_gphone64_x86_64
//        udid=emulator-5554


        // Continue with the test execution...
    }
}

