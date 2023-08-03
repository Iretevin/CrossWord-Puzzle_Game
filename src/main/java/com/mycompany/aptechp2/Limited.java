//Class for acceptance of single character.
package com.mycompany.aptechp2;

import javax.swing.text.PlainDocument;
import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;


public class Limited extends PlainDocument {
    
    private int limit;
    
    Limited(int limit){
        super();
        this.limit = limit;
    }
    Limited(int limit,boolean upper){
     
         super();
        this.limit=limit;
    }
    
    public void insertString(int offset,String str,AttributeSet attr) throws BadLocationException{
      
        if(str == null)
            return;
           if((getLength() + str.length())<= limit){
               super.insertString(offset, str, attr);
           }    
            
        }
    }
    

