package com.trinityBakery.trinityBakery.controller;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/ajax")
public class AjaxController {

    @RequestMapping(value = "/createAdmin", method = RequestMethod.POST)
    @ResponseBody
    public String createAdmin(HttpServletRequest request){
        //从前端获取数据 名字，电话，邮箱，部门
        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String pro = request.getParameter("pro");
        String re = " <tr>\n" +
                "                    <td>"+ name +"</td>\n" +
                "                    <td>"+phone+"</td>\n" +
                "                    <td>"+ pro +"</td>\n" +
                "                    <td>"+ phone +"</td>\n" +
                "                    <td>"+ email +"</td>\n" +
                "                    <td>\n" +
                "                        <a href=\"#\" data-toggle=\"modal\" data-target=\"#changeAdmin\" onclick=\"showAdmin(this)\">修改</a>\n" +
                "                        <a href=\"#\" onclick=\"delAdmin(this)\">删除</a>\n" +
                "                    </td>\n" +
                "                </tr>";

        //根据获得的信息更新数据库
        return re;
    }


    @PostMapping("/delAdmin")
    public String delAdmin(HttpServletRequest request){
        String account = request.getParameter("account");
        //根据账户删除admin
        //成功返回 success，失败返回error
        return "success";
    }

    @PostMapping("/changeAdmin")
    public String changeAdmin(HttpServletRequest request){
        String account = request.getParameter("account");
        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String pro = request.getParameter("pro");
        //根据账户修改admin
        //成功返回 success，失败返回error
        return "success";
    }
}
