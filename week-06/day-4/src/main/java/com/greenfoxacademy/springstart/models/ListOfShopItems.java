package com.greenfoxacademy.springstart.models;

import java.util.ArrayList;
import java.util.List;

public class ListOfShopItems {
    private List<ShopItem> shopItemList;

    public ListOfShopItems() {
        ShopItem item1 = new ShopItem("Nike", "shoes", "14.000 HUF", 10);
        ShopItem item2 = new ShopItem("Adidas", "shoes", "18.000 HUF", 4);
        ShopItem item3 = new ShopItem("Puma", "shirt", "5.000 HUF", 23);
        ShopItem item4 = new ShopItem("Tisza", "Fullcap", "7.000 HUF", 10);

        shopItemList = new ArrayList<>();
        shopItemList.add(item1);
        shopItemList.add(item2);
        shopItemList.add(item3);
        shopItemList.add(item4);
    }

    public List<ShopItem> getListOfShopItems() {
        return shopItemList;
    }
}
