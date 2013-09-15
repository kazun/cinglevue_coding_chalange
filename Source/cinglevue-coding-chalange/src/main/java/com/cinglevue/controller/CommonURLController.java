package com.cinglevue.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Common URL controller wich is used to handle common URL such as Error pages..
 * etc.
 * 
 */
@Controller
public class CommonURLController {

	/**
	 * Url mapping for 404 error page.
	 * 
	 */
	@RequestMapping(value = "/404-error.html", method = RequestMethod.GET)
	public void pageNotFoundError(Model model) {

	}
}