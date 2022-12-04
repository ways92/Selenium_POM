package steps;

import base.BaseClass;
import io.cucumber.java.After;

public class Hook extends BaseClass {
    @After
    public void closeBrow() {
        closeBrowser();
    }
}
