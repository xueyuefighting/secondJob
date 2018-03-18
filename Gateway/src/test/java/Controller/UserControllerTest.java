//package Controller;
//
//import javax.annotation.Resource;
//
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.SpringApplicationConfiguration;
//import org.springframework.hateoas.MediaTypes;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.web.WebAppConfiguration;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.MvcResult;
//import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//
//import com.yonyou.scf.gateway.App;
//
//////SpringJUnit支持，由此引入Spring-Test框架支持！
//@RunWith(SpringJUnit4ClassRunner.class)
//////指定我们SpringBoot工程的Application启动类
//@SpringApplicationConfiguration(classes = App.class)
/////由于是Web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上@WebAppConfiguration。
//@WebAppConfiguration
//public class UserControllerTest {
//    @Resource
//  //  private UserController ut;
//
//    @Test
//    public void testGetName(){
//          // Assert.assertEquals(4,ut.likeName("杜瑞", 1, 5).size());
//    }
//    
//    @Test
//    public void testGetNameByUrl(){
//    	String uri = "/SERVICE/EMP";
//    	MockMvc mvc;
//    	MockHttpServletRequestBuilder build = MockMvcRequestBuilders.get(uri);
//    	build.accept("*/*");
//    	build.header("Method", "post");
//    	build.contentType("application/json;charset=UTF-8");
//    	
//    	MvcResult result = null;
//    	
//         //  Assert.assertEquals(4,ut.likeName("杜瑞", 1, 5).size());
//    }
//}
