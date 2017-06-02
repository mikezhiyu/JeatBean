/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package class2ex1;


class MyClass{
    private String s1 = "This is string s1";
    private int i1 = 10;
    
    public String getS1(){
        return s1;
    }
    
    public int getI1(){
        return i1;
    }
    
    public void setI1(int int1){
        i1 = int1;
        
    }
    public void setS1(String string1){
        s1 = string1;
        
    }
}





/**
 *
 * @author ipd
 */
public class Class2Ex1 {
    
   String myString = ("This is my first project");
   static int myInt = 5;
   
   static MyClass myClass;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        myClass = new MyClass();
        myClass.setS1("This is a new string");
        myClass.setI1(100);
        
        System.out.println(myClass.getS1());
        System.out.println(myClass.getI1());
    }
                
//        Class2Ex1 myClass = new Class2Ex1()  /**creating a new object or instance*/
//        System.out.println(myClass.);
//        
//        
//        System.out.println(Class2Ex1.myInt);
        /** or System.out.println(myInt);
         my class is the only local variable.
         mystring is 
         myInt is static*/
//    }
//    
//}
