package com.greenfoxacademy.springstart.models;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfShopItems {
    private List<ShopItem> shopItemList;

    public ListOfShopItems() {
        ShopItem item1 = new ShopItem("Nike cipő", "shoes for amateurs", 14000, 10);
        ShopItem item2 = new ShopItem("Adidas cipő", "shoes", 18000, 4);
        ShopItem item3 = new ShopItem("Puma T-shirt", "shirt", 5000, 20);
        ShopItem item4 = new ShopItem("Tisza sapka", "Hungarian cap", 7000, 10);
        ShopItem item5 = new ShopItem("Tisza cipő", "Hungarian shoes similar to Nike", 12000, 0);
        ShopItem item6 = new ShopItem("Nike cipő profiknak", "shoes for pros", 21000, 0);

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

    public List<ShopItem> sortOnlyAvailable() {
        return shopItemList.stream()
                .filter(shopItem -> shopItem.getQuantity() > 0)
                .collect(Collectors.toList());
    }

    public List<ShopItem> cheapestFirst() {
        return shopItemList.stream()
                .sorted((a, b) -> a.getPrice() > b.getPrice() ? 1 : -1)
                .collect(Collectors.toList());
    }

    public List<ShopItem> containsNike() {
        return shopItemList.stream()
                .filter(shopItem -> shopItem.getName().toLowerCase().contains("nike")
                        || shopItem.getDescription().toLowerCase().contains("nike"))
                .collect(Collectors.toList());
    }

    public String averageStock() {
        double average = shopItemList.stream()
                .mapToDouble(ShopItem::getQuantity)
                .summaryStatistics().getAverage();
        average = ((double) Math.round(average * 100)) / 100;

        return "Average Stock: " + average;
    }

    public String mostExpensive() {
        List<ShopItem> mostExpensive = shopItemList.stream()
                .sorted((a, b) -> a.getPrice() > b.getPrice() ? -1 : 1)
                .limit(1)
                .collect(Collectors.toList());
        return "Most expensive item: " + mostExpensive.get(0).getName();
    }
}
