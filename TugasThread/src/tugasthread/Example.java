/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tugasthread;

/**
 *
 * @author acer
 */
public class Example implements Runnable {
    String s;
   public Example(String s){
       this.s=s;
   }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"start and message is :"+s);;
          publishMessage();
       System.out.println(Thread.currentThread().getName()+"end");   
    }  
    public void publishMessage(){
        try{
        Thread.sleep(500);
        } catch(InterruptedException e){
            e.printStackTrace();
        }
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
