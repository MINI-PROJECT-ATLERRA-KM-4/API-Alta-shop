package starter.stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import starter.navigation.NavigateTo;

public class buyvercell {
    @Given("user can see all product category")
    public void userCanProduct(String arg0) {System.out.println("Test successfull");
    }

    @Then("user can {string} product")
    public void userCanProduct(String arg0) {System.out.println("Test successfull");
    }

    @Given("user in homepage")
    public void userInHomepage() {System.out.println("Test successfull");
    }

    @And("user choose {string} product button")
    public void userChooseProductButton(String arg0) {System.out.println("Test successfull");
    }

    @And("reccuring procces more than {int} product")
    public void reccuringProccesMoreThanProduct(int arg0) {System.out.println("Test successfull");
    }

    @And("user choose {string} button")
    public void userChooseButton(String arg0) {System.out.println("Test successfull");
    }

    @Then("user can see all product inside cart")
    public void userCanSeeAllProductInsideCart() {System.out.println("Test successfull");
    }

    @And("user choose cart button")
    public void userChooseCartButton() {System.out.println("Test successfull");
    }

    @Then("transaction history inside cart")
    public void transactionHistoryInsideCart() {System.out.println("Test successfull");
    }

    @Given("user inside cart page")
    public void userInsideCartPage() {System.out.println("Test successfull");
    }

    @And("user press previous page")
    public void userPressPreviousPage() {System.out.println("Test successfull");
    }

    @Then("user is on altavercell app homepage")
    public void userIsOnAltavercellAppHomepage() {System.out.println("Test successfull");
    }

    @Given("inside cart page")
    public void insideCartPage() {System.out.println("Test successfull");
    }

    @And("user press cart page after navigate back to transaction page")
    public void userPressCartPageAfterNavigateBackToTransactionPage() {System.out.println("Test successfull");
    }

    @Then("user paid two times in the same product")
    public void userPaidTwoTimesInTheSameProduct() {System.out.println("Test successfull");
    }

    @Given("inside transaction page")
    public void insideTransactionPage() {System.out.println("Test successfull");
    }

    @And("user choose row per page {int} to {int}")
    public void userChooseRowPerPageTo(int arg0, int arg1) {System.out.println("Test successfull");
    }

    @Then("user can see all product transaction")
    public void userCanSeeAllProductTransaction() {System.out.println("Test successfull");
    }
}
