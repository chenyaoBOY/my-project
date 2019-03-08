package org.study.project.io.bio;


public class TcpServiceImpl implements TcpService {
    @Override
    public Person getPerson(String name, Integer age) {
        Person person = new Person(name, age);
        return person;
    }
}
