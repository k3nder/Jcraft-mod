package net.k3nder.json.parser.settings.item;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FoodComponent {

    @SerializedName("hunger")
    @Expose
    private Integer hunger;
    @SerializedName("saturationModifier")
    @Expose
    private Float saturationModifier;
    @SerializedName("meat")
    @Expose
    private Boolean meat;
    @SerializedName("alwaysEdible")
    @Expose
    private Boolean alwaysEdible;
    @SerializedName("snack")
    @Expose
    private Boolean snack;

    @SerializedName("chance")
    @Expose
    private Float chance;

    public Integer getHunger() {
        return hunger;
    }

    public void setHunger(Integer hunger) {
        this.hunger = hunger;
    }

    public Float getSaturationModifier() {
        return saturationModifier;
    }

    public void setSaturationModifier(Float saturationModifier) {
        this.saturationModifier = saturationModifier;
    }

    public Boolean getMeat() {
        return meat;
    }

    public void setMeat(Boolean meat) {
        this.meat = meat;
    }

    public Boolean getAlwaysEdible() {
        return alwaysEdible;
    }

    public void setAlwaysEdible(Boolean alwaysEdible) {
        this.alwaysEdible = alwaysEdible;
    }

    public Boolean getSnack() {
        return snack;
    }

    public void setSnack(Boolean snack) {
        this.snack = snack;
    }

    public net.minecraft.item.FoodComponent toSetting(){
        net.minecraft.item.FoodComponent.Builder result = new net.minecraft.item.FoodComponent.Builder();
        if(hunger != null) result.hunger(hunger);
        if(saturationModifier != null) result.saturationModifier(saturationModifier);
        if(meat != null) if(meat) result.meat();
        if(alwaysEdible != null) if(alwaysEdible) result.alwaysEdible();
        if(snack != null) if(snack) result.snack();
        return result.build();
    }
}