/**
 * Copyright (C),2019, 金科教育
 * FileName: SchedualServiceHiHystric
 * Author:   马法冲
 * Date:     2019/5/10 16:40
 * Description: a
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.hystrix;

import com.jk.model.User;
import com.jk.service.PersonalService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈a〉
 *
 * @author MC
 * @create 2019/5/10
 * @since 1.0.0
 */
@Component
public class SchedualServiceHiHystric implements PersonalService {

    //查询
    @Override
    public List<User> queryUserList() {

            List<User> list= new ArrayList<>();
            User user= new User();
            user.setUserName("错误了--个人系统返回");
            list.add(user);
            return list;
    }
}