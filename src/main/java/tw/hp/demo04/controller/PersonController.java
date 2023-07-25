package tw.hp.demo04.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tw.hp.demo04.entity.Person;
import tw.hp.demo04.mapper.PersonMapper;

@RestController
public class PersonController {
    @Autowired
    PersonMapper mapper;

    @RequestMapping("reg")
    public int reg(@RequestBody Person person) {
        Person p = mapper.selectByPerson(person.getName());
        if (p != null) {
            return 2;
        }
        mapper.inset(person);
        return 1;
    }
}
