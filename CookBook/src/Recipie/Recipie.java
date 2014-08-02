/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Recipie;

import java.util.ArrayList;

/**
 *
 * @author brandan
 */
public class Recipie {
    
    // Constructors
    // -----------------------------------------------------------------------
    public Recipie(String recipie){
        parseRecipie(recipie);
    }
    
    // Private Functions
    // -----------------------------------------------------------------------
    private void parseRecipie(String recipie){
        String[] r = recipie.split(";");
        id = Integer.parseInt(r[ID]);
        title = r[TITLE].trim();
        parseIngredients(r[INGREDIENTS]);
        parseTags(r[TAGS]);
    }
    
    private void parseIngredients(String ingredients) {
        String[] i = ingredients.split(",");
        
        for(String s : i){
            //ingredient format: NAME/UNIT/COUNT
        }
    }
    
    private void parseTags(String tags) {
        String[] t = tags.split(",");
        
    }
    
    
    // Sets and Gets
    // -----------------------------------------------------------------------
    public void setRecipie(String recipie) { parseRecipie(recipie); }
    public void setTitle(String title) { this.title = title; }
    public void setIngredients(String ingredients) { parseIngredients(ingredients); }
    public void setTags(Tags tags) { this.tags = tags; }
    public void setID(int id) { this.id = id; }
    public String getTitle() { return title; }
    public ArrayList<Ingredient> getIngredients() { return ingredients; }
    public int getID() { return id; }
    
    // Members
    // -----------------------------------------------------------------------
    private String title;
    private ArrayList<Ingredient> ingredients;
    private Tags tags;
    private int id;
    
    private int ID = 0;
    private int TITLE = 1;
    private int INGREDIENTS = 2;
    private int TAGS = 3;
}
