package com.mkcorp.ethicworld.repositories;

import com.mkcorp.ethicworld.beans.Comp;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface CompRepository extends CrudRepository<Comp,Long>{

    Comp findById(@Param("id") long id);

    Comp findByName(@Param("name") String name);

    //List<Comp> searchByName(String name);
}
