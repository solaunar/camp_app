package com.example;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

//used to simplify occurring queries=>easier control of our database
public interface CampingRepository extends CrudRepository<Camping,String> {
        //equivalent to: select camp from Camp where campId=id;
        Optional<Camping> findByCampId(Integer id);

        Optional <Camping> findByCloc(String cloc);

        Optional<Camping> findByCname(String cname);
}
