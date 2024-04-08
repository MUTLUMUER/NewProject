package stepDefinitions;

import Utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks {

    @Before
    public void before() {
        // System.out.println("Senaryo başladı");
    }
    @After
    public void after(Scenario senaryo) {
        //senaryo fail olduysa ekran kaydı al
        if (senaryo.isFailed()) {
            // aşağıdaki bölüm sadece extend report plugini devrede ise açılır
//          TakesScreenshot ts=(TakesScreenshot) GWD.getDriver();
//          byte[] hafizadakiHali= ts.getScreenshotAs(OutputType.BYTES);
//          senaryo.attach(hafizadakiHali, "image/png", "screenshot name");
            GWD.quitDriver();
        }
        GWD.quitDriver();
    }
}
