/*
 * Unit.java
 */

package Recipe;

/**
 * 
 * @author brandan
 */
public class Unit {
    
    // Constructors
    // -----------------------------------------------------------------------
    /**
     * main constructor
     * set this to blank values
     */
    public Unit() {
        this("",0f);
    }
    
    /**
     * constructor
     * @param type type name of the unit
     * @param unit float value of the unit
     */
    public Unit(String type, float unit){
        this.type = type;
        this.unit = unit;
    }
    
    // Public functions
    // -----------------------------------------------------------------------
    @Override
    /**
     * toSring == TYPE/UNIT
     */
    public String toString(){
        return type + "/" + unit;
    }
    
    // Sets and Gets
    // -----------------------------------------------------------------------
    /**
     * get the unit type
     * @return type of the unit
     */
    public String getType() { return type; }
    
    /**
     * get the unit value
     * @return unit value
     */
    public float getUnit() { return unit; }
    
    // Members
    // -----------------------------------------------------------------------
    final static public String[] Types = new String[]{
        "QTY",   //quantity
        "LBS",   //pounds
        "OZ",    //ounces
        "C",     //cups
        "TBSP",  //table spoons 
        "TSP",   //teaspoons
        "G",     //grams
        "ML",    //milliter
        "PINTS",  //pint
        "OTHER"
    };
    
    private float unit;
    private String type; 
}
