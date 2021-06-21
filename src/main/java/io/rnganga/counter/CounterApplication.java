package io.rnganga.counter;

import javax.servlet.http.HttpSession;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller

@RequestMapping("/your_server")
public class CounterApplication {

	public static void main(String[] args) {
		SpringApplication.run(CounterApplication.class, args);
	}
	
	@RequestMapping("")
	public String home(HttpSession session, Model model) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		} else {
			Integer count = (Integer) session.getAttribute("count");
			session.setAttribute("count", count+1);
		}
		return "index.jsp";
	}

	@RequestMapping("/counter")
	public String counter(HttpSession session, Model model) {
		if (session.getAttribute("count") == null) {
			model.addAttribute("count", 0);
		} else {
			model.addAttribute("count", (Integer) session.getAttribute("count"));
		}
		return "counter.jsp";
	}
}
