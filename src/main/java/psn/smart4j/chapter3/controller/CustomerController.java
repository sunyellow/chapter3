package psn.smart4j.chapter3.controller;

import psn.myst.framework.annotation.Action;
import psn.myst.framework.annotation.Controller;
import psn.myst.framework.annotation.Inject;
import psn.myst.framework.bean.Param;
import psn.myst.framework.bean.View;
import psn.smart4j.chapter3.service.CustomerService;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author huangrx
 * @version V1.0
 * @since 2017/9/3
 */
@Controller
public class CustomerController {

    @Inject
    private CustomerService customerService;

    @Action("get:/hello")
    public View index(Param param) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentTime = dateFormat.format(new Date());
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("currentTime", currentTime);
        map.put("list", customerService.getCustomerList());
        return new View("hello.jsp", map);
    }
}
