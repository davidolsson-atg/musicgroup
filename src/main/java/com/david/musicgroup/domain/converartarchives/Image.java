package com.david.musicgroup.domain.converartarchives;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class Image {

    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Image{" +
                "image='" + image + '\'' +
                '}';
    }
}
