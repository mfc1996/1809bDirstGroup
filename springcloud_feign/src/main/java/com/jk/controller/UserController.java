/**
 * Copyright (C),2019, 金科教育
 * FileName: UserController
 * Author:   马法冲
 * Date:     2019/5/10 17:10
 * Description: a
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.controller;

import com.jk.model.User;
import com.jk.service.PersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈a〉
 *
 * @author MC
 * @create 2019/5/10
 * @since 1.0.0
 */
@CrossOrigin
@Controller
@RequestMapping("user")
public class UserController{

    @Autowired
    private PersonalService personalService;

    @GetMapping("queryUserList")
    @ResponseBody
    public List<User> queryUserList(){
        List<User> list=  personalService.queryUserList();
        return list;
    }

}