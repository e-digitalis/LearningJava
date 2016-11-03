package constructors;

public class CircleMain {

	public static void main(String[] args) {

		Circle createdCircle = new Circle(8);
		System.out.println(createdCircle.getRadius());
		
		createdCircle.setRadius(123);
		System.out.println(createdCircle.getRadius());

		createdCircle.setRadius(-6);
		System.out.println(createdCircle.getRadius());


	}

}
