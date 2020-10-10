package com.zhangzemin.controller;

import com.zhangzemin.domain.Account;
import com.zhangzemin.domain.User;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Date;

//出现位置示例
@RequestMapping("account")
@Controller
public class AccountController {
//    /**
//     * 查询账户
//     * @return
//     */
//    @RequestMapping("/findAccount")
//    public String findAccount(){
//        System.out.println("查询了账户....");
//        return "success";
//    }

//    /**
//     * 保存账户
//     * @return
//     */
//    @RequestMapping(value="/saveAccount",method= RequestMethod.POST)
//    public String saveAccount(){
//        System.out.println("保存了账户...");
//        return "success";
//    }

//    /**
//     * 删除账户
//     * @return
//     */
//    @RequestMapping(value="/deleteAccount",params={"accountName","money>100"})
//    public String deleteAccount(){
//        return "success";
//    }

    @RequestMapping("/findAccount")
    public String findAccount(Integer accountId,String accountName){
        System.out.println("查询了账户。。。"+accountId+","+accountName);
        return "success";
    }

    @RequestMapping("/saveAccount")
    public String saveAccount(Account account){
        System.out.println("保存了账户。。。"+account);
        return "success";
    }

    @RequestMapping("/updateAccount")
    public String updateAccount(User user){
        System.out.println("更新了账户..."+user);
        return "success";
    }

    @RequestMapping("/deleteAccount")
    public String deleteAccount(Date date){
        System.out.println("删除了账户...."+date);
        return "success";
    }

    /**
     * 测试访问testServletAPI
     * @param httpServletRequest
     * @param httpServletResponse
     * @param httpSession
     * @return
     */
    @RequestMapping("/testServletAPI")
    public String testServletAPI(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, HttpSession httpSession){
        System.out.println(httpServletRequest);
        System.out.println(httpServletResponse);
        System.out.println(httpSession);
        return "success";
    }


}
