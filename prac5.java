
//in java 8 the interface support the static  methods

import java.util.*;
import java.time.LocalDate;

 interface train{
 
  static void attend(){
    System.out.println("i am in interface");
  }

}

class a1 implements train{

  

}


 public class prac5 {

   static public void main(String name1[]){

   /*
     we can not use  reference variable to call the static method  

    train aa=new a1();
    aa.attend();

    a1 aaa=new a1();
    aaa.attend();

 */

  train.attend();
    System.out.println();
     
 
}
 }

 








