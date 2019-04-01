import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.HashMap;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.Test;
import billdao.BillDao;
import dao.UserDao;
import pojo.User;
import pojo.Address;
import pojo.Bill;
import pojo.Electronic;
import pojo.Provider;
import providerdao.ProviderDao;
import electronicdao.ElectronicDao;
public class TestMybatis {
	private static Logger log=Logger.getLogger(TestMybatis.class);
	@Test
		public void getProviderCont() throws Exception{
			InputStream in=Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactory as=new SqlSessionFactoryBuilder().build(in);
			SqlSession SE=as.openSession();
			int cont=SE.getMapper(ProviderDao.class).getProviderCont();
			System.out.println("����Ϊ"+cont);
		}
	//������
	@Test
	public void testUserCount() throws IOException { 
		InputStream is = Resources.getResourceAsStream("mybatis-config.xml");//
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is) ;//���칤��
		SqlSession session = factory.openSession() ;//��������ģʽ
		
		int count = session.getMapper(UserDao.class).getUserCount() ;//�������
	
		System.out.println("�û�����Ϊ��"+count);
	}
	//���user���е�������Ϣ
	@Test
	public void showUserList() {   
		SqlSession sqlsession=null;
		List<User> userlist=null;
		try {
			sqlsession=MyBatisUtil.createSqlSession();
			//����userdao�е�showuserlist�ӿ�
			userlist=sqlsession.getMapper(UserDao.class).showUserList();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			MyBatisUtil.closeSqlSession(sqlsession);
		}
		for(User user:userlist) {
			//logger.debug("testGetUserList userCode"+user.getUserCode()+"and userName:"+user.getUserName());
			System.out.println(user.toString());
		}
	}
	//��ù�Ӧ�̵�������Ϣ
	@Test
	public void showprovider() {
		SqlSession sqlsession=null;
		List<Provider> providerlist=null;
		try {
			sqlsession=MyBatisUtil.createSqlSession();
			providerlist=sqlsession.getMapper(ProviderDao.class).showprovider();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			MyBatisUtil.closeSqlSession(sqlsession);
		}
		for(Provider pro:providerlist) {
			System.out.println(pro.toString());
		}
	}
	//��ѯ����������2015���ĵ����豸
	@Test
	public void getelectronic() throws SQLException{
		SqlSession sqlsession=null;
		List<Electronic> ele=new ArrayList<Electronic>();
		try {
			sqlsession=MyBatisUtil.createSqlSession();
			ele=sqlsession.getMapper(ElectronicDao.class).getelectronic();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			MyBatisUtil.closeSqlSession(sqlsession);
		}
		for(Electronic el:ele) {
			System.out.println(el.toString());
		}
	}
	//���
	@Test
	public void add() {
		SqlSession sqlsession=null;
		int cont=0;
		try {
			sqlsession=MyBatisUtil.createSqlSession();
			User user=new User();
			user.setUserCode("test001");
			user.setUserName("������");
			user.setUserPassword("852369");
			user.setGender(1);
			Date birthday=new SimpleDateFormat("yyyy-MM-dd").parse("2015-12-23");
			user.setBirthday(birthday);
			user.setPhone("15234597158");
			user.setAddress("����ʥ��");
			user.setUserRole(2);
			user.setCreatedBy(2);
			Date cdate=new SimpleDateFormat("yyyy-MM-dd").parse("2018-12-14");
			user.setCreationDate(cdate);
			user.setModifyBy(1);
			Date mdate=new SimpleDateFormat("yyyy-MM-dd").parse("2019-01-21");
			user.setModifyDate(mdate);
			cont=sqlsession.getMapper(UserDao.class).add(user);
			sqlsession.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			sqlsession.rollback();
			cont=0;
		}finally {
			MyBatisUtil.closeSqlSession(sqlsession);
			System.out.println("cont add"+cont);
		}
	}
	//�����޸�
	@Test
	public void get() {
		SqlSession sqlsession=null;
		int cont=0;
		try {
			sqlsession=MyBatisUtil.createSqlSession();
			User user=new User();
			user.setId(84);
			user.setUserCode("test001");
			cont=sqlsession.getMapper(UserDao.class).get(user);
			sqlsession.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			sqlsession.rollback();
			cont=0;
		}finally { 
			MyBatisUtil.closeSqlSession(sqlsession);
			System.out.println("cont get"+cont);
		}
	}
	//ģ����ѯ
	@Test
	public void getListBy() {
		SqlSession con=null;
		List<User> userList=new ArrayList<User>();
		try { 
			con=MyBatisUtil.createSqlSession();
			User user=new User();
			user.setUserName("��");
			userList=con.getMapper(UserDao.class).getListBy(user);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			MyBatisUtil.closeSqlSession(con); 
		}
		for(User el:userList) {
			System.out.println(el.getUserName());
		}
	}
	//ģ����ѯ��
	@Test
	public void getListBuy() {
		SqlSession sql=null;
		List<User> us=new ArrayList<User>();
		try {
			sql=MyBatisUtil.createSqlSession();
			User u=new User();
			u.setUserName("��");
			us=sql.getMapper(UserDao.class).getListBuy(u);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			MyBatisUtil.closeSqlSession(sql);
		}
		for(User as:us) {
			System.out.println(as.getUserName());
		}
	}
	//������
	@Test
	public void getListin() {
		SqlSession session=null;
		List<User> userList=null;
		User user=new User();
		user.setUserName("��");
		user.setAddress("����");
		try {
			session=MyBatisUtil.createSqlSession();
			userList=session.getMapper(UserDao.class).getListin(user);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();  
		}finally {
			MyBatisUtil.closeSqlSession(session);
		}
		for(User er:userList) {
			System.out.println(er.getUserName()+er.getUserCode()+er.getRoleName());
		}
	}
	//�ڶ���ʾ��5,�ڸ���������������
	@Test
	public void getListMap() {
		SqlSession session=null;
		List<User> userList=null;
		Map<Object,Object> usermap= new HashMap<Object,Object>();
		usermap.put("name", "��");
		usermap.put("address", "����");
		
		try {
			session=MyBatisUtil.createSqlSession();
			userList=session.getMapper(UserDao.class).getListMap(usermap);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			MyBatisUtil.closeSqlSession(session);
		}
		for(User er:userList) {
			System.out.println(er.getUserName()+er.getAddress());
		}
	}
	//ɾ������
	@Test
	public void delete() {
		SqlSession ion=null;
		Integer con = 0;
		try {
			ion=MyBatisUtil.createSqlSession();
			con=ion.getMapper(UserDao.class).delete(87);
			ion.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			ion.rollback();
			con=0;
		}finally {
			MyBatisUtil.closeSqlSession(ion);
			log.info(con);
		}
		
	}
	//ass�����û�id��ѯ�û���,�ڶ���ʾ��21
	@Test
	public void getuserlistbyrole() {
		SqlSession session=null;
		List<User> userList=new ArrayList<User>();
		//User user=new User();
		//user.setUserName("��");
		//user.setAddress("����");
		Integer roleid=3;
		try {
			session=MyBatisUtil.createSqlSession();
			userList=session.getMapper(UserDao.class).getuserlistbyrole(roleid);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			MyBatisUtil.closeSqlSession(session);
		}
		/*for(User er:userList) {
			System.out.println(er.getUserName()+er.getAddress()+er.getRoleName());
		}*/
		log.info(userList);
	}
	//�ڶ����ϻ���ϰ1,3
	@Test
	public void getbillBy() {
		SqlSession session=null;
		List<Bill> billlist=null;
		Map<Object,Object> billmap= new HashMap<Object,Object>();
		billmap.put("productName", "��");
		billmap.put("proCode", "BJ_GYS001");
		billmap.put("isPayment"," 2");
		try {
			session=MyBatisUtil.createSqlSession();
			billlist=session.getMapper(BillDao.class).getbillBy(billmap);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			MyBatisUtil.closeSqlSession(session);
		}
		for(Bill bi:billlist) {
			//System.out.println(bi.toString());
			System.out.println("��������:"+bi.getBillCode()+"��Ʒ����:"+bi.getProductName()+"��Ӧ������:"+bi.getProName()+"��Ӧ����ϵ��:"+bi.getProContact()+"�˵����:"+bi.getTotalPrice()+"�Ƿ񸶿�:"+bi.getIsPayment()+"����ʱ��:"+bi.getCreationDate());
		}
	}
	//�ϻ���ϰ4
	@Test
	public void getPrviderBy() {
		SqlSession session=null;
		List<Provider> prolist=null;
		//Map<Object,Object> promap= new HashMap<Object,Object>();
		
		//promap.put("id", "1");
		Integer promap=1;
		try {
			session=MyBatisUtil.createSqlSession();
			prolist=session.getMapper(ProviderDao.class).getProviderBy(promap);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
		finally {
			MyBatisUtil.closeSqlSession(session);
		}
		for(Provider pro:prolist) {
			log.info(pro.getId()+"  "+pro.getProCode()+"  "+pro.getProName()+"  "+pro.getProContact()+" "+pro.getProPhone()+"  "+pro.getBilllist());
		}
	}
	/*
	 * ʾ��25
	 * �����û�id��ȡ�û���Ϣ����ַ�б�
	 * */
	/*@Test
	public void getAddressListByUserId() {
		SqlSession session=null;
		List<User> userlist=new ArrayList<User>();
		Integer userid=1;
		try {
			session=MyBatisUtil.createSqlSession();
			userlist=session.getMapper(UserDao.class).getAddressListByUserId(userid);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			MyBatisUtil.closeSqlSession(session);
		}
		for(User user:userlist) {
			log.info(user.getUserCode()+user.getUserName());
			for(Address address:user.getAddresslist()) {
				log.info(address.getId()+address.getContact()+address.getAddressDesc()+address.getTel()+address.getPostCode());
			}
		}
	}*/
	/*
	 * ʾ��27
	 * �����û�id��ȡ�û���Ϣ����ַ�б�
	 * */
	@Test
	public void getAddressListByUserId() {
		SqlSession session=null;
		//List<User> userlist=new ArrayList<User>();
		User user =null;
		Integer userid=1;
		try {
			session=MyBatisUtil.createSqlSession();
			user=session.getMapper(UserDao.class).getAddressListByUserId(userid);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			MyBatisUtil.closeSqlSession(session);
		}
		if(null!=user) {  
			log.info(user.getUserCode()+user.getUserName()+user.getUserPassword());
			if(user.getAddresslist().size()>0) {
				for(Address address:user.getAddresslist()) {
					log.info(address.getId()+address.getContact()+address.getTel()+address.getPostCode());
				}
			}
		}
	}
}



