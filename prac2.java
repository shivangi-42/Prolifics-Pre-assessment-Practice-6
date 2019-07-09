//java inheritance 1

import java.util.*;
import java.time.LocalDate;

class car{

   int speed;
   int gear; 

   car(int speed,int gear){
   this.speed=speed;
   this.gear=gear;
   }
 
   public void applyBrake(int decrement) 
    { 
        speed -= decrement; 
    } 
          
    public void speedUp(int increment) 
    { 
        speed += increment; 
    } 
      
     
    public String printthe()  
    { 
        return("No of gear are "+gear 
                +"\n"
                + "speed of bicycle is "+speed); 
    }  

  
}


class nano extends car  
{ 
      
    
    public int seatHeight; 
  
     
    public nano(int gear,int speed, 
                        int startHeight) 
    { 
         
        super(gear, speed); 
        seatHeight = startHeight; 
    }  
          
   /*
    public void setHeight(int newValue) 
    { 
        seatHeight = newValue; 
    }    
   */
    public String printthe() 
    { 
        return (super.printthe()+ 
                "\nseat height is "+seatHeight); 
    } 
      
} 
 

 public class prac2{

   static public void main(String name1[]){

      nano aa=new nano(1,2,3);
    System.out.println(aa.printthe());
     
 
}
 }

 








