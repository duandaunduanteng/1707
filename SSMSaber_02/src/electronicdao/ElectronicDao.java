package electronicdao;


import java.sql.SQLException;
import java.util.List;

import pojo.Electronic;

public interface ElectronicDao {
	//查询出厂日期在2015年后的电子设备
	List<Electronic> getelectronic() throws SQLException;
	//添加电子设备
	public int add(Electronic electronic);
}
