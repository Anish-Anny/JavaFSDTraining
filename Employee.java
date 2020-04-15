class Employee { 
  
    static int noOfObjects = 0; 
    { 
        noOfObjects += 1; 
    } 
 
    public static void main(String a[]) 
    { 
      
		
		Admin a1 = new Admin();
		Admin a2 = new Admin();
		Admin a3 = new Admin();
		Admin a4 = new Admin();
		Admin a5 = new Admin();
		Manager m1 = new Manager();
		Manager m2 = new Manager();
		Manager m3 = new Manager();
        System.out.println("Number of Object is : "+ Employee.noOfObjects); 
         
    }

} 
class Manager extends Employee{
	
	
}
class Admin extends Employee{}
