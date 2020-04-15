class MyStaticPoly{

void mycalculation(int num1 , int num2){

	System.out.println("Addition of two number :" + (num1+num2));
}
void mycalculation(int num1 , int num2 , int num3){

	System.out.println("Addition of three number :" + (num1+num2+num3));
}
}

class MainClass {
	public static void main(String a[]){
	
		MyStaticPoly msp = new MyStaticPoly();
		msp.mycalculation(5,6);
		msp.mycalculation(4,5,6);
	}
}