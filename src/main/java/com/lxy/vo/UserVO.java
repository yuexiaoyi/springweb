package com.lxy.vo;

public class UserVO {
    private int id;
    private String name;
    private int age;
    private String idNum;
    private String phone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "UserVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", idNum='" + idNum + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public UserVO(int id, String name, int age, String idNum, String phone) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.idNum = idNum;
        this.phone = phone;
    }
}
