/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RecipeDataBase;

import Recipe.Recipe;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

/**
 *
 * @author brandan
 */
public class Input {
    
    /**
     * trys to load and create the initial recipe database
     * @return the recipe list if not null
     */
    public ArrayList<Recipe> getDatabase(){
        ArrayList<String> str;
        
        //try online first
        str = this.getOnlineDatabase();
        if(str != null){
            return makeRecipeList(str);
        }
        
        //try local if online fails
        str = this.getLocalDatabase();
        if(str != null){
            return makeRecipeList(str);
        }
        
        //return null if no database is loaded
        return null;
    }
    
    /**
     * look online to a static location for a recipe book
     * @return the string list of the recipe book
     */
    private ArrayList<String> getOnlineDatabase(){
        //look for https://greenrock.comule.com/recipe/book.dat
        ArrayList<String> str = new ArrayList<>();
        try {
            URL databasePath = new URL("http://greenrock.comule.com/recipe/book.dat");
            URLConnection connection = databasePath.openConnection();
            BufferedReader in = new BufferedReader(new
            InputStreamReader(connection.getInputStream()));
            String inputLine;
            System.out.println("WEB--------------------");
            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
                str.add(inputLine);
            }
            System.out.println("WEB END----------------");
            in.close();
            return str;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    /**
     * look in a local dir for a recipe book
     * @return the string list of the recipe book
     */
    private ArrayList<String> getLocalDatabase(){
        // load a file chooser and look in current dir
        return null;
    }
    
    /**
     * turn the string list of a recipe book into a Recipe list
     * @param str the string list of the recipe book
     * @return the Recipe list
     */
    private ArrayList<Recipe> makeRecipeList(ArrayList<String> str){
        if (str == null){
            return null;
        }
        ArrayList<Recipe> r = new ArrayList<>();
        for (String s : str){
            r.add(new Recipe(s));
        }
        return r;
    }
}
