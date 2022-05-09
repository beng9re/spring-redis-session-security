package com.example.springredissessionsecurity.api;

import java.util.ArrayList;
import java.util.List;

import com.example.springredissessionsecurity.domain.User;
import com.example.springredissessionsecurity.domain.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.sql.DataSource;


@RestController
@Slf4j
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class UserController {

	private final DataSource dataSource;
	private final UserService userService;



	@GetMapping("init")
	public User login(){
		return userService.initService();
	}

    @GetMapping("users")
    public List<User> users() {
        return new ArrayList<>();
    }
}
