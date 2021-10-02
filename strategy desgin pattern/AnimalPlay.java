/**
 * Demo code to implememt the strategy pattern. 
 * The code is adopted the reference: http://www.newthinktank.com/2012/08/strategy-design-pattern-tutorial/ 
 */
public class AnimalPlay{
	
	public static void main(String[] args){
		
		Animal lovelly = new Camel();
		Animal tweety = new Bird();
		
		System.out.println("Camel: " + lovelly.tryToFly());
		
		System.out.println("Bird: " + tweety.tryToFly());
		
		// This allows dynamic changes for flyingType
		
		lovelly.setFlyingAbility(new ItFlys());
		
		System.out.println("Camel: " + lovelly.tryToFly());
		
	}
	
}