
package com.mycompany.williamapplications;

import java.util.Scanner;
import java.io.*;

public class WilliamApplications {

    public static void main(String[] args) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        WilliamApplications wm=new WilliamApplications();
       boolean ch=false;
       while(!ch)
       { wm.main();}
        
    }
    void main()throws IOException
    {
    
       InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        global g=new global();
           g.p("Menu \n1.create 2.write 3.read 4.delete 5.copy");
       int ch;
        ch = Integer.parseInt(br.readLine());
       switch(ch)
               {
                   case 1:
                   
                      g.p("enter the file name");
                        String fname =br.readLine();
                      
                        createFile cf=new createFile();
                        cf.cFile(fname);   
                         
                         break;
                   case 2:
                       
                       break;
                   case 3:
                       
               break;
                   case 4:
                       
                       break;
                   case 5:
                       
                       break;
                       
                   default:
                           g.p("you choose the wrong option");  
                           break;
               }
        
    
    }
    

}
