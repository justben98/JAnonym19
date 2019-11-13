/*
 * File: Timer
 * Date: 10th October, 2019
 * 
 */
package macchanger;

/**
 *
 * @author Justech@ubuntusystems.com
 */
public class Timer {
    

    public void timeInterval() throws InterruptedException{
        try{
            //Variable defination
            //int m = 5;
            int timet =  600;
            long delay = timet * 1000;
            
            do{
                //int minutes = timet / 60;
                //int seconds = timet % 60;
                //System.out.println(minutes + "minute(s)," +seconds+ " second(s)");
                Thread.sleep(1000);
                timet = timet -1;
                delay = delay - 1000;
        }while (delay != 0);
        
        }catch (InterruptedException e){
            System.out.println("Interrupted Exception: ");
            e.printStackTrace();
            System.exit(-1);
        }
    }
}
