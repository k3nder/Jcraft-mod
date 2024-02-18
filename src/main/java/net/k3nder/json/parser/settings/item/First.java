
package net.k3nder.json.parser.settings.item;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class First extends StatusEffect {

    @SerializedName("duration")
    @Expose
    private Integer duration;
    @SerializedName("amplifier")
    @Expose
    private Integer amplifier;
    @SerializedName("ambient")
    @Expose
    private Boolean ambient;
    @SerializedName("factorCalculationData")
    @Expose
    private Object factorCalculationData;
    @SerializedName("infinite")
    @Expose
    private Boolean infinite;
    @SerializedName("translationKey")
    @Expose
    private String translationKey;
    @SerializedName("effectType")
    @Expose
    private EffectType effectType;

    protected First(StatusEffectCategory category, int color) {
        super(category, color);
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getAmplifier() {
        return amplifier;
    }

    public void setAmplifier(Integer amplifier) {
        this.amplifier = amplifier;
    }

    public Boolean getAmbient() {
        return ambient;
    }

    public void setAmbient(Boolean ambient) {
        this.ambient = ambient;
    }

    public Object getFactorCalculationData() {
        return factorCalculationData;
    }

    public void setFactorCalculationData(Object factorCalculationData) {
        this.factorCalculationData = factorCalculationData;
    }

    public Boolean getInfinite() {
        return infinite;
    }

    public void setInfinite(Boolean infinite) {
        this.infinite = infinite;
    }

    public String getTranslationKey() {
        return translationKey;
    }

    public void setTranslationKey(String translationKey) {
        this.translationKey = translationKey;
    }

    public EffectType getEffectType() {
        return effectType;
    }

    public void setEffectType(EffectType effectType) {
        this.effectType = effectType;
    }

}
