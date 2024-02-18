
package net.k3nder.json.parser.settings.block;

import java.util.LinkedHashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "volume",
    "pitch",
    "breakSound",
    "stepSound",
    "placeSound",
    "hitSound",
    "fallSound"
})
public class SoundGroup {

    @JsonProperty("volume")
    private Double volume;
    @JsonProperty("pitch")
    private Double pitch;
    @JsonProperty("breakSound")
    private BreakSound breakSound;
    @JsonProperty("stepSound")
    private StepSound stepSound;
    @JsonProperty("placeSound")
    private PlaceSound placeSound;
    @JsonProperty("hitSound")
    private HitSound hitSound;
    @JsonProperty("fallSound")
    private FallSound fallSound;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("volume")
    public Double getVolume() {
        return volume;
    }

    @JsonProperty("volume")
    public void setVolume(Double volume) {
        this.volume = volume;
    }

    @JsonProperty("pitch")
    public Double getPitch() {
        return pitch;
    }

    @JsonProperty("pitch")
    public void setPitch(Double pitch) {
        this.pitch = pitch;
    }

    @JsonProperty("breakSound")
    public BreakSound getBreakSound() {
        return breakSound;
    }

    @JsonProperty("breakSound")
    public void setBreakSound(BreakSound breakSound) {
        this.breakSound = breakSound;
    }

    @JsonProperty("stepSound")
    public StepSound getStepSound() {
        return stepSound;
    }

    @JsonProperty("stepSound")
    public void setStepSound(StepSound stepSound) {
        this.stepSound = stepSound;
    }

    @JsonProperty("placeSound")
    public PlaceSound getPlaceSound() {
        return placeSound;
    }

    @JsonProperty("placeSound")
    public void setPlaceSound(PlaceSound placeSound) {
        this.placeSound = placeSound;
    }

    @JsonProperty("hitSound")
    public HitSound getHitSound() {
        return hitSound;
    }

    @JsonProperty("hitSound")
    public void setHitSound(HitSound hitSound) {
        this.hitSound = hitSound;
    }

    @JsonProperty("fallSound")
    public FallSound getFallSound() {
        return fallSound;
    }

    @JsonProperty("fallSound")
    public void setFallSound(FallSound fallSound) {
        this.fallSound = fallSound;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
