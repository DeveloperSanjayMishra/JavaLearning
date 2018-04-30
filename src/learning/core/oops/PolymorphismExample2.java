package learning.core.oops;

public class PolymorphismExample2 {

    public static void main(String args[])
    {
          // Parent obj = new Child();
           //obj.display();
    		Child obj = new Child();
    		obj.display();
    		int result = 0; 
    		Boolean b1 = new Boolean("TRUE");
    		Boolean b2 = new Boolean("true");
    		if(b1 == b2) result= 1;
    		if(b1.equals(b2)) result= result + 10;
    		System.out.println(result);
    }
}
class Grandparent
{
       public void display()
       {
              System.out.println("I am a Grand Parent");
       }
}
class Parent extends Grandparent
{
       public void display()
       {
              System.out.println("I am a Parent");
       }
}

class Child extends Parent
{
       public void display()
       {	//super.super.display(); 
              System.out.println("I am a Child");
       }
}

