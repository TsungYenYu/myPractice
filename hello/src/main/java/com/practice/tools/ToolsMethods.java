package com.practice.tools;

import java.util.ArrayList;
import java.util.Date;

import com.practice.vo.DataPracticeVO;

public class ToolsMethods {

	public DataPracticeVO transform(String[] arr) {
		ArrayList list = new ArrayList();
		DataPracticeVO dataPracticeVO = new DataPracticeVO();

		dataPracticeVO.setId(arr[0].trim());
		dataPracticeVO.setProd_id(arr[1].trim());
		dataPracticeVO.setProd_seq(arr[2].trim());
		dataPracticeVO.setFund_name(arr[3].trim());
		dataPracticeVO.setFund_type(arr[4].trim().charAt(0));
		dataPracticeVO.setFund_type_name(arr[5].trim());
		dataPracticeVO.setCurr(arr[6].trim());
		dataPracticeVO.setCurr_name(arr[7].trim());
		dataPracticeVO.setBuy_date(arr[8].trim());
		dataPracticeVO.setAmt(Double.parseDouble(arr[9].trim()));
		dataPracticeVO.setUnit(Double.parseDouble(arr[10].trim()));
		dataPracticeVO.setRef_nav(Double.parseDouble(arr[11].trim()));
		dataPracticeVO.setRef_nav_date(arr[12].trim());
		dataPracticeVO.setRef_rate(Double.parseDouble(arr[13].trim()));
		dataPracticeVO.setRef_amt(Double.parseDouble(arr[14].trim()));
		dataPracticeVO.setRef_income_amt(Double.parseDouble(arr[15].trim()));
		dataPracticeVO.setRef_income_rate(Double.parseDouble(arr[16].trim()));
		dataPracticeVO.setCash_net_return(Double.parseDouble(arr[17].trim()));
		dataPracticeVO.setCash_return_rate(Double.parseDouble(arr[18].trim()));
		dataPracticeVO.setProfit_point(Double.parseDouble(arr[19].trim()));
		dataPracticeVO.setLoss_point(Double.parseDouble(arr[20].trim()));
		if(arr[21].trim() != null && !"".equals(arr[21].trim())) {
			dataPracticeVO.setV_sw(arr[21].trim().charAt(0));
		}
		if(arr[22].trim() != null && !"".equals(arr[22].trim())) {
			dataPracticeVO.setInv_code(arr[22].trim().charAt(0));
		}
		dataPracticeVO.setFail_cnt(Double.parseDouble(arr[23].trim()));
		
		if(arr[24].trim() != null && !"".equals(arr[24].trim())) {
			dataPracticeVO.setKind(arr[24].trim().charAt(0));
		}
		
		dataPracticeVO.setRisk_attrib(arr[25].trim().charAt(0));
		// dataPracticeVO.setData_date(arr[26].trim());
		dataPracticeVO.setData_date(new Date());
		// dataPracticeVO.setCreator(arr[27].trim());
		// dataPracticeVO.setCreate_time(arr[28].trim());
		// dataPracticeVO.setUpdate_src(arr[29].trim());
		// dataPracticeVO.setUpdate_time(arr[30].trim());
		dataPracticeVO.setCreator("123");
		dataPracticeVO.setCreate_time(new Date());
		dataPracticeVO.setUpdate_src("321");
		dataPracticeVO.setUpdate_time(new Date());
		list.add(dataPracticeVO);
		return dataPracticeVO;
	}
}
