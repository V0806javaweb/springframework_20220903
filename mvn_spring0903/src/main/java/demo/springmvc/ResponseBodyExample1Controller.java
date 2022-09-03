package demo.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ResponseBodyExample1Controller {
 
    // Simple example, method returns String.
    @RequestMapping(value = "/saveResult")
    @ResponseBody
    public String authorInfo(Model model) {
    	//回傳的是一段字串，而非一整個jsp畫面
        return "return a string bit not a jsp";
    }     
}
