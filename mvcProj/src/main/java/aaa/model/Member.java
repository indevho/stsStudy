package aaa.model;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class Member {

	String pname;
	int age;
	boolean marriage;
	
	MultipartFile upfile1, upfile2;
}
