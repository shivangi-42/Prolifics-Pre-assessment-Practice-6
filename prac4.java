//in java 8 the interface support the default 


import java.util.*;
import java.time.LocalDate;

 interface train{
 
  default void attend(){
    System.out.println("i am in interface");
  }

}

class a1 implements train{

  

}


 public class prac4 {

   static public void main(String name1[]){

    train aa=new a1();
    aa.attend();

   a1 aaa=new a1();
    aaa.attend();
    System.out.println();
     
 
}
 }

 








