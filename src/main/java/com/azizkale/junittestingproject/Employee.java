package com.azizkale.junittestingproject;

import java.util.List;

public class Employee {
    private Long id;
    private String name;
    private List<String> duties;
    private String gender;
    private  Integer age;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getDuties() {
        return duties;
    }

    public String getGender() {
        return gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDuties(List<String> duties) {
        this.duties = duties;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
