package providerdao;

import java.util.List;
import java.util.Map;
import pojo.Provider;

public interface ProviderDao {
	//��ù�Ӧ�̵�����
Integer getProviderCont();
//��ù�Ӧ��������Ϣ
List<Provider> showprovider();
//�ϻ���ϰ4,���ݹ�Ӧ��id��ѯ�������Ϣ�������еĶ����б�
List<Provider> getProviderBy(Integer ProviderMap);

}
