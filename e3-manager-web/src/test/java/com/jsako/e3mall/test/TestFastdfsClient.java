package com.jsako.e3mall.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.csource.common.MyException;
import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.junit.Test;

import com.jsako.e3mall.common.utils.FastdfsClient;

public class TestFastdfsClient {
	
	@Test
	public void testFastDfsClient1() throws FileNotFoundException, IOException, MyException{
		//1、创建一个配置文件。文件名任意，内容tracker服务器的地址
		//2、使用一个全局对象加载配置文件
		//ClientGlobal.init("E:\\e3ShopSystemRepository\\e3-manager-web\\src\\main\\resources\\conf\\fastdfs.conf");
		//3、创建一个TrackerClient对象
		//TrackerClient trackerClient=new TrackerClient();
		//4、通过TrackerClient获得一个TrackerServer
		//TrackerServer trackerServer = trackerClient.getConnection();
		//5、创建StorageServer的应用，可以为null
		//6、创建一个StorageClient，参数需要TrackerServer和StorageServer
		//StorageClient storageClient=new StorageClient();
		//7、使用StorageClient上传文件
		//String[] upload_file = storageClient.upload_file("C:/Users/Administrator/Desktop/photo/01300001024098149749325179620.jpg", "jpg", null);
//		for (String string : upload_file) {
//			System.out.println(string);
//		}
	}
	
	@Test
	public void test2(){
//		String path = Test.class.getResource("/").getPath();
//		System.out.println(path);
	}
	
	@Test
	public void testFastDfsClient2(){
		try {
			byte[] file_buff = IOUtils.toByteArray(new FileInputStream("C:/Users/Administrator/Desktop/photo/01300000370062123963969358616.jpg"));
			String upload = new FastdfsClient().upload(file_buff, "jpg");
			System.out.println(upload);
			
			file_buff= IOUtils.toByteArray(new FileInputStream("C:/Users/Administrator/Desktop/photo/90f58663jw1e35ghg7sm3j.jpg"));
			upload=new FastdfsClient().upload(file_buff, "jpg");
			System.out.println(upload);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
