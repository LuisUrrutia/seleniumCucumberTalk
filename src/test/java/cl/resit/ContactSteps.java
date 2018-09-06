package cl.resit;

import cl.resit.components.ContactComponent;
import cl.resit.components.MenuComponent;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactSteps {
    private WebDriver driver;
    private MenuComponent menuComponent;
    private ContactComponent contactComponent;

    public ContactSteps() {
        driver = new ChromeDriver();
        menuComponent = new MenuComponent(driver);
        contactComponent = new ContactComponent(driver);
    }

    @Given("^que estoy en la página de resIT$")
    public void backgroundOnResIT() {
        driver.get("https://resit.cl");
    }

    @Given("^que he realizado clic en contacto$")
    public void goToContact() {
        menuComponent.goToContact();
    }

    @And("^que he ingresado mi nombre (.*)$")
    public void enterName(String name) {
        contactComponent.setName(name);
    }

    @And("^que he dado mi correo electrónico (.*)$")
    public void enterEmail(String email) {
        contactComponent.setEmail(email);
    }

    @And("^que he ingresado mi mensaje (.*)$")
    public void enterMessage(String message) {
        contactComponent.setMessage(message);
    }

    @When("^presione el botón enviar$")
    public void sendContact() {
        contactComponent.send();
    }


    @Then("^mi mensaje se debería haber enviado$")
    public void checkSent() throws InterruptedException {
        Assert.assertTrue(contactComponent.hasSent());
    }
}
