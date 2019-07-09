
//reference variable  in java

import java.util.*;
import java.time.LocalDate;

class employee
{
 String name;
 String address;
 String phonenumber;
 float experience;
}

interface interview{

 public void conductinterview();

}
 
class hrexecutive extends employee implements interview{

  String[] special;
  public void conductinterview(){

   System.out.println("hrexecutive - conducting interview");

   }


}


 public class prac10 {

   static public void main(String name1[]){

   
    hrexecutive he=new hrexecutive();
    he.special=new String[]{"staffing","hii"};

    
    System.out.println(he.special[0]);
     he.name="pravin";

     System.out.println(he.name);
      he.conductinterview();
}
 }

 








