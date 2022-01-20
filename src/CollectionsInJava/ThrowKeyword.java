package CollectionsInJava;

public class ThrowKeyword {
	
	public static void main(String[] args) {
		
		System.out.println("Heli");
		
		try {
			throw new Exception("Aakash");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Astha");
	}

}
