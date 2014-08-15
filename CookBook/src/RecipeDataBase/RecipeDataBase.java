/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RecipeDataBase;

import Recipe.Recipe;
import java.util.ArrayList;

/**
 *
 * @author brandan
 */
public class RecipeDataBase {
    
    // Constructor
    // -----------------------------------------------------------------------
    /**
     * Constructor, attempt to load the database
     */
    public RecipeDataBase(){
        //recipes = new ArrayList<>();
        loadDatabase();
        
    }
    
    // Public Functions
    // -----------------------------------------------------------------------
    /**
     * add a single recipe to the database at the end of the list
     * @param recipe Recipe to add
     */
    public void addRecipe(Recipe recipe){
        //recipes.add(recipe);
        if(recipe != null){
            recipes.add(recipe);
        }
    }
    
    /**
     * print all the Recipes using the toString() method
     * used mainly for testing
     */
    public void print(){
        for(Recipe r : recipes){
            System.out.println(r.toString());
        }
    }
    
    // Private Functions
    // -----------------------------------------------------------------------
    /**
     * attempt to load a database using the Input class
     * @return true if a database has been loaded
     */
    private boolean loadDatabase(){
        Input input = new Input();
        recipes = input.getDatabase();
        if(recipes == null){
            recipes = new ArrayList<>();
            return false;
        }
        return true;
    }

    
    // Sets and Gets
    // -----------------------------------------------------------------------
    /**
     * return a Recipe based of the recipe ID passed in
     * @param id ID of the recipe for look up
     * @return the Recipe with Recipe.ID == id
     */
    public Recipe getRecipe(int id) {
        int i = id - 1000;
        if(i < 0 || i > recipes.get(recipes.size() - 1).getID()-1000){
            //throw new IndexOutOfBoundsException();
            Recipe r = null;
            return r;
        }
        return recipes.get(i);
    }
    
    /**
     * get the entire database
     * @return the database
     */
    public ArrayList<Recipe> getDatabase(){
        return recipes;
    }
    
    /**
     * get the highest ID in the recipe book
     * @return Recipe with the highest ID
     */
    public int getMaxID(){
        return recipes.get(recipes.size() - 1).getID();
    }
    
    // Members
    // -----------------------------------------------------------------------
    private ArrayList<Recipe> recipes;
}
