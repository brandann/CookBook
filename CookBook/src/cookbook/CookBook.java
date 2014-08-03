/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cookbook;

import Recipie.Recipie;

/**
 *
 * @author brandan
 */
public class CookBook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Recipie r1 = new Recipie("1000;Mac and Cheese;Noodles/C/2,Chese/OZ/4,MILK/PINT/1;KIDS,DAIRY,YUK");
        Recipie r2 = new Recipie("1001;Soup;Noodles/C/2,Broth/OZ/6,TOFU/QTY/1;KIDS,VEGAN,HOT");
        Recipie r3 = new Recipie();
        
        System.out.println(r1.toString());
        System.out.println(r2.toString());
        System.out.println(r3.toString());
    }
    
}
