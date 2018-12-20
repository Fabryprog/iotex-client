package org.fabryprog.iotex.rest.api;

import java.util.HashMap;
import java.util.Map;

import org.fabryprog.iotex.rest.api.dto.IoTeXRequest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 
 * @author Fabrizio Spataro - Fabryprog <fabryprog@gmail.com>
 *
 */
public class RequestUtils {
    private static ObjectMapper objectMapper = new ObjectMapper();
    
    public static String jsonrpc(RequestType type, IoTeXRequest payload) throws JsonProcessingException {
        Map<String, Object> map = new HashMap<>();
        map.put("jsonrpc", "2.0");
        map.put("id", "1");
        map.put("method", type.getMethod());
        map.put("params", new IoTeXRequest[] { payload });
        
        return objectMapper.writeValueAsString(map);
    }
    
    public static String json(IoTeXRequest payload) throws JsonProcessingException {
        return objectMapper.writeValueAsString(payload);
    }
    
}
