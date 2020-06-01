package com.aaa.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Data
@Getter
@Setter
@AllArgsConstructor
public class Role {
    private Integer roleId;

    private String roleName;

    private String roleKey;

    private Integer roleSort;

    private String status;

    private String delFlag;

    private String createBy;
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    private String updateBy;

    private Date updateTime;

    private String remark;


}