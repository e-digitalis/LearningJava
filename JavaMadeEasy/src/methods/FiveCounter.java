package methods;

public class FiveCounter {
	
	public static void main(String[] args) {

		
		
		for (int y=0; y<5; y++){
			System.out.print(y + " ");	
			System.out.println(" this is TOP loop " +y+"  ");
					
						
		}
		System.out.println();
		counter();
	}
		
		public static void counter() {
			
			
			for (int x=1;x<=5;x++){
				System.out.println("this is BOT loop     " +x+" ");
				
			}
			
		}
	

	
	
}
