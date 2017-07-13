package com.twomonkey.goodstudy.web;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * Created by HJK on 2017/1/19.
 */
@Controller
public class IndexController extends BaseController{

    @RequestMapping("/")
    public String root(HttpServletRequest request){
        return "common/index";
    }

    @RequestMapping("/login")
    public String login(HttpServletRequest req, Model model){
        String exceptionClassName = (String)req.getAttribute("shiroLoginFailure");
        String error = null;
        if(UnknownAccountException.class.getName().equals(exceptionClassName)) {
            error = "用户名/密码错误";
        } else if(IncorrectCredentialsException.class.getName().equals(exceptionClassName)) {
            error = "用户名/密码错误";
        } else if(exceptionClassName != null) {
            error = "其他错误：" + exceptionClassName;
        }
        if(error!=null) {
            model.addAttribute("error", error);
        }
        //判断当前用户是否已经登录
        if(SecurityUtils.getSubject().isAuthenticated()){
           // return "redirect:/index";
            SecurityUtils.getSubject().logout();//注销当前对象
        }
        return "common/login";
    }

    @RequestMapping("/index")
    public String index(HttpServletRequest request){
        return "common/index";
    }
}
