package com.web.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.admin.model.Video;
import com.web.admin.service.VideoService;

@Controller("/")
public class IndexAction {
	
	@Autowired
	private VideoService videoService;
	
	@RequestMapping("")
	public String index(Model model){
		List<Video> list = videoService.findVideos(0, 10);
		model.addAttribute("videoList", list);
		return "index";
	}
}