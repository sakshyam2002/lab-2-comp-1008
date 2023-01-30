package org.example;

public class Student {
    private int id;
    private String firstname;
    private String lastname;
    private String activity;

    public Student(int id, String firstname, String lastname, String activity) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.activity = activity;
    }



    public void setId(int id) {
        this.id = id;
    }
    public void setActivity(String activity) {
        this.activity = activity;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    @Override
    public String toString()
    {
        return firstname + lastname + id + "is" + activity;
    }


}

