package org.redfox.zufun51.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewTest {

	@RequestMapping("/init")
	public String init(Model model){
		return "init";
	}
}
