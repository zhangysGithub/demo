package com.hr.controller;


import com.hr.entity.Menus2;
import com.hr.entity.ceshi;
import com.hr.service.IMenus2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
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
@RequestMapping("/menus2")
@CrossOrigin(originPatterns = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class Menus2Controller {

    @Autowired
    public IMenus2Service iMenus2Service;


    @RequestMapping("/menus2All")
    public List menusAll(){
        List<Menus2> ceshiList = new ArrayList<>();

        List<Menus2> list =  iMenus2Service.list();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getMurl().equals("")){
                System.out.println(list.get(i));
            }
        }
        return iMenus2Service.list();
    }
}

