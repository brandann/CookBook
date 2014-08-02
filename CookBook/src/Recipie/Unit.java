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
    public Unit(String unit, float count){
        parseUnit(unit);
        this.count = count;
    }
    
    // Private functions
    // -----------------------------------------------------------------------
    private void parseUnit(String unit){
        String u = unit.toUpperCase();
        if(u == Type.QTY.toString())
            this.unit = Type.QTY;
        else if(u == Type.LBS.toString())
            this.unit = Type.LBS;
        else if(u == Type.OZ.toString())
            this.unit = Type.OZ;
        else if(u == Type.C.toString())
            this.unit = Type.C;
        else if(u == Type.TBSP.toString())
            this.unit = Type.TBSP;
        else if(u == Type.TSP.toString())
            this.unit = Type.TSP;
    }
    
    // Sets and Gets
    // -----------------------------------------------------------------------
    public String getUnit() { return unit.toString(); }
    public float getCount() { return count; }
    
    // Members
    // -----------------------------------------------------------------------
    public enum Type{
        QTY, //quantity
        LBS, //pounds
        OZ,  //ounces
        C,   //cups
        TBSP,//table spoons 
        TSP, //teaspoons
        G,   //grams
    };
    
    private float count;
    private Type unit; 
}
