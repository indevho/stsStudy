package aaa.model;

import java.util.List;

import lombok.Data;

@Data
public class BuyOrder {

	List<Product> prod;
	//<td><input type="text" name="prod[${i }].pid" /></td>
	//으로 인풋을 받는다.
	//컨트롤러에서는 public String complete(BuyOrder bo) {
	//System.out.println(bo.getProd());
	//  bo  가 prod 를 알고 있으므로, index값이 부여된 상태의  prod 객체를 잘알고있음 소름돋게
	// 제너릭만으로 이해를 해버린다.
	// 그러면 StudArr 의 stdarr 도. 컨트롤러리퀘스트매핑은 
	//이해를 해버릴수가있다는힌트.
	Address addr;
}
