
//extending interface in java

import java.util.*;
import java.time.LocalDate;

 interface train{
 
   
 default  void attend(){
    System.out.println("i am in interface train");
  }

  
}

interface train1{
 
   
 default  void attend(){
    System.out.println("i am in interface train1");
  }

  
}

interface a1 extends train,train1{
  default void attend(){
   System.out.println("i am in interface a1" );
    }

}

class a2 implements a1{

  /*default void attend(){
     System.out.println("i am in interface a1" );
   }*/

}

 public class prac9 {

   static public void main(String name1[]){

   
   
    
    System.out.println();
     
 
}
 }

 








