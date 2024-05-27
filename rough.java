public class rough {
    
    public static void main(String[] args){
        Person p1 = new Person();
        p1.age = 24;
        p1.name = "Aryan";

        Person p2 = new Person(31, "yoyo");
        
        
        // System.out.println(p1.age +" " + p1.name);
        // System.out.println(p2.age +" " + p2.name);
    
        // p1.eat();
        p2.walk();
        p2.walk(2);

        System.out.println(Person.count);
        Developer d1 = new Developer(24, "Aryan");
        d1.walk();
    } 
}

class Developer extends Person{

    public Developer(int age, String name){
        super(age, name);

    }
}

class Person {
    String name;
    int age;

    static int count;           // now has become property of class 

    public Person(){   
        count++;           // default constructor
        System.out.println("creating an object");
    }

    public Person(int age,String name){
        this.name = name;
        this.age = age;
    }

    void walk(){
            System.out.println("Better " + name + " is walking.");
    } 
    void eat(){
        System.out.println(name + " is eating.");
    } 
    void walk(int steps){
        System.out.println(name + " walked " + steps);
    }
    void doWork(){
        System.out.println("Person is working");
    }
}