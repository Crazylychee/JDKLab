package com.Crazylychee.demo03mysql.optimize;

import com.Crazylychee.demo03mysql.mock.Emergency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@Controller
public class TestController {

    @Autowired
    private TestBitMapIndexInRedis testBitMapIndexInRedis;


    @GetMapping("/test")
    public Page<Emergency> test(){
        Page<Emergency> res = testBitMapIndexInRedis.getPageMeta(20, new Random().nextInt(100000)+500000);
        return res;
    }
}
