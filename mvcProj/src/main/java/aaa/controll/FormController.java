package aaa.controll;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import aaa.model.Member;
import aaa.model.Stud;

@Controller
public class FormController {

	@RequestMapping(value = "/form/join", method = RequestMethod.GET)
	public String form() {
		System.out.println("form 진입");
		
		return "form/joinForm";
	}
	
	
	@RequestMapping(value = "/form/join", method = RequestMethod.POST)
	public String submitttt(
			@RequestParam("pname") String pname,
			@RequestParam("age") int age,
			@RequestParam("marriage") boolean marriage,
			HttpServletRequest req,
			Member mm,
			@ModelAttribute("mem") Member mem
			//,Member member
			
	) {
		System.out.println("submitttt 진입:"+pname+","+age+","+marriage);
		System.out.println("request:"+
				req.getParameter("pname")+","+
				req.getParameter("age")+","+
				req.getParameter("marriage"));
		System.out.println("mm:"+mm);
		System.out.println("mem:"+mem);
		return "form/joinReg";
		
		
		/*
	     *   폼입력 : 이름, 국어,영어,수학
	     * 
	     * 출력 : 이름, 국어,영어,수학, 총점, 평균, 등급
	     * 
	     * */
	}
	
	
	@RequestMapping(value = "/form/stud", method = RequestMethod.GET)
	public String studform(Model mm) {
		System.out.println("form 진입");
		
		mm.addAttribute("st", new Stud());
		
		return "form/studForm";
	}
	
	
	@RequestMapping(value = "/form/stud", method = RequestMethod.POST)
	public String studsubmitttt(Stud st) {
		
		st.calc();
		
		return "form/studReg";
		
	}
}
