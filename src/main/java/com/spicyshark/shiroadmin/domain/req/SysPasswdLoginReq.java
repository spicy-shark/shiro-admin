package com.spicyshark.shiroadmin.domain.req;

import lombok.Data;
import javax.validation.constraints.NotBlank;


/**
 * @program: npc-admin
 * @description: 登录参数结构
 * @author: Pei Yansheng
 * @date: 2021-05-25 17:37
 **/
@Data
public class SysPasswdLoginReq {

  private Integer type;

  @NotBlank
  private String username;

  private String passwd;

}
