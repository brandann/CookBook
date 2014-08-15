/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cookbook;

import Recipe.Recipe;
import RecipeDataBase.RecipeDataBase;

/**
 *
 * @author brandan
 */
public class CookBook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        RecipeDataBase rb = new RecipeDataBase();
        
        rb.print();
        
    }
    
    static public void print(String s){
        System.out.println("LOG: " + s);
    }
    
}
