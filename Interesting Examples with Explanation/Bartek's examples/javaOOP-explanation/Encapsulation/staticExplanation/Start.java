	class Start {
		public static void main (String[] args) {
			
			System.out.println("hello");
		}
	}


public class Person{
    String imie;
    
    public Person(){
        
    }
    
    public Person(String name, String color){
        imie=name;
    }
    
     public Person(String name){
        imie=name;
    }
}



public class HelloWorld{
    public Person j= new Persion();
    Person b=j;
    
    j.setAge(5)
    syso(j) //5
    b.setAge(10)
    
    syso(j) //10
    
    
public Person j2;
     public static void main(String []args){
         String[] tekst= Array.empty();
         
         
         j= new Person("Bartek", "color");
         j= new Person("Bartek");
         
         j= new Person();
         j.imie="Bartek";
         
        System.out.println(tekst);
     }
}