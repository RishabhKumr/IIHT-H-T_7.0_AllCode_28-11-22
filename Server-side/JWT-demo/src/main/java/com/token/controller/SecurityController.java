package com.token.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;

import com.token.entity.JwtRequest;
import com.token.entity.JwtResponse;
import com.token.service.UserService;
import com.token.utility.JWTUtility;

@RestController
public class SecurityController {
	
	@Autowired
	private JWTUtility jwtUtility;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@GetMapping("/")
	public String home() {
		return "Hello welcome to home page";
	}
	
	@PostMapping("/auth")
	public JwtResponse authenticate(@RequestBody JwtRequest jwtRequest) throws Exception {
		try {
			authenticationManager.authenticate(new 
					UsernamePasswordAuthenticationToken(jwtRequest.getUsername(),jwtRequest.getPassword()));
		}
		catch(BadCredentialsException ex) {
			throw new Exception("Invalid credentials",ex);
		}
		
		final UserDetails  userDetails = userService.loadUserByUsername(jwtRequest.getUsername());
		final String token  = jwtUtility.generateToken(userDetails);
		System.out.println(token);
		return new JwtResponse(token);
	}

}
