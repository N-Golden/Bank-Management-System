
package com.bmSys.model;

/**
 *
 * @author Admin
 */
public class EmployeeModel extends AbstractModel{
       private String username;
       private String password;
       private String email;
       private String linkImg;

    public EmployeeModel() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLinkImg() {
        return linkImg;
    }

    public void setLinkImg(String linkImg) {
        this.linkImg = linkImg;
    }
       
       
}
