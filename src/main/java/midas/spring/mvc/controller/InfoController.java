package midas.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/info")
public class InfoController {
	
	@RequestMapping ("/controller")
	public ModelAndView informacao()
	{
		return new ModelAndView("/info/informacao");
	}

}
