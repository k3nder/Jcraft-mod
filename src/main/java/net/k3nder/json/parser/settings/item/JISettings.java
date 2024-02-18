
package net.k3nder.json.parser.settings.item;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Rarity;

public class JISettings {

    @SerializedName("maxCount")
    @Expose
    private Integer maxCount;
    @SerializedName("maxDamage")
    @Expose
    private Integer maxDamage;
    @SerializedName("recipeRemainder")
    @Expose
    private Object recipeRemainder;
    @SerializedName("rarity")
    @Expose
    private String rarity;
    @SerializedName("foodComponent")
    @Expose
    private FoodComponent foodComponent;
    @SerializedName("fireproof")
    @Expose
    private Boolean fireproof;


    public Integer getMaxCount() {
        return maxCount;
    }

    public void setMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
    }

    public Integer getMaxDamage() {
        return maxDamage;
    }

    public void setMaxDamage(Integer maxDamage) {
        this.maxDamage = maxDamage;
    }

    public Object getRecipeRemainder() {
        return recipeRemainder;
    }

    public void setRecipeRemainder(Object recipeRemainder) {
        this.recipeRemainder = recipeRemainder;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

//    public FoodComponent getFoodComponent() {
//        return foodComponent;
//    }
//
//    public void setFoodComponent(FoodComponent foodComponent) {
//        this.foodComponent = foodComponent;
//    }

    public Boolean getFireproof() {
        return fireproof;
    }

    public void setFireproof(Boolean fireproof) {
        this.fireproof = fireproof;
    }

    public FabricItemSettings toSettings() {
        FabricItemSettings result = new FabricItemSettings();
        result.maxCount(maxCount);
        result.maxDamage(maxDamage);
        result.recipeRemainder((Item) recipeRemainder);
        result.rarity(Rarity.valueOf(rarity));
        result.food(foodComponent.toSetting());
        if(fireproof) result.fireproof();
        return result;
    }

}
