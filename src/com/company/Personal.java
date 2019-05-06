package com.company;

public class Personal {
    private String name;
    private String email;

    public Personal() {
    }

    public Personal(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void displayPersonal(){
        System.out.println(getName());
        System.out.println(getEmail());
        System.out.println();
    }
}
