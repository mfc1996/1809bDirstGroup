package com.jk.service;

import com.jk.hystric.SchedualServiceHiHystric;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "SERVICE-PROVIDER",fallback = SchedualServiceHiHystric.class)
public interface BackstageService extends BackstageServiceApi {

}
