package model;

import java.io.Serializable;
import java.util.List;

public class PostMutterLogic implements Serializable {
	public void execute(Mutter mutter, List<Mutter> mutterList) {
		mutterList.add(0,mutter);
	}
}
