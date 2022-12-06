package pages.am_adminpanel;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.base.BasePage;

public class AdminPanel extends BasePage {
    public AdminPanel(WebDriver driver) {
        super(driver);
    }

    //Burger Menu
    private final By burgerMenuBtn = By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-1ty64dg']");
    //Catalogs
    private final By catalogsBtn = By.xpath("(//div[@class='MuiButtonBase-root MuiListItemButton-root MuiListItemButton-gutters MuiListItemButton-root MuiListItemButton-gutters css-16szxmh'])[1]");
    private final By sourcesGroupsBtn = By.xpath("(//div[@class='MuiButtonBase-root MuiListItemButton-root MuiListItemButton-gutters MuiListItemButton-root MuiListItemButton-gutters css-wqyty6'])[1]");
    private final By sourcesBtn = By.xpath("(//div[@class='MuiButtonBase-root MuiListItemButton-root MuiListItemButton-gutters MuiListItemButton-root MuiListItemButton-gutters css-wqyty6'])[2]");
    private final By countriesBtn = By.xpath("(//div[@class='MuiButtonBase-root MuiListItemButton-root MuiListItemButton-gutters MuiListItemButton-root MuiListItemButton-gutters css-wqyty6'])[3]");
    private final By regionsBtn = By.xpath("(//div[@class='MuiButtonBase-root MuiListItemButton-root MuiListItemButton-gutters MuiListItemButton-root MuiListItemButton-gutters css-wqyty6'])[4]");
    private final By locationsBtn = By.xpath("(//div[@class='MuiButtonBase-root MuiListItemButton-root MuiListItemButton-gutters MuiListItemButton-root MuiListItemButton-gutters css-wqyty6'])[5]");
    private final By employeesBtn = By.xpath("(//div[@class='MuiButtonBase-root MuiListItemButton-root MuiListItemButton-gutters MuiListItemButton-root MuiListItemButton-gutters css-wqyty6'])[6]");
    private final By employersBtn = By.xpath("(//div[@class='MuiButtonBase-root MuiListItemButton-root MuiListItemButton-gutters MuiListItemButton-root MuiListItemButton-gutters css-wqyty6'])[7]");
    private final By employeePositionsBtn = By.xpath("(//div[@class='MuiButtonBase-root MuiListItemButton-root MuiListItemButton-gutters MuiListItemButton-root MuiListItemButton-gutters css-wqyty6'])[8]");
    private final By companiesBtn = By.xpath("(//div[@class='MuiButtonBase-root MuiListItemButton-root MuiListItemButton-gutters MuiListItemButton-root MuiListItemButton-gutters css-wqyty6'])[9]");
    private final By companyOfficesBtn = By.xpath("(//div[@class='MuiButtonBase-root MuiListItemButton-root MuiListItemButton-gutters MuiListItemButton-root MuiListItemButton-gutters css-wqyty6'])[10]");
    private final By brandsBtn = By.xpath("(//div[@class='MuiButtonBase-root MuiListItemButton-root MuiListItemButton-gutters MuiListItemButton-root MuiListItemButton-gutters css-wqyty6'])[11]");
    private final By offersBtn = By.xpath("(//div[@class='MuiButtonBase-root MuiListItemButton-root MuiListItemButton-gutters MuiListItemButton-root MuiListItemButton-gutters css-wqyty6'])[12]");
    private final By professionsBtn = By.xpath("(//div[@class='MuiButtonBase-root MuiListItemButton-root MuiListItemButton-gutters MuiListItemButton-root MuiListItemButton-gutters css-wqyty6'])[13]");
    private final By languagesBtn = By.xpath("(//div[@class='MuiButtonBase-root MuiListItemButton-root MuiListItemButton-gutters MuiListItemButton-root MuiListItemButton-gutters css-wqyty6'])[14]");
    private final By callbackReasonsBtn = By.xpath("(//div[@class='MuiButtonBase-root MuiListItemButton-root MuiListItemButton-gutters MuiListItemButton-root MuiListItemButton-gutters css-wqyty6'])[15]");
    //Call center
    private final By callCenterBtn = By.xpath("(//div[@class='MuiButtonBase-root MuiListItemButton-root MuiListItemButton-gutters MuiListItemButton-root MuiListItemButton-gutters css-16szxmh'])[2]");
    private final By tasks = By.xpath("(//div[@class='MuiButtonBase-root MuiListItemButton-root MuiListItemButton-gutters MuiListItemButton-root MuiListItemButton-gutters css-wqyty6'])[16]");
    private final By taskTwo = By.xpath("(//div[@class='MuiButtonBase-root MuiListItemButton-root MuiListItemButton-gutters MuiListItemButton-root MuiListItemButton-gutters css-wqyty6'])[17]");
    private final By leadsBtn = By.xpath("(//div[@class='MuiButtonBase-root MuiListItemButton-root MuiListItemButton-gutters MuiListItemButton-root MuiListItemButton-gutters css-wqyty6'])[18]");
    //System
    private final By systemBtn = By.xpath("(//div[@class='MuiButtonBase-root MuiListItemButton-root MuiListItemButton-gutters MuiListItemButton-root MuiListItemButton-gutters css-16szxmh'])[3]");
    private final By usersBtn = By.xpath("(//div[@class='MuiButtonBase-root MuiListItemButton-root MuiListItemButton-gutters MuiListItemButton-root MuiListItemButton-gutters css-wqyty6'])[19]");



    public AdminPanel openMenu() {
        driver.findElement(burgerMenuBtn).click();
        return this;
    }

    public AdminPanel openCatalogs() {
        driver.findElement(catalogsBtn).click();
        return this;
    }

    public AdminPanel openSourcesGroups() {
        driver.findElement(sourcesGroupsBtn).click();
        return this;
    }


}
