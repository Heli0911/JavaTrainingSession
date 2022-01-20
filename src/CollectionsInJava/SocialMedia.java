package CollectionsInJava;

public class SocialMedia implements Internet {

	@Override
	public void Whatsapp() {
		System.out.println("Whatsapp welcomes you");
	}

	@Override
	public void Instagram() {
		System.out.println("Instagram welcomes you");
	}

	@Override
	public void Facebook() {
		System.out.println("Facebook welcomes you");
	}

	// non overriden method :
	public void Twitter() {
		System.out.println("Twitter welcomes you");
	}

}
