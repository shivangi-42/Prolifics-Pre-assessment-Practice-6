
//in java 8 the interface the overriding default methods

import java.util.*;
import java.time.LocalDate;

 interface train{
 
 static  void attend(){
    System.out.println("i am in interface");
  }

  /* this is not allowed in the  default shows error
 
  default  void attend1(){
    System.out.println("i am in  aainterface");
  }*/

  default  String attend2(){
    System.out.println("i am in interface");
   return null;
  }


}

class a1 implements train{
 //here method overriding does'nt occur

  static  void attend(){
    System.out.println("i am in   mmmm interface");
  }

  public String attend2(){
    System.out.println("i am in   mmmm interface");
     return null;
  }

/*
 default  void attend1(){
    System.out.println("i am in   mmmm interface");
  }*/
}


 public class prac6 {

   static public void main(String name1[]){

   
    train aa=new a1();
    aa.attend2();


    train.attend();
     //train.attend2();
    
    System.out.println();
     
 
}
 }

 








