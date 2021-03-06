package aaa.controll;

import java.io.File;
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
		
		System.out.println("=======================");
		System.out.println(mm.getUpfile2().getOriginalFilename());
		
//		 파일을 검사한다? 검사해서 존재하면 mm에다가 좀 다른걸 달아올린다.
		
		
		fileSave(mm.getUpfile1(), req);
				//Multipartfile // 리퀘스트
		
		mm.setUp2(fileSave2(mm.getUpfile2(),req));
		
		
		
		return "file/com_3";
	}
	
	
	
	
	
	
	void fileSave(MultipartFile mf, HttpServletRequest request) {
		String path =request.getRealPath("up"); // 배포용 path값.
		path = "C:\\Users\\unoes\\Documents\\s\\springWork\\mvcProj\\src\\main\\webapp\\up";
		
		try {
			FileOutputStream fos = new FileOutputStream(path+"\\"+mf.getOriginalFilename());
			
			// 이 쓰는 과정에[서 아니  fos 에서. 먼가 이부분에서 제목을 바꿔준 뒤에 . 
			//fot 의 값을 바꾸어 주도록 해야것네. 
			
			
			
			fos.write(mf.getBytes());
			
			
			
			
			fos.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	
	String fileSave2(MultipartFile mf, HttpServletRequest request) {
		String path = request.getRealPath("up");
		path = "C:\\Users\\unoes\\Documents\\s\\springWork\\mvcProj\\src\\main\\webapp\\up";
		
		int pos = mf.getOriginalFilename().lastIndexOf(".");
		
		String fname = mf.getOriginalFilename();
		String domain = fname.substring(0,pos);
		String ext = fname.substring(pos);
		
		int no = 0;
		
		try {
			File ff = new File(path+"\\"+fname);
			while(ff.exists()) {
				no++;
				fname=domain+no+ext;
				ff = new File(path+"\\"+fname);
			}
			
			
			
			
			FileOutputStream fos = new FileOutputStream(ff);
			
			fos.write(mf.getBytes());
			
			fos.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return fname;
	}
	
	
		
	
}
