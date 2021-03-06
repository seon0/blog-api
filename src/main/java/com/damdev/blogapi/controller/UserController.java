package com.damdev.blogapi.controller;

import com.damdev.blogapi.domain.UserInfo;
import com.damdev.blogapi.service.UserService;
import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/damdev/api/user")
public class UserController {

  @Autowired
  UserService userService;

  @PostMapping
  public String signUpUser(HttpServletResponse response, HttpServletRequest request, @RequestBody UserInfo userInfo) {
    String result = "";
    log.info("signUpUser");
    result = userService.insertUser(userInfo);
    return result;
  }

  @GetMapping
  public String signInUser(HttpServletResponse response, HttpServletRequest request, HttpSession session) {
    String result = "";
    log.info("signInUser");
    return result;
  }

  @PutMapping
  public String modifyUser(@RequestBody UserInfo userInfo) {
    String result = "";
    log.info("modifyUser");
    result = userService.updateUser(userInfo);
    return result;
  }
}
