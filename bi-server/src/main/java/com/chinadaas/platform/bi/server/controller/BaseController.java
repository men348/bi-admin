package com.chinadaas.platform.bi.server.controller;

import org.springframework.validation.BindingResult;

import java.util.stream.Collectors;

/**
 * Created by xie on 16/7/26.
 */
public class BaseController {

    protected final int CODE_OK = 200;
    protected final int CODE_BAD_REQUEST_PARAM = 400;
    protected final int CODE_UN_AUTH = 401;
    protected final int CODE_FORBIDDEN = 403;
    protected final int CODE_PRECONDITION_FAILED = 410;
    protected final int CODE_INTERNAL_ERROR = 500;
    protected final int CODE_EXTERNAL_RESOURCE_ERROR = 503;

    protected String wrapperBindingResult(BindingResult bindingResult) {
        return bindingResult.getFieldErrors().stream().map(error -> {
            return error.getDefaultMessage();
        }).collect(Collectors.joining(","));
    }
}
