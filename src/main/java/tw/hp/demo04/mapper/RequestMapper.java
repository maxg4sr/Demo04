package tw.hp.demo04.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import tw.hp.demo04.entity.Request;

@Mapper
public interface RequestMapper {

    @Insert("INSERT INTO request (name, phone, date, person, line, project, how, location, sayHow, datetime, message) " +
            "VALUES (#{name}, #{phone}, #{date}, #{person}, #{line}, #{project}, #{how}, #{location}, #{sayHow}, #{datetime}, #{message})")
    void insertRequest(Request request);
}
