/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Ankita
 */
public class WelcomeService {
    
    private Date currentDate;

    public WelcomeService() {
        this.currentDate = new Date();
    }
    
    
    
    private String generateGreeting(){       
        
        
        Calendar c = Calendar.getInstance();        
        c.setTime(currentDate);        
        int hours = c.get(Calendar.HOUR_OF_DAY);
       
        
        if(hours>=0 && hours<=11)
        {
        return "Morning";
        }
        else if (hours>=12 && hours <= 16)
        {
            return "Afternoon";
        }
        else if (hours>=17 && hours <=23){
            return "Evening";
        }
        
        return "nothing";
    }
    
    
    public String generateGreetingMessaage(String Name){
        String message = "Good " + generateGreeting()+", "+Name+". Welcome!";
        return message;
    }

    public Date getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }
    
    
    
}
