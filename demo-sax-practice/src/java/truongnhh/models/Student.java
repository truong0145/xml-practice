/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package truongnhh.models;

/**
 *
 * @author ADMIN
 */
public class Student {
    private String id;
    private String classes;
    private String username;
    private String lastname;
    private String middlename;
    private String firstname;
    private String sex;
    private String password;
    private String address;
    private String status;
    private String fullname;

    public Student() {
    }

    public Student(String id, String classes, String username, String lassname, String middlename, String firstname, String sex, String password, String address, String status) {
        this.id = id;
        this.classes = classes;
        this.username = username;
        this.lastname = lassname;
        this.middlename = middlename;
        this.firstname = firstname;
        this.sex = sex;
        this.password = password;
        this.address = address;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getFullname(){
        return lastname+ " " +middlename+ " " +firstname;
    }
    
    public String toStringObject(){
        return "\n{ id : " + this.getId() + "\n"
                +"class : " + this.getClasses() + "\n"
                +"username : " + this.getUsername() + "\n"
                +"fullname : " + this.getFullname()+ "\n"
                +"sex : " + this.getSex() + "\n"
                +"password : " + this.getPassword() + "\n"
                +"address : " + this.getAddress() + "\n"
                +"status : " + this.getStatus() + "}\n";
    }
}
