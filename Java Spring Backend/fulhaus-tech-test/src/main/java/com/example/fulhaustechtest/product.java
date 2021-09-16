package com.example.fulhaustechtest;

import java.lang.annotation.Documented;


public class product {
    private String _id;
    private String imageURLs;

    public product(){};

    public product(String _id, String imageURLs) {
        this._id = _id;
        this.imageURLs = imageURLs;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getImageURLs() {
        return imageURLs;
    }

    public void setImageURLs(String imageURLs) {
        this.imageURLs = imageURLs;
    }

    @Override
    public String toString() {
        return "product{" +
                "_id='" + _id + '\'' +
                ", imageURLs='" + imageURLs + '\'' +
                '}';
    }
}
