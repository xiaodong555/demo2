package cn.itcast.contorller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuickController {
    @GetMapping("/qidong")
    public String quick(){
        return "你好，SpringBoot";
    }
}
