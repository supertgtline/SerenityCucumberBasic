package cucumbersteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class NewCarSteps {
    @Given("user navigate to the website")
    public void user_navigate_to_the_website() {
        System.out.println("@Given -- user navigate to the Website");
    }
    @When("user choose menu as new car")
    public void user_choose_menu_as_new_car() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("@When -- user choose menu as new car");
    }
    @Then("user click on find new cars")
    public void user_click_on_find_new_cars(List<String> price) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("@Then -- user click find new cars with price: "+price.get(1));
    }

    @And("user search for (.$) car")
    public void userSearchForBrandCar() {
        System.out.println("@And -- user search for new cars");
    }
}
