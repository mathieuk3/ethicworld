package com.mkcorp.ethicworld.services;

import com.mkcorp.ethicworld.beans.Comp;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class GetDataService {
    public static Map<Long, Comp> mComp = new HashMap();
    static{
        Comp c = new Comp(1L,"Monsanto",10000L);
        Comp c2 = new Comp(2L,"Lu",3000L);
        mComp.put(c.getId(),c);
        mComp.put(c2.getId(),c2);
    }

    public Comp getCompById(Long id){
        return mComp.get(id);
    }
}
