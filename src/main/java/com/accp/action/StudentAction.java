package com.accp.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.accp.pojo.Student;

@Controller
public class StudentAction {

	@GetMapping("/c/dome")
	public String showN(Model model) {
		model.addAttribute("data","访问");
		List<Student> list = new ArrayList<Student>(0);
		list.add(new Student("a", new Date(), 1));
		list.add(new Student("b", new Date(), 2));
		list.add(new Student("c", new Date(), 1));
		//list.clear();
		model.addAttribute("list",list);
		return "NewFile";
	}
	
	@GetMapping("/c/del")
	public String delN(String name) {
		System.out.println("移除"+name);
		return "redirect:/c/dome";
		
	}
	
}
