package cl.resit.components;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class MenuComponent {

    private WebDriver driver;

    public MenuComponent(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
    }

    @FindBy(xpath = "//*[@id=\"menu-main-menu-3\"]/li[1]/a")
    private WebElement projects;

    @FindBy(xpath = "//*[@id=\"menu-main-menu-3\"]/li[2]/a")
    private WebElement contact;

    public void goToProjects() {
        projects.click();
    }

    public void goToContact() {
        contact.click();
    }
}
