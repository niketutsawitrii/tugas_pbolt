/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tugasthread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author acer
 */
public class TugasThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ExecutorService executors = Executors.newFixedThreadPool(5);
        
        for(int i = 0; i<100; i++){
          
             
         Example ex = new Example(" "+i);
         executors.execute(ex);
            }
            
             executors.shutdown();
    
   while(!executors.isTerminated()){
   }
        System.out.println("finish");
}
    }


