/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Recipie;

/**
 *
 * @author brandan
 */
public class Unit {
    
    // Constructors
    // -----------------------------------------------------------------------
    public Unit() {
        this("",0f);
    }
    
    public Unit(String type, float unit){
        this.type = type;
        this.unit = unit;
    }
    
    // Public functions
    // -----------------------------------------------------------------------
    @Override
    public String toString(){
        return type + "/" + unit;
    }
    
    // Sets and Gets
    // -----------------------------------------------------------------------
    public String getType() { return type; }
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
