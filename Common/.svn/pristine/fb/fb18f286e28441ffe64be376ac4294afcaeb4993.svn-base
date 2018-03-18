package com.yonyou.scf.common.tx.gateway;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yonyou.scf.common.util.json.JsonUtil;

public class Scf1103Request_DataList implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7792230911915477609L;

	//商户端融资方ID
	@NotBlank(message="商户端融资方ID不能为空")
	@Length(max=32,message="商户端融资方ID不超过32位")
	
    private String fsId;
	
	//融资方类型
	@NotNull(message="融资方类型不能为空")
	@Max(value=99,message="融资方类型不超过2位")
	
    private Integer fsType;
	
	//企业名称/个人名称
	@NotBlank(message="企业名称/个人名称不能为空")
	@Length(max=200,message="企业名称/个人名称不能超过200位")
	
    private String fsName;

	//组织机构代码/身份证号  校验身份证格式
	@NotBlank(message="组织机构代码/身份证号不能为空")
	@Length(max=20,message="组织机构代码/身份证号不超过20位")
	
    private String fsGroupNo;
	
	//联系人
	@Length(max=10,message="联系人不超过10位")
	
    private String fsConcater;
	
	//手机
	@Length(max=11,message="手机不超过11位")
	@Pattern(regexp="^[0-9]*$",message="手机号必须为数字")
	
    private String fsPhone;
	
	//邮箱
	@Length(max=100,message="邮箱不超过100位")
	@Pattern(regexp="^(\\S+@\\S+)|\\s{0}$",message="邮箱格式必须正确")
	
    private String fsMail;

    public String getFsId() {
        return fsId;
    }

    public void setFsId(String fsId) {
        this.fsId = fsId == null ? null : fsId.trim();
    }

    public Integer getFsType() {
        return fsType;
    }

    public void setFsType(Integer fsType) {
        this.fsType = fsType;
    }

    public String getFsName() {
        return fsName;
    }

    public void setFsName(String fsName) {
        this.fsName = fsName == null ? null : fsName.trim();
    }

    public String getFsGroupNo() {
        return fsGroupNo;
    }

    public void setFsGroupNo(String fsGroupNo) {
        this.fsGroupNo = fsGroupNo == null ? null : fsGroupNo.trim();
    }

    public String getFsConcater() {
        return fsConcater;
    }

    public void setFsConcater(String fsConcater) {
        this.fsConcater = fsConcater == null ? null : fsConcater.trim();
    }

    public String getFsPhone() {
        return fsPhone;
    }

    public void setFsPhone(String fsPhone) {
        this.fsPhone = fsPhone == null ? null : fsPhone.trim();
    }

    public String getFsMail() {
        return fsMail;
    }

    public void setFsMail(String fsMail) {
        this.fsMail = fsMail == null ? null : fsMail.trim();
    }

    @Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}