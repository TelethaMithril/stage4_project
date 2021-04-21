package com.sy.service.imp;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sy.mapper.AfficheMapper;
import com.sy.model.Affiche;
import com.sy.service.AfficheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class AfficheServiceImp implements AfficheService {

    @Autowired
    private AfficheMapper afficheMapper;

    @Override
    public Affiche findById(int id) throws Exception {
        return afficheMapper.selectById(id);
    }

    @Override
    public List<Affiche> findPage(Affiche affiche) throws Exception {
        return afficheMapper.selectPage(affiche);
    }

    @Override
    public PageInfo<Affiche> findPage(Affiche affiche, int pageNum, int pageSize) throws Exception {
        PageHelper.startPage(pageNum, pageSize);
        List<Affiche> list = afficheMapper.selectPage(affiche);
        PageInfo<Affiche> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Transactional
    @Override
    public int removeById(int id) throws Exception {
        return afficheMapper.deleteById(id);
    }

    @Transactional
    @Override
    public int add(Affiche affiche) throws Exception {
        return afficheMapper.insert(affiche);
    }

    @Transactional
    @Override
    public int modifyById(Affiche affiche) throws Exception {
        return afficheMapper.updateById(affiche);
    }


}
