package klu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AppController {
	
	@Autowired
	Faculty F;
	
	@Autowired
	Student S;
	
	@Autowired
	DAO dao;
	
	@RequestMapping("/")
	@ResponseBody
	public String welcome() {
		return "Welcome...";
	}
	
	@GetMapping("/faculty")
	@ResponseBody
	public String faculty()
	{
		return F.toString();
	}
	
	@GetMapping("/student")
	@ResponseBody
	public String student()
	{
		return S.toString();
	}
	
	@GetMapping("/dao")
	@ResponseBody
	public String dao()
	{
		return dao.toString();
	}
}
