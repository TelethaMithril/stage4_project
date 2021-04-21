package com.sy.service;


import com.github.pagehelper.PageInfo;
import com.sy.model.Affiche;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AfficheService {

    Affiche findById(int id) throws Exception;

    List<Affiche> findPage(Affiche affiche) throws Exception;

    PageInfo<Affiche> findPage(Affiche affiche, int pageNum, int pageSize) throws Exception;

    int removeById(int id) throws Exception;

    int add(Affiche affiche) throws Exception;

    int modifyById(Affiche affiche) throws Exception;


}
