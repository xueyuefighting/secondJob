package com.yonyou.scf.gateway.service;
//package com.yonyou.scf.service;
//
//import java.util.Date;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.yonyou.scf.bean.User;
//import com.yonyou.scf.bean.UserExample;
//import com.yonyou.scf.mapper.UserMapper;
//
//@Service
//public class UserService {
//
//        @Autowired
//        private UserMapper userMappper;
//        
//        public List<User> getEmp(String name){
//
//        	UserExample ue = new UserExample();
//        	ue.createCriteria().andUserNameLike("%" + name + "%");
//            return userMappper.selectByExample(ue);
//        }
//        
//        public User getEmpById(int id){
//            return userMappper.selectByPrimaryKey(id);
//        }
//        
//        public String addEmp(User user) {
//        	
//        	userMappper.insert(user);
//        	//打印插入后的UserId值
//        	System.out.println("new UserId =" + user.getUserId());
//        	return "Success";
//        }
//        
//        public String updEmp(User user) {
//        	
//        	userMappper.updateByPrimaryKey(user);
//        	return "Success";
//        }
//        
//        public String addEmpTest() {
//        	User user = new User();
//        	//user.setUserId(1);
//        	user.setUserAge(20);
//        	user.setUserEmail("duruia@yonyou.com");
//        	user.setUserName("杜瑞");
//        	user.setUserPhone("136****9319");
//        	user.setUserReason("");
//        	user.setUserSex(0);
//        	user.setUserStstus("0");
//        	user.setUserTime(new Date().toString());
//        	user.setUserType(1);
//        	
//        	userMappper.insert(user);
//        	userMappper.insert(user);
//        	userMappper.insert(user);
//        	userMappper.insert(user);
//        	userMappper.insert(user);
//        	
//        	return "Success";
//        }
//        
//        
//        
//        public String delEmp(int id) {
//        	userMappper.deleteByPrimaryKey(id);
//        	return "Success";
//        }
//}