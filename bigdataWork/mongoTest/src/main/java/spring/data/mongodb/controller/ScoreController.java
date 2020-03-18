package spring.data.mongodb.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import spring.data.mongodb.dto.ScoreDTO;
import spring.data.mongodb.service.ScoreMongoService;

@Controller
public class ScoreController {
	@Autowired
	ScoreMongoService service;
	
	@RequestMapping(value="/score/paginglist")
	public ModelAndView showPagingMongolist(String pageNo) {
		ModelAndView mav = new ModelAndView();
		List<ScoreDTO> list = service.findAll(Integer.parseInt(pageNo));
		mav.addObject("mongolist", list);
		mav.setViewName("list");
		
		return mav;
	}
	
	@RequestMapping(value="/score/list")
	public ModelAndView showMongolist() {
		ModelAndView mav = new ModelAndView();
		List<ScoreDTO> list = service.findAll();
		mav.addObject("mongolist", list);
		mav.setViewName("list");
		
		return mav;
	}
	
	@RequestMapping(value="/score/insert", method=RequestMethod.GET)
	public String insertPage() {
		return "mongo_insert";
	}
	
	@RequestMapping(value="/score/insert", method=RequestMethod.POST)
	public String insert(ScoreDTO doc) {
		service.insertDocument(doc);
		return "redirect:/score/paginglist?pageNo=0";
	}
	
	@RequestMapping(value="/score/multiInsert", method=RequestMethod.GET)
	public String multiInsert() {
		List<ScoreDTO> doclist = new ArrayList<ScoreDTO>();
		ScoreDTO doc = null;
		for (int i = 0; i < 10; i++) {
			doc = new ScoreDTO();
			doc.setId("multi" + 10 + i);
			doc.setDept("multi" + i);
			doc.setAddr("부산");
			doc.setJava(100);
			doclist.add(doc);
		}
		service.insertAllDocument(doclist);
		
		return "redirect:/score/paginglist?pageNo=0";
	}
	
	@RequestMapping(value="/score/update",method=RequestMethod.POST)
	public String update(ScoreDTO document) {
		service.update(document);
		return "redirect:/score/paginglist?pageNo=0";
	}

}
