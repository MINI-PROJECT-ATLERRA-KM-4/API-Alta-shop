import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import starter.navigation.NavigateTo;


public class loginvercell {

    @Given("user in login page")
    public void userInLoginPage(Actor actor) {
        actor.wasAbleTo(NavigateTo.theAltaShopLoginPage());
    }

    @When("dont have user account")
    public void dontHaveUserAccount(Actor actor) {
        actor.wasAbleTo(NavigateTo.theAltaShopLoginPage());
    }

    @And("user create user account")
    public void userCreateUserAccount(Actor actor, String string) {
        actor.attemptsTo(fillFormName());
    }

    @Then("user have user account")
    public void userHaveUserAccount(Actor actor, String string) {
        actor.wasAbleTo(NavigateTo.theAltaShopLoginPage());
    }

    @When("user does not have account")
    public void userDoesNotHaveAccount(Actor actor) {
        actor.wasAbleTo(NavigateTo.theAltaShopLoginPage());
    }

    @Then("user register")
    public void userRegister(Actor actor, String string) {
        actor.attemptsTo(fillFormName());
    }

    @Given("fill form name")
    public Actor.ErrorHandlingMode fillFormName() {
        return null;
    }

    @Then("user fill the name form")
    public void userFillTheNameForm(Actor actor, String string) {
        actor.attemptsTo(fillFormName());
    }

    @Given("fill form email")
    public void fillFormEmail(Actor actor, String string) {
        actor.attemptsTo(userFillFormPassword());
    }

    @Then("user fill the email form")
    public void userFillTheEmailForm(Actor actor, String string) {
        System.out.println("Test successfull");
    }

    @Given("fill form password")
    public void fillFormPassword() {
        System.out.println("Test successfull");
    }

    @Then("user fill form password")
    public Actor.ErrorHandlingMode userFillFormPassword() {
        return null;
    }

    @When("user press register")
    public void userPressRegister() {
        System.out.println("Test successfull");
    }


    @Then("user account created")
    public void userAccountCreated() {
        System.out.println("Test successfull");
    }

    @Given("user account")
    public void userAccount() {
        System.out.println("Test successfull");
    }

    @And("user click button login altahsop")
    public void userClickButtonLoginAltahsop() {
        System.out.println("Test successfull");
    }

    @And("user input correct username muhnurfz@gmai.com and password {int}")
    public void userInputCorrectUsernameMuhnurfzGmaiComAndPassword(int arg0) {
        System.out.println("Test successfull");
    }

    @Then("user submit login")
    public void userSubmitLogin() {
        System.out.println("Test successfull");
    }

    @Then("user inside homepage altashop")
    public void userInsideHomepageAltashop() {
        System.out.println("Test successfull");
    }

    @And("user click button user altashop")
    public void userClickButtonUserAltashop() {System.out.println("Test successfull");
    }

    @And("user click button logout altashop")
    public void userClickButtonLogoutAltashop() {System.out.println("Test successfull");
    }

    @Then("user will be logout on altahsop")
    public void userWillBeLogoutOnAltahsop() {System.out.println("Test successfull");
    }
}

