
//extending interface in java

import java.util.*;
import java.time.LocalDate;

 interface train{
 
    String attend();
 /*static  void attend(){
    System.out.println("i am in interface");
  }*/

  
}

interface train1{
 
   String attend();
 /*static  void attend(){
    System.out.println("i am in interface");
  }*/

  
}

interface a1 extends train,train1{
  

}

class a2 implements a1{

  public String attend(){
    return null;
   }

}

 public class prac8 {

   static public void main(String name1[]){

   
   
    
    System.out.println();
     
 
}
 }

 








