package TestPackage;

import CollectionsInJava.Internet;
import CollectionsInJava.SocialMedia;

public class TestInterface {

	public static void main(String[] args) {

		SocialMedia sm = new SocialMedia();
		sm.Facebook();
		sm.Instagram();
		sm.Whatsapp();
		sm.Twitter();

		// dynamic polymorphism/top casting - child class object can be reffer by parent
		// class
		Internet in = new SocialMedia();
		in.Facebook();
		in.Instagram();
		in.Whatsapp();
		// in.Twitter();
	}

}
