package electronicdao;


import java.sql.SQLException;
import java.util.List;

import pojo.Electronic;

public interface ElectronicDao {
	//��ѯ����������2015���ĵ����豸
	List<Electronic> getelectronic() throws SQLException;
	//��ӵ����豸
	public int add(Electronic electronic);
}
