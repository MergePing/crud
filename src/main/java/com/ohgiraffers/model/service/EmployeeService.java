package com.ohgiraffers.service;



import com.ohgiraffers.model.dao.EmployeeMapper_JYS;
import com.ohgiraffers.model.dto.EmployeeDTO;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import java.util.List;

public class EmployeeService {

    private final SqlSessionFactory sqlSessionFactory;

    public EmployeeService(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public List<EmployeeDTO> getAllMembers() {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            EmployeeMapper_JYS mapper = session.getMapper(EmployeeMapper_JYS.class);
            return mapper.selectAllMember();
        }
    }
}