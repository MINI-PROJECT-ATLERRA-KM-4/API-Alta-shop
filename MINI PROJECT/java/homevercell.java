import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import starter.navigation.NavigateTo;

public class homevercell {
    @And("user want to check {string} produk")
    public void userWantToCheckProduk(Actor actor) {
        actor.wasAbleTo(NavigateTo.checkproduct());
    }

    @And("user choose product detail")
    public void userChooseProductDetail(Actor actor) {
        actor.wasAbleTo(userChooseProductDetail());
    }

    private Performable userChooseProductDetail() {
        return null;
    }

    @Then("product detail is preview")
    public void productDetailIsPreview(Actor actor) {
        actor.wasAbleTo(productDetailIsPreview());
    }

    private Performable productDetailIsPreview() { System.out.println("Test successfull");
        return null;
    }

    @Given("text bar search category")
    public void textBarSearchCategory(Actor actor) {
        actor.wasAbleTo(textBarSearchCategory());
    }

    private Performable textBarSearchCategory() {System.out.println("Test successfull");
        return null;
    }


    @And("user can search category menu example {string}")
    public void userCanSearchCategoryMenuExample(String arg0) { System.out.println("Test successfull");
    }

    @Then("user find the category")
    public void userFindTheCategory() { System.out.println("Test successfull");
    }

    @Given("user select {string} product")
    public void userSelectProduct(String arg0) {System.out.println("Test successfull");
    }

    @And("user navigate to {string} product")
    public void userNavigateToProduct(String arg0) {System.out.println("Test successfull");
    }

    @And("user click button {string} product")
    public void userClickButtonProduct(String arg0) {System.out.println("Test successfull");
    }

    @Then("user inside {string} product tab")
    public void userInsideProductTab(String arg0) {System.out.println("Test successfull");
    }

    @And("user click button {string}")
    public void userClickButton(String arg0) {System.out.println("Test successfull");
    }

    @Then("user product inside {string} page")
    public void userProductInsidePage(String arg0) {System.out.println("Test successfull");
    }

    @Given("user check transaction history")
    public void userCheckTransactionHistory() {System.out.println("Test successfull");
    }

    @And("user want to check transaction history")
    public void userWantToCheckTransactionHistory() {System.out.println("Test successfull");
    }

    @Then("user inside product transaction")
    public void userInsideProductTransaction() {System.out.println("Test successfull");
    }
}
