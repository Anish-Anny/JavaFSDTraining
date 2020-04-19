class Entertainment{
	
public static void main(String a[]){
	
	TV e1 = new TV();
	DVD h1 = new DVD();
	Radio m1 = new Radio();
	
	e1.listen();
	h1.listen();
	m1.listen();

}
}
class TV extends Entertainment{
	public void listen(){
	System.out.println(" You are watching news in TV ");
	}
}
class DVD extends Entertainment{
	public void listen(){
	System.out.println(" You are watching movie in DVD ");
	}
}
class Radio extends Entertainment{
	public void listen(){
	System.out.println(" You are listening songs on Radio ");
	}
}