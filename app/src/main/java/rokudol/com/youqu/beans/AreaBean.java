package rokudol.com.youqu.beans;

import java.util.List;

/**
 * Created by rokudo on 2017/4/18.
 */

public class AreaBean {
	/*
	* @param noMore:没有更多数据
	* @param nameList:地区名称
	* @param idList:地区id
	* */
	private List<String> noMore;
	private List<String> nameList;
	private List<String> idList;

	public List<String> getNoMore() {
		return noMore;
	}

	public void setNoMore(List<String> noMore) {
		this.noMore = noMore;
	}

	public List<String> getNameList() {
		return nameList;
	}

	public void setNameList(List<String> nameList) {
		this.nameList = nameList;
	}

	public List<String> getIdList() {
		return idList;
	}

	public void setIdList(List<String> idList) {
		this.idList = idList;
	}
}
