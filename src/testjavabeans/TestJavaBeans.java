/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjavabeans;

import java.beans.PropertyVetoException;
import mybeans.FirstBean;
import mybeans.ReceptorVetador;

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

        ReceptorVetador r = new ReceptorVetador();
        b.addVetoableChangeListener(r);
        
        //Intentem posar -1 com a valor de la propietat quantitat
        System.out.println("Intent de canvi a la propietat quantitat.");
        System.out.println("Valor actual: " + b.getQuantitat());  
        System.out.println("Nou valor: -1.");
        
        try {
            b.setQuantitat(-1);
        } catch (PropertyVetoException ex) {
            System.out.println("No s'ha permès el canvi!!");            
        }

        //Intentem posar 160 com a valor de la propietat quantitat
        System.out.println("\nIntent de canvi a la propietat quantitat.");
        System.out.println("Valor actual: " + b.getQuantitat());  
        System.out.println("Nou valor: 160.");
        
        try {
            b.setQuantitat(160);
        } catch (PropertyVetoException ex) {
            System.out.println("No s'ha permès el canvi!!");            
        }
        
        //Intentem posar 25 com a valor de la propietat quantitat
        System.out.println("\nIntent de canvi a la propietat quantitat.");
        System.out.println("Valor actual: "+b.getQuantitat());  
        System.out.println("Nou valor: 25.");
        
        try {
            b.setQuantitat(25);
        } catch (PropertyVetoException ex) {
            System.out.println("No s'ha permès el canvi!!");            
        }  
    }
    
}
