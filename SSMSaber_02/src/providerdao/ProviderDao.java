package providerdao;

import java.util.List;
import java.util.Map;
import pojo.Provider;

public interface ProviderDao {
	//获得供应商的总数
Integer getProviderCont();
//获得供应的所有信息
List<Provider> showprovider();
//上机练习4,根据供应商id查询其相关信息及其所有的订单列表
List<Provider> getProviderBy(Integer ProviderMap);

}
