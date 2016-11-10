package constructors2;

public class MunchingClass {

	YummyApples mmmApple3 = new YummyApples("yellow");
	YummyApples mmmApple = new YummyApples("yellow");
	YummyApples mmmApple2 = new YummyApples("red");
	
	public void muchoMunch(){
		
		
		System.out.println("Munch, munch! This was a really good " + mmmApple3.getColor() + " apple!");
		System.out.println("Munch, munch! This was a really good " + mmmApple2.getColor() + " apple!");
		
		mmmApple2.setColor("pink");
		
	}
	
}
