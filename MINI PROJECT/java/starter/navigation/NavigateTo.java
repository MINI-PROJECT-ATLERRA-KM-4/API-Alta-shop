package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable theAltaShopLoginPage() {
        return Task.where("{0} opens the AltaShopLoginPage",
                Open.browserOn().the(AltaShophomepage.class));
    }

    public static Performable theAltaShopLoginPage() {
        return null;
    }

    public static Performable checkproduct() {
    }
}
