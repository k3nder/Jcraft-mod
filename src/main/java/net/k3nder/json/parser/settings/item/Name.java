
package net.k3nder.json.parser.settings.item;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Name {

    @SerializedName("content")
    @Expose
    private Content content;
    @SerializedName("siblings")
    @Expose
    private List<Object> siblings;
    @SerializedName("style")
    @Expose
    private Style style;
    @SerializedName("string")
    @Expose
    private String string;
    @SerializedName("literalString")
    @Expose
    private Object literalString;

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public List<Object> getSiblings() {
        return siblings;
    }

    public void setSiblings(List<Object> siblings) {
        this.siblings = siblings;
    }

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public Object getLiteralString() {
        return literalString;
    }

    public void setLiteralString(Object literalString) {
        this.literalString = literalString;
    }

}
