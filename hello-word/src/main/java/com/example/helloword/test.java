package com.example.helloword;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yanyu
 * @date 2020/6/10 10:28
 */
@RestController
public class test {


@RequestMapping("test")
     public  String test(){
         return  "helloworld";
     }

}
