package Hooks;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;
import utilities.ReusableMethods;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.time.Duration;

import static utilities.Driver.isAppiumServerRunning;

public class Hooks {

    public static AppiumDriverLocalService server;

    @Before
    public void setUp() throws InterruptedException {
        AppiumServiceBuilder builder = new AppiumServiceBuilder();
        builder
                .withIPAddress("127.0.0.1")
                .usingPort(4723)
                .withTimeout(Duration.ofSeconds(30));


        server = AppiumDriverLocalService.buildService(builder);

        server.start();

        int maxWaitTimeSeconds  = 120;
        int port = 4723;
        boolean serverStarted = false;

        for (int i = 0; i < maxWaitTimeSeconds; i += 5) {
            if (isAppiumServerRunning("localhost", port)) {
                serverStarted = true;
                break;
            } else {
                Thread.sleep(5000); // 5 saniye bekleyin ve tekrar kontrol edin
            }
        }

        if (serverStarted) {
            System.out.println("Appium sunucusu başarıyla başlatıldı ve bağlandı.");
        } else {
            System.out.println("Appium sunucusu başlatılamadı veya bağlantı sağlanamadı.");
        }}

    @After
    public void tearDown(Scenario scenario) throws InterruptedException, IOException {
        String screenshot=ReusableMethods.getScreenshot("Team4");
        if (scenario.isFailed()) {
            //final byte[] screenshot = ((TakesScreenshot) Driver.getAppiumDriver() ).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshots");
        }
        //Driver.quitAppiumDriver();
        try {
            // Node.js süreçlerini sonlandır
            Runtime.getRuntime().exec("taskkill /F /IM node.exe");
            // Komut istemcisi süreçlerini sonlandır
            Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }}
/*
    public void forceStopAppiumServer() {

        try {
            // Node.js süreçlerini sonlandır
            Runtime.getRuntime().exec("taskkill /F /IM node.exe");
            // Komut istemcisi süreçlerini sonlandır
            Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

