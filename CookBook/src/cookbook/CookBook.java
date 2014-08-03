/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cookbook;

import Recipie.Recipe;

/**
 *
 * @author brandan
 */
public class CookBook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Recipe r1 = new Recipe("1000;Mac and Cheese;Noodles/C/2,Chese/OZ/4,MILK/PINT/1;KIDS,DAIRY,YUK");
        Recipe r2 = new Recipe("1001;Soup;Noodles/C/2,Broth/OZ/6,TOFU/QTY/1;KIDS,VEGAN,HOT");
        Recipe r3 = new Recipe();
        
        System.out.println(r1.toString());
        System.out.println(r2.toString());
        System.out.println(r3.toString());
    }
    
}
