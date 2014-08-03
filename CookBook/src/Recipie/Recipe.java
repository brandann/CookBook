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
public class Recipe {
    
    // Constructors
    // -----------------------------------------------------------------------
    /**
     * Recipe constructor
     */
    public Recipe() {
        ingredients = new ArrayList<Ingredient>();
        tags = new Tags();
    }
    
    /**
     * Recipe constructor
     * @param recipie parses and loads recipe from string
     */
    public Recipe(String recipie){
        parseRecipe(recipie);
    }
    
    // Private Functions
    // -----------------------------------------------------------------------
    /**
     * parseRecipe
     * @param recipe parses the recipe string
     */
    private void parseRecipe(String recipe){
        ingredients = new ArrayList<Ingredient>();
        
        String[] r = recipe.split(";");
        id = Integer.parseInt(r[ID]);
        title = r[TITLE].trim();
        parseIngredients(r[INGREDIENTS]);
        tags = new Tags(r[TAGS]);
    }
    
    /**
     * parseIngredients
     * break and parse the ingredients and set its units
     * @param ingredients string off all ingredients
     */
    private void parseIngredients(String ingredients) {
        String[] i = ingredients.split(",");
        for(String s : i){
            //ingredient format: NAME/TYPE/UNIT
            String[] in = s.split("/");
            Ingredient temp = new Ingredient(in[NAME], 
                    new Unit(in[TYPE], Float.parseFloat(in[UNIT])));
            this.ingredients.add(temp);
        }
    }
    
    // Public Functions
    // -----------------------------------------------------------------------
    @Override
    
    public String toString(){
        String str = "";
        str += id + ";" +title + ";";
        for(Ingredient i : ingredients){
            str += i.toString() + ",";
        }
        str += ";";
        //int last = str.lastIndexOf(",");
        str = str.replaceAll(",;", ";");
        //str.replace(",;", ";");
        str += tags;
        return str;
    }
    
    
    // Sets and Gets
    // -----------------------------------------------------------------------
    public void setRecipie(String recipie) { parseRecipe(recipie); }
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
    
    final private int ID = 0;
    final private int TITLE = 1;
    final private int INGREDIENTS = 2;
    final private int TAGS = 3;
    final private int NAME = 0;
    final private int TYPE = 1;
    final private int UNIT = 2;
}