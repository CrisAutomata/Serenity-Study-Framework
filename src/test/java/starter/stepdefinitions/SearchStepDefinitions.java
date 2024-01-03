package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import starter.navigation.NavigateTo;
import starter.search.LookForInformation;

public class SearchStepDefinitions extends PageObject {

    @Given("{actor} is researching things on the internet")
    public void researchingThings(Actor actor) {
        actor.wasAbleTo(NavigateTo.theSearchHomePage());
    }

    @When("{actor} looks up {string}")
    public void searchesFor(Actor actor, String term) {
//        actor.attemptsTo(
//                LookForInformation.about(term)
//        );
        WebElementFacade button = findBy("#searchbox_input");
        button.waitUntilVisible().click();
        button.clear();
        button.sendKeys(term);
        Actions actions = new Actions(getDriver());
        actions.sendKeys(Keys.ENTER).perform();
    }

    @Then("{actor} should see information about {string}")
    public void should_see_information_about(Actor actor, String term) {
        actor.attemptsTo(
                Ensure.that(TheWebPage.title()).containsIgnoringCase(term)
        );
    }
}
