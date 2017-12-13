package ui;


import java.io.Serializable;

public class Affiliates implements Serializable {
    private String name;
    private String username;
    private String email;
    private String hpNo;
    private String url;
    private String sellingProd;
    private String password;

    public Affiliates(String name, String username, String email, String hpNo, String url, String sellingProd, String password) {
        this.name = name;
        this.username = username;
        this.email = email;
        this.hpNo = hpNo;
        this.url = url;
        this.sellingProd = sellingProd;
        this.password = password;
    }

   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHpNo() {
        return hpNo;
    }

    public void setHpNo(String hpNo) {
        this.hpNo = hpNo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSellingProd() {
        return sellingProd;
    }

    public void setSellingProd(String sellingProd) {
        this.sellingProd = sellingProd;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final Affiliates other = (Affiliates) obj;
    if (this.username != other.username) {
      return false;
    }
    return true;
  }

    @Override
    public String toString() {
//        return "Affiliates{" + "name=" + name + ", username=" + username + ", email=" + email + ", hpNo=" + hpNo + ", url=" + url + ", sellingProd=" + sellingProd + ", password=" + password + '}';
        return String.format("Name: %-20s \n    Username: %-20s \n    Password: %-20s \n    Email: %-20s \n    PhoneNo: %-20s \n    Selling Product: %-20s \n    Website Url: %-20s\n\n", name, username, password, email, hpNo, sellingProd, url);


    }
    
}
