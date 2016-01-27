/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import java.time.LocalDateTime;
import java.time.LocalTime;
/**
 *
 * @author Scott
 */

public class WelcomeService {  
    
    private LocalDateTime currentDateTime = LocalDateTime.now();
    

     public String timeOfDay(LocalDateTime currentDateTime){
        String time = null;
        
        if(currentDateTime.getHour() > 17 & currentDateTime.getHour() < 23){
          time = "evening";
        } else if (currentDateTime.getHour() > 12 & currentDateTime.getHour() < 18){
            time = "afternoon";
        }else{
            time = "morning";
        }
        
          return time;
    }
        
 public String sayWelcome(String name){
     return "Hello " + name + "! Good " + timeOfDay(currentDateTime) + ", the current time is  " + LocalTime.now().getHour() + ":" + LocalTime.now().getMinute();
   
 } 
}
