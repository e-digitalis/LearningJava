package exercisePPT;

import java.util.ArrayList;

public class CalculateBonus {

	public static double sumBonus(ArrayList<Employee> empl) {
		double totBonus = 0;
		for(Employee currentEmployee : empl){
			totBonus+=currentEmployee.bonus();
		}
		
		return totBonus;
	}

}
