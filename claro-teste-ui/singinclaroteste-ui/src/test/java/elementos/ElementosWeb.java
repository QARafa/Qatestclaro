package elementos;

import org.openqa.selenium.By;

public class ElementosWeb {
	
	private By login = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");
	private By loginEmail = By.cssSelector("#email");
	private By loginSenha = By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/div[2]/span/input");
	private By greenLogin = By.xpath("//*[@id=\"SubmitLogin\"]/span");
	
	
	//Metodos Publicos
	
	
	public By getLogin() {
		return login;
	}
	public By getLoginEmail() {
		return loginEmail;
	}
	public By getLoginSenha() {
		return loginSenha;
	}
	public By getGreenLogin() {
		return greenLogin;
	}

}
