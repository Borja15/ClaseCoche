/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coche;

/**
 *
 * @author Borja Andrades
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClaseCoche Coche1 = new ClaseCoche();
        Coche1.asignarValores("Phantom","dorado",true,312314,1998);
        System.out.println(Coche1.mostrarValores());
    }
    
}
