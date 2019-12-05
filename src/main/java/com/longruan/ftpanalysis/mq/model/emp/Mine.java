package com.longruan.ftpanalysis.mq.model.emp;

import com.longruan.ftpanalysis.batch.entity.FieldOrder;
import com.longruan.ftpanalysis.batch.entity.MsgName;
import com.longruan.ftpanalysis.mq.consts.BatchConstants;
import com.longruan.ftpanalysis.mq.consts.MQConstants;
import com.longruan.ftpanalysis.mq.model.MsgHead;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;

import java.text.ParseException;
import java.util.Date;

@MsgName(job = "煤矿基础数据", filePath = "*RYKJ", sysType = BatchConstants.SystemType.rydw, exchangeName = MQConstants.ExChanges.EMP_MINE)
public class Mine{

    @FieldOrder(order = 1)
    private String id; //	a）煤矿编码（11位十进制数字）；
    @FieldOrder(order = 2)
    private String group_name;//	b）集团名称（不超过5个汉字长度）；
    @FieldOrder(order = 3)
    private String company_name;//	c）公司名称（不超过5个汉字长度，此处的公司是指集团公司下面的子公司，如果没有，则填写一个小写字母“x”）；
    @FieldOrder(order = 4)
    private String v_name;//	d）煤矿全称（不超过30个汉字长度）；
    @FieldOrder(order = 5)
    private String short_mine_name;//	e）煤矿简称（不超过5个汉字长度）；
    @FieldOrder(order = 6)
    private String economy_type;//	f）经济类型（按照国家标准，不超过20个汉字长度）；
    @FieldOrder(order = 7)
    private String sub_relation;//	g）隶属关系（不超过50个汉字长度）；
    @FieldOrder(order = 8)
    private String leader;//	h）矿长姓名（不超过10个汉字长度）；
    @FieldOrder(order = 9)
    private String mine_adrr;//	i）详细地址（不超过50个汉字长度）；
    @FieldOrder(order = 10)
    private Double plan_ability;//	j）核定生产能力（不超过5位十进制数字长度，单位：万吨）；
    @FieldOrder(order = 11)
    private Double fact_ability;//	k）实际生产能力（不超过5位十进制数字长度，单位：万吨）；
    @FieldOrder(order = 12)
    private Integer limit_person_num;//	l）核定下井人数（不超过5位十进制数字长度，单位：人）；
    @FieldOrder(order = 13)
    private Integer limit_time_per_class;//	m）核定每班下井时间（不超过2位十进制数字长度，单位：小时）；
    @FieldOrder(order = 14)
    private String phone;//	n）矿联系电话（不超过20个数字/符号长度）；
    @FieldOrder(order = 15)
    private Double well_area;//	o）井田面积（含小数位不超过8位十进制数字长度，单位：平方公里）；
    @FieldOrder(order = 16)
    private String coal_bed;//	p）可采煤层（不超过10个数字/符号长度）；
    @FieldOrder(order = 17)
    private String license_no;//	q）采矿许可证编号（不超过30个十进制数字/汉字长度）；
    @FieldOrder(order = 18)
    private String mine_safe_no;//	r）安全生产许可证编号（不超过30个十进制数字/汉字长度）；
    @FieldOrder(order = 19)
    private String mine_coal_no;//	s）煤炭生产许可证编号（不超过30个十进制数字/汉字长度）；
    @FieldOrder(order = 20)
    private String leader_safe_no;//	t）矿长安全生产许可资格证编号（不超过30个十进制数字/汉字长度）；
    @FieldOrder(order = 21)
    private String leader_qualif_no;//	u）矿长资格证编号（不超过30个十进制数字/汉字长度）；
    @FieldOrder(order = 22)
    private String	 business_no;//	v）工商执照编号（不超过30个十进制数字/汉字长度）；
    @FieldOrder(order = 23)
    private String	gas_level;//	w）矿井瓦斯等级（填写“高瓦斯”或“低瓦斯”或“煤（岩）与瓦斯突出”）；
    @FieldOrder(order = 24)
    private String	absolute_gas_flow;//	x）绝对瓦斯涌出量（不超过5个十进制数字长度，单位：立方米/分钟）；
    @FieldOrder(order = 25)
    private String compare_gas_flow;	//	y）相对瓦斯涌出量（不超过5个十进制数字长度，单位：立方米/吨）；
    @FieldOrder(order = 26)
    private String mastip;	//	z）主用服务器IP地址（不超过15个十进制数字/符号长度）；
    @FieldOrder(order = 27)
    private String slaveip1;	//	aa）备用服务器IP地址（不超过15个十进制数字/符号长度）；
    @FieldOrder(order = 28)
    private String slaveip2;	//	ab）备用IP地址（不超过15个十进制数字/符号长度）；
    @FieldOrder(order = 29)
    private String v_lat;	//	ac）主井口Y坐标（不超过20个十进制数字长度）；
    @FieldOrder(order = 30)
    private String v_lng;	//	ad）主井口X坐标（不超过20个十进制数字长度）；
    @FieldOrder(order = 31)
    private String remark;  //备注

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGroup_name() {
        return group_name;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getV_name() {
        return v_name;
    }

    public void setV_name(String v_name) {
        this.v_name = v_name;
    }

    public String getShort_mine_name() {
        return short_mine_name;
    }

    public void setShort_mine_name(String short_mine_name) {
        this.short_mine_name = short_mine_name;
    }

    public String getEconomy_type() {
        return economy_type;
    }

    public void setEconomy_type(String economy_type) {
        this.economy_type = economy_type;
    }

    public String getSub_relation() {
        return sub_relation;
    }

    public void setSub_relation(String sub_relation) {
        this.sub_relation = sub_relation;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public String getMine_adrr() {
        return mine_adrr;
    }

    public void setMine_adrr(String mine_adrr) {
        this.mine_adrr = mine_adrr;
    }

    public Double getPlan_ability() {
        return plan_ability;
    }

    public void setPlan_ability(Double plan_ability) {
        this.plan_ability = plan_ability;
    }

    public Double getFact_ability() {
        return fact_ability;
    }

    public void setFact_ability(Double fact_ability) {
        this.fact_ability = fact_ability;
    }

    public Integer getLimit_person_num() {
        return limit_person_num;
    }

    public void setLimit_person_num(Integer limit_person_num) {
        this.limit_person_num = limit_person_num;
    }

    public Integer getLimit_time_per_class() {
        return limit_time_per_class;
    }

    public void setLimit_time_per_class(Integer limit_time_per_class) {
        this.limit_time_per_class = limit_time_per_class;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Double getWell_area() {
        return well_area;
    }

    public void setWell_area(Double well_area) {
        this.well_area = well_area;
    }

    public String getCoal_bed() {
        return coal_bed;
    }

    public void setCoal_bed(String coal_bed) {
        this.coal_bed = coal_bed;
    }

    public String getLicense_no() {
        return license_no;
    }

    public void setLicense_no(String license_no) {
        this.license_no = license_no;
    }

    public String getMine_safe_no() {
        return mine_safe_no;
    }

    public void setMine_safe_no(String mine_safe_no) {
        this.mine_safe_no = mine_safe_no;
    }

    public String getMine_coal_no() {
        return mine_coal_no;
    }

    public void setMine_coal_no(String mine_coal_no) {
        this.mine_coal_no = mine_coal_no;
    }

    public String getLeader_safe_no() {
        return leader_safe_no;
    }

    public void setLeader_safe_no(String leader_safe_no) {
        this.leader_safe_no = leader_safe_no;
    }

    public String getLeader_qualif_no() {
        return leader_qualif_no;
    }

    public void setLeader_qualif_no(String leader_qualif_no) {
        this.leader_qualif_no = leader_qualif_no;
    }

    public String getBusiness_no() {
        return business_no;
    }

    public void setBusiness_no(String business_no) {
        this.business_no = business_no;
    }

    public String getGas_level() {
        return gas_level;
    }

    public void setGas_level(String gas_level) {
        this.gas_level = gas_level;
    }

    public String getAbsolute_gas_flow() {
        return absolute_gas_flow;
    }

    public void setAbsolute_gas_flow(String absolute_gas_flow) {
        this.absolute_gas_flow = absolute_gas_flow;
    }

    public String getCompare_gas_flow() {
        return compare_gas_flow;
    }

    public void setCompare_gas_flow(String compare_gas_flow) {
        this.compare_gas_flow = compare_gas_flow;
    }

    public String getMastip() {
        return mastip;
    }

    public void setMastip(String mastip) {
        this.mastip = mastip;
    }

    public String getSlaveip1() {
        return slaveip1;
    }

    public void setSlaveip1(String slaveip1) {
        this.slaveip1 = slaveip1;
    }

    public String getSlaveip2() {
        return slaveip2;
    }

    public void setSlaveip2(String slaveip2) {
        this.slaveip2 = slaveip2;
    }

    public String getV_lat() {
        return v_lat;
    }

    public void setV_lat(String v_lat) {
        this.v_lat = v_lat;
    }

    public String getV_lng() {
        return v_lng;
    }

    public void setV_lng(String v_lng) {
        this.v_lng = v_lng;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
