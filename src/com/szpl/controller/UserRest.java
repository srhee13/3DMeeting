package com.szpl.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.szpl.pojo.User;
import com.szpl.service.UserService;
import com.szpl.util.QueryPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: lish.
 * @Description:
 * @Date:Created in 15:35  2018/2/26.
 * @Modified by:
 */
@Controller
@RequestMapping("user")
public class UserRest {

    @Autowired
    private UserService userService;

    /**
     *
     * @param userName
     * @return 这里指定验证返回格式是json格式{'valid':true},{'valid':false}这种
     */
    @RequestMapping(value = "/validate/userName",method= RequestMethod.POST)
    public @ResponseBody String validateUserName(@RequestParam String userName){
        return validate("userName",userName);
    }
    @RequestMapping(value = "/validate/phoneNum",method= RequestMethod.POST)
    public @ResponseBody String validatePhoneNum(@RequestParam String phoneNum){
        return validate("phoneNum",phoneNum);
    }
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public @ResponseBody  boolean addUser(@ModelAttribute("user") User user){
        try{
            userService.registerUser(user);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

    private String validate(String validateFild,String fildValue){
        boolean result = true;//默认无
        if("userName".equals(validateFild)){
            if(userService.validateUserName(fildValue)){
                result = false;
            }
        }else if("phoneNum".equals(validateFild)){
            if (userService.validatePhoneNum(fildValue)){
                result = false;
            }
        }
        Map<String, Boolean> map = new HashMap<>();
        map.put("valid", result);
        ObjectMapper mapper = new ObjectMapper();
        String resultString = "";
        try {
            resultString = mapper.writeValueAsString(map);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return resultString;
    }

    @RequestMapping(value = "/getUserPages/{userName}/{phoneNum}/{type}",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public @ResponseBody QueryPage<User> getUserPages(@PathVariable String userName,@PathVariable String phoneNum,
                                                      @PathVariable String type,@RequestParam int pageSize,
                                                      @RequestParam int pageNum){
        return userService.getUserPages(userName,phoneNum,type,pageSize,pageNum);
    }
}
