package com.example.RectangleExamlple;

public class NegativeLengthException extends GeometryException{
    double wrongValue;

    public NegativeLengthException(String s, double wrongValue) {
        super(s);
        this.wrongValue = wrongValue;
    }
}
