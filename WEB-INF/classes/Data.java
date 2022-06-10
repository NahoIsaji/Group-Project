
import java.sql.Array;
/**
 *
 * @author N_Isaji
 */
public class Data{
    private String fish;
    private String fishNum;
    private String drink;
    private String drinkNum;
    private String extra;
    private String extraNum;
    
    
    public Data(String fish, String fishNum, String drink, String drinkNum, String extra,String extraNum){
        this.fish = fish;
        this.fishNum = fishNum;
        this.drink = drink;
        this.drinkNum = drinkNum;
        this.extra = extra;
        this.extraNum = extraNum;
    }
    
    //setter and getter for fish type
    public void setFish(String fish){
        this.fish = fish;
    }
    public String getFish(){
        return fish;
    }
    
    //setter and getter for number of fish
    public void setFishNum(String fishNum){
        this.fishNum = fishNum;
    }
    public String getFishNum(){
        return fishNum;
    }
    
    //setter and getter for drink 
    public void setDrink(String drink){
        this.drink = drink;
    }
    public String getDrink(){
        return drink;
    }
    
    //setter and getter for number of drink
    public void setDrinkNum(String drinkNum){
        this.drinkNum = drinkNum;
    }
    public String getDrinkNum(){
        return drinkNum;
    }
    
    //setter and getter for extra
    public void setExtra(String extra){
        this.extra = extra;
    }
    public String getExtra(){
        return extra;
    }
    
    //setter and getter for number if extra
    public void setExtraNum(String extraNum){
        this.extraNum = extraNum;
    }
    public String getExtraNum(){
        return extraNum;
    }
    

    
    
}
