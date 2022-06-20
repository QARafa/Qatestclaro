package tests;

import elementos.ElementosWeb;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.Metodos;

public class Teste {
	
	Metodos metodos = new Metodos();
	ElementosWeb el = new ElementosWeb();
	
	
	@Given("dado que eu esteja {string}")
	public void dado_que_eu_esteja(String string) {
		metodos.openBrowser();
	  
	}

	@When("Clico em Singin")
	public void clico_em_singin() {
	   meto

	@When("digito o email")
	public void digito_o_email() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("digito a senha")
	public void digito_a_senha() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Validado a login com {string}")
	public void validado_a_login_com(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
