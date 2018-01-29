package controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class Login {
		
		@RequestMapping("/login")
		public String login(@RequestParam("username")String username, @RequestParam("password")String password, Model model, HttpSession session){
			
			if( username.equals("admin") && password.equals("123") ){
				return "success";
			}else{
				return "index";
			}
			
		}
		
		@RequestMapping("/loginout")
		public String loginout(HttpSession session){
			
			session.invalidate();
			
			return "login";
		}
	
	
}
