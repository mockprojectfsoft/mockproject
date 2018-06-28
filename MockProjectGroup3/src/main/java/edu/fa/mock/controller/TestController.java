package edu.fa.mock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.fa.mock.model.Category;
import edu.fa.mock.service.CategoryService;

@Controller
public class TestController {
	
	@Autowired
	CategoryService c;
	
	@RequestMapping(value="/home")
	public String showHome(Model model) {
		List<Category> list = c.getList();
		model.addAttribute("list", list);
		return "home/index";
	}
}
