package billdao;

import java.util.List;
import java.util.Map;

import pojo.Bill;


public interface BillDao {
	//�ϻ���ϰһ
		 List<Bill> getbillBy(Map<Object,Object> userMap);
	
}
