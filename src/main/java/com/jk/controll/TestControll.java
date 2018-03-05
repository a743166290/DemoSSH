package com.jk.controll;

import com.alibaba.fastjson.JSON;
import com.jk.entity.UserEntity;
import com.jk.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
@RequestMapping("/test")
public class TestControll {
    @Resource
    UserService userService;
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
    @RequestMapping("/gtAll")
    @ResponseBody
    public String gtAll(){
        return JSON.toJSONString(userService.selectAll());
    }
    //Get无参数
    @RequestMapping("/gj")
    @ResponseBody
    public String gj(){
        UserEntity entity = new UserEntity();
        entity.setName("jack");
        entity.setPassword("1234");
        return JSON.toJSONString(entity);
    }

    //Get有参数
    @RequestMapping("/gp1")
    @ResponseBody
    public String gp1(@RequestParam("name") String name){
        return name;
    }
    //Get有参数
    @RequestMapping("/gp2/{values}")
    @ResponseBody
    public String gp2(@PathVariable(value = "values") String values){
        return values;
    }
    //post有参数
    @RequestMapping(value = "/gp3" ,method = RequestMethod.POST)
    @ResponseBody
    public String gp3(String name,String password){
        return name + password;
    }
}
