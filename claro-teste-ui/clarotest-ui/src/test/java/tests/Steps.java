package tests;

import elements.ElementsWeb;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Methods;

public class Steps {

	Methods methods = new Methods();
	ElementsWeb el = new ElementsWeb();

	@Given("que eu esteja no {string}")
	public void que_eu_esteja_no(String appUrl) {
		methods.openBrowser(appUrl, "acessar o site");

	}

	@When("que eu click e Singin")
	public void que_eu_click_e_singin() {
		methods.click(el.getLogin());
	}

	@When("Preencho o campo email {string}")
	public void preencho_o_campo_email(String string) {
		methods.writeText(string, el.getEmail());

	}

	@When("Clico em Create an account")
	public void clico_em_create_an_account() {
		methods.click(el.getCreateAccount());

	}

	@When("Preencho o First Name {string}")
	public void preencho_o_first_name(String string) {
		methods.sleep();
		methods.writeText(string, el.getFirstName());

	}

	@When("Preencho o Last Name {string}")
	public void preencho_o_last_name(String string) {
		methods.sleep();
		methods.writeText(string, el.getLastName());

	}

	@When("Preencho o Password {string}")
	public void preencho_o_password(String string) {
		methods.sleep();
		methods.writeText(string, el.getPassword());

	}

	@When("Seleciono dia do aniversario")
	public void seleciono_dia_do_aniversario() {
		methods.sleep();
		methods.click(el.getSelectDayBirth());
		methods.sleep();
		methods.click(el.getDayBirth());

	}

	@When("Seleciono o Mes de aniversari")
	public void seleciono_o_mes_de_aniversari() {
		methods.sleep();
		methods.click(el.getSelectMonthBirth());
		methods.sleep();
		methods.click(el.getMonthBirth());

	}

	@When("Seleciono o Ano de aniversario")
	public void seleciono_o_ano_de_aniversario() {
		methods.sleep();
		methods.click(el.getSelectYearBirth());
		methods.sleep();
		methods.click(el.getYearBirth());

	}

	@When("descrevo o address {string}")
	public void descrevo_o_address(String string) {
		methods.sleep();
		methods.writeText(string, el.getAddress());

	}

	@When("descrevo o city {string}")
	public void descrevo_o_city(String string) {
		methods.sleep();
		methods.writeText(string, el.getCity());

	}

	@When("seleciono State")
	public void seleciono_state() {
		methods.sleep();
		methods.click(el.getClickState());
		methods.sleep();
		methods.click(el.getState());

	}

	@When("descrevo o Postal Code {string}")
	public void descrevo_o_postal_code(String string) {
		methods.sleep();
		methods.writeText(string, el.getPostalCode());

	}

	@When("descrevo o Mobile Phone {string}")
	public void descrevo_o_mobile_phone(String string) {
		methods.sleep();
		methods.writeText(string, el.getMobilePhone());

	}

	@When("Clico em Register")
	public void clico_em_register() {
		methods.sleep();
		methods.click(el.getRegister());

	}

	@Then("entao valido as informações")
	public void entao_valido_as_informações(String expectedtext) {
		methods.validateText(expectedtext, el.getValidation());

	}
	
	//Cenario Login

	@When("Preencho o campo email Login {string}")
	public void preencho_o_campo_email_login(String string) {
		methods.validateText(string, el.getLoginEmail());
	}

	@When("Preencho o campo Senha Login {string}")
	public void preencho_o_campo_senha_login(String string) {
		methods.validateText(string, el.getLoginSenha());
	}

	@When("Clico em Singin Verde")
	public void clico_em_singin_verde() {
		methods.click(el.getGreenLogin());
		
	}

	@Then("Valido o Acesso com {string}")
	public void valido_o_acesso_com(String expectedtext) {
		methods.validateText(expectedtext, el.getValidation());
	}

}
