//interface

import java.util.*;
import java.time.LocalDate;

 interface trainable{
 
  public void attendtraining();

}

interface interview{
  public void conductinterview();
 
}


class employ{
   String name="divya";
   String address;
    String phonenumber;
     String experience;
}


class manager extends employ implements interview,trainable{
int teamsize;
void projectstatus(){}
public void attendtraining(){

  System.out.println("we are conducting training");

}
 
public void conductinterview(){
 System.out.println(name+" we are conducting interview");
} 
}
 public class prac3{

   static public void main(String name1[]){

    manager aa=new manager();
    aa.attendtraining();
    aa.conductinterview();  
    System.out.println();
     
 
}
 }

 








