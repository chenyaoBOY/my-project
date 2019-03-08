package org.study.ssm.bean;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Contract implements Serializable {
    private String sysGuid;//主键
    private String code;//合同编码
    private String name;//合同名称
    private String operatorMobile;//经办人移动电话
    private String operatorId;//经办人id
    private String operatorName;//经办人名称
    private String operationDepId;//经办部门id
    private String operationDepName;//经办部门名称
    private String sourceId;//不含税总金额  原来用处是来源单据id
    private String sourceCode;//来源单据编码
    private String contractSource;//合同来源:0需求1询竞价2询报价3招投标
    private String companyName;//所属公司名称
    private String companyId;//所属公司id
    private String supplierId;//供应商id
    private String supplierName;//供应商名称
    private Date startTime;//合同开始时间
    private Date endTime;//合同结束时间
    private String contractClause;//合同条款
    private String paymentClause;//框架协议适用范围  合同:预算更新成功状态
    private String status;//合同状态：0草稿1已生效2变更中3已失效4待生效
    private BigDecimal totalPrice;//总金额
    private String version;//历史版本id
    private Date sysCreateDate;//创建时间
    private String sysCreateUser;//创建人
    private Date sysUpdateDate;//更新时间
    private String sysUpdateUser;//更信任姓名
    private String sysRecycle;//逻辑删标识（0：未删；1：已删）
    private Integer versionNum;//合同版本号
    private Integer approvalStatus;//审批状态 0：审批中  1：已驳回  2:已审批 404：清除审批状态
    private String extend3;//0：合同  1：框架协议 2:战略协议引用合同
    private String extend4;//提交时间
    private String extend5;//审批时间  1.4:用作来源单据id

    /**
     * copyFrom
     * @param src
     */
    public void copyFrom(Contract src){		this.sysGuid=src.sysGuid;//主键
        this.code=src.code;//合同编码
        this.name=src.name;//合同名称
        this.operatorMobile=src.operatorMobile;//经办人移动电话
        this.operatorId=src.operatorId;//经办人id
        this.operatorName=src.operatorName;//经办人名称
        this.operationDepId=src.operationDepId;//经办部门id
        this.operationDepName=src.operationDepName;//经办部门名称
        this.sourceId=src.sourceId;//来源单据id
        this.sourceCode=src.sourceCode;//来源单据编码
        this.contractSource=src.contractSource;//合同来源:0需求1询竞价2询报价3招投标
        this.companyName=src.companyName;//所属公司名称
        this.companyId=src.companyId;//所属公司id
        this.supplierId=src.supplierId;//供应商id
        this.supplierName=src.supplierName;//供应商名称
        this.startTime=src.startTime;//合同开始时间
        this.endTime=src.endTime;//合同结束时间
        this.contractClause=src.contractClause;//合同条款
        this.paymentClause=src.paymentClause;//付款条款
        this.status=src.status;//合同状态：0草稿1已生效2变更中
        this.totalPrice=src.totalPrice;//总金额
        this.version=src.version;//历史版本id
        this.sysCreateDate=src.sysCreateDate;//创建时间
        this.sysCreateUser=src.sysCreateUser;//创建人
        this.sysUpdateDate=src.sysUpdateDate;//更新时间
        this.sysUpdateUser=src.sysUpdateUser;//更信任姓名
        this.sysRecycle=src.sysRecycle;//逻辑删标识（0：未删；1：已删）
        this.versionNum=src.versionNum;//合同版本号
        this.approvalStatus=src.approvalStatus;//审批状态 0：审批中  1：已驳回
        this.extend3=src.extend3;//
        this.extend4=src.extend4;//
        this.extend5=src.extend5;//
    }


    /**
     * 	 */
    public String getSysGuid(){
        return this.sysGuid;
    }

    /**
     * 	 */
    public void setSysGuid(String sysGuid){
        this.sysGuid = sysGuid;
    }
    /**
     * 	 */
    public String getCode(){
        return this.code;
    }

    /**
     * 	 */
    public void setCode(String code){
        this.code = code;
    }
    /**
     * 	 */
    public String getName(){
        return this.name;
    }

    /**
     * 	 */
    public void setName(String name){
        this.name = name;
    }
    /**
     * 	 */
    public String getOperatorMobile(){
        return this.operatorMobile;
    }

    /**
     * 	 */
    public void setOperatorMobile(String operatorMobile){
        this.operatorMobile = operatorMobile;
    }
    /**
     * 	 */
    public String getOperatorId(){
        return this.operatorId;
    }

    /**
     * 	 */
    public void setOperatorId(String operatorId){
        this.operatorId = operatorId;
    }
    /**
     * 	 */
    public String getOperatorName(){
        return this.operatorName;
    }

    /**
     * 	 */
    public void setOperatorName(String operatorName){
        this.operatorName = operatorName;
    }
    /**
     * 	 */
    public String getOperationDepId(){
        return this.operationDepId;
    }

    /**
     * 	 */
    public void setOperationDepId(String operationDepId){
        this.operationDepId = operationDepId;
    }
    /**
     * 	 */
    public String getOperationDepName(){
        return this.operationDepName;
    }

    /**
     * 	 */
    public void setOperationDepName(String operationDepName){
        this.operationDepName = operationDepName;
    }
    /**
     * 	 */
    public String getSourceId(){
        return this.sourceId;
    }

    /**
     * 	 */
    public void setSourceId(String sourceId){
        this.sourceId = sourceId;
    }
    /**
     * 	 */
    public String getSourceCode(){
        return this.sourceCode;
    }

    /**
     * 	 */
    public void setSourceCode(String sourceCode){
        this.sourceCode = sourceCode;
    }
    /**
     * 	 */
    public String getContractSource(){
        return this.contractSource;
    }

    /**
     * 	 */
    public void setContractSource(String contractSource){
        this.contractSource = contractSource;
    }
    /**
     * 	 */
    public String getCompanyName(){
        return this.companyName;
    }

    /**
     * 	 */
    public void setCompanyName(String companyName){
        this.companyName = companyName;
    }
    /**
     * 	 */
    public String getCompanyId(){
        return this.companyId;
    }

    /**
     * 	 */
    public void setCompanyId(String companyId){
        this.companyId = companyId;
    }
    /**
     * 	 */
    public String getSupplierId(){
        return this.supplierId;
    }

    /**
     * 	 */
    public void setSupplierId(String supplierId){
        this.supplierId = supplierId;
    }
    /**
     * 	 */
    public String getSupplierName(){
        return this.supplierName;
    }

    /**
     * 	 */
    public void setSupplierName(String supplierName){
        this.supplierName = supplierName;
    }
    /**
     * 	 */
     	public Date getStartTime(){
        return this.startTime;
    }

    /**
     * 	 */
    public void setStartTime(Date startTime){
        this.startTime = startTime;
    }
    /**
     * 	 */
    	public Date getEndTime(){
        return this.endTime;
    }

    /**
     * 	 */
    public void setEndTime(Date endTime){
        this.endTime = endTime;
    }
    /**
     * 	 */
    public String getContractClause(){
        return this.contractClause;
    }

    /**
     * 	 */
    public void setContractClause(String contractClause){
        this.contractClause = contractClause;
    }
    /**
     * 	 */
    public String getPaymentClause(){
        return this.paymentClause;
    }

    /**
     * 	 */
    public void setPaymentClause(String paymentClause){
        this.paymentClause = paymentClause;
    }
    /**
     * 	 */
    public String getStatus(){
        return this.status;
    }

    /**
     * 	 */
    public void setStatus(String status){
        this.status = status;
    }
    /**
     * 	 */
    public BigDecimal getTotalPrice(){
        return this.totalPrice;
    }

    /**
     * 	 */
    public void setTotalPrice(BigDecimal totalPrice){
        this.totalPrice = totalPrice;
    }
    /**
     * 	 */
    public String getVersion(){
        return this.version;
    }

    /**
     * 	 */
    public void setVersion(String version){
        this.version = version;
    }
    /**
     * 	 */
    	public Date getSysCreateDate(){
        return this.sysCreateDate;
    }

    /**
     * 	 */
    public void setSysCreateDate(Date sysCreateDate){
        this.sysCreateDate = sysCreateDate;
    }
    /**
     * 	 */
    public String getSysCreateUser(){
        return this.sysCreateUser;
    }

    /**
     * 	 */
    public void setSysCreateUser(String sysCreateUser){
        this.sysCreateUser = sysCreateUser;
    }
    /**
     * 	 */
    public Date getSysUpdateDate(){
        return this.sysUpdateDate;
    }

    /**
     * 	 */
    public void setSysUpdateDate(Date sysUpdateDate){
        this.sysUpdateDate = sysUpdateDate;
    }
    /**
     * 	 */
    public String getSysUpdateUser(){
        return this.sysUpdateUser;
    }

    /**
     * 	 */
    public void setSysUpdateUser(String sysUpdateUser){
        this.sysUpdateUser = sysUpdateUser;
    }
    /**
     * 	 */
    public String getSysRecycle(){
        return this.sysRecycle;
    }

    /**
     * 	 */
    public void setSysRecycle(String sysRecycle){
        this.sysRecycle = sysRecycle;
    }
    /**
     * 	 */
    public Integer getVersionNum(){
        return this.versionNum;
    }

    /**
     * 	 */
    public void setVersionNum(Integer versionNum){
        this.versionNum = versionNum;
    }
    /**
     * 	 */
    public Integer getApprovalStatus(){
        return this.approvalStatus;
    }

    /**
     * 	 */
    public void setApprovalStatus(Integer approvalStatus){
        this.approvalStatus = approvalStatus;
    }
    /**
     * 	 */
    public String getExtend3(){
        return this.extend3;
    }

    /**
     * 	 */
    public void setExtend3(String extend3){
        this.extend3 = extend3;
    }
    /**
     * 	 */
    public String getExtend4(){
        return this.extend4;
    }

    /**
     * 	 */
    public void setExtend4(String extend4){
        this.extend4 = extend4;
    }
    /**
     * 	 */
    public String getExtend5(){
        return this.extend5;
    }

    /**
     * 	 */
    public void setExtend5(String extend5){
        this.extend5 = extend5;
    }

}
