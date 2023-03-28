public class InsectClient {
	public static void main(String[] args) {
		Insect bug1 = new Insect(13, 31, 0);
		System.out.println(bug1.getX());
		bug1.setX(-314);
		System.out.println(bug1.getX());
		bug1.setX(133);
		System.out.println(bug1.getX());
		
		Insect bug2 = new Insect(31);
		System.out.println(bug2.toString());
		System.out.println(Insect.getPopulation());
	}
}