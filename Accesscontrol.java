package module4;

public class Accesscontrol {
	private boolean isValidId = true;

	private boolean isValidAccessCard = false;

	private boolean isAdmin = false;



	public void checkAccess() {

		if ((isValidId == true && isValidAccessCard == true) || (isAdmin == true))

			System.out.println("Person is allowed to access");

		else

			System.out.println("Person is not allowed to access");

	}

}




