//package com.angular_springmvc.util;
//
//import java.io.IOException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//import org.codehaus.jackson.JsonGenerator;
//import org.codehaus.jackson.JsonProcessingException;
//import org.codehaus.jackson.map.JsonSerializer;
//import org.codehaus.jackson.map.SerializerProvider;
//
///**  
// *	解决SpringMVC使用@ResponseBody返回json时，日期格式默认显示为时间戳的问题。
// *	必须为yyyy-MM-dd HH:mm:ss格式才可传给<input type="date"/>日期控件
// */
//
//public class CustomDateSerializer extends JsonSerializer<Date> {
//	@Override
//	public void serialize(Date value, JsonGenerator gen, SerializerProvider pro) throws IOException, JsonProcessingException {
//		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
//		String formattedDate = formatter.format(value);
//		gen.writeString(formattedDate);
//	} 
//}
