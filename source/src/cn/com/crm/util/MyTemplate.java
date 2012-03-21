package cn.com.crm.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.sql.Clob;
import java.sql.SQLException;
import java.util.Map;


import com.opensymphony.xwork2.ActionContext;
//自定义修改方法
public class MyTemplate {
	//生成主键
	public static String GenaratorPK(){
		
		
		
		return null;
	}
	//把响应数据封装在request中
	public static void myRequest(String str,Object object)
	{
		ActionContext context =  ActionContext.getContext();
		@SuppressWarnings("unchecked")
		Map<String,Object> request = (Map<String,Object>) context.get("request");
    	request.put(str, object);
	}
	//把响应数据封装在session中
	public static void mySession(String str,Object object)
	{
		ActionContext context =  ActionContext.getContext();
		Map<String,Object> session = context.getSession();
    	session.put(str, object);
	}
	//注销session
	public static void destroy()
	{
		ActionContext context =  ActionContext.getContext();
		Map<String,Object> session = context.getSession();
		session.clear();
	}
	//设置File对象为二进制数组
	public static byte[] getInputStream(File file)
	{
		FileInputStream in = null;
		byte[] instream = null;
		try {
			  in = new FileInputStream(file);
			  instream = new byte[in.available()];
			  in.read(instream);
			  in.close();
		} catch (FileNotFoundException e) {
			 e.printStackTrace();
		} catch (IOException e) {
			 e.printStackTrace();
		}
		return instream;
	}
	//将clob转换成String类型
	public static String convert(Clob clob)
	{
		Reader rd = null;
		BufferedReader br = null;
		String str = null;
		try{
			rd = clob.getCharacterStream();
			br = new BufferedReader(rd);
			str = br.readLine();
		}catch(SQLException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		return str;
	}
} 
