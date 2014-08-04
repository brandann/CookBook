/*
 * Ingredients.java
 */

package Recipe;

/**
 *
 * @author brandan
 */
public class Ingredient {
   
    // Constructors
    // -----------------------------------------------------------------------
    /**
     * main constructor
     * sets values to blank
     */
    public Ingredient(){
        this("", null);
    }
    
    /**
     * constructor
     * @param name of ingredient
     * @param unit of ingredient
     */
    public Ingredient(String name, Unit unit) {
        this.name = name;
        this.unit = unit;
    }
    
    // Public Functions
    // -----------------------------------------------------------------------
    @Override
    public String toString(){
        return name + "/" + unit.toString();
    }
    
    // Sets and Gets
    // -----------------------------------------------------------------------
    /**
     * set name of ingredient
     * @param name of ingredient
     */
    public void setName(String name) { this.name = name; }
    
    /**
     * set unit of ingredient
     * @param unit of ingredient
     */
    public void setUnit(Unit unit) { this.unit = unit; }
    
    /**
     * get name of ingredient
     * @return name of ingredient
     */
    public String getName() { return name; }
    
    /**
     * get unit of ingredient
     * @return unit of ingredient
     */
    public Unit getUnit() { return unit; }
    
    // Members
    // -----------------------------------------------------------------------
    private String name;
    private Unit unit;
    
    private int NAME = 0;
    private int UNIT = 1;
    private int COUNT = 2;
}
