
//in java 8 the interface the overriding default methods

import java.util.*;
import java.time.LocalDate;

 interface train{
 
 static  void attend(){
    System.out.println("i am in interface");
  }

  


}

class a1 implements train{
 

  static  void attend(){
    System.out.println("i am in   mmmm interface");
  }

  

}


 public class prac7 {

   static public void main(String name1[]){

   
   // train aa=new a1();
    //aa.attend2();


    train.attend();
     //train.attend2();
    
    System.out.println();
     
 
}
 }

 








