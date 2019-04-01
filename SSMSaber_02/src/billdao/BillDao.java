package billdao;

import java.util.List;
import java.util.Map;

import pojo.Bill;


public interface BillDao {
	//ио╩За╥о╟р╩
		 List<Bill> getbillBy(Map<Object,Object> userMap);
	
}
