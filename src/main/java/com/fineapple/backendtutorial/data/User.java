package com.fineapple.backendtutorial.data;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class User {
    private String id;
    private String nm;        
    
    /**
     * <pre> 
     * lombok 사용법
     * </pre>
     * @param args
     */
    public static void main(String[] args) {
        User user = new User();
        user.setId("me");
        user.setNm("me");
        log.info(user.getId());        
    }

}

