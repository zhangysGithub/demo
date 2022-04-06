package com.hr.controller;


import com.hr.service.IMenusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zhang
 * @since 2022-04-06
 */
@RestController
@RequestMapping("/menus")
@CrossOrigin(originPatterns = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class MenusController {

    //自动注入
    @Autowired
    public IMenusService iMenusService;

    //前端标签
    @RequestMapping("/menusAll")
    public List menusAll(){
        return iMenusService.list();
    }

}

