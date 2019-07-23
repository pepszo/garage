package garage;

public class Garage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Car c = new Car("opel","corsa","red","123-456",10000,15000,2015,5,5);
		Person p1 = new Person();
		Person p2 = new Person("nechelput","vivien","950817-4350",1995,"memodebouvy@hotmail.com","jetechiedessus");
		
		System.out.println(c);
		System.out.println("resultat p1 : " + p1);
		System.out.println(p2);
		
		p1.setName("Cambaz");
		System.out.println("resultat p1 : " + p1);
		p1.setFirstname("Mehmet");
		System.out.println("resultat p1 : " + p1);
		
		System.out.println("resultat p2 natnum " + p2.getNatnum());
		
		System.out.println("resultat p1 natnum " + p1.getNatnum());
	}
	
}
