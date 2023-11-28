/*import BankFolder.BankForPackage;


class Pen {
    String colour;
    String type;

    public void write(){
        System.out.println("Writting something in write function....\n");
    }
    public void printColour(){
        System.out.println(this.colour);
    }
    
}

class Student{
    String name;
    int age;

    public void studentInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(){      //empty constructor

    }

    Student(String name, int age){      //parameterized constructor
        this.name = name;
        this.age=age;
    }
    Student(Student a){             //copy contructor- build a copy of another constructor. Constructor construct objects
        this.name=a.name;
        this.age = a.age;
    }
}

class Employee{              //Polymorphism- Many forms. Ploy means many, morph means form. 
    String name;
    int id;

    public void info(String name){
        //this.name=name;
        System.out.println(name);
    }
    public void info(int id){
        //this.id=id;
        System.out.println(id);
    }
    public void info(String name, int id){
        //this.name=name;
        //this.id=id;
        System.out.println(name+" and "+id);
    }
}

                        //Inheritance - Single level, Multi level, Hierarchial Inheritance, Hybrid Inheritance
class Shape{
    String color;
    public void areas(){
        System.out.println("Printing area in shape");
    }
}
class Triangle extends Shape{           //Inheritance - Single level
    public void areaOne(int length, int height){
        System.out.println(0.5*height*length);
        //return 1/2*height*length;
    }
}
class EquilateralTriangle extends Triangle{                 //Inheritance - Multi level
    public void areaTwo(int length,int height){
        System.out.println(height*length);
    }
}
// class Circle extends Shape{                 //Inheritance - Hierarchial Inheritance
//     public void area(int r){
//         System.out.println(3.1416*r*r);
//     }
// }

////Inheritance - Hybrid Inheritance --- All types of inharitance in one code(from Shape to circle all)
*/
//Abstraction starts
class Animal{
    public void walk(){
    }
    Animal(){
        System.out.println("This is an animal constructor...");
    }
    public void eat(){

        System.out.println("All animals eats..");
    }
}
class Horse extends Animal{
    Horse(){
        System.out.println("This is a horse constructor...");
    }
    public void walk(){
        System.out.println("Horse walks on 4 legs");
    }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("Chicken walks on 2 legs");
    }
}

//Interfaces start

interface Shoe{
    void shoeColor();       //only supports absract functions
    int size=2;
}
interface Bag{
    void Bagcolor();
}
class Person implements Shoe, Bag{      //interface support multiple inharitance in java but clss doesn't
    public void shoeColor(){            //need to declare public must
        System.out.println("Under person shoe color is black...");
    }
    public void Bagcolor(){
        System.out.println("Under person bag colour...");
    }
}

//Static keyword starts

class DressBrand{
    String name;
    static String country;

    public static void changeCountry(){
        country="USA";
    }

}
public class OOPs {
    /**
     * @param args
     */
    public static void main(String args[]){
       /* // Pen pen1 = new Pen();
        // pen1.colour="Red";
        // pen1.type="Ballpoint";
        // pen1.write();
        // System.out.println(pen1.colour+" colour pen is used for correction and type is "+pen1.type);

        // Pen pen2 = new Pen();
        // pen2.colour="Blue";
        // pen2.type="Gel";

        // pen1.printColour();
        // pen2.printColour();

        // Student s1= new Student();
        // s1.name="nafisa";
        // s1.age=25;
        // s1.studentInfo();

        // Student s2= new Student("Anjum",24);
        // s2.studentInfo();

        // Student s3 = new Student(s2);       //copy constructor
        // s3.studentInfo();

        // Employee emp = new Employee();      //Polymorphism
        // emp.info(123);
        // emp.info("Nafisa");
        // emp.info("Anjum",456);

        EquilateralTriangle eq = new EquilateralTriangle();
        //eq.area(5,4);
        //System.out.println(eq.area(4, 5));
        eq.areas();
        eq.areaOne(4, 5);
        eq.areaTwo(4, 5);
        // Circle cr = new Circle();
        // cr.area(3);

        BankForPackage ac = new BankForPackage();
        ac.eName="Nafisa";
        System.out.println(ac.eName);*/

        Horse hr = new Horse();
        hr.walk();
        hr.eat();

        //interface
        Person pr = new Person();
        pr.shoeColor();
        pr.Bagcolor();

        //static keyword
        //DressBrand.country="Bangladesh";        //Don't need to declare dynamically. Can be called directly.
        DressBrand db = new DressBrand();
        db.name="Aarong";
        System.out.println(DressBrand.country);
        System.out.println(db.country);
        //db.changeCountry();
        DressBrand.changeCountry();
        System.out.println(db.country);

        System.out.println("");

    }
}
