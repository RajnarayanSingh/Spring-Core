package springmvc.controller;

import java.time.LocalDateTime;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/rajnarayan")
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("Tis is ome URL");
		model.addAttribute("name","Rajnarayan singh Tamkuhiraj");
		List<String> friends= new ArrayList<String>();
		friends.add("Rahul");
		friends.add( "Ramesh");
		model.addAttribute("f",friends);
		return "index";
	}
	@RequestMapping("/about")
	public String about() {
		System.out.println("Tis is about URL");
		return "about";
	}
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("This is help Controller console");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name", "Uttam");
		modelAndView.addObject("rollnumber", "12046");
		LocalDateTime now =  LocalDateTime.now();
		
		modelAndView.addObject("time", now);
		modelAndView.setViewName("help");
		return modelAndView;
	}
}
