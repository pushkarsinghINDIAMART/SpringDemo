package com.indiamart.service.imp;

import com.indiamart.model.Employee;
import com.indiamart.service.EmployeeService;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    @Transactional
    public void addEmployee(Employee employee) {
        sessionFactory.getCurrentSession().save(employee);
    }
}
