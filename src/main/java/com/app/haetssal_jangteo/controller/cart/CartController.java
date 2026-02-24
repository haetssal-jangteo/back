package com.app.haetssal_jangteo.controller.cart;

import com.app.haetssal_jangteo.mapper.CartMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class CartController {

    private final CartMapper cartMapper;

    @GetMapping("/cart")
    public String goToCart(Long userId, Model model) {
        model.addAttribute("items", )
        return "/payment/itemCart";
    }

}
