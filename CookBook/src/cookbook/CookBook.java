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
        Recipe r1 = new Recipe("1000;Mac and Cheese;Noodles/C/2,Chese/OZ/4,MILK/PINT/1;KIDS,DAIRY,YUK");
        Recipe r2 = new Recipe("1001;Soup;Noodles/C/2,Broth/OZ/6,TOFU/QTY/1;KIDS,VEGAN,HOT");
        Recipe r3 = new Recipe("1002;Grilled Cheese;Bread/QTY/8,Dyia Cheese/QTY/1;KIDS,VEGAN,FAST,CHEAP");
        
        RecipeDataBase rb = new RecipeDataBase();
        rb.addRecipe(r1);
        rb.addRecipe(r2);
        rb.addRecipe(r3);
        
        rb.print();
        print("------------------------------------------------");
        for(int i = 1000; i < 1005; i++){
            if(rb.getRecipe(i) != null)
                print(rb.getRecipe(i).toString());
        }
    }
    
    static public void print(String s){
        System.out.println("LOG: " + s);
    }
    
}
