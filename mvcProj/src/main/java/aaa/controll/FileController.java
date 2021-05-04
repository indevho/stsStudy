package aaa.controll;

import java.io.FileOutputStream;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import aaa.model.Member;

@Controller
public class FileController {
	
	// 여기 오는 모든 form 은  enctype 이 멀티파트이다.

	@RequestMapping("/file/upload")
	public String form() {
		return "file/uploadForm";
	}
	
	

	@RequestMapping("/file/complete1")
	public String comp1( 
			@RequestParam("pname")String pname,
			@RequestParam("age")Integer age,
			@RequestParam("upfile1")MultipartFile up1,
			@RequestParam("upfile2")MultipartFile up2,
			HttpServletRequest req,
			Model mod
			
			) {

		System.out.println("com1:"+pname+","+age+","+up1+","+up2);
		System.out.println(up1.getOriginalFilename());//이미지  2021 05 03 21 00 001.jpg
		System.out.println(up1.getName());//upfile1
		System.out.println(up1.getContentType()); // image/jpeg
		System.out.println(up1.getSize());//227015
		System.out.println(up1.isEmpty());//false
		System.out.println(up1.getResource());//MultipartFile resource [upfile1]
		System.out.println(up2.getOriginalFilename());
		//파일 이름을 보내구 싶네?
		
		mod.addAttribute("up1",up1.getOriginalFilename());
		mod.addAttribute("up2",up2.getOriginalFilename());
		
		
		String path =req.getRealPath("up"); // 배포용 path값.
		//path = "C:\\Users\\unoes\\Documents\\s\\springWork\\mvcProj\\src\\main\\webapp\\up";
		
		try {
			FileOutputStream fos = new FileOutputStream(path+"\\"+up1.getOriginalFilename());
			
			fos.write(up1.getBytes());
			fos.close();// 이게 나은가요?
			fos = new FileOutputStream(path+"\\"+up2.getOriginalFilename());
			
			fos.write(up2.getBytes());
			fos.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		fileSave(up1, req);
		
		
		return "file/com_1";
	}

	@RequestMapping("/file/complete2")
	public String com2(
			MultipartHttpServletRequest mr,
			Model mm
	) {
		MultipartFile up1 = mr.getFile("upfile1");
		MultipartFile up2 = mr.getFile("upfile2");
		
		String pname = mr.getParameter("pname");
		String age = mr.getParameter("age");
		
		mm.addAttribute("up1",up1.getOriginalFilename());
		mm.addAttribute("up2",up2.getOriginalFilename());
		
		System.out.println("com2:"+pname+","+age+","+up1+","+up2);
		System.out.println(up1.getOriginalFilename());
		
		fileSave(up1, mr);
		fileSave(up2, mr);// 둘다 올라가려면./

		return "file/com_1";
	}
	
	
	@RequestMapping("/file/complete3")
	public String comp3( Member mm,
			HttpServletRequest req
			
			) {

		System.out.println("com3:"+mm);
		System.out.println(mm.getUpfile1().getOriginalFilename());	
		System.out.println(mm.getUpfile1().getName());	

		System.out.println(mm.getUpfile2().getOriginalFilename());	
		
		fileSave(mm.getUpfile1(), req);
		
		
		
		
		
		return "file/com_3";
	}
	
	
	
	
	
	
	void fileSave(MultipartFile mf, HttpServletRequest request) {
		String path =request.getRealPath("up"); // 배포용 path값.
		path = "C:\\Users\\unoes\\Documents\\s\\springWork\\mvcProj\\src\\main\\webapp\\up";
		
		try {
			FileOutputStream fos = new FileOutputStream(path+"\\"+mf.getOriginalFilename());
			
			
			
			fos.write(mf.getBytes());
			
			
			
			
			fos.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
}
