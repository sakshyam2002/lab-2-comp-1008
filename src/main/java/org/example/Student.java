package org.example;

public class Student {
    private int id;
    private String firstname;
    private String lastname;
    private String activity;

    public Student(int id, String firstname, String lastname, String activity) {

        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id;
        this.activity = activity;



    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }


}

