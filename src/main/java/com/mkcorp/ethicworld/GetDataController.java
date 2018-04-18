package com.mkcorp.ethicworld;

import com.mkcorp.ethicworld.beans.Comp;
import com.mkcorp.ethicworld.services.GetDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class GetDataController {

    @Autowired
    GetDataService getDataService;

    @RequestMapping(value = "getCompById/{id}", method = RequestMethod.GET)
    public ResponseEntity<Comp> getCompById(@PathVariable("id") long id) throws IOException {
        return new ResponseEntity<Comp>(getDataService.getCompById(id), HttpStatus.OK);
    }


}
