package com.company.render;

public class User {
    private int userId;
    private String username;
    private String email;
    private String lang;

    // Default constructor
    public User() {
        // Default constructor
    }

    // Parameterized constructor
    public User(int userId, String username, String email, String lang) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.lang = lang;
    }

    // Getter for userId
    public int getUserId() {
        return userId;
    }

    // Setter for userId
    public void setUserId(int userId) {
        this.userId = userId;
    }

    // Getter for username
    public String getUsername() {
        return username;
    }

    // Setter for username
    public void setUsername(String username) {
        this.username = username;
    }

    // Getter for email
    public String getEmail() {
        return email;
    }

    // Setter for email
    public void setEmail(String email) {
        this.email = email;
    }

    // Getter for lang
    public String getLang() {
        return lang;
    }

    // Setter for lang
    public void setLang(String lang) {
        this.lang = lang;
    }

    // toString method to display object information
    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", lang='" + lang + '\'' +
                '}';
    }
}

