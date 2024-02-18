
package net.k3nder.json.parser.settings.item;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EffectType {

    @SerializedName("attributeModifiers")
    @Expose
    private AttributeModifiers attributeModifiers;
    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("color")
    @Expose
    private Integer color;
    @SerializedName("translationKey")
    @Expose
    private String translationKey;
    @SerializedName("factorCalculationDataSupplier")
    @Expose
    private Object factorCalculationDataSupplier;
    @SerializedName("registryEntry")
    @Expose
    private RegistryEntry registryEntry;
    @SerializedName("name")
    @Expose
    private Name name;
    @SerializedName("beneficial")
    @Expose
    private Boolean beneficial;
    @SerializedName("instant")
    @Expose
    private Boolean instant;

    public AttributeModifiers getAttributeModifiers() {
        return attributeModifiers;
    }

    public void setAttributeModifiers(AttributeModifiers attributeModifiers) {
        this.attributeModifiers = attributeModifiers;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getColor() {
        return color;
    }

    public void setColor(Integer color) {
        this.color = color;
    }

    public String getTranslationKey() {
        return translationKey;
    }

    public void setTranslationKey(String translationKey) {
        this.translationKey = translationKey;
    }

    public Object getFactorCalculationDataSupplier() {
        return factorCalculationDataSupplier;
    }

    public void setFactorCalculationDataSupplier(Object factorCalculationDataSupplier) {
        this.factorCalculationDataSupplier = factorCalculationDataSupplier;
    }

    public RegistryEntry getRegistryEntry() {
        return registryEntry;
    }

    public void setRegistryEntry(RegistryEntry registryEntry) {
        this.registryEntry = registryEntry;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Boolean getBeneficial() {
        return beneficial;
    }

    public void setBeneficial(Boolean beneficial) {
        this.beneficial = beneficial;
    }

    public Boolean getInstant() {
        return instant;
    }

    public void setInstant(Boolean instant) {
        this.instant = instant;
    }

}
