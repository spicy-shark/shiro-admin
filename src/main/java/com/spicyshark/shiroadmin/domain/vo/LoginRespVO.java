package com.spicyshark.shiroadmin.domain.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @program: npc-admin
 * @description: 登录返回结构
 * @author: Pei Yansheng
 * @date: 2021-06-01 20:06
 **/
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoginRespVO {

  private String userId;

  private String userName;

//  private Set<SysRole> sysRoleSet;

  @ApiModelProperty(value = "正常的业务token")
  private String accessToken;

  @ApiModelProperty(value = "refresh token")
  private String refreshToken;

}
