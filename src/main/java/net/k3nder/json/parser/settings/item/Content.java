
package net.k3nder.json.parser.settings.item;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Content {

    @SerializedName("key")
    @Expose
    private String key;
    @SerializedName("fallback")
    @Expose
    private Object fallback;
    @SerializedName("args")
    @Expose
    private List<Object> args;
    @SerializedName("type")
    @Expose
    private Type type;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Object getFallback() {
        return fallback;
    }

    public void setFallback(Object fallback) {
        this.fallback = fallback;
    }

    public List<Object> getArgs() {
        return args;
    }

    public void setArgs(List<Object> args) {
        this.args = args;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

}
