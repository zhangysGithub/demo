package com.hr.controller;


import com.hr.entity.Test3;
import com.hr.service.ITest3Service;
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
 * @since 2022-03-28
 */
@RestController
@RequestMapping("/test3")
@CrossOrigin(originPatterns = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class Test3Controller {

    @Autowired
    private ITest3Service test3Service;

    //查询test3表当中的值
    @RequestMapping("/selectAll")
    public List selectAll(){
        return test3Service.list();
    }

    //向表中插入数据
    @RequestMapping("/addAll")
    public void addAll(Test3 test3){
        boolean save = test3Service.save(test3);
        if(save == true){
            System.out.println("成功");
        }
    }

}

