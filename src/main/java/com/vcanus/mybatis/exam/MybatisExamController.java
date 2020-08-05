package com.vcanus.mybatis.exam;

import com.vcanus.mybatis.Mapper;
import com.vcanus.mybatis.sql.SqlSyntax;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class MybatisExamController {
    @Resource(name = "mapperSimpleMySql")
    private Mapper mapper;

//    @RequestMapping("/")
//    public String index() {
//        return "Greetings from Spring Boot!";
//    }

    @RequestMapping("/")
    public String index() {
        {
            String statement=
                    "DROP TABLE IF EXISTS " + "table1";

            Map<Object,Object> sqlObject = new HashMap<Object,Object>();
            sqlObject.put(SqlSyntax.PREPAREDSTATEMENT,statement);
            List<Object> sqlCommand = new ArrayList<>();
            sqlCommand.add(sqlObject);
            Map<Object,Object> statementMap = new HashMap<>();
            statementMap.put(SqlSyntax.STATEMENT, sqlCommand);
            mapper.doStatement(statementMap);
        }
        return "succeed";
    }

}
