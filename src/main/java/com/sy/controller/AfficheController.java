package com.sy.controller;

import com.github.pagehelper.PageInfo;
import com.sy.model.Affiche;
import com.sy.model.Result;
import com.sy.service.AfficheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/affiche")
public class AfficheController {

    @Autowired
    private AfficheService afficheService;

    //ok
    @RequestMapping("/add.do")
    public Result add(Affiche affiche, Result result) throws Exception {
        int i = afficheService.add(affiche);
        if (i == 0) {
            result.respError();
        }
        return result;
    }
    //ok
    @RequestMapping("/remove.do")
    public Result remove(Integer id, Result result) throws Exception {
        int i = afficheService.removeById(id);
        if (i == 0) {
            result.respError();
        }
        return result;
    }
    //ok
    @RequestMapping("/modify.do")
    public Result modify(Affiche affiche, Result result) throws Exception {
        int i = afficheService.modifyById(affiche);
        if (i == 0) {
            result.respError();
        }
        return result;
    }
    //ok
    @RequestMapping("/list.do")
    public Result list(Affiche affiche,
                       @RequestParam(value = "pageNum", defaultValue = "1") int pageNum,
                       @RequestParam(value = "pageSize", defaultValue = "5") int pageSize,
                       Result result) throws Exception {
        PageInfo<Affiche> page = afficheService.findPage(affiche, pageNum, pageSize);
        result.setPageInfo(page);
        return result;
    }
    //ok
    @RequestMapping("findById")
    public Result findById(Integer id,Result result) throws Exception {
        Affiche byId = afficheService.findById(id);
        if (byId==null){
            result.respError();
        }
        result.setData(byId);
        return result;
    }

}
