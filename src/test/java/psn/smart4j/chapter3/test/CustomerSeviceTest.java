package psn.smart4j.chapter3.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import psn.myst.framework.annotation.Inject;
import psn.smart4j.chapter3.model.Customer;
import psn.smart4j.chapter3.service.CustomerService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author huangrx
 * @version V1.0
 * @since 2017/8/30
 */
public class CustomerSeviceTest {

    private final CustomerService customerService = new CustomerService();

    @Before
    public void init() {
        // TODO 初始化数据库
    }

    @Test
    public void getCustomerListTest() throws Exception {
        List<Customer> customerList = customerService.getCustomerList();
        Assert.assertEquals(2, customerList.size());
    }

    @Test
    public void getCustomerTest() throws Exception {
        long id = 1;
        Customer customer = customerService.getCustomer(id);
        Assert.assertNotNull(customer);
    }

    @Test
    public void createCustomerTest() throws Exception {
        Map<String, Object> fieldMap = new HashMap<String, Object>();
        fieldMap.put("name", "customer100");
        fieldMap.put("contact", "John");
        fieldMap.put("telephone", "13512345678");
        boolean result = customerService.createCustomer(fieldMap);
        Assert.assertTrue(result);
    }

    @Test
    public void deleteCustomerTest() throws Exception {
        long id = 1;
        boolean result = customerService.deleteCustomer(id);
        Assert.assertTrue(result);
    }

}
