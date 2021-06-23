package exercises;

public class Percent {
	
    public static void main(String[] args) {
    	
    	double meal_cost = 12; 
    	int tip_percent = 20; 
    	int tax_percent = 8;

        double tip = (tip_percent * meal_cost) / 100;
        double tax = (tax_percent * meal_cost) / 100;
        int total_cost = (int) Math.round(meal_cost + tip + tax);
        System.out.println(total_cost);

    }

}
