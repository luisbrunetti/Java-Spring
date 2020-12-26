package com.java.javamarket.web.Security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import javax.xml.crypto.Data;
import java.util.Date;


@Component
public class JWTUtil {
    private static final String KEY = "oracle";
    public String generateToken(UserDetails userDetails){
        return Jwts.builder().setSubject(userDetails.getUsername())
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() * 1000* 60 *60 *10))
                .signWith(SignatureAlgorithm.HS256,KEY).compact();
    }
}
