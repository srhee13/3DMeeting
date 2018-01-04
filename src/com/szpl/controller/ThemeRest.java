package com.szpl.controller;

import com.szpl.pojo.Theme;
import com.szpl.service.ThemeService;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by litao on 2017/12/29.
 */
@Api(value="theme",description="会议主题")
@Controller
@RequestMapping("theme")
public class ThemeRest {
    @Autowired
    private ThemeService themeService;

    public ThemeService getThemeService() {
        return themeService;
    }

    public void setThemeService(ThemeService themeService) {
        this.themeService = themeService;
    }

    @ApiOperation(value="新增主题",notes="新增单个会议主题")
    @RequestMapping(value = "/add",method= RequestMethod.POST)
    public @ResponseBody boolean addTheme(@RequestBody Theme theme){
        return themeService.saveTheme(theme);
    }

    @ApiOperation(value="查找主题",httpMethod = "GET",response = Theme.class,notes="通过id查找会议主题")
    @RequestMapping(value = "/get/{id}",method= RequestMethod.GET,consumes = "application/json")
    public @ResponseBody Theme getThemeById(@ApiParam(required=true,value="主题id",name="id") @PathVariable String id){
        return themeService.findThemeById(id);
    }


}
