package com.sprinbootthymeleaf.controller;


import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class TextController {
	
	 //http://localhost:8080
	 //here is create your method
	  @RequestMapping(value="/about",method =RequestMethod.GET)
	  public String about(Model model){
		 
		 System.out.println("inside about hanler");
		 //here i am putting data in model
		 model.addAttribute("name"," altaf malik");
		 model.addAttribute("currentDate",new Date().toLocaleString());
		 return "about";//ya ju aapka about hai html page ko dikaha na hai 
		 //about.html
	 }
	 //here is your second handler method
	  @GetMapping("/example-loop")
	   public String iteraterhandler(Model model_a) {
		  //sending the data 
		  //create a list, a collection
		List<String> names=List.of("altaf ","malik","sorabha","niraj");
		model_a.addAttribute("names",names);
		System.out.println("it is print here your loop");
		
	   return "iterater";
		   
	   }
	   //yawala method aap condition key liye used huga 
	  //handler for Conditional statement in thymeleaf
	  //yaha per sabsa pahale ham model langye taki data send kar pawo aapne view per view miss thymeleaf per
	  //ya method kab chalega jab aap fier karogay /condition tab chalega 
	  @GetMapping("/condition")
	  public String conditionHandler(Model model) {
		System.out.println("conditional handler exicuted");
		 //here is work Elvis Operator key  through
		 //model.addAttribute("isActive",false); //aager aap true code chalogaye tu aapko isActive aayega 
		 model.addAttribute("isActive",true); //aager aap false wala code chalaogi tu isNoActive aayega
		 System.out.println("userIsActive then true 'userIs Not Active then not true'");
		     
			/* <-------Stpe(1)-----> */
		 //here is work if-Unless key  through
		 //aager aapka condition match huga tabhi dekhaega otherwise nahi dekhega aap key UAI per 
		// model.addAttribute("gender","F");//aager aap na yaha per F likha tu aape key thymeleaf Femal wala chalega
		// System.out.println("it is work of the Female(F)");
		 
		 /* <-------Stpe(2)-----> */
		//aager aapka condition match huga tabhi dekhaega otherwise nahi dekhega aap key UAI per 
		//model.addAttribute("gender","M");//iss condition aapka dono show karega kyu 
		//System.out.println("it is work of the Male (M)");
		 
		 /* <-------Stpe(3, A)-----> */
		 //hamare UAI per Femal show hu raha hai kyu ki controller aaur view ka data ju hai nahi match hu raha hai iss ilye unless call huwa hai 
		// model.addAttribute("gender","F");
		// System.out.println("if match then excute if condition then not match then excute unless condition");
		 
		 /* <-------Stpe(B, A)-----> */
		 //hamare UAI per Femal show hu raha hai kyu ki controller aaur view ka data ju hai nahi match hu raha hai iss ilye unless call huwa hai 
		 //model.addAttribute("gender","F");
		 //System.out.println("if match then excute if condition then not match then excute unless condition");
		 
		 //here is started your switch-case
		 //aager aap key ko eaak sa jada condition lagana hu tu aapko used karna hai switch 
		List<Integer> list= List.of(24,45,67);
		model.addAttribute("mylist"+list);
		return "condition"; //iss return key aander ju condition likha iss name ka ma html file banaunga  
	  }


}
