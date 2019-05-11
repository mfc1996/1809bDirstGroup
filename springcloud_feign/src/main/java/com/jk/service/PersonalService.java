package com.jk.service;

import com.jk.hystrix.SchedualServiceHiHystric;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "SERVICE-PROVIDER",fallback = SchedualServiceHiHystric.class)
public interface PersonalService extends PersonalServiceApi{

}
