/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RecipieDataBase;

import Recipie.Recipe;
import java.util.ArrayList;

/**
 *
 * @author brandan
 */
public class RecipieDataBase {
    // Constructor
    // -----------------------------------------------------------------------
    public RecipieDataBase(){
        recipies = new ArrayList<>();
        loadDatabase();
        
    }
    
    // Public Functions
    // -----------------------------------------------------------------------
    public void addRecipie(Recipe recipie){
        if(recipie != null){
            recipies.add(recipie);
        }
    }
    
    // Private Functions
    // -----------------------------------------------------------------------
    private boolean loadDatabase(){
        Input input = new Input();
        recipies = input.getDatabase();
        if(recipies == null){
            return false;
        }
        return true;
    }
    
    // Sets and Gets
    // -----------------------------------------------------------------------
    public void setDatabase(ArrayList<Recipe> recipies){
        this.recipies = recipies;
    }
    public Recipe getRecipie(int id){
        int i = id - 1000;
        if(i < 0 || i > recipies.get(recipies.size() - 1).getID()){
            return null;
        }
        return recipies.get(i);
    }
    public ArrayList<Recipe> getDatabase(){
        return recipies;
    }
    public int getMaxID(){
        return recipies.get(recipies.size() - 1).getID();
    }
    
    // Members
    // -----------------------------------------------------------------------
    private ArrayList<Recipe> recipies;
}
