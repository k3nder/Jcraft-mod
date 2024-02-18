
package net.k3nder.json.parser.settings.item;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RegistryEntry {

    @SerializedName("key")
    @Expose
    private Key key;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("keyOrValue")
    @Expose
    private KeyOrValue keyOrValue;

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public KeyOrValue getKeyOrValue() {
        return keyOrValue;
    }

    public void setKeyOrValue(KeyOrValue keyOrValue) {
        this.keyOrValue = keyOrValue;
    }

}
