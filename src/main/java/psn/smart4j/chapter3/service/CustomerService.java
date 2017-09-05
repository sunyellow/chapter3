package psn.smart4j.chapter3.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import psn.myst.framework.annotation.Service;
import psn.smart4j.chapter3.helper.DatabaseHelper;
import psn.smart4j.chapter3.model.Customer;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 提供客户数据服务
 * @author huangrx
 * @version V1.0
 * @since 2017/8/30
 */
@Service
public class CustomerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);

    /**
     * 获取客户列表
     * @return
     */
    public List<Customer> getCustomerList() {
        Connection connection = null;
        List<Customer> customerList = new ArrayList<Customer>();
        String sql = "SELECT * FROM customer";
        return DatabaseHelper.queryEntityList(Customer.class, sql);
    }

    /**
     * 获取客户
     * @param id
     * @return
     */
    public Customer getCustomer(Long id) {
        // TODO
        return null;
    }

    /**
     * 创建客户
     * @param fieldMap
     * @return
     */
    public boolean createCustomer(Map<String, Object> fieldMap) {
        // TODO
        return false;
    }

    /**
     * 删除客户
     * @param id
     * @return
     */
    public boolean deleteCustomer(Long id) {
        // TODO
        return false;
    }
}
