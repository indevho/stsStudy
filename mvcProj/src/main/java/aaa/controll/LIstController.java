package aaa.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import aaa.model.BuyOrder;

@Controller
@RequestMapping("/form/buyOrder")
public class LIstController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String form() {
		return "form/buyOrderForm";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String complete(BuyOrder bo) {
		System.out.println(bo.getProd());
		
		System.out.println(bo);
		return "form/buyOrderComplete";
	}
}
