
package ui;

import java.io.Serializable;

public class Menu implements Serializable {
    private String code;
    private String menuName;
    private String price;

    public Menu(String code, String menuName, String price) {
        this.code = code;
        this.menuName = menuName;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    
     @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final Menu other = (Menu) obj;
    if (this.code != other.code) {
      return false;
    }
    return true;
  }

    @Override
    public String toString() {
        return "Menu{" + "code=" + code + ", menuName=" + menuName + ", price=" + price + '}';
    }

    
}
