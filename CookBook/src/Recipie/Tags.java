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
public class Tags {
    
    // Constructors
    // -----------------------------------------------------------------------
    public Tags(String tags) {
        this.tags = tags;
    }
    
    // Public Functions
    // -----------------------------------------------------------------------
    public void appendTags(String tag){
        tags += ", " + tags;
    }
    
    public boolean removeTag(String tag){
        return false;
    }
    
    // Set and Gets
    // -----------------------------------------------------------------------
    public void setTags(String tags) { this.tags = tags; }
    public String getTags() { return tags; }
    
    // Members
    // -----------------------------------------------------------------------
    private String tags;
}
