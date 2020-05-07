package spring.data.mongodb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import spring.data.mongodb.dto.ScoreDTO;
import spring.data.mongodb.service.ScoreMongoService;

@Controller
public class ScoreFindController {
	@Autowired
	ScoreMongoService service;
	
	@RequestMapping(value="/score/search", method=RequestMethod.GET)
	public String searchPage() {
		return "search";
	}
	
	@RequestMapping(value="/score/search", method=RequestMethod.POST)
	public ModelAndView searchByKeys(String key, String opr, String value) {
		List<ScoreDTO> scoreList = service.findCriteria(key + "," + opr, value);
		return new ModelAndView("list", "mongolist", scoreList);
	}
	
	/*@RequestMapping(value="/score/search", method=RequestMethod.POST)
	public ModelAndView search(String key, String value) {
		List<ScoreDTO> scoreList = service.findCriteria(key, value);
		return new ModelAndView("list", "mongolist", scoreList);
	}*/
	
	//update와 read를 위해 필요한 컨트롤러
	@RequestMapping(value="/score/detail")
	public ModelAndView findById(String key, String value, String action) {	
		ScoreDTO doc = service.findById(key, value);
		String view = "";
		if(action.equals("READ")) {
			view = "mongo_detail";
		} else {
			view = "mongo_update";
		}
		return new ModelAndView(view, "document", doc);
	}
}
