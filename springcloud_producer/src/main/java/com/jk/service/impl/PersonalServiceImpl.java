/**
 * Copyright (C),2019, 金科教育
 * FileName: PersonalServiceImpl
 * Author:   马法冲
 * Date:     2019/5/10 22:01
 * Description: a
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.service.impl;

import com.jk.mapper.PersonalMapper;
import com.jk.model.User;
import com.jk.service.PersonalServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
@Controller
public class PersonalServiceImpl implements PersonalServiceApi {
    @Autowired
    private PersonalMapper personalMapper;


    @ResponseBody
    @Override
    public List<User> queryUserList() {
        return personalMapper.queryUserList();
    }

}