package pages.am_callcenter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class TaskTwo extends BasePage {
    public TaskTwo(WebDriver driver) {
        super(driver);
    }

    private final By personalData = By.xpath("//div[@class='MuiCardContent-root css-1qw96cp']");
    private final By submitBtn = By.xpath("//button[@type='submit']");

    public TaskTwo checkIfExistElements() {
        //Boolean
        boolean personalDataPresence = driver.findElement(personalData).isDisplayed();
        boolean submitBtnPresence = driver.findElement(submitBtn).isDisplayed();
        if (personalDataPresence == true && submitBtnPresence == true) {
            System.out.println("TaskTwo is OK");

        } else {
            System.out.println("TaskTwo is FAIL");
        }
        return this;
    }

}
