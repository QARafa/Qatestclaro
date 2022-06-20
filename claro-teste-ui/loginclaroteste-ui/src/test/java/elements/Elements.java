package elements;

import org.openqa.selenium.By;

public class Elements {
	
	// Web Elements

		private By login = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");
		private By email = By.xpath("//*[@id=\"email_create\"]");
		private By createAccount = By.xpath("//*[@id=\"SubmitCreate\"]");
		private By firstName = By.xpath("//*[@id=\"customer_firstname\"]");
		private By lastName = By.xpath("//*[@id=\"customer_lastname\"]");
		private By password = By.xpath("//*[@id=\"passwd\"]");
		private By selectDayBirth = By.xpath("//*[@id=\"uniform-days\"]");
		private By dayBirth = By.xpath("//*[@id=\"days\"]/option[26]");
		private By selectMonthBirth = By.xpath("//*[@id=\"months\"]");
		private By monthBirth = By.xpath("//*[@id=\"months\"]/option[10]");
		private By selectYearBirth = By.xpath("//*[@id=\"years\"]");
		private By yearBirth = By.xpath("//*[@id=\"years\"]/option[31]");
		private By address = By.xpath("//*[@id=\"address1\"]");
		private By city = By.xpath("//*[@id=\"city\"]");
		private By clickState = By.xpath("//*[@id=\"id_state\"]");
		private By state = By.xpath("//*[@id=\"id_state\"]/option[34]");
		private By postalCode = By.xpath("//*[@id=\"postcode\"]");
		private By mobilePhone = By.xpath("//*[@id=\"phone_mobile\"]");
		private By futureReference = By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[2]/p[14]/input");
		private By register = By.xpath("//*[@id=\"submitAccount\"]");
		private By validation = By.cssSelector("#center_column > h1");
		private By loginEmail = By.cssSelector("#email");
		private By loginSenha = By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/div[2]/span/input");
		private By greenLogin = By.xpath("//*[@id=\"SubmitLogin\"]/span");

		// Public Methods

		public By getLogin() {
			return login;
		}

		public By getEmail() {
			return email;
		}

		public By getCreateAccount() {
			return createAccount;
		}

		public By getFirstName() {
			return firstName;
		}

		public By getLastName() {
			return lastName;
		}

		public By getPassword() {
			return password;
		}

		public By getSelectDayBirth() {
			return selectDayBirth;
		}

		public By getDayBirth() {
			return dayBirth;
		}

		public By getSelectMonthBirth() {
			return selectMonthBirth;
		}

		public By getMonthBirth() {
			return monthBirth;
		}

		public By getSelectYearBirth() {
			return selectYearBirth;
		}

		public By getYearBirth() {
			return yearBirth;
		}

		public By getAddress() {
			return address;
		}

		public By getCity() {
			return city;
		}

		public By getClickState() {
			return clickState;
		}

		public By getState() {
			return state;
		}

		public By getPostalCode() {
			return postalCode;
		}

		public By getMobilePhone() {
			return mobilePhone;
		}

		public By getFutureReference() {
			return futureReference;
		}

		public By getRegister() {
			return register;
		}

		public By getValidation() {
			return validation;
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
