package cn.mcandroid.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class controller {
	@RequestMapping(value="/test",method=RequestMethod.GET)
	public ModelAndView t1() {
		ModelAndView mView=new ModelAndView();
		mView.setViewName("01");
		return mView;
	}

}
