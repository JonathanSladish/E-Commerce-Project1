package com.tts.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

public class CartController {
}
@Controller
@Autowired
ProductService productService;

@Autowired
UserService userService;

@ModelAttribute("loggedInUser")

