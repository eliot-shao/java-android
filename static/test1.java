/*类变量（静态变量）和类方法（静态方法）使用方法都是通过类名访问，相当于该类多有对象的全局变量
 * 主要标志static
 * 
 * 
 * */

public class test1 {
	
	public static void main(String []args)
	{
		
		dog dog1 = new dog(2,"大黑狗");
		person p1 = new person(dog1,28,"明亮");
		p1.show_info();
		person p2 = new person(dog1,28,"玉霞");
		p2.show_info();
		p2.show_total();
		
		static_test test1 = new static_test() ;
		System.out.println(static_test.i);
		
		static_test test2 = new static_test() ;
		System.out.println(static_test.i);
		
		System.out.println(static_test.static_fun());
		
		
		
	}
}

class person {
	 int age ;
	 String name;
	 dog dog;//引用类型
	 private static int total=0;//静态变量可以被所有的对象访问。也叫类变量
	 public person(dog dog,int age,String name)
	 {
		this.age = age ;
		this.name = name ;
		this.dog = dog;
		 
		total++;
	 }
	 public void show_info()
	 {
		 System.out.println("this persion name is: "+ this.name+" the dog name is: "+this.dog.name);
	 }
	 public void show_total()
	 {
		 System.out.println("static total is = "+total);
	 }
}

class static_test
{
	static int i =0;
	static {i++;}//静态代码区在代码执行的时候执行一次，不受是否创建对象的限制。
	//{i++;} 每次new 对象的时候都会执行
	public static_test()
	{
		i++;
	}
	/*static 方法 ，所有的类对象共有的方法，使用类名访问*/
	public static String static_fun()
	{
		return "this is 类方法 或者是一个静态方法！\n";
	}
	
	
	
}
class dog{
	
	 int age ;
	 String name;
	
	public dog(int age,String name)
	{
		this.age = age ;
		this.name = name;
	}
	
}


/*运行结果*/
/*this persion name is: 明亮 the dog name is: 大黑狗
*this persion name is: 玉霞 the dog name is: 大黑狗
*static total is = 2
*2
*3
*this is 类方法 或者是一个静态方法！
**/
