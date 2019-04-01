

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {
	public static SqlSessionFactory factory;
	static{
		try {
			InputStream is=Resources.getResourceAsStream("mybatis-config.xml");
			factory=new SqlSessionFactoryBuilder().build(is);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public static SqlSession createSqlSession() {
		return factory.openSession(false);//trueΪ�Զ��ύ
		
	}
	public static void closeSqlSession(SqlSession sqlsession) {//�ر�
		if(null!=sqlsession)
			sqlsession.close();
	}
	
}
