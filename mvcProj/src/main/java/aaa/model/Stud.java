package aaa.model;

import lombok.Data;

@Data
public class Stud implements Comparable<Stud>{
	String title="국어,영어,수학";
	String pname, grade;
	Integer [] jum;
	// int, integer >> 차이무엇?
	int tot,avg,rank;
	
	public void calc() {
		System.out.println("calc시작");
		tot=0;
		for (Integer integer : jum) {
			tot+= integer;
		}
		
		avg=tot / jum.length;
		
		grade= "가가가가가가양미우수수".charAt(avg/10)+"";
		
	}
	
	
	
	
	public String[] getTitles() {
		System.out.println("과목명출력");
		return title.split(",");
	}
	
	public void rankC(Stud [] allStuds) {
		
		rank=1;
		for (Stud othr : allStuds) {
			if(avg<othr.avg) {
				rank++;
			}
		}
	}




	@Override
	public int compareTo(Stud o) {
		int res;
		if(this.avg== o.avg) {
			return 1;
		}
		res= this.avg-o.avg;
		return res;
	}
	
	
	
}

