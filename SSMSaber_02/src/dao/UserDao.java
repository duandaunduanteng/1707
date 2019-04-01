package dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import pojo.User;

public interface UserDao {

	//获取用户总数�?
	Integer getUserCount() ;
	//获取所有用户
	User getUserList();
	//获取所用用户名的第二种方法
	List<User> showUserList();                 
	//添加用户信息
	int add(User user);
	//修改用户信息
	int get(User user);
	//模糊查询
	List<User> getListBy(User userName);
	//模糊查询1
	List<User> getListBuy(User userName);
	//多条件查询
	List<User> getListin(User user);
	//多条件查询Map
	List<User> getListMap(Map<Object,Object> userMap);
	//删除
	int delete(Integer id);          
	//根据角色id查询角色名称
	List<User> getuserlistbyrole(@Param("userRole")Integer roleid);
	//根据用户id获取用户信息及地址列表,可将User替换成数组形式List<User>,不过在测试类中方法需要更改为注释的那部分代码
	User getAddressListByUserId(@Param("id")Integer userId);
}                                                                                                   
