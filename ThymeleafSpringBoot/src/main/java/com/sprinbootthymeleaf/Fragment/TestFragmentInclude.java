package com.sprinbootthymeleaf.Fragment;


import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestFragmentInclude {
   
	/*
	 * rule=>about.html ya aboutnew.html ya base.html in ko used karne key liye
	 * aapko TestFragmentInclude wala controller chalanahuga
	 */
	   //handler for including fragment 
	   @GetMapping("/service")
		public String serviceHandlerfragment(Model model) 
		{
		    //processing logic
			/* titel aaur substitel aab ham yaha per pass karenga aapne controller ma */ 
		     model.addAttribute("titel","i like to tea ande samosa");
		     model.addAttribute("subtitel",LocalDateTime.now().toString());
			 return "service"; //ya ju aapne return kara rahe hu iss key name ka template bana rahe hi
			                // aaur aap key file ka name rahega service.html
				/* Rule=>model ki data aap key service wale html per jayega but hame service per nahi chaye aapne footer par lejana hai tu dusara html 
				 * page hai tu data kaise aayega tu aapko footer key aander aapka ju variable ka name wo pass karna huga ${titel} ${subtitel}
				 * }
				 *    */
				/*
				 * (1)model ki value app key (2)service ma jayegi phir aap key (3)footer ma
				 * jayegi
				 */
		}
			 //for new about
	          @GetMapping("/newabout")
			  public String newAbout() {
				return "aboutnew";	  
		}
	          
	          //for new Contact
	          @GetMapping("/contact")
			  public String contact() {
				return "contact";
				  
		}     
	          
}
