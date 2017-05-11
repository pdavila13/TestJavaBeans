/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjavabeans;

import mybeans.FirstBean;
import mybeans.Receptor;

/**
 *
 * @author pdavila
 */
public class TestJavaBeans {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        FirstBean b = new FirstBean();
        Receptor r = new Receptor();
        
        //Registrem al receptor com a listener de l'bjecte FirstBean
        b.addPropertyChangeListener(r);
        
        //Canvien el valor de la propietat sampleProperty per provocar la reacció del receptor
        b.setSampleProperty("He canviat");
        
    }
    
}
