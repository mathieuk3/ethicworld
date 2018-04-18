package com.mkcorp.ethicworld;

import com.mkcorp.ethicworld.beans.Comp;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class PostDataController {

    @RequestMapping(value="/addComp", method = RequestMethod.POST, consumes= MediaType.ALL_VALUE)
    public void addcomp(@RequestBody Comp payload) throws IOException {
        System.out.println(payload);
    }
}
