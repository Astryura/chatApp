package dta.chat.view.console;

import java.util.ArrayList;
import java.util.List;

public abstract class ViewComposite {

	protected List<ViewComposite> children = new ArrayList<>();

	public void print() {
		children.forEach(vc -> {
			vc.print();
		});
	}
}
