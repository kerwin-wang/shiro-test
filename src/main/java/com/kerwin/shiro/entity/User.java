package com.kerwin.shiro.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 系统用户
 * </p>
 *
 * @author sy
 * @since 2019-12-02
 */
@TableName("sys_user")
public class User implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "user_id", type = IdType.AUTO)
    private Long userId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 状态  0：禁用   1：正常
     */
    private Integer status;

    /**
     * 创建者ID
     */
    private Long createUserId;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 部门ID
     */
    private Long deptId;

    /**
     * 商户id
     */
    private Long merchantId;

    /**
     * 商铺名称
     */
    private String merchantName;

    /**
     * 本人分佣金
     */
    @TableField("FX")
    private Double fx;

    /**
     * 一级分佣金
     */
    @TableField("FX1")
    private Double fx1;

    /**
     * 二级分佣金
     */
    @TableField("FX2")
    private Double fx2;

    /**
     * 平台分佣金
     */
    @TableField("PFX")
    private Double pfx;

    /**
     * 是否显示其他商户 0:不显示，1:显示
     */
    private Integer allShow;


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public Long getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public Double getFx() {
        return fx;
    }

    public void setFx(Double fx) {
        this.fx = fx;
    }

    public Double getFx1() {
        return fx1;
    }

    public void setFx1(Double fx1) {
        this.fx1 = fx1;
    }

    public Double getFx2() {
        return fx2;
    }

    public void setFx2(Double fx2) {
        this.fx2 = fx2;
    }

    public Double getPfx() {
        return pfx;
    }

    public void setPfx(Double pfx) {
        this.pfx = pfx;
    }

    public Integer getAllShow() {
        return allShow;
    }

    public void setAllShow(Integer allShow) {
        this.allShow = allShow;
    }

    @Override
    public String toString() {
        return "User{" +
        "userId=" + userId +
        ", username=" + username +
        ", password=" + password +
        ", email=" + email +
        ", mobile=" + mobile +
        ", status=" + status +
        ", createUserId=" + createUserId +
        ", createTime=" + createTime +
        ", deptId=" + deptId +
        ", merchantId=" + merchantId +
        ", merchantName=" + merchantName +
        ", fx=" + fx +
        ", fx1=" + fx1 +
        ", fx2=" + fx2 +
        ", pfx=" + pfx +
        ", allShow=" + allShow +
        "}";
    }
}
