/*
 * Recipe.java
 */

package Recipe;

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
    /**
     * set this recipe
     * @param recipie to set this to
     */
    public void setRecipie(String recipie) { parseRecipe(recipie); }
    
    /**
     * set title of recipe
     * @param title to set this to
     */
    public void setTitle(String title) { this.title = title; }
    
    /**
     * set ingredients of recipe
     * @param ingredients to set this to
     */
    public void setIngredients(String ingredients) { parseIngredients(ingredients); }
    
    /**
     * set tags of recipe
     * @param tags to set this to
     */
    public void setTags(Tags tags) { this.tags = tags; }
    
    /**
     * set id of recipe
     * @param id to set this to
     */
    public void setID(int id) { this.id = id; }
    
    /**
     * get recipe title
     * @return recipe title
     */
    public String getTitle() { return title; }
    
    /**
     * get recipe ingredients
     * @return recipe ingredients
     */
    public ArrayList<Ingredient> getIngredients() { return ingredients; }
    
    /**
     * get recipe id
     * @return recipe id
     */
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
