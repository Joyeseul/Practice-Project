package com.ysjo.example.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class Response {

    @ApiModelProperty(example = "상태코드")
    private int status;
    
    @ApiModelProperty(example = "메세지")
    private String message;

    @ApiModelProperty(example = "응답데이터")
    private Map<String, Object> data;
    
    @ApiModelProperty(example = "시간")
    private LocalDateTime timeStamp;

    public Response() {
        this(HttpStatus.OK);
    }

    public Response(HttpStatus httpStatus) {
        this.status = httpStatus.value();
        this.message = httpStatus.getReasonPhrase();
        this.data = new HashMap<>();
        this.timeStamp = LocalDateTime.now();
    }

    public void add(String key, Object value) {
        this.data.put(key, value);
    }
}
