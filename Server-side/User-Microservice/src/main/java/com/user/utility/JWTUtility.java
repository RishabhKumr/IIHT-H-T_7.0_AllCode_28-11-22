package com.user.utility;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JWTUtility implements Serializable {
	
	private static final long serialVersionUID = 2342345464553L;
	private static final long JWT_TOKEN_VALIDITY = 5*60*60;
	private String secretKey="saurabh";
	
	
	//Use this method for retrieve user name from JWT token 
	public String getUsernameFromToken(String token) {
		return getClaimFromToken(token, Claims::getSubject);
	
	}
	
	
	//Use to retrieve the expiration date from the token 
	public Date getExpirationDateFromToken(String token) {
		return getClaimFromToken(token, Claims::getExpiration);
	}
	
	private <T> T getClaimFromToken(String token, Function<Claims, T> claimsResolver) {
		final Claims claims = getAllClaimsFromToken(token);
		return claimsResolver.apply(claims);
	}
	
	
	//Use for retrieving any information from the token we will need for the secret key 
	private Claims getAllClaimsFromToken(String token) {
		return Jwts.parser().setSigningKey(secretKey).parseClaimsJws(token).getBody();
	}
	
	
	//Method to check if the token is expired 
	private Boolean isTokenExpired(String token) {
		final Date Expiration = getExpirationDateFromToken(token);
		return Expiration.before(new Date());
	}

	
	//Method use to  generate token for user
	public String genrateToken(UserDetails userDetails) {
		Map<String, Object> claims = new HashMap<>();
		return doGenerateToken(claims,userDetails.getUsername());
	}

	
	
	private String doGenerateToken(Map<String, Object> claims, String subject) {
		return Jwts.builder().setClaims(claims).setSubject(subject).setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + JWT_TOKEN_VALIDITY *1000))
				.signWith(SignatureAlgorithm.HS512, secretKey).compact();
	}
	
	
	//Validate the token
	public Boolean validateToken(String token, UserDetails userDetails) {
		final String Username = getUsernameFromToken(token);
		return (Username.equals(userDetails.getUsername())&& !isTokenExpired(token));
		
	}
	
	
	
}