import java.util.*;

public class PersonDemo {
    public static void main(String[] args) {  // Fixed main method signature
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ENTER THE NAME:");
        String name = sc.next();
        
        System.out.println("ENTER AGE:");
        int age = sc.nextInt();
        
        System.out.println("ENTER GENDER:");
        String gender = sc.next();
        
        System.out.println("ENTER INCOME:");
        int income = sc.nextInt();
        
        // Creating Person object
        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        person.setGender(gender);
        person.setIncome(income);
        
        System.out.println("Person Details Before Tax Calculation: " + person);
        
        // Creating TaxCalculation object
        TaxCalculation calc = new TaxCalculation();
        calc.calculateTax(person);  // Fixed method call
        
        System.out.println("Person Details After Tax Calculation: " + person);
        
        sc.close();  // Close scanner to prevent memory leak
    }
}
