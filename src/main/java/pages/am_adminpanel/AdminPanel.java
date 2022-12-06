package pages.am_adminpanel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class AdminPanel extends BasePage {
    public AdminPanel(WebDriver driver) {
        super(driver);
    }
    private final By burgerMenuBtn = By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-1ty64dg']");
    private final By catalogsBtn = By.xpath("(//div[@class='MuiButtonBase-root MuiListItemButton-root MuiListItemButton-gutters MuiListItemButton-root MuiListItemButton-gutters css-16szxmh'])[1]");
    private final By sourcesGroupsBtn = By.xpath("(//div[@class='MuiButtonBase-root MuiListItemButton-root MuiListItemButton-gutters MuiListItemButton-root MuiListItemButton-gutters css-wqyty6'])[1]");


    public AdminPanel openMenu(){
        driver.findElement(burgerMenuBtn).click();
        return this;
    }
    public AdminPanel openCatalogs(){
        driver.findElement(catalogsBtn).click();
        return this;
    }
    public AdminPanel openSourcesGroups(){
        driver.findElement(sourcesGroupsBtn).click();
        return this;
    }


}
