package com.bumjin.springbootcicd.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "RestController 예제 API", description = "Swagger 테스트용 API")
@RequestMapping("/api")
@RestController
public class HelloController {

    @Operation(summary = "환영인사", description = "환영인사를 출력합니다.")
    @GetMapping("/welcome")
    public String getMessage(){
        return "Welcome to JiniLand";
    }
}
