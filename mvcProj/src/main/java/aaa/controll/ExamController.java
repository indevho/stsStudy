package aaa.controll;

import java.util.Arrays;
import java.util.TreeSet;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import aaa.model.Stud;
import aaa.model.StudArr;

@Controller
@RequestMapping(value = "/form/exForm")
public class ExamController {
	@RequestMapping(method = RequestMethod.GET)
	public String exForm(Model mod) {
		System.out.println("exForm");
		Stud stu = new Stud();
		mod.addAttribute("std", stu);
		mod.addAttribute("subs", stu.getTitles().length);

		return "form/exForm";// view form exForm jsp

	}

	@RequestMapping(method = RequestMethod.POST)
	public String exSbmt(StudArr st) {// setstdarr
		//stdarr알고있어.
		System.out.println("자료개수:"+st.getStdarr().length);
		System.out.println(st.getStdarr()[0].getPname());
		System.out.println(Arrays.toString(st.getStdarr()[0].getJum()));
		System.out.println("exSubmit 점수등록했습니다.");
		for (Stud stu : st.getStdarr()) {
			stu.calc();
			st.setStset(new TreeSet<>());
			st.getStset().add(stu);
		}
		for (Stud stu : st.getStdarr()) {
			stu.rankC(st.getStdarr());
		}
		// 다넣고.
		System.out.println(st.getStset());
		System.out.println(st.getStset().size());

		return "form/exRes";

	}

}
