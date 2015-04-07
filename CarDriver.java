public class CarDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarSet car = new CarSet();
		System.out.println(car);
		CarSet car2 = new CarSet("white", 400, "super");
		System.out.println(car2);
		CarSet car3 = new CarSet("red", 900, "mega");
		
		System.out.println(car3);
		System.out.println(car3.getcolor());
		System.out.println(car3.gethorsepower());
		System.out.println(car3.getsize());

	}

}
