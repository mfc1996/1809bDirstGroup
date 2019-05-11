package com.jk.service;


import com.jk.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

public interface BusinessServiceApi {

    @GetMapping("queryUserListes")
    @ResponseBody
    List<User> queryUserListes();
}
