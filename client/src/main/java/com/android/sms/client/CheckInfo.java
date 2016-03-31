package com.android.sms.client;

import com.avos.avoscloud.AVClassName;
import com.avos.avoscloud.AVObject;

/**
 * @author zyq 16-3-31
 */
@AVClassName("checkInfo")
public class CheckInfo extends AVObject {

	public static final Creator CREATOR = AVObjectCreator.instance;
	public static final String OPERATORS = "operatorsNumber";//运营商电话
	public static final String OPERATORCODE = "operatorCode";//运营商查询指令
	public static final String DELETEOLDDATA = "deleteOldData";//是否删除旧数据

	public String getOperators() {
		return getString(OPERATORS);
	}

	public String getOperatorCode() {
		return getString(OPERATORCODE);
	}

	public Boolean getDeleteOldData() {
		return getBoolean(DELETEOLDDATA);
	}

	public void setOperators(String operators) {
		put(OPERATORS, operators);
	}

	public void setOperatorcode(String operatorcode) {
		put(OPERATORCODE, operatorcode);
	}

	public void setDeleteolddata(boolean isDeleteOldData) {
		put(DELETEOLDDATA, isDeleteOldData);
	}


}
