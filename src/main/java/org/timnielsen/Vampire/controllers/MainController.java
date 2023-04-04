package org.timnielsen.Vampire.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String root() {
        return "characterSheet";
    }

    @GetMapping("/login")
    public String login(Model model) {
        return "login";
    }
    
   // @GetMapping("/CharacterList")
  //  public String listing(Model model) {
 //       return "CharacterList";
  // }
  @GetMapping("/user")
  public String userIndex() {
      return "user/index";
  }
}
