package aaa.controll;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	   @RequestMapping("/home")
	   //@ResponseBody
	   public String home(Model mm) {
	      
	                  //이름   ,  데이터
	      mm.addAttribute("data",new Date());
	      
	      System.out.println("home 진입");
	      return "/homee";


}
}
