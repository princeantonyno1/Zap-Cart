package com.digitalstore.imperium.customer.controller;

import com.digitalstore.imperium.library.model.Customer;
import com.digitalstore.imperium.library.model.Product;
import com.digitalstore.imperium.library.model.ShoppingCart;
import com.digitalstore.imperium.library.service.CustomerService;
import com.digitalstore.imperium.library.service.ProductService;
import com.digitalstore.imperium.library.service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.security.Principal;

@Controller
public class CartController {
    @Autowired
    private CustomerService customerService;

    @Autowired
    private ShoppingCartService cartService;

    @Autowired
    private ProductService productService;

    @GetMapping("/cart")
    public String cart(Model model, Principal principal, HttpSession session){

        if(principal == null){
            return "redirect:/login";
        }
        String username = principal.getName();
        Customer customer = customerService.findByUsername(username);
        ShoppingCart shoppingCart = customer.getShoppingCart();

        if(shoppingCart == null){
            model.addAttribute("check", "No item in your cart");
            return "redirect:/products";
        }

        if(shoppingCart != null) {
            session.setAttribute("totalItems", shoppingCart.getTotalItems());
            model.addAttribute("subTotal", shoppingCart.getTotalPrices());
            model.addAttribute("discountPrice", customerService.calculateDiscount(shoppingCart.getTotalPrices()));
        }

        model.addAttribute("shoppingCart", shoppingCart);

        return "shoping-cart";
    }

    @PostMapping("/add-to-cart")
    public String addItemToCart(
            @RequestParam("id") Long productId,
            @RequestParam(value = "quantity", required = false, defaultValue = "1") int quantity,
            Principal principal,
            HttpServletRequest request){

        if(principal == null){
            return "redirect:/login";
        }
        Product product = productService.getProductById(productId);
        String username = principal.getName();
        Customer customer = customerService.findByUsername(username);

        ShoppingCart cart = cartService.addItemToCart(product, quantity, customer);
        return "redirect:" + request.getHeader("Referer");

    }

    //Update cart

    @RequestMapping(value = "/update-cart", method = RequestMethod.POST, params = "action=update")
    public String updateCart(@RequestParam("quantity") int quantity,
                             @RequestParam("id") Long productId,
                             Principal principal) {

        if (principal == null) {
            return "redirect:/login";
        }

        String username = principal.getName();
        Customer customer = customerService.findByUsername(username);
        Product product = productService.getProductById(productId);
        cartService.updateItemInCart(product, quantity, customer);

        return "redirect:" + ensureFullUrl(product.getFileLink());
    }


    //Update cart ends


    @RequestMapping(value = "/update-cart", method = RequestMethod.POST, params = "action=delete")
    public String deleteItemFromCart(@RequestParam("id") Long productId,
                                     Model model,
                                     Principal principal){
        if(principal == null){
            return "redirect:/login";
        }else{
            String username = principal.getName();
            Customer customer = customerService.findByUsername(username);
            Product product = productService.getProductById(productId);
            ShoppingCart cart = cartService.deleteItemFromCart(product, customer);
            model.addAttribute("shoppingCart", cart);
            return "redirect:/cart";
        }

    }

    //Helper method to redirect the full url
    private String ensureFullUrl(String link) {
        if (!link.startsWith("http://") && !link.startsWith("https://")) {
            return "https://" + link;
        }
        return link;
    }

}

