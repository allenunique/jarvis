package com.allen.jarvis.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.List;

@Entity
public class Users {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

    private String name;

    private Integer age;

//    0 女
//    1 男a
//    -1 隐藏
    private Short sex;

    private String tel;

    private String address;

    private Long birthDay;

    private String nickName;

    private String email;

    private String password;

    @OneToMany(mappedBy="users")
    @LazyCollection(LazyCollectionOption.EXTRA)
    @JsonIgnore
    private List<LocationInfo> locationInfos;

    public Users() {
        super();
    }

    public Users(String name, Integer age, Short sex, String tel, String address,
                 Long birthDay, String nickName, String email, String password) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.tel = tel;
        this.address = address;
        this.birthDay = birthDay;
        this.nickName = nickName;
        this.email = email;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Short getSex() {
        return sex;
    }

    public void setSex(Short sex) {
        this.sex = sex;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Long birthDay) {
        this.birthDay = birthDay;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<LocationInfo> getLocationInfos() {
        return locationInfos;
    }

    public void setLocationInfos(List<LocationInfo> locationInfos) {
        this.locationInfos = locationInfos;
    }
}
