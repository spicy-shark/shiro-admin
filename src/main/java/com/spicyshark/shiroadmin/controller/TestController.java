package com.spicyshark.shiroadmin.controller;

import com.spicyshark.shiroadmin.domain.req.SysPasswdLoginReq;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: shiro-admin
 * @description: TestController
 * @author: Pei Yansheng
 * @date: 2022-06-02 15:51
 **/
@RestController
@Slf4j
public class TestController {

  @PostMapping("/sys/user/login")
  public String sysUserLogin(@RequestBody SysPasswdLoginReq dto) {
    log.debug("SysUser login-username:{}", dto.getUsername());
    return dto.getUsername() + " login success!";
  }

}
