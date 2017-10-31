package com.practice.vo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "MF_PROFIT_NOTIFY_DETAIL")
@Entity
public class DataPracticeVO implements Serializable{
	
	@Id
	@Column(name = "id", nullable = false)
	private String id;
	@Id
	@Column(name = "prod_id")
	private String prod_id;
	@Id
	@Column(name = "prod_seq")
	private String prod_seq;
	
	@Column(name = "fund_name")
	private String fund_name;
	
	@Column(name = "fund_type")
	private char fund_type;
	
	@Column(name = "fund_type_name")
	private String fund_type_name;
	
	@Column(name = "curr")
	private String curr;
	
	@Column(name = "curr_name")
	private String curr_name;
	
	@Column(name = "buy_date")
	private String buy_date;
	
	@Column(name = "amt")
	private Double amt;
	
	@Column(name = "unit")
	private Double unit;
	
	@Column(name = "ref_nav")
	private Double ref_nav;
	
	@Column(name = "ref_nav_date")
	private String ref_nav_date;
	
	@Column(name = "ref_rate")
	private Double ref_rate;
	
	@Column(name = "ref_amt")
	private Double ref_amt;
	
	@Column(name = "ref_income_amt")
	private Double ref_income_amt;
	
	@Column(name = "ref_income_rate")
	private Double ref_income_rate;
	
	@Column(name = "cash_net_return")
	private Double cash_net_return;
	
	@Column(name = "cash_return_rate")
	private Double cash_return_rate;
	
	@Column(name = "profit_point")
	private Double profit_point;
	
	@Column(name = "loss_point")
	private Double loss_point;
	
	@Column(name = "v_sw")
	private char v_sw;
	
	@Column(name = "inv_code")
	private char inv_code;
	
	@Column(name = "fail_cnt")
	private Double fail_cnt;
	@Id
	@Column(name = "kind")
	private char kind;
	
	@Column(name = "risk_attrib")
	private char risk_attrib;
	@Id
	@Column(name = "data_date")
	private Date data_date;
	
	@Column(name = "creator")
	private String creator;
	
	@Column(name = "create_time")
	private Date create_time;
	
	@Column(name = "update_src")
	private String update_src;
	
	@Column(name = "update_time")
	private Date update_time;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProd_id() {
		return prod_id;
	}

	public void setProd_id(String prod_id) {
		this.prod_id = prod_id;
	}

	public String getProd_seq() {
		return prod_seq;
	}

	public void setProd_seq(String prod_seq) {
		this.prod_seq = prod_seq;
	}

	public String getFund_name() {
		return fund_name;
	}

	public void setFund_name(String fund_name) {
		this.fund_name = fund_name;
	}

	public char getFund_type() {
		return fund_type;
	}

	public void setFund_type(char fund_type) {
		this.fund_type = fund_type;
	}

	public String getFund_type_name() {
		return fund_type_name;
	}

	public void setFund_type_name(String fund_type_name) {
		this.fund_type_name = fund_type_name;
	}

	public String getCurr() {
		return curr;
	}

	public void setCurr(String curr) {
		this.curr = curr;
	}

	public String getCurr_name() {
		return curr_name;
	}

	public void setCurr_name(String curr_name) {
		this.curr_name = curr_name;
	}

	public String getBuy_date() {
		return buy_date;
	}

	public void setBuy_date(String buy_date) {
		this.buy_date = buy_date;
	}

	public Double getAmt() {
		return amt;
	}

	public void setAmt(Double amt) {
		this.amt = amt;
	}

	public Double getUnit() {
		return unit;
	}

	public void setUnit(Double unit) {
		this.unit = unit;
	}

	public Double getRef_nav() {
		return ref_nav;
	}

	public void setRef_nav(Double ref_nav) {
		this.ref_nav = ref_nav;
	}

	public String getRef_nav_date() {
		return ref_nav_date;
	}

	public void setRef_nav_date(String ref_nav_date) {
		this.ref_nav_date = ref_nav_date;
	}

	public Double getRef_rate() {
		return ref_rate;
	}

	public void setRef_rate(Double ref_rate) {
		this.ref_rate = ref_rate;
	}

	public Double getRef_amt() {
		return ref_amt;
	}

	public void setRef_amt(Double ref_amt) {
		this.ref_amt = ref_amt;
	}

	public Double getRef_income_amt() {
		return ref_income_amt;
	}

	public void setRef_income_amt(Double ref_income_amt) {
		this.ref_income_amt = ref_income_amt;
	}

	public Double getRef_income_rate() {
		return ref_income_rate;
	}

	public void setRef_income_rate(Double ref_income_rate) {
		this.ref_income_rate = ref_income_rate;
	}

	public Double getCash_net_return() {
		return cash_net_return;
	}

	public void setCash_net_return(Double cash_net_return) {
		this.cash_net_return = cash_net_return;
	}

	public Double getCash_return_rate() {
		return cash_return_rate;
	}

	public void setCash_return_rate(Double cash_return_rate) {
		this.cash_return_rate = cash_return_rate;
	}

	public Double getProfit_point() {
		return profit_point;
	}

	public void setProfit_point(Double profit_point) {
		this.profit_point = profit_point;
	}

	public Double getLoss_point() {
		return loss_point;
	}

	public void setLoss_point(Double loss_point) {
		this.loss_point = loss_point;
	}

	public char getV_sw() {
		return v_sw;
	}

	public void setV_sw(char v_sw) {
		this.v_sw = v_sw;
	}

	public char getInv_code() {
		return inv_code;
	}

	public void setInv_code(char inv_code) {
		this.inv_code = inv_code;
	}

	public Double getFail_cnt() {
		return fail_cnt;
	}

	public void setFail_cnt(Double fail_cnt) {
		this.fail_cnt = fail_cnt;
	}

	public char getKind() {
		return kind;
	}

	public void setKind(char kind) {
		this.kind = kind;
	}

	public char getRisk_attrib() {
		return risk_attrib;
	}

	public void setRisk_attrib(char risk_attrib) {
		this.risk_attrib = risk_attrib;
	}

	public Date getData_date() {
		return data_date;
	}

	public void setData_date(Date data_date) {
		this.data_date = data_date;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public String getUpdate_src() {
		return update_src;
	}

	public void setUpdate_src(String update_src) {
		this.update_src = update_src;
	}

	public Date getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}
	
	
	
	
	
}
