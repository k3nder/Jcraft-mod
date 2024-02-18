
package net.k3nder.json.parser.settings.item;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Style {

    @SerializedName("color")
    @Expose
    private Object color;
    @SerializedName("bold")
    @Expose
    private Boolean bold;
    @SerializedName("italic")
    @Expose
    private Boolean italic;
    @SerializedName("underlined")
    @Expose
    private Boolean underlined;
    @SerializedName("strikethrough")
    @Expose
    private Boolean strikethrough;
    @SerializedName("obfuscated")
    @Expose
    private Boolean obfuscated;
    @SerializedName("clickEvent")
    @Expose
    private Object clickEvent;
    @SerializedName("hoverEvent")
    @Expose
    private Object hoverEvent;
    @SerializedName("insertion")
    @Expose
    private Object insertion;
    @SerializedName("font")
    @Expose
    private Font font;
    @SerializedName("empty")
    @Expose
    private Boolean empty;

    public Object getColor() {
        return color;
    }

    public void setColor(Object color) {
        this.color = color;
    }

    public Boolean getBold() {
        return bold;
    }

    public void setBold(Boolean bold) {
        this.bold = bold;
    }

    public Boolean getItalic() {
        return italic;
    }

    public void setItalic(Boolean italic) {
        this.italic = italic;
    }

    public Boolean getUnderlined() {
        return underlined;
    }

    public void setUnderlined(Boolean underlined) {
        this.underlined = underlined;
    }

    public Boolean getStrikethrough() {
        return strikethrough;
    }

    public void setStrikethrough(Boolean strikethrough) {
        this.strikethrough = strikethrough;
    }

    public Boolean getObfuscated() {
        return obfuscated;
    }

    public void setObfuscated(Boolean obfuscated) {
        this.obfuscated = obfuscated;
    }

    public Object getClickEvent() {
        return clickEvent;
    }

    public void setClickEvent(Object clickEvent) {
        this.clickEvent = clickEvent;
    }

    public Object getHoverEvent() {
        return hoverEvent;
    }

    public void setHoverEvent(Object hoverEvent) {
        this.hoverEvent = hoverEvent;
    }

    public Object getInsertion() {
        return insertion;
    }

    public void setInsertion(Object insertion) {
        this.insertion = insertion;
    }

    public Font getFont() {
        return font;
    }

    public void setFont(Font font) {
        this.font = font;
    }

    public Boolean getEmpty() {
        return empty;
    }

    public void setEmpty(Boolean empty) {
        this.empty = empty;
    }

}
