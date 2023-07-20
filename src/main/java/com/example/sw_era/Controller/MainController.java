package com.example.sw_era.Controller;

import com.example.sw_era.auth.JWT.TokenProvider;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "posts", description = "게시글 정보를 가져오는 API")
@RestController
public class MainController {

    @Operation(summary = "get posts", description = "가장 최근 게시물 10개 가져오기")
    @GetMapping(value = "/")
    public String main() {
        return "음 아잇";
    }

    @GetMapping(value = "/json")
    public String sendJWT() {
        TokenProvider tokenProvider = new TokenProvider();
        return tokenProvider.makeToken();
    }
}
