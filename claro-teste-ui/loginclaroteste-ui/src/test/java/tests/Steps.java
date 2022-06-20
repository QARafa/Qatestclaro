package tests;

import elements.Elements;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Methods;

public class Steps {
	
	Methods methods = new Methods();
	Elements el = new Elements();
	
	
	@Given("que eu esteja no {string}")
	public void que_eu_esteja_no(String String) {
		methods.openBrowser(Srting, "acessar o site");
		
	}

	@When("que eu clico e Singin")
	public void que_eu_clico_e_singin() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("preencho o email j? cadastrado {string}")
	public void preencho_o_email_j_cadastrado(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("preencho a senha j? cadastrado {string}")
	public void preencho_a_senha_j_cadastrado(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("clico em SinginGreen")
	public void clico_em_singin_green() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("valido {string}")
	public void valido(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	

}
