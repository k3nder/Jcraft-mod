package net.k3nder.json.parser.settings.block;

import java.util.LinkedHashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.enums.Instrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.EntityType;
import net.minecraft.sound.BlockSoundGroup;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "collidable",
        "soundGroup",
        "luminance",
        "resistance",
        "hardness",
        "toolRequired",
        "randomTicks",
        "slipperiness",
        "velocityMultiplier",
        "jumpVelocityMultiplier",
        "lootTableId",
        "opaque",
        "isAir",
        "burnable",
        "liquid",
        "forceNotSolid",
        "forceSolid",
        "pistonBehavior",
        "blockBreakParticles",
        "instrument",
        "replaceable",
        "allowsSpawningPredicate",
        "solidBlockPredicate",
        "suffocationPredicate",
        "blockVisionPredicate",
        "postProcessPredicate",
        "emissiveLightingPredicate",
        "dynamicBounds",
        "requiredFeatures",
        "offsetter"
})

public class JBSettings {

    @JsonProperty("collidable")
    private Boolean collidable;
    @JsonProperty("soundGroup")
    private BlockSoundGroup soundGroup;
    @JsonProperty("luminance")
    private int luminance;
    @JsonProperty("resistance")
    private Float resistance;
    @JsonProperty("hardness")
    private Float hardness;
    @JsonProperty("toolRequired")
    private Boolean toolRequired;
    @JsonProperty("randomTicks")
    private Boolean randomTicks;
    @JsonProperty("slipperiness")
    private Float slipperiness;
    @JsonProperty("velocityMultiplier")
    private Float velocityMultiplier;
    @JsonProperty("jumpVelocityMultiplier")
    private Float jumpVelocityMultiplier;
    @JsonProperty("lootTableId")
    private Object lootTableId;
    @JsonProperty("opaque")
    private Boolean opaque;
    @JsonProperty("isAir")
    private Boolean isAir;
    @JsonProperty("burnable")
    private Boolean burnable;
    @JsonProperty("liquid")
    private Boolean liquid;
    @JsonProperty("forceNotSolid")
    private Boolean forceNotSolid;
    @JsonProperty("forceSolid")
    private Boolean forceSolid;
    @JsonProperty("pistonBehavior")
    private String pistonBehavior;
    @JsonProperty("blockBreakParticles")
    private Boolean blockBreakParticles;
    @JsonProperty("instrument")
    private String instrument;
    @JsonProperty("replaceable")
    private Boolean replaceable;
    @JsonProperty("allowsSpawningPredicate")
    private AllowsSpawningPredicate allowsSpawningPredicate;
    @JsonProperty("solidBlockPredicate")
    private SolidBlockPredicate solidBlockPredicate;
    @JsonProperty("suffocationPredicate")
    private net.k3nder.json.parser.settings.block.SuffocationPredicate suffocationPredicate;
    @JsonProperty("blockVisionPredicate")
    private BlockVisionPredicate blockVisionPredicate;
    @JsonProperty("postProcessPredicate")
    private PostProcessPredicate postProcessPredicate;
    @JsonProperty("emissiveLightingPredicate")
    private EmissiveLightingPredicate emissiveLightingPredicate;
    @JsonProperty("dynamicBounds")
    private Boolean dynamicBounds;
    @JsonProperty("requiredFeatures")
    private RequiredFeatures requiredFeatures;
    @JsonProperty("offsetter")
    private Object offsetter;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("collidable")
    public Boolean getCollidable() {
        return collidable;
    }

    @JsonProperty("collidable")
    public void setCollidable(Boolean collidable) {
        this.collidable = collidable;
    }

    @JsonProperty("soundGroup")
    public BlockSoundGroup getSoundGroup() {
        return soundGroup;
    }

    @JsonProperty("soundGroup")
    public void setSoundGroup(BlockSoundGroup soundGroup) {
        this.soundGroup = soundGroup;
    }

    @JsonProperty("luminance")
    public int getLuminance() {
        return luminance;
    }

    @JsonProperty("luminance")
    public void setLuminance(int luminance) {
        this.luminance = luminance;
    }

    @JsonProperty("resistance")
    public Float getResistance() {
        return resistance;
    }

    @JsonProperty("resistance")
    public void setResistance(Float resistance) {
        this.resistance = resistance;
    }

    @JsonProperty("hardness")
    public Float getHardness() {
        return hardness;
    }

    @JsonProperty("hardness")
    public void setHardness(Float hardness) {
        this.hardness = hardness;
    }

    @JsonProperty("toolRequired")
    public Boolean getToolRequired() {
        return toolRequired;
    }

    @JsonProperty("toolRequired")
    public void setToolRequired(Boolean toolRequired) {
        this.toolRequired = toolRequired;
    }

    @JsonProperty("randomTicks")
    public Boolean getRandomTicks() {
        return randomTicks;
    }

    @JsonProperty("randomTicks")
    public void setRandomTicks(Boolean randomTicks) {
        this.randomTicks = randomTicks;
    }

    @JsonProperty("slipperiness")
    public Float getSlipperiness() {
        return slipperiness;
    }

    @JsonProperty("slipperiness")
    public void setSlipperiness(Float slipperiness) {
        this.slipperiness = slipperiness;
    }

    @JsonProperty("velocityMultiplier")
    public Float getVelocityMultiplier() {
        return velocityMultiplier;
    }

    @JsonProperty("velocityMultiplier")
    public void setVelocityMultiplier(Float velocityMultiplier) {
        this.velocityMultiplier = velocityMultiplier;
    }

    @JsonProperty("jumpVelocityMultiplier")
    public Float getJumpVelocityMultiplier() {
        return jumpVelocityMultiplier;
    }

    @JsonProperty("jumpVelocityMultiplier")
    public void setJumpVelocityMultiplier(Float jumpVelocityMultiplier) {
        this.jumpVelocityMultiplier = jumpVelocityMultiplier;
    }

    @JsonProperty("lootTableId")
    public Object getLootTableId() {
        return lootTableId;
    }

    @JsonProperty("lootTableId")
    public void setLootTableId(Object lootTableId) {
        this.lootTableId = lootTableId;
    }

    @JsonProperty("opaque")
    public Boolean getOpaque() {
        return opaque;
    }

    @JsonProperty("opaque")
    public void setOpaque(Boolean opaque) {
        this.opaque = opaque;
    }

    @JsonProperty("isAir")
    public Boolean getIsAir() {
        return isAir;
    }

    @JsonProperty("isAir")
    public void setIsAir(Boolean isAir) {
        this.isAir = isAir;
    }

    @JsonProperty("burnable")
    public Boolean getBurnable() {
        return burnable;
    }

    @JsonProperty("burnable")
    public void setBurnable(Boolean burnable) {
        this.burnable = burnable;
    }

    @JsonProperty("liquid")
    public Boolean getLiquid() {
        return liquid;
    }

    @JsonProperty("liquid")
    public void setLiquid(Boolean liquid) {
        this.liquid = liquid;
    }

    @JsonProperty("forceNotSolid")
    public Boolean getForceNotSolid() {
        return forceNotSolid;
    }

    @JsonProperty("forceNotSolid")
    public void setForceNotSolid(Boolean forceNotSolid) {
        this.forceNotSolid = forceNotSolid;
    }

    @JsonProperty("forceSolid")
    public Boolean getForceSolid() {
        return forceSolid;
    }

    @JsonProperty("forceSolid")
    public void setForceSolid(Boolean forceSolid) {
        this.forceSolid = forceSolid;
    }

    @JsonProperty("pistonBehavior")
    public String getPistonBehavior() {
        return pistonBehavior;
    }

    @JsonProperty("pistonBehavior")
    public void setPistonBehavior(String pistonBehavior) {
        this.pistonBehavior = pistonBehavior;
    }

    @JsonProperty("blockBreakParticles")
    public Boolean getBlockBreakParticles() {
        return blockBreakParticles;
    }

    @JsonProperty("blockBreakParticles")
    public void setBlockBreakParticles(Boolean blockBreakParticles) {
        this.blockBreakParticles = blockBreakParticles;
    }

    @JsonProperty("instrument")
    public String getInstrument() {
        return instrument;
    }

    @JsonProperty("instrument")
    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    @JsonProperty("replaceable")
    public Boolean getReplaceable() {
        return replaceable;
    }

    @JsonProperty("replaceable")
    public void setReplaceable(Boolean replaceable) {
        this.replaceable = replaceable;
    }

    @JsonProperty("allowsSpawningPredicate")
    public AllowsSpawningPredicate getAllowsSpawningPredicate() {
        return allowsSpawningPredicate;
    }

    @JsonProperty("allowsSpawningPredicate")
    public void setAllowsSpawningPredicate(AllowsSpawningPredicate allowsSpawningPredicate) {
        this.allowsSpawningPredicate = allowsSpawningPredicate;
    }

    @JsonProperty("solidBlockPredicate")
    public SolidBlockPredicate getSolidBlockPredicate() {
        return solidBlockPredicate;
    }

    @JsonProperty("solidBlockPredicate")
    public void setSolidBlockPredicate(SolidBlockPredicate solidBlockPredicate) {
        this.solidBlockPredicate = solidBlockPredicate;
    }

    @JsonProperty("suffocationPredicate")
    public SuffocationPredicate getSuffocationPredicate() {
        return suffocationPredicate;
    }

    @JsonProperty("suffocationPredicate")
    public void setSuffocationPredicate(SuffocationPredicate suffocationPredicate) {
        this.suffocationPredicate = suffocationPredicate;
    }

    @JsonProperty("blockVisionPredicate")
    public BlockVisionPredicate getBlockVisionPredicate() {
        return blockVisionPredicate;
    }

    @JsonProperty("blockVisionPredicate")
    public void setBlockVisionPredicate(BlockVisionPredicate blockVisionPredicate) {
        this.blockVisionPredicate = blockVisionPredicate;
    }

    @JsonProperty("postProcessPredicate")
    public PostProcessPredicate getPostProcessPredicate() {
        return postProcessPredicate;
    }

    @JsonProperty("postProcessPredicate")
    public void setPostProcessPredicate(PostProcessPredicate postProcessPredicate) {
        this.postProcessPredicate = postProcessPredicate;
    }

    @JsonProperty("emissiveLightingPredicate")
    public EmissiveLightingPredicate getEmissiveLightingPredicate() {
        return emissiveLightingPredicate;
    }

    @JsonProperty("emissiveLightingPredicate")
    public void setEmissiveLightingPredicate(EmissiveLightingPredicate emissiveLightingPredicate) {
        this.emissiveLightingPredicate = emissiveLightingPredicate;
    }

    @JsonProperty("dynamicBounds")
    public Boolean getDynamicBounds() {
        return dynamicBounds;
    }

    @JsonProperty("dynamicBounds")
    public void setDynamicBounds(Boolean dynamicBounds) {
        this.dynamicBounds = dynamicBounds;
    }

    @JsonProperty("requiredFeatures")
    public RequiredFeatures getRequiredFeatures() {
        return requiredFeatures;
    }

    @JsonProperty("requiredFeatures")
    public void setRequiredFeatures(RequiredFeatures requiredFeatures) {
        this.requiredFeatures = requiredFeatures;
    }

    @JsonProperty("offsetter")
    public Object getOffsetter() {
        return offsetter;
    }

    @JsonProperty("offsetter")
    public void setOffsetter(Object offsetter) {
        this.offsetter = offsetter;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
    public String parent;

    public FabricBlockSettings toSettings() throws NoSuchFieldException, IllegalAccessException {
        if(parent != null && !parent.isEmpty() && !parent.isBlank()) {
            Block b = (Block) Blocks.class.getField(parent).get(new Blocks());
            return FabricBlockSettings.copyOf(b.getSettings());
        }

        FabricBlockSettings settings = FabricBlockSettings.create();
        if(collidable != null) settings.collidable(collidable);
        if(allowsSpawningPredicate != null) settings.allowsSpawning((AbstractBlock.TypedContextPredicate<EntityType<?>>) allowsSpawningPredicate);
        if(blockVisionPredicate != null) settings.blockVision((AbstractBlock.ContextPredicate) blockVisionPredicate);
        if(burnable != null) if(burnable) settings.burnable();
        if(isAir != null) if(isAir) settings.air();
        if(hardness != null) settings.hardness(hardness);
        if(soundGroup != null) settings.sounds(soundGroup);
        settings.luminance(1);
        if(resistance != null) settings.resistance(resistance);
        if(toolRequired != null) if(toolRequired) settings.requiresTool();
        if(randomTicks != null) if(randomTicks) settings.ticksRandomly();
        if(slipperiness != null) settings.slipperiness(slipperiness);
        if(velocityMultiplier != null) settings.velocityMultiplier(velocityMultiplier);
        if(jumpVelocityMultiplier != null) settings.jumpVelocityMultiplier(jumpVelocityMultiplier);
        if(opaque != null) if(!opaque) settings.nonOpaque();
        if(liquid != null) if(liquid) settings.liquid();
        if(forceNotSolid != null) if(forceNotSolid) settings.notSolid();
        if(pistonBehavior != null) if(!pistonBehavior.isEmpty() || !pistonBehavior.isBlank()) settings.pistonBehavior(PistonBehavior.valueOf(pistonBehavior));
        if(blockBreakParticles != null) if(blockBreakParticles) settings.noBlockBreakParticles();
        if(instrument != null) if(!instrument.isBlank() || !instrument.isEmpty()) settings.instrument(Instrument.valueOf(instrument));
        if(resistance != null) if(replaceable) settings.replaceable();
        if(solidBlockPredicate != null) settings.solidBlock((AbstractBlock.ContextPredicate) solidBlockPredicate);
        if(suffocationPredicate != null) settings.suffocates((AbstractBlock.ContextPredicate) suffocationPredicate);
        if(postProcessPredicate != null) settings.postProcess((AbstractBlock.ContextPredicate) postProcessPredicate);
        if(emissiveLightingPredicate != null) settings.emissiveLighting((AbstractBlock.ContextPredicate) emissiveLightingPredicate);
        if(dynamicBounds != null) if(dynamicBounds) settings.dynamicBounds();
        if(offsetter != null) settings.offset((AbstractBlock.OffsetType) offsetter);
        return settings;
    }
}
