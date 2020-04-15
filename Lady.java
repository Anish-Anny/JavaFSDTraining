class Lady{
	
public static void main(String a[]){
	
	Employee e1 = new Employee();
	HomeMaker h1 = new HomeMaker();
	Member m1 = new Member();
	
	e1.work();
	h1.work();
	m1.work();

}
}
class Employee extends Lady{
	public void work(){
	System.out.println(" She is an Employee ");
	}
}
class HomeMaker extends Lady{
	public void work(){
	System.out.println(" She is a homemaker ");
	}
}
class Member extends Lady{
	public void work(){
	System.out.println(" She is an Member ");
	}
}