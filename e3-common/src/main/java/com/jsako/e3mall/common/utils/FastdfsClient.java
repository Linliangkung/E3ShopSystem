package com.jsako.e3mall.common.utils;

import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

import javax.sound.sampled.LineListener;

import org.csource.common.MyException;
import org.csource.common.NameValuePair;
import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient1;
import org.csource.fastdfs.StorageServer;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;

public class FastdfsClient {
	
	private StorageClient1 client;
	
	static{
		try {
			String path = FastdfsClient.class.getResource("/conf/fastdfs.conf").getPath();
			ClientGlobal.init(path);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public FastdfsClient() throws Exception {
			TrackerClient trackerClient=new TrackerClient();
			TrackerServer trackerServer = trackerClient.getConnection();
			StorageServer storageServer =trackerClient.getStoreStorage(trackerServer);
			client=new StorageClient1(trackerServer, storageServer);
	}
	
	public  String upload(byte[] file_buff,String file_ext_name,Map<String, String> meta_list) throws Exception{
		NameValuePair[] pairs=null;
		if(meta_list!=null&&meta_list.size()>0){
			pairs=new NameValuePair[meta_list.size()];
			int index=0;
			NameValuePair pair=null;
			for(Entry<String, String> entry:meta_list.entrySet()){
				pair=new NameValuePair(entry.getKey(), entry.getValue());
				pairs[index++]=pair;
			}
		}
		return client.upload_file1(file_buff, file_ext_name, pairs);
	}
	
	
	public String upload(byte[] file_buff,String file_ext_name) throws Exception{
		return this.upload(file_buff, file_ext_name, null);
	}
	
	
	public String upload(byte[] file_buff) throws Exception{
		return this.upload(file_buff, null, null);
	}
}
