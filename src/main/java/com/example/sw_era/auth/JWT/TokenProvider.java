package com.example.sw_era.auth.JWT;

import io.jsonwebtoken.Header;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.util.Date;

@RequiredArgsConstructor
@Service
public class TokenProvider {
    public String makeToken() {
        Date now = new Date();

        return Jwts.builder()
                .setHeaderParam(Header.TYPE, Header.JWT_TYPE)
                .setIssuer("teamslowdevelop@gmail.com")
                .setIssuedAt(now)
                .setExpiration(new Date(now.getTime() + Duration.ofMinutes(10).toMillis()))
                .claim("id","ji")
                .claim("email", "em")
                .signWith(SignatureAlgorithm.HS256, "e4a15f475c08133b520231d4d987ba33b0ed315b720cb6d459b90e2613578380")
                .compact();
    }
}
