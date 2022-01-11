package com.example.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 云堤客户基本信息表
 * @TableName customer
 */
@TableName(value ="customer")
@Data
public class Customer implements Serializable {
    /**
     * 自增ID
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 客户ID（来自云堤工单）
     */
    private String customerId;

    /**
     * 客户名称
     */
    private String customerName;

    /**
     * 省份
     */
    private String province;

    /**
     * 地区
     */
    private String area;

    /**
     * 地址
     */
    private String address;

    /**
     * 行业
     */
    private String industry;

    /**
     * 客户状态（0，删除；1，正常;2，失效）
     */
    private Integer status;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 客户联系人短信告警级别(1-5)
     */
    private Integer commonAlertLevelSms;

    /**
     * 客户联系人邮件告警级别(1-5)
     */
    private Integer commonAlertLevelEmail;

    /**
     * 客户经理短信告警级别（1-5）
     */
    private Integer managerAlertLevelSms;

    /**
     * 客户经理邮件告警级别（1-5）
     */
    private Integer managerAlertLevelEmail;

    /**
     * 上海本地防护用户名
     */
    private String shUser;

    /**
     * 上海本地防护密码
     */
    private String shPassword;

    /**
     * 自动清洗通知方式（null，不发送；1，短信；2，邮件）
     */
    private Integer autoProtectMessage;

    /**
     * 是否有应用层清洗（0，没有。1，有
     */
    private Integer applicationKey;

    /**
     * 最后修改时间
     */
    private Date updateTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Customer other = (Customer) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCustomerId() == null ? other.getCustomerId() == null : this.getCustomerId().equals(other.getCustomerId()))
            && (this.getCustomerName() == null ? other.getCustomerName() == null : this.getCustomerName().equals(other.getCustomerName()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getArea() == null ? other.getArea() == null : this.getArea().equals(other.getArea()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getIndustry() == null ? other.getIndustry() == null : this.getIndustry().equals(other.getIndustry()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getCommonAlertLevelSms() == null ? other.getCommonAlertLevelSms() == null : this.getCommonAlertLevelSms().equals(other.getCommonAlertLevelSms()))
            && (this.getCommonAlertLevelEmail() == null ? other.getCommonAlertLevelEmail() == null : this.getCommonAlertLevelEmail().equals(other.getCommonAlertLevelEmail()))
            && (this.getManagerAlertLevelSms() == null ? other.getManagerAlertLevelSms() == null : this.getManagerAlertLevelSms().equals(other.getManagerAlertLevelSms()))
            && (this.getManagerAlertLevelEmail() == null ? other.getManagerAlertLevelEmail() == null : this.getManagerAlertLevelEmail().equals(other.getManagerAlertLevelEmail()))
            && (this.getShUser() == null ? other.getShUser() == null : this.getShUser().equals(other.getShUser()))
            && (this.getShPassword() == null ? other.getShPassword() == null : this.getShPassword().equals(other.getShPassword()))
            && (this.getAutoProtectMessage() == null ? other.getAutoProtectMessage() == null : this.getAutoProtectMessage().equals(other.getAutoProtectMessage()))
            && (this.getApplicationKey() == null ? other.getApplicationKey() == null : this.getApplicationKey().equals(other.getApplicationKey()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCustomerId() == null) ? 0 : getCustomerId().hashCode());
        result = prime * result + ((getCustomerName() == null) ? 0 : getCustomerName().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getArea() == null) ? 0 : getArea().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getIndustry() == null) ? 0 : getIndustry().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getCommonAlertLevelSms() == null) ? 0 : getCommonAlertLevelSms().hashCode());
        result = prime * result + ((getCommonAlertLevelEmail() == null) ? 0 : getCommonAlertLevelEmail().hashCode());
        result = prime * result + ((getManagerAlertLevelSms() == null) ? 0 : getManagerAlertLevelSms().hashCode());
        result = prime * result + ((getManagerAlertLevelEmail() == null) ? 0 : getManagerAlertLevelEmail().hashCode());
        result = prime * result + ((getShUser() == null) ? 0 : getShUser().hashCode());
        result = prime * result + ((getShPassword() == null) ? 0 : getShPassword().hashCode());
        result = prime * result + ((getAutoProtectMessage() == null) ? 0 : getAutoProtectMessage().hashCode());
        result = prime * result + ((getApplicationKey() == null) ? 0 : getApplicationKey().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", customerId=").append(customerId);
        sb.append(", customerName=").append(customerName);
        sb.append(", province=").append(province);
        sb.append(", area=").append(area);
        sb.append(", address=").append(address);
        sb.append(", industry=").append(industry);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", commonAlertLevelSms=").append(commonAlertLevelSms);
        sb.append(", commonAlertLevelEmail=").append(commonAlertLevelEmail);
        sb.append(", managerAlertLevelSms=").append(managerAlertLevelSms);
        sb.append(", managerAlertLevelEmail=").append(managerAlertLevelEmail);
        sb.append(", shUser=").append(shUser);
        sb.append(", shPassword=").append(shPassword);
        sb.append(", autoProtectMessage=").append(autoProtectMessage);
        sb.append(", applicationKey=").append(applicationKey);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}