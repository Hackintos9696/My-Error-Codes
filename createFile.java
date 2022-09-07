/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.williamapplications;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author william
 */
public class createFile {
    void cFile(String fname)
    {  
       FileOutputStream output;
    DataInputStream input;
    global g= new global();
    try
    {
     output=new FileOutputStream(fname);
     input=new DataInputStream(System.in);
    int c;
     g.p("File" +fname+" Create Succefully");
     g.p("Enter the text in it And Press $ to exit");
     while((c=input.read())!='$')
     {
      output.write(c);
     }   
     try
     {
    output.close();
     input.close();
     }
     catch(IOException e1)
     {
     g.pe(e1);
     }
    }
catch(IOException e)
    {
    g.pe(e);       
    }    
    }

  
}
