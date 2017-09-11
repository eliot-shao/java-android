package FindCat ;

//import java.io.* ;

public class FindCat
{
	public static void main (String []args) 
	{
		Cat cat1 = new Cat();
		cat1.name = "white" ;
		cat1.age = 7;
		cat1.setfather("Times white");
		Cat cat2 = new Cat();
		cat2.name = "black";
		cat2.age = 8;
		cat2.setfather("Times black");
		
		System.out.println(cat1.name+" "+cat1.getfather()+" age "+cat1.age);
		
		System.out.println(cat2.name+" "+cat2.getfather()+" age "+cat2.age);
		
	}
}

class Cat 
{
    String name ;
	int age ;
	
	private String father;
	
	void setfather(String _father_)
	{
		father = _father_;
	}
	
	String getfather(){
		return father ;
	}
}
