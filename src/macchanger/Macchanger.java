/*
 *File: macchanger
 *
 *Date: 10th October, 2019.
 */


package macchanger;

//Imported java packages
import java.io.*;

public class Macchanger{
    public void mac() throws Exception{
    
        String s = null;

         try {

            /* run the Linux "series of commands"
             * using the Runtime exec method:
             * Variable inintialization 
             */
            Process p1 = Runtime.getRuntime().exec("sudo ifconfig wlo1 down");
            Process p2 = Runtime.getRuntime().exec("sudo macchanger -r wlo1");
            Process p3 = Runtime.getRuntime().exec("sudo ifconfig wlo1 up");
            
            //Run 1st Process
            BufferedReader stdInput1 = new BufferedReader(new
                 InputStreamReader(p1.getInputStream()));
            BufferedReader stdError1 = new BufferedReader(new
                 InputStreamReader(p1.getErrorStream()));

            //Run 2nd process
            BufferedReader stdInput2 = new BufferedReader(new
                 InputStreamReader(p2.getInputStream()));
            BufferedReader stdError2 = new BufferedReader(new
                 InputStreamReader(p2.getErrorStream()));

            //Run 3rd process
            BufferedReader stdInput3 = new BufferedReader(new
                 InputStreamReader(p3.getInputStream()));
            BufferedReader stdError3 = new BufferedReader(new
                 InputStreamReader(p3.getErrorStream()));

            // read the standard output of the 1st command
            while ((s = stdInput1.readLine()) != null) {
                System.out.println(s);
            }

            // read any errors from the 1st attempted command
            while ((s = stdError1.readLine()) != null) {
                System.out.println(s);
            }

            // read the standard output of the 2nd command
            while ((s = stdInput2.readLine()) != null) {
                System.out.println(s);
            }
            
            // read any errors from the 2nd attempted command
            while ((s = stdError2.readLine()) != null) {
                System.out.println(s);
            }

            // read the standard output of the 3rd command
            while ((s = stdInput3.readLine()) != null) {
                System.out.println(s);
            }

            // read any errors from the 3rd attempted command
            while ((s = stdError3.readLine()) != null) {
                System.out.println(s);
            }
  
        }catch (Exception e) {
            System.out.println("Excepción: ");
            e.printStackTrace();
                 System.exit(-1);
            }
        }
    
}