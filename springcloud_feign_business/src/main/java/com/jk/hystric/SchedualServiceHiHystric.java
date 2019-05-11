/**
 * Copyright (C),2019, 金科教育
 * FileName: SchedualServiceHiHystric
 * Author:   马法冲
 * Date:     2019/5/10 20:47
 * Description: a
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.hystric;

import com.jk.model.User;
import com.jk.service.BusinessService;
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
public class SchedualServiceHiHystric implements BusinessService {

    //查询
    public List<User> queryUserListes() {
        List<User> listes= new ArrayList<>();
        User user= new User();
        user.setUserName("错误了--商家系统返回");
        listes.add(user);
        return listes;
    }
}