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
public class Ingredient {
   
    // Constructors
    // -----------------------------------------------------------------------
    public Ingredient(String name, Unit unit) {
        this.name = name;
        this.unit = unit;
    }
    
    // Sets and Gets
    // -----------------------------------------------------------------------
    public void setName(String name) { this.name = name; }
    public void setUnit(Unit unit) { this.unit = unit; }
    public String getName() { return name; }
    public Unit getUnit() { return unit; }
    
    // Members
    // -----------------------------------------------------------------------
    private String name;
    private Unit unit;
    
    private int NAME = 0;
    private int UNIT = 1;
    private int COUNT = 2;
}
