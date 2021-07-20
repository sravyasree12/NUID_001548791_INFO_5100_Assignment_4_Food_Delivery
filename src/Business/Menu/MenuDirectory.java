/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Menu;

import java.util.ArrayList;

/**
 *
 * @author Sravya
 */
public class MenuDirectory {
    private ArrayList<Menu> menuList;
    
    public MenuDirectory(){
        menuList = new ArrayList();
    }

    public ArrayList<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(ArrayList<Menu> menuList) {
        this.menuList = menuList;
    }
    
    //mehtod adds new Dishes to menu
    public Menu addDish(String dishName, double price, String restaurantName){
        Menu menu = new Menu(dishName, price, restaurantName);
        menuList.add(menu);
        return menu;
    }
    
    public void deleteMenu(Menu menu){
        menuList.remove(menu);
    }
    
}
