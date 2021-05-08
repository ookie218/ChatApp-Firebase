package com.ookie.chatapp_firebase;

public class Message {

    //Declare Fields
    private String text;
    private String name;
    private String photoUrl;


    //Empty Constructor
    public Message() {

    }

    //Constructor mapped for Method use
    public Message(String text, String name, String photoUrl){
        this.text = text;
        this.name = name;
        this.photoUrl = photoUrl;
    }


    //Getter and Setter Methods
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}

