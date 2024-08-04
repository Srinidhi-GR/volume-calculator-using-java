package com.example.volumecalculator;

public class Shape {
    private int imageId;
    private String shape;

    public Shape(int imageId, String shape) {
        this.imageId = imageId;
        this.shape = shape;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }
}
