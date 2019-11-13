/**
 * File: main
 * Date: 23rd Oct, 2019.
 */

package janonym;

//Import my packages
import macchanger.Timer;
import macchanger.Macchanger;

/**
 *
 * @author Justech@ubuntusystems.com
 */
public class Janonym{
    static String r;
        public static void main (String [] args) throws Exception{
            try{
               //Change the MAC address
               System.out.println("Getting new MAC!");
               Macchanger address = new Macchanger();
               address.mac();
               
               //Start timer
               Timer cycle = new Timer();
               cycle.timeInterval();
           
            //Exit only when an exception occurs            
            }catch (Exception e){
               System.out.println("Exception: ");
               e.printStackTrace();
               System.exit(-1);
               }
           //If no exception found, create a recussion
           main (null); //Infinite recussion
        }
}
