package com.company.JPA.dao;



import com.company.JPA.entity.EmploymentHistory;

import java.util.List;

public interface EmploymentHistoryInterface {
    public List<EmploymentHistory> getAllEmploymentHistory(int id);
}
