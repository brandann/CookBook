/*
 * Tags.java
 */

package Recipe;

/**
 *
 * @author brandan
 */
public class Tags {
    
    // Constructors
    // -----------------------------------------------------------------------
    /**
     * main constructor
     * set the values of this to blank
     */
    public Tags() {
        tags = "";
    }
    
    /**
     * constructor
     * @param tags tags to set to this
     */
    public Tags(String tags) {
        this.tags = tags;
    }
    
    // Public Functions
    // -----------------------------------------------------------------------
    /**
     * add a new tag to the end of this list
     * @param tag to add
     */
    public void add(String tag){
        tags += ", " + tags;
    }
    
    /**
     * remove tag by name
     * @param tag name to remove
     * @return true if the tag is found
     */
    public boolean remove(String tag){
        return false;
    }
    
    @Override
    /**
     * toString == tag1,tag2,...
     */
    public String toString(){
        return tags;
    }
    
    // Set and Gets
    // -----------------------------------------------------------------------
    /**
     * set this.tags to tags
     * @param tags to set to this
     */
    public void setTags(String tags) { this.tags = tags; }
    
    /**
     * get all the tags
     * @return tags
     */
    public String getTags() { return tags; }
    
    // Members
    // -----------------------------------------------------------------------
    private String tags;
}
