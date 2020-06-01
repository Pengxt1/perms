package com.aaa.controller;

import com.aaa.biz.MenuBiz;
import com.aaa.entity.LayUiTable;
import com.aaa.entity.LayUiTree;
import com.aaa.entity.Menu;
import com.aaa.util.MyConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: 陈建
 * @Date: 2020/5/28 0028 6:59
 * @Version 1.0
 */
@Controller
@RequestMapping("/menu")
public class MenuController {
    @Autowired
    private MenuBiz menuBiz;
    @RequestMapping("/toShowMenu")
    public String toShowMenu(Model model) {
        List<Menu> menuList=menuBiz.selectbytype("M");
        model.addAttribute("menus",menuList);
        return "menu/showMenu";
    }
    @RequestMapping("/selectAllMenu")
    @ResponseBody
    public List<LayUiTree> selectAllMenu(){
        List<LayUiTree> layUiTrees = menuBiz.selectAllMenu();
        return layUiTrees;
    }
    @RequestMapping("/selectAllMenu1")
    @ResponseBody
    public LayUiTable selectAllMenu1() {
        List<Menu> menuList=menuBiz.selectAllMenu1();
        LayUiTable layUiTable = new LayUiTable();
        layUiTable.setCode(0);
        layUiTable.setMsg("");
        layUiTable.setData(menuList);
        return layUiTable;
    }

    @RequestMapping("/saveMenu")
    @ResponseBody
    public Object saveDept(Menu menu){ ;
        int i = menuBiz.insertSelective(menu);
        Map map= new HashMap<>();
        if(i>0){
            map.put("code", MyConstants.successCode);
            map.put("message",MyConstants.saveSuccessMsg);
        }else {
            map.put("code",MyConstants.failCode);
            map.put("message",MyConstants.saveFailMsg);
        }
        return map;
    }
    @RequestMapping("/editMenu")
    @ResponseBody
    public Object editMenu(Menu menu){
        int i = menuBiz.updateByPrimaryKeySelective(menu);
        Map map= new HashMap<>();
        if(i>0){
            map.put("code",MyConstants.successCode);
            map.put("message",MyConstants.editSuccessMsg);
        }else {
            map.put("code",MyConstants.failCode);
            map.put("message",MyConstants.editFailMsg);
        }
        return map;
    }
}
