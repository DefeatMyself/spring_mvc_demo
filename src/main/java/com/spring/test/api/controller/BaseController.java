package com.spring.test.api.controller;

import com.spring.test.api.SpringBeanLocator;
import com.spring.test.api.request.IBaseRequest;
import com.spring.test.api.response.DefaultBaseResponse;
import com.spring.test.api.response.IBaseResponse;
import com.spring.test.api.response.Result;
import com.spring.test.api.service.IBaseService;
import com.spring.test.api.util.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by hkw on 2017/4/9.
 */
@Controller
@RequestMapping("/api")
public class BaseController {

    private static Logger logger = LoggerFactory.getLogger(BaseController.class);
    private static SpringBeanLocator springBeanLocator = SpringBeanLocator.getInstance();

    @RequestMapping("/{version}/{exec}")
    @ResponseBody
    public Result invoke(@PathVariable String version, @PathVariable String exec, HttpServletRequest request) {
        logger.info("version = [" + version + "], exec = [" + exec + "]");

        IBaseService service = springBeanLocator.getBean(exec, IBaseService.class);
        if (null == service) {
//            return ResultUtil.convertResult();
        }

        IBaseRequest request1 = service.getRequest();
        if (null == request) {
//            return new DefaultBaseResponse().response(1,"没有相关request");
        }
        request1.parse(request);
        IBaseResponse response = service.serve(request1);
        return ResultUtil.convertResult(response);
    }

}
