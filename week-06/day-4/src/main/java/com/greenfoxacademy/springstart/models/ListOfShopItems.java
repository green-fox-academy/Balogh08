package com.greenfoxacademy.springstart.models;

import java.util.ArrayList;
import java.util.List;

public class ListOfShopItems {
    private List<ShopItem> shopItemList;

    public ListOfShopItems() {
        ShopItem item1 = new ShopItem("Nike", "shoes for amateurs", 14000, 10);
        ShopItem item2 = new ShopItem("Adidas", "shoes", 18000, 4);
        ShopItem item3 = new ShopItem("Puma", "shirt", 5000, 23);
        ShopItem item4 = new ShopItem("Tisza", "Hungarian cap", 7000, 10);
        ShopItem item5 = new ShopItem("Tisza", "Hungarian shoes", 12000, 0);
        ShopItem item6 = new ShopItem("Nike", "shoes for pros", 21000, 0);

        shopItemList = new ArrayList<>();
        shopItemList.add(item1);
        shopItemList.add(item2);
        shopItemList.add(item3);
        shopItemList.add(item4);
        shopItemList.add(item5);
        shopItemList.add(item6);
    }

    public List<ShopItem> getListOfShopItems() {
        return shopItemList;
    }
}
