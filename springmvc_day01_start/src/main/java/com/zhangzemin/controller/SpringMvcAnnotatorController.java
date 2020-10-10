package com.zhangzemin.controller;

import com.zhangzemin.domain.Account;
import com.zhangzemin.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.util.Map;

@Controller
@RequestMapping("springmvc")
//@SessionAttributes(value={"username","password","age"})//把属性值存到session域中
public class SpringMvcAnnotatorController {
    /**
     * requestParams注解使用
     * @param username
     * @param age
     * @return
     */
    @RequestMapping("/useRequestParam")
    public String useRequestParam(@RequestParam("name")String username,@RequestParam(value="age",required = false)Integer age){
        System.out.println(username+","+age);
        return "success";
    }

    @RequestMapping("/useRequestBody")
    public String useRequestBody(@RequestBody(required = false) String body){
        System.out.println(body);
        return "success";
    }

    @RequestMapping("usePathVariable/{id}")
    public String usePathVariable(@PathVariable("id") Integer id){
        System.out.println(id);
        return "success";
    }

    /**
     * Post请求：保存
     * @param user
     * @return
     */
    @RequestMapping(value="/testRestfulPOST",method= RequestMethod.POST)
    public String testRestfulURLPOST(User user){
        System.out.println("rest post:"+user);
        return "success";
    }

    /**
     * Put请求：更新
     * @param user
     * @return
     */
    @RequestMapping(value="/testRestfulPUT/{id}",method= RequestMethod.PUT)
    public String testRestfulURLPUT(@PathVariable("id") Integer id,User user){
        System.out.println("rest put:"+id+","+user);
        return "success";
    }

    /**
     * Delete请求:删除
     * @param id
     * @return
     */
    @RequestMapping(value="/testRestfulDELETE/{id}",method = RequestMethod.DELETE)
    public String testRestfulURLDELETE(@PathVariable("id") Integer id){
        System.out.println("rest delete:"+id);
        return "success";
    }

    /**
     * Get请求：查询
     * @param id
     * @return
     */
    @RequestMapping(value="/testRestfulGET/{id}",method=RequestMethod.GET)
    public String testRestfulGET(@PathVariable("id") Integer id){
        System.out.println("rest get:"+id);
        return "success";
    }

    /**
     * 获取请求消息头
     * @return
     */
    @RequestMapping("/useRequestHeader")
    public String testRequestHeader(@RequestHeader(value="Accept-Language",required = false) String requestHeader){
        System.out.println(requestHeader);
        return "success";
    }

    /**
     * 获取指定cookie名称
     * @return
     */
    @RequestMapping("/useCookieValue")
    public String testCookieValue(@CookieValue(value="JSESSIONID",required = false) String cookieValue){
        System.out.println(cookieValue);
        return "success";
    }


    /**
     * 被ModelAttribute修饰的方法
     * @param user
     */
    /*@ModelAttribute
    public void showModel(User user){
        System.out.println("执行了show方法:"+user.getUsername());
    }

    @RequestMapping("/testModelAttribute")
    public String testModelAttribute(User user){
        System.out.println("执行了控制器的方法:"+user.getUsername());
        return "success";
    }*/


    /*@ModelAttribute
    public User showModel(String username){
        //模拟去数据库查询
        User user = findUserByName(username);
        System.out.println("执行了show model方法:"+user);
        return user;
    }
    @RequestMapping("/updateUser")
    public String testModelAttribute(User user){
        System.out.println("控制器中处理请求的方法：修改用户:"+user);
        return "success";
    }

    *//**
     * 模拟去数据查询
     * @param username
     * @return
     */
    /*public User findUserByName(String username){
        User user = new User();
        user.setUsername(username);
        user.setAge(18);
        user.setPassword("1234");
        return user;
    }*/


    /*@ModelAttribute
    public void showModel(String username, Map<String,User> map){
        //模拟去数据库查询数据
        User user = findUserByName(username);
        System.out.println("执行了show model方法:"+user);
        map.put("abc",user);
    }*/



    @RequestMapping("/updateUser")
    public String testModelAttribute(@ModelAttribute("abc") User user){
        System.out.println("控制器中处理请求的方法：修改用户:"+user);
        return "success";
    }

    /**
     * 模拟去数据查询
     * @param username
     * @return
     */
    public User findUserByName(String username){
        User user = new User();
        user.setUsername(username);
        user.setAge(18);
        user.setPassword("1234");
        return user;
    }



    /**
     * 把数据存入SessionAttribute
     * @param model
     * @return
     * Model 是 spring 提供的一个接口，该接口有一个实现类 ExtendedModelMap
     * 该类继承了 ModelMap，而 ModelMap 就是 LinkedHashMap 子类
     */
    @RequestMapping("/testPut")
    public String testPut(Model model){
        model.addAttribute("username","泰思特");
        model.addAttribute("password","1234");
        model.addAttribute("age",18);
        //跳转之前将数据保存到 username、password 和 age 中，因为注解@SessionAttribute 中有 这几个参数
        System.out.println("testPut执行了...");
        return "success";
    }

    @RequestMapping("/testGet")
    public String testGet(ModelMap model){
        System.out.println(model.get("username")+","+model.get("password")+","+model.get("age"));
        return "success";
    }

    @RequestMapping("/testClean")
    public String complete(SessionStatus sessionStatus){
        System.out.println("complete执行了...");
        sessionStatus.setComplete();
        return "success";
    }

}
