package com.urbanvn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/")
public class AdminController {
	@RequestMapping("/")
	public String getAdminPage() {
		return "/admin/list-emp";
	}
}
