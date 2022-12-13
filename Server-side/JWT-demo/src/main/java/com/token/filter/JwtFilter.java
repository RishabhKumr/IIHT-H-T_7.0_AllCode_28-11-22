package com.token.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

@Component
public class JwtFilter extends OncePerRequestFilter{

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}
	
//	@Autowired
//	private JWTUtility jwtUtility;
//	
//	@Autowired
//	private UserService userService;
//
//	@Override
//	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
//			throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		String authorization = request.getHeader("Authorization");
//		String token = null;
//		String userName = null;
//		
//		if(null != authorization && authorization.startsWith("Bearer ")) {
//			token = authorization.substring(7);
//			userName = jwtUtility.getUsernameFromToken(token);
//		}
//		
//		if(null != userName && SecuritContextHolder.getContext().getAuthorization() == null) {
//			UserDetails userDetails = userService.loadUserByUsername(userName);
//			
//			if(jwtUtility.validateToken(token,userDetails)) {
//				UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken =
//						new UsernamePasswordAuthenticationToken(userDetails,userDetails.getAuthorities());
//				usernamePasswordAuthenticationToken.setDetails(new 
//						WebAuthenticationDetailSource().buildDetails(request));
//				SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
//			};
//		}
//		filterChain.doFilter(request, response);
//	}
	
}
