package lesson2ControlFlowAndConditionals;

public class ElseIfStatement {

	public static void main(String[] args) {

		boolean isLightGreen = false;
		boolean isLightYellow = false;
		
		if(isLightGreen){		//traffic light is green
			System.out.println("Drive!");			
		} else if(isLightYellow){
			System.out.println("Slow down!");
		}else{
			System.out.println("Stop.");
		}
		
		
		// Bardias example:
		
		
		if(isLightGreen){		//traffic light is green
			System.out.println("Drive!");			
		} 
		
		else {
			
			if(isLightYellow){
						System.out.println("Slow down!");
					}else
					
					{
							System.out.println("Stop.");
						}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
