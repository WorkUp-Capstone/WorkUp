/* (C)2021 */
package com.workup.workup.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthenticationController {
    @GetMapping("/login")
    public String loginForm() {
        return "welcome";
    }
}
