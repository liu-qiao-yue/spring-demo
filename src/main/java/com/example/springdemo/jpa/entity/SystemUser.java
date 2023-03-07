package com.example.springdemo.jpa.entity;

import com.example.springdemo.jpa.entityId.SystemUserId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@Entity
@IdClass(SystemUserId.class)
@Table(name = "sys_user")
@AllArgsConstructor
@NoArgsConstructor
public class SystemUser implements Serializable {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "username")
    private String username;

    @Column(name = "realname")
    private String realname;

    @Column(name = "password")
    private String password;

    @Column(name = "salt")
    private String salt;

    @Column(name = "birthday")
    private LocalDate birthday;

    @Column(name = "avatar")
    private String avatar;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "org_code")
    private String orgCode;

    @Column(name = "status")
    private String status;

    @Column(name = "del_flag")
    private String delFlag;

    @Column(name = "third_id")
    private String thirdId;

    @Column(name = "third_type")
    private String thirdType;

    @Column(name = "activiti_sync")
    private String activitiSync;

    @Column(name = "work_no")
    private String workNo;

    @Column(name = "post")
    private String post;

    @Column(name = "telephone")
    private String telephone;

    @Column(name = "create_by")
    private String createBy;

    @Column(name = "create_time")
    private String createTime;

    @Column(name = "update_by")
    private String updateBy;

    @Column(name = "update_time")
    private String updateTime;

    @Column(name = "user_identity")
    private String userIdentity;

    @Column(name = "depart_ids")
    private String departIds;

    @Column(name = "rel_tenant_ids")
    private String relTenantIds;

    @Column(name = "client_id")
    private String clientOd;

}
