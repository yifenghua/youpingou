package com.pinyougou.pojo;

import java.io.Serializable;

public class Brand implements Serializable{
    Long id;
    String name;
    String   first_name;

    public Brand(Long id, String name, String first_name) {
        this.id = id;
        this.name = name;
        this.first_name = first_name;
    }

    public Brand() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", first_name='" + first_name + '\'' +
                '}';
    }
}
