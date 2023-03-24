package Assignment_March24;
class TaxCalculator{
	  public double calculateTax(String empName, boolean isIndian, double empSal) throws Exception {
	   if (!isIndian) {
         throw new Exception("The employee should be an Indian citizen for calculating tax");
     }

     if (empName == null || empName.isEmpty()) {
         throw new Exception("The employee name cannot be empty");
     }

     double taxAmount;

     if (empSal > 100000) {
         taxAmount = empSal * 8 / 100;
     } else if (empSal > 50000) {
         taxAmount = empSal * 6 / 100;
     } else if (empSal > 30000) {
         taxAmount = empSal * 5 / 100;
     } else if (empSal >= 10000) {
         taxAmount = empSal * 4 / 100;
     } else {
         throw new Exception("The employee does not need to pay tax");
     }

     return taxAmount;
	  }	
	
}
public class CalcilatorSimulator {

	public static void main(String[] args) {
		 TaxCalculator taxCalculator = new TaxCalculator();

	        // Test Case 1
	        try {
	            double taxAmount = taxCalculator.calculateTax("Ron", false, 34000);
	            System.out.println("Tax amount is " + taxAmount);
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }

	        // Test Case 2
	        try {
	            double taxAmount = taxCalculator.calculateTax("Tim", true, 1000);
	            System.out.println("Tax amount is " + taxAmount);
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }

	        // Test Case 3
	        try {
	            double taxAmount = taxCalculator.calculateTax("Jack", true, 55000);
	            System.out.println("Tax amount is " + taxAmount);
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }

	        // Test Case 4
	        try {
	            double taxAmount = taxCalculator.calculateTax("", true, 30000);
	            System.out.println("Tax amount is " + taxAmount);
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	}

}
