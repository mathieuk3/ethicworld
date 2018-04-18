package com.mkcorp.ethicworld.tools;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class JsonUtils {

    public JsonUtils() {}

    public String jsonMyFace(Object O) throws IOException {
        ObjectMapper om = new ObjectMapper();
        return om.writeValueAsString(O);
    }
}
