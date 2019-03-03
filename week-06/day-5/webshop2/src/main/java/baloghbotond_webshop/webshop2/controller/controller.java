package baloghbotond_webshop.webshop2.controller;


import baloghbotond_webshop.webshop2.models.ListOfProducts;
import baloghbotond_webshop.webshop2.models.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class controller {
    ListOfProducts listOfProducts;

    public controller() {
        listOfProducts = new ListOfProducts();
    }


    @GetMapping("/allProducts")
    public String allProducts(Model model) {
        model.addAttribute("items", listOfProducts.getAllProducts());
        return "index";
    }

    @PostMapping("/allProducts")
    public String addProduct(Model model, @RequestParam("name") String name, @RequestParam("description") String description, @RequestParam("price") int price, @RequestParam("qty") int qty) {
        Product product = new Product(name, description, price, qty);
        listOfProducts.addProduct(product);
        model.addAttribute("items", listOfProducts.getAllProducts());
        return "index";
    }

    @GetMapping("/available")
    public String available(Model model) {
        model.addAttribute("items", listOfProducts.getAvailable());
        return "index";
    }

    @GetMapping("/cheapest")
    public String cheapest(Model model) {
        model.addAttribute("items", listOfProducts.getCheapest());
        return "index";
    }

    @GetMapping("/nike")
    public String nike(Model model) {
        model.addAttribute("items", listOfProducts.getNike());
        return "index";
    }

    @GetMapping("/average")
    public String avg(Model model) {
        model.addAttribute("product", listOfProducts.getAverageStock());
        return "stats";
    }

    @GetMapping("/mostExpensive")
    public String mostExpensive(Model model) {
        model.addAttribute("product", listOfProducts.getMostExpensive());
        return "stats";
    }

    @GetMapping("/search")
    public String search(Model model, @RequestParam("search") String search) {
        model.addAttribute("items", listOfProducts.getSearch(search));
        return "index";
    }
}
