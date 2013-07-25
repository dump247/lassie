package com.bazaarvoice.lassie.screenboard.widgets;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import static com.google.common.base.Preconditions.checkNotNull;

public class ConditionalFormat {
    @JsonProperty("color")
    private Color _color = Color.WHITE_ON_GREEN;
    @JsonProperty("invert")
    private boolean _inverted = false;
    @JsonProperty("comparator")
    private Comparator _comparator = Comparator.GREATER;
    @JsonProperty("value")
    private double _value = 0;

    public ConditionalFormat(Color color, boolean inverted, Comparator comparator, double value) {
        _color = checkNotNull(color, "color is null");
        _inverted = inverted;
        _comparator = checkNotNull(comparator, "comparator is null");
        _value = checkNotNull(value, "value is null");
    }

    private ConditionalFormat() {
    }

    @JsonIgnore
    public Color getColor() {
        return _color;
    }

    public void setColor(Color color) {
        _color = checkNotNull(color, "color is null");
    }

    @JsonIgnore
    public boolean isInverted() {
        return _inverted;
    }

    public void setInverted(boolean inverted) {
        _inverted = inverted;
    }

    @JsonIgnore
    public Comparator getComparator() {
        return _comparator;
    }

    public void setComparator(Comparator comparator) {
        _comparator = checkNotNull(comparator, "comparator is null");
    }

    @JsonIgnore
    public double getValue() {
        return _value;
    }

    public void setValue(double value) {
        _value = value;
    }

    public String toString() {
        return "ConditionalFormat[" +
                "color=" + getColor() +
                ", inverted=" + isInverted() +
                ", comparator=" + getComparator() +
                ", value=" + getValue() +
                "]";
    }
}
