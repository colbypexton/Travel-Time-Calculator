/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package program2.pkg5;

/**
 *
 * @author owner
 */
public class TravelTimeCalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        //Variables 
        int hour = 0;
        int minutes;
        int travelTime;
        int classCount = 1;
        while (hour != -1){
            if(classCount == 1){
            System.out.print("What hour does your first class start?");
            hour = Integer.parseInt(input.nextLine());
            } else {
            System.out.print("What hour does your next class start?");
            hour = Integer.parseInt(input.nextLine());
            }
     
            if(hour != -1 && classCount == 1){
            System.out.print("What minute does your first class start?");
            minutes = Integer.parseInt(input.nextLine());
            System.out.print("How many minutes does it take to get there?");
            travelTime = Integer.parseInt(input.nextLine());
            System.out.println(departureTime(hour, minutes, travelTime));
            classCount++;
            }
            else if( hour != -1 && classCount != 1){
            
            System.out.print("What minute does your next class start?");
            minutes = Integer.parseInt(input.nextLine());
            System.out.print("How many minutes does it take to get there?");
            travelTime = Integer.parseInt(input.nextLine());
            System.out.println(departureTime(hour, minutes, travelTime));
            }
        }
    }
    
    static String departureTime(int hour, int minu, int tt){
        int trueTime = minu - (tt + 2);
        if(trueTime < 0){
            trueTime = 60 + trueTime;
            hour -= 1;
        }
        if (hour == 0){
            hour = 12;
        }
       
        if(trueTime == 0){
        return "You should leave by " + hour + ":" + trueTime + "0!";
        } else {
        return "Your should leave by " + hour + ":"+ trueTime +"!" ;
        }
   
    }
}
