package com.example.gform;

import java.io.Serializable;

public class in implements Serializable {

    String email;
    String name;
    int age;
    String college;
    String year;
    String mobile;
    String gender;
    String area;
    String techs;
    String specs;
    String lkprof;
    String fbprof;
    String gitprof;
    String resume;
    String why;
    String exp;
    String suggest;
    String reff;

    public in(String email, String name, int age, String college, String year, String mobile, String gender, String area, String techs, String specs, String lkprof, String fbprof, String gitprof, String resume, String why, String exp, String suggest, String reff) {
        this.email = email;
        this.name = name;
        this.age = age;
        this.college = college;
        this.year = year;
        this.mobile = mobile;
        this.gender = gender;
        this.area = area;
        this.techs = techs;
        this.specs = specs;
        this.lkprof = lkprof;
        this.fbprof = fbprof;
        this.gitprof = gitprof;
        this.resume = resume;
        this.why = why;
        this.exp = exp;
        this.suggest = suggest;
        this.reff = reff;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getTechs() {
        return techs;
    }

    public void setTechs(String techs) {
        this.techs = techs;
    }

    public String getSpecs() {
        return specs;
    }

    public void setSpecs(String specs) {
        this.specs = specs;
    }

    public String getLkprof() {
        return lkprof;
    }

    public void setLkprof(String lkprof) {
        this.lkprof = lkprof;
    }

    public String getFbprof() {
        return fbprof;
    }

    public void setFbprof(String fbprof) {
        this.fbprof = fbprof;
    }

    public String getGitprof() {
        return gitprof;
    }

    public void setGitprof(String gitprof) {
        this.gitprof = gitprof;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public String getWhy() {
        return why;
    }

    public void setWhy(String why) {
        this.why = why;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public String getSuggest() {
        return suggest;
    }

    public void setSuggest(String suggest) {
        this.suggest = suggest;
    }

    public String getReff() {
        return reff;
    }

    public void setReff(String reff) {
        this.reff = reff;
    }
}
