package cn.itcast.javaee.springmvc.app20;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 控制器
 * @author AdminTC
 */
@Controller
@RequestMapping(value="/person")
public class PersonAction {
	@InitBinder
	public void initBinder(HttpServletRequest request,ServletRequestDataBinder binder) throws Exception {
		binder.registerCustomEditor(
				Date.class, 
				new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"),true));
	}
	
	
	
	
	
	/**
	 * 业务方法
	 */	
	@RequestMapping(value="/register")
	public String registerMethod(Bean bean,Model model) throws Exception{
		System.out.println("普通用户：" + bean.getUser());
		System.out.println("管理员：" + bean.getAdmin());
		//将user和admin都绑定到Model
		model.addAttribute("user",bean.getUser());
		model.addAttribute("admin",bean.getAdmin());
		//转发
		return "/02_person.jsp";
	}
}













