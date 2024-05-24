package com.github.acnaweb.mvc_rh.lov;

public class ListOfValues {
    private Object value;
    private String text;

    public ListOfValues(Object value, String text) {
        this.value = value;
        this.text = text;
    }
    public Object getValue() {
        return value;
    }
    public void setValue(Object value) {
        this.value = value;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    
}
