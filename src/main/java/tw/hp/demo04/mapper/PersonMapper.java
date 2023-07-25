package tw.hp.demo04.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import tw.hp.demo04.entity.Person;

@Mapper
public interface PersonMapper {
    @Select("select * from person where name = #{name}")
    Person selectByPerson(String person);

    @Insert("insert into person values(null,#{name},#{phone},#{date})")
    void inset(Person person);

}
