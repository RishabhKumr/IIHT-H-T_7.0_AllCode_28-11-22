package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.entity.JwtRequest;
import com.user.entity.JwtResponse;
import com.user.service.UserService;
import com.user.utility.JWTUtility;

@RestController
@RequestMapping("/api/auth")
public class SecurityController {

	
	@Autowired
	private JWTUtility jwtUtility;
	
	@Autowired
	private AuthenticationManager authanticationManager;
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String home() {
		return "Hello and Welcome to home page";
	}
	
	
	@PostMapping("/signin")
	public ResponseEntity<String> authenticate(@RequestBody JwtRequest jwtRequest) throws Exception {
		try {
			authanticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(jwtRequest.getUserName(),
							jwtRequest.getPassword()));

		} catch (BadCredentialsException e) {
			throw new Exception("INVALID_CREDENTIALS", e);
		}
		final UserDetails userDetails = userService.loadUserByUsername(jwtRequest.getUserName());
		final String token = jwtUtility.genrateToken(userDetails);
		 JwtResponse jwt = new JwtResponse(token);
		return new ResponseEntity(jwt.getJwtToken(),HttpStatus.CREATED);

	}
	
	
}