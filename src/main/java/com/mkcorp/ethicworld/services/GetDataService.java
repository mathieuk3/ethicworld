package com.mkcorp.ethicworld.services;

import com.mkcorp.ethicworld.repositories.CompRepository;
import com.mkcorp.ethicworld.beans.Comp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

@Service
public class GetDataService {
    public static Map<Long, Comp> mComp = new HashMap();
    static{
        Comp c = new Comp(1L,"FakeComp1",10000L);
        Comp c2 = new Comp(2L,"FakeComp2",3000L);
        mComp.put(c.getId(),c);
        mComp.put(c2.getId(),c2);
    }

    @Autowired
    CompRepository compRepository;

    @Transactional(readOnly = true)
    public Comp getCompById(Long id){
        return compRepository.findById(id).orElse(null);
    }
}
