package com.lucas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Welcome {

	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {

		String message = "<br><div style='text-align:center;'>"
				+ "<h3> <font color=7D27D2> Finalmente consegui essa ****</h3>Essa mensagem está vindo do Controller lá que fiz!! </font></div><br><br>";
		return new ModelAndView("welcome", "message", message);
		
		
	}
	@RequestMapping("/inicial")
	public ModelAndView index() {

		String message = "";
		return new ModelAndView("inicial", "message", message);
		
		
	}
	  @RequestMapping("/sucesso")
	  public ModelAndView olamundo() {

			String message = "";
			return new ModelAndView("sucesso", "message", message);
	  }
}