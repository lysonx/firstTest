package com.lyson.web.controller;


import com.lyson.web.model.User;
import com.lyson.web.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(value = "/user")
public class UserController {
	@Autowired
	private IUserService iUserService;

	/**
	 * 2017.10.09
	 * 查询
	 * @return
	 */
	@RequestMapping(value = "/findByUserName")
	@ResponseBody
	public boolean checkUserName(@RequestParam(value="userName",defaultValue = "admin") String userName){
		User user =iUserService.findByUserName(userName);
		if(user != null){
			return true;
		}else {
			return false;
		}
	}

	@RequestMapping(value = "/getUserById")
	@ResponseBody
	public User getUserById(Integer id){
		return iUserService.getUserById(id);
	}


}
