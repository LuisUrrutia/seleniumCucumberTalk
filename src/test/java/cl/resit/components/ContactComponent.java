package cl.resit.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.util.concurrent.TimeUnit;

public class ContactComponent {

    private WebDriver driver;

    public ContactComponent(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
    }

    @FindBy(name = "algo")
    private WebElement name;

    @FindBy(xpath = "//*[@id=\"wpcf7-f6648-p6556-o1\"]/form/p/label[2]/span/input")
    private WebElement email;

    @FindBy(xpath = "//*[@id=\"wpcf7-f6648-p6556-o1\"]/form/p/label[3]/span/textarea")
    private WebElement message;

    @FindBy(xpath = "//*[@id=\"wpcf7-f6648-p6556-o1\"]/form/p/input")
    private WebElement button;

    @FindBy(xpath = "//*[@id=\"wpcf7-f6648-p6556-o1\"]/form/div[2]")
    private WebElement alert;

    public void setName(String name) {
        this.name.sendKeys(name);
    }

    public void setEmail(String email) {
        this.email.sendKeys(email);
    }

    public void setMessage(String message) {
        this.message.sendKeys(message);
    }

    public void send() {
        button.click();
    }

    public boolean hasSent() throws InterruptedException {
        Thread.sleep(5000);
        return alert.getText().equals("Gracias por tu mensaje. ¡Pronto estaremos en contacto!");
    }
}
