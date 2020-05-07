package kr.multi.bigdataShop.board;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


@Service
public class FileUploadLogic {
	FileOutputStream fos;
	public void upload(MultipartFile file,String path,String fileName){
		try {
			byte[] data = file.getBytes();
			fos = 
			new FileOutputStream(path+File.separator+fileName);
			fos.write(data);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(fos!=null)fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}









