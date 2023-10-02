package com.bumjin.springbootcicd.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Slf4j
@Tag(name = "컨트롤러 예제 API", description = "Swagger 테스트용 API")
@Controller
public class HomeController {
    @Operation(summary = "초기페이지", description = "?? 출력합니다.")
    @GetMapping(value = "/")
    public String index(){
        return "index";
    }

    @Operation(summary = "jsp예제", description = "WEB-INF/jsp/main.jsp로 출력합니다.")
    @GetMapping(value = "/jsp/{name}")
    public String jsp(@PathVariable("name") String name, Model model) {
        log.debug("jsp called name={}", name);
        model.addAttribute("name", name);
        return "main";
    }

    @Operation(summary = "thymeleaf예제", description = "templates/thymeleaf/main.html로 출력합니다.")
    @GetMapping(value = "/th/{name}")
    public String th(@PathVariable("name") String name, Model model) {
        log.debug("thymeleaf called name={}", name);
        model.addAttribute("name", name);
        return "thymeleaf/main";
    }
// ...
}
