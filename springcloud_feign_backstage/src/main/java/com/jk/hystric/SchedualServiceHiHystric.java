/**
 * Copyright (C),2019, 金科教育
 * FileName: SchedualServiceHiHystric
 * Author:   马法冲
 * Date:     2019/5/10 20:42
 * Description: a
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.hystric;


import com.jk.model.User;
import com.jk.service.BackstageService;
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
public class SchedualServiceHiHystric implements BackstageService {

    public List<User> queryUserLists() {
        List<User> lists = new ArrayList<>();
        User user = new User();
        user.setUserName("错误了--后台系统返回");
        lists.add(user);
        return lists;
    }
}