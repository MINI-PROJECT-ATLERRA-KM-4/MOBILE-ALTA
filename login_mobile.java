import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebElement;

import java.lang.reflect.Field;
import java.net.MalformedURLException;
import java.net.URL;

public class login_mobile {
    public static void main(String[] args) throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options()
                .setUdid("emulator-5554")
                .setApp("E:/SDK/app-release.apk");
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4773"), options);
        try {
            WebElement button_login = driver.findElement(AppiumBy.xpath("   "));
            button_login.click();

            WebElement button_register = driver.findElement(AppiumBy.xpath(""));
            button_register.click();
        } finally {

        }
    }
}