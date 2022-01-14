package com.commverge.kafka.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 报警表
 * @TableName attack_alarm
 */
@TableName(value ="attack_alarm")
@Data
public class AttackAlarm implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 告警ID
     */
    private String alarmId;

    /**
     * 告警来源（1，上海城域；2，云堤骨干）
     */
    private Integer detectorId;

    /**
     * 攻击目的IP
     */
    private String dstIp;

    /**
     * 攻击开始时间
     */
    private Date startTime;

    /**
     * 攻击结束时间
     */
    private Date endTime;

    /**
     * 攻击类型，例如"TCP SYN","Total Traffic"
     */
    private String attackType;

    /**
     * 最大pps
     */
    private Double maxPps;

    /**
     * 最大bps
     */
    private Double maxBps;

    /**
     * 告警状态 1 进行中，2 告警结束
     */
    private Integer status;

    /**
     * 是否发送邮件（0；未发送，1：已发送，2:发送中）
     */
    private Integer mailStatus;

    /**
     * 是否发送短信（0；未发送，1：已发送，2:发送中）
     */
    private Integer smsStatus;

    /**
     * 告警级别：融合（0:提示 1:低 2:较低 3:中 4:高 5:较高）
     */
    private Integer alarmLevel;

    /**
     * 客户id（冗余）
     */
    private String customerId;

    /**
     * 客户名称（冗余字段，显示用）
     */
    private String customerName;

    /**
     * 编组id
     */
    private String groupId;

    /**
     * 编组名称
     */
    private String groupName;

    /**
     * 电路编号
     */
    private String lineCode;

    /**
     * IPV6标识字段
     */
    private String ipv6Code;

    /**
     * 记录更新时间
     */
    private Date updateTime;

    /**
     * 是否发送kafka（0；未发送，1：已发送）
     */
    private Integer kafkaStatus;

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
        AttackAlarm other = (AttackAlarm) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAlarmId() == null ? other.getAlarmId() == null : this.getAlarmId().equals(other.getAlarmId()))
            && (this.getDetectorId() == null ? other.getDetectorId() == null : this.getDetectorId().equals(other.getDetectorId()))
            && (this.getDstIp() == null ? other.getDstIp() == null : this.getDstIp().equals(other.getDstIp()))
            && (this.getStartTime() == null ? other.getStartTime() == null : this.getStartTime().equals(other.getStartTime()))
            && (this.getEndTime() == null ? other.getEndTime() == null : this.getEndTime().equals(other.getEndTime()))
            && (this.getAttackType() == null ? other.getAttackType() == null : this.getAttackType().equals(other.getAttackType()))
            && (this.getMaxPps() == null ? other.getMaxPps() == null : this.getMaxPps().equals(other.getMaxPps()))
            && (this.getMaxBps() == null ? other.getMaxBps() == null : this.getMaxBps().equals(other.getMaxBps()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getMailStatus() == null ? other.getMailStatus() == null : this.getMailStatus().equals(other.getMailStatus()))
            && (this.getSmsStatus() == null ? other.getSmsStatus() == null : this.getSmsStatus().equals(other.getSmsStatus()))
            && (this.getAlarmLevel() == null ? other.getAlarmLevel() == null : this.getAlarmLevel().equals(other.getAlarmLevel()))
            && (this.getCustomerId() == null ? other.getCustomerId() == null : this.getCustomerId().equals(other.getCustomerId()))
            && (this.getCustomerName() == null ? other.getCustomerName() == null : this.getCustomerName().equals(other.getCustomerName()))
            && (this.getGroupId() == null ? other.getGroupId() == null : this.getGroupId().equals(other.getGroupId()))
            && (this.getGroupName() == null ? other.getGroupName() == null : this.getGroupName().equals(other.getGroupName()))
            && (this.getLineCode() == null ? other.getLineCode() == null : this.getLineCode().equals(other.getLineCode()))
            && (this.getIpv6Code() == null ? other.getIpv6Code() == null : this.getIpv6Code().equals(other.getIpv6Code()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getKafkaStatus() == null ? other.getKafkaStatus() == null : this.getKafkaStatus().equals(other.getKafkaStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAlarmId() == null) ? 0 : getAlarmId().hashCode());
        result = prime * result + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        result = prime * result + ((getDstIp() == null) ? 0 : getDstIp().hashCode());
        result = prime * result + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        result = prime * result + ((getAttackType() == null) ? 0 : getAttackType().hashCode());
        result = prime * result + ((getMaxPps() == null) ? 0 : getMaxPps().hashCode());
        result = prime * result + ((getMaxBps() == null) ? 0 : getMaxBps().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getMailStatus() == null) ? 0 : getMailStatus().hashCode());
        result = prime * result + ((getSmsStatus() == null) ? 0 : getSmsStatus().hashCode());
        result = prime * result + ((getAlarmLevel() == null) ? 0 : getAlarmLevel().hashCode());
        result = prime * result + ((getCustomerId() == null) ? 0 : getCustomerId().hashCode());
        result = prime * result + ((getCustomerName() == null) ? 0 : getCustomerName().hashCode());
        result = prime * result + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        result = prime * result + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        result = prime * result + ((getLineCode() == null) ? 0 : getLineCode().hashCode());
        result = prime * result + ((getIpv6Code() == null) ? 0 : getIpv6Code().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getKafkaStatus() == null) ? 0 : getKafkaStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", alarmId=").append(alarmId);
        sb.append(", detectorId=").append(detectorId);
        sb.append(", dstIp=").append(dstIp);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", attackType=").append(attackType);
        sb.append(", maxPps=").append(maxPps);
        sb.append(", maxBps=").append(maxBps);
        sb.append(", status=").append(status);
        sb.append(", mailStatus=").append(mailStatus);
        sb.append(", smsStatus=").append(smsStatus);
        sb.append(", alarmLevel=").append(alarmLevel);
        sb.append(", customerId=").append(customerId);
        sb.append(", customerName=").append(customerName);
        sb.append(", groupId=").append(groupId);
        sb.append(", groupName=").append(groupName);
        sb.append(", lineCode=").append(lineCode);
        sb.append(", ipv6Code=").append(ipv6Code);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", kafkaStatus=").append(kafkaStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}