package org.example.Model;

public class Student {
    private Long id ;
    private int name ;
    private String email;
    private int age ;

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(int name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public int getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
