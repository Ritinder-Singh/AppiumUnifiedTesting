package basicSetup;


import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DeviceTypeCheck {
    public static void main(String[] args) {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android"); // Modify dynamically
        URL url = null;
        try {
            //noinspection deprecation
            url = new URL("http://127.0.0.1:4723/");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        AppiumDriver driver = null;

        String platformName = capabilities.getCapability("platformName").toString();

        if (platformName.equalsIgnoreCase("Android")) {
            driver = new AppiumDriver(url,capabilities);
            System.out.println("Running on Android");
        } else if (platformName.equalsIgnoreCase("iOS")) {
            driver = new AppiumDriver(url,capabilities);
            System.out.println("Running on iOS");
        }

        // Continue with your tests using 'driver'
    }
}
