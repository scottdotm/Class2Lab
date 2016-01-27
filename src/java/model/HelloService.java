/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import java.time.LocalTime;
import java.util.Calendar;
/**
 *
 * @author Scott
 */

public class HelloService {   
private Calendar date;
private String greeting;

     private String getGreeting() {
        //Instantiating object with the current time
        date = Calendar.getInstance();
        
        //Creating calendar objects
        Calendar morning = Calendar.getInstance();
        Calendar afternoon = Calendar.getInstance();
        Calendar evening = Calendar.getInstance();
        Calendar sample = Calendar.getInstance();
        
        //setting the time of day for when it is morning
        morning.set(Calendar.HOUR_OF_DAY, 03);
        morning.set(Calendar.MINUTE, 0);
        morning.set(Calendar.SECOND, 0);
        //setting the time of day for when it is afternoon
        afternoon.set(Calendar.HOUR_OF_DAY, 10);
        afternoon.set(Calendar.MINUTE, 31);
        afternoon.set(Calendar.SECOND, 0);
        //setting the time of day for when it is evening
        evening.set(Calendar.HOUR_OF_DAY, 13);
        evening.set(Calendar.MINUTE, 1);
        evening.set(Calendar.SECOND, 0);
        //setting the time of day for testing purposes.... delete later
        sample.set(Calendar.HOUR_OF_DAY, 00);
        sample.set(Calendar.MINUTE, 1);
        sample.set(Calendar.SECOND, 0);
        
        //If the current time is after the morning, afternoon, & evening time then it is evening
        if (date.after(morning) == true && date.after(afternoon) == true && date.after(evening) == true) {
            System.out.println("It is evening"); 
            greeting = "Evening"; 
        //If the current time is after the morning & afternoon, but not after evening time then it is afternoon
        } else if (date.after(morning) == true && date.after(afternoon) == true && date.after(evening) == false) {
            System.out.println("It is afternoon");
            greeting = "Afernoon"; 
        //If the current time is after the morning, but not after afternoon & evening time then it is morning
        } else if (date.after(morning) == true && date.after(afternoon) == false && date.after(evening) == false) {
            System.out.println("It is morning");
            greeting = "Morning"; 
        //If it is before the morning time than it is still evening
        } else if (date.before(morning) == true) {
            System.out.println("It is evening because it is before morning");
            greeting = "Evening"; 
        }         
        return greeting;
    }
        
 public String sayHello(String name){
     getGreeting();
     return "Hello " + name + " good " + greeting + " the current time is  " + LocalTime.now().getHour() + ":" + LocalTime.now().getMinute();
   
 } 
}
