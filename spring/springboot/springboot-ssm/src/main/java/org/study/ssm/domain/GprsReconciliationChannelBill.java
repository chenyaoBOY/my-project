package org.study.ssm.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author chenyao
 * @date 2020/6/17 10:57
 * @description
 */
public class GprsReconciliationChannelBill {

    /**
     * id
     */
    private Long id;

    /**
     * 对账批次号
     */
    private String batchNo;

    /**
     * 订单号
     */
    private String merchantOrderNo;

    /**
     * 商户号
     */
    private String merchantNo;

    /**
     * 网关单号 支付中心产生的单号 支付网关单号/退款网关单号
     */
    private String gatewayOrderNo;

    /**
     * 交易类型 1支付2退款
     */
    private Integer tradeType;

    /**
     * 退款路径属性 原路退款：退款 非原路退款：打款
     */
    private Integer isOriginal;

    /**
     * 1：api退款2：渠道退款3：手工打款4：api打款5：平台退款
     */
    private Integer refundPath;

    /**
     * 实际支付币种（非下单币种）/实际退款币种（非下单币种）
     */
    private String currencyCode;

    /**
     * 实际支付金额（非下单币种金额）/实际退款金额（非下单币种退款金额）
     */
    private BigDecimal amount;

    /**
     * 渠道类型
     */
    private String channel;

    /**
     * 渠道单号
     */
    private String channelNo;

    /**
     * 状态
     */
    private Integer channelBillStatus;

    /**
     * 手工导入操作人
     */
    private String operator;

    /**
     * 对账流水号，可能会有多个
     */
    private String reconciliationDetailNos;

    /**
     * 是否参与对账 0不参与1参与
     */
    private Integer reconciliationStatus;

    /**
     * 源数据创建时间
     */
    private Date sourceDataCreateTime;

    /**
     * 源数据更新时间
     */
    private Date sourceDataUpdateTime;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 最后更新时间
     */
    private Date lastUpdateTime;

    /**
     * 是否删除 1是 0 否
     */
    private Boolean isDel;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public String getMerchantOrderNo() {
        return merchantOrderNo;
    }

    public void setMerchantOrderNo(String merchantOrderNo) {
        this.merchantOrderNo = merchantOrderNo;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getGatewayOrderNo() {
        return gatewayOrderNo;
    }

    public void setGatewayOrderNo(String gatewayOrderNo) {
        this.gatewayOrderNo = gatewayOrderNo;
    }

    public Integer getTradeType() {
        return tradeType;
    }

    public void setTradeType(Integer tradeType) {
        this.tradeType = tradeType;
    }

    public Integer getIsOriginal() {
        return isOriginal;
    }

    public void setIsOriginal(Integer isOriginal) {
        this.isOriginal = isOriginal;
    }

    public Integer getRefundPath() {
        return refundPath;
    }

    public void setRefundPath(Integer refundPath) {
        this.refundPath = refundPath;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getChannelNo() {
        return channelNo;
    }

    public void setChannelNo(String channelNo) {
        this.channelNo = channelNo;
    }

    public Integer getChannelBillStatus() {
        return channelBillStatus;
    }

    public void setChannelBillStatus(Integer channelBillStatus) {
        this.channelBillStatus = channelBillStatus;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getReconciliationDetailNos() {
        return reconciliationDetailNos;
    }

    public void setReconciliationDetailNos(String reconciliationDetailNos) {
        this.reconciliationDetailNos = reconciliationDetailNos;
    }

    public Integer getReconciliationStatus() {
        return reconciliationStatus;
    }

    public void setReconciliationStatus(Integer reconciliationStatus) {
        this.reconciliationStatus = reconciliationStatus;
    }

    public Date getSourceDataCreateTime() {
        return sourceDataCreateTime;
    }

    public void setSourceDataCreateTime(Date sourceDataCreateTime) {
        this.sourceDataCreateTime = sourceDataCreateTime;
    }

    public Date getSourceDataUpdateTime() {
        return sourceDataUpdateTime;
    }

    public void setSourceDataUpdateTime(Date sourceDataUpdateTime) {
        this.sourceDataUpdateTime = sourceDataUpdateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public Boolean getDel() {
        return isDel;
    }

    public void setDel(Boolean del) {
        isDel = del;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}
