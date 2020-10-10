package com.zhangzemin.controller;

import com.zhangzemin.domin.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/testString")
    public String testString(Model model){
        System.out.println("testString执行了...");
        //模拟出数据库中查询user对象
        User user  = new User();
        user.setUsername("泰思特");
        user.setPassword("123");
        user.setAge(30);
        model.addAttribute("user",user);
        return "success";
    }

    /**
     * 转发是一次请求，不用编写项目的名称
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @RequestMapping("/testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("testVoid执行了...");
        //编写请求转发的程序
//        request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request,response);
        //重定向
//        response.sendRedirect(request.getContextPath()+"/index.jsp");

//        设置中文乱码
        response.setCharacterEncoding("utf-8");
        response.setContentType("application/json;charset=utf-8");

        response.getWriter().write("json 串");
        return;
    }

    /**
     * ModelAndView
     * @return
     */
    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView(){
        //创建ModelAndView对象
        ModelAndView mv = new ModelAndView();
        //模拟出数据库中查询user对象
        User user  = new User();
        user.setUsername("泰思特");
        user.setPassword("123");
        user.setAge(30);
        //把user对象存储到mv对象中,也会把user对象存储到request对象中
        mv.addObject("user",user);
        //跳转到哪个页面
        mv.setViewName("success");
        return mv;
    }

    /**
     * 转发
     * @return
     */
    @RequestMapping("/testForward")
    public String testForward(){
        System.out.println("testForward方法执行了");
        return "forward:/WEB-INF/pages/success.jsp";
    }


    /**
     * 重定向
     * @return
     */
    @RequestMapping("/testRedirect")
    public String testRedirect(){
        System.out.println("testRedirect");
        return "redirect:/index.jsp";
    }


    /**
     * 模拟异步请求响应
     * @return
     */
    @ResponseBody
    @RequestMapping("/testAjax")
    public User testAjax(User user){
        System.out.println("testAjax执行了...");
        //客户端发送ajax请求，传的是json字符串，后端把json字符串封装到user对象中
        System.out.println(user);
        //做响应
        user.setUsername("张泽民");
        user.setPassword("1234");
        user.setAge(21);
        return user;
    }



}
