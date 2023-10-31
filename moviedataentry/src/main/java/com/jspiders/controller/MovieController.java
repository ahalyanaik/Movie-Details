package com.jspiders.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jspiders.model.Movie;
import com.jspiders.service.MovieService;

@Controller
public class MovieController {
	@Autowired
	private MovieService ms;
	ModelAndView mav = new ModelAndView();
	String s;

	@RequestMapping("/insert")
	public ModelAndView movieInsertion(HttpServletRequest req,HttpServletResponse res) {
		int mId = Integer.parseInt(req.getParameter("mId"));
		String mName = req.getParameter("mName");
		int mPrice = Integer.parseInt(req.getParameter("mPrice"));
		s = ms.insertMovies(mId, mName, mPrice);
		mav.setViewName("output.jsp");
		mav.addObject("output", s);
		return mav;
	}
	
	@RequestMapping("/select")
	public ModelAndView movieSelection(HttpServletRequest req,HttpServletResponse res) {
		List<Movie> list = ms.getMovies();
		System.out.println(list);
		mav.setViewName("output.jsp");
		mav.addObject("output", list);
		return mav;
	}
	
	@RequestMapping("/update")
	public ModelAndView movieUpdation(HttpServletRequest req,HttpServletResponse res) {
		int mId = Integer.parseInt(req.getParameter("mId"));
		String mName = req.getParameter("mName");
		int mPrice = Integer.parseInt(req.getParameter("mPrice"));
		s = ms.updateMovies(mId, mName, mPrice);
		mav.setViewName("output.jsp");
		mav.addObject("output", s);
		return mav;
	}
	@RequestMapping("/delete")
	public ModelAndView movieDeletion(HttpServletRequest req,HttpServletResponse res) {
		int mId = Integer.parseInt(req.getParameter("mId"));
		s = ms.deleteMovies(mId);
		mav.setViewName("output.jsp");
		mav.addObject("output", s);
		return mav;
	}
}
