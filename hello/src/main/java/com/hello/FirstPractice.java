package com.hello;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.practice.dao.FirstDAO;
import com.practice.daoImpl.FirstDAOImpl;
import com.practice.tools.ToolsMethods;
import com.practice.vo.DataPracticeVO;

public class FirstPractice {

	@SuppressWarnings("unchecked")
	public static void main(String[] argv) throws IOException {
		FileReader fr = new FileReader("IMS_W36001F_20171023.D");
		FileReader frH = new FileReader("IMS_W36001F_20171023.H");
		BufferedReader br = new BufferedReader(fr);
		BufferedReader brH = new BufferedReader(frH);
		ArrayList list = new ArrayList();
		FirstDAO firstDAO = new FirstDAOImpl();
		ToolsMethods toolsMethods = new ToolsMethods();
		String[] strH = brH.readLine().split("\\|");
		int count = 0;
		int compareDateH = Integer.valueOf(strH[0].trim());// H 日期
		int resultCount = Integer.valueOf(strH[4].trim());// H 筆數
		int compareDateD;
		DataPracticeVO transList;
		while (br.ready()) {
			count++;
			String strTmp = br.readLine();
			String[] arr = strTmp.split("\\|");
			if(!"".equals(arr[8].trim())) {
				compareDateD = Integer.valueOf(arr[8].trim());
				System.out.println(arr[8].trim());
			}else {
				compareDateD = 0;
//				System.out.println("No value");
			}
			
			if (compareDateD == compareDateH) {
				System.out.println("compare right");
				transList = toolsMethods.transform(arr);
				list.add(toolsMethods.transform(arr));
			}else {
				System.out.println("compare wrong");
			}
		}
		if (resultCount == count) {
			firstDAO.insert(list);
			System.out.println("count works");
		}
		brH.close();
		br.close();
		frH.close();
		fr.close();
	}
}

// test------------------------------------------
// TestTableVO testTableVO = new TestTableVO();
// testTableVO.setId("c");
//
// firstDAO.testInsert(testTableVO);
