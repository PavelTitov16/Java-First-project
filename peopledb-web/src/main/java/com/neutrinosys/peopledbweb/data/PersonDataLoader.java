package com.neutrinosys.peopledbweb.data;

import com.neutrinosys.peopledbweb.biz.model.Person;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

//@Component
public class PersonDataLoader implements ApplicationRunner {
    private PersonRepository personRepository;

    public PersonDataLoader(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        if (personRepository.count() == 0) {
            List<Person> people = List.of(
//                    new Person(null, "Pete", "Snake", "dummy@mail.com", LocalDate.of(1950, 1, 1), new BigDecimal("50000")),
//                    new Person(null, "Vita", "Smith", "dummy@mail.com", LocalDate.of(1960, 2, 1), new BigDecimal("60000")),
//                    new Person(null, "Oliver", "Jackson", "dummy@mail.com", LocalDate.of(1970, 3, 1), new BigDecimal("70000")),
//                    new Person(null, "Bobby", "Kim", "dummy@mail.com", LocalDate.of(1980, 4, 1), new BigDecimal("80000"))
            );
            personRepository.saveAll(people);
        }
    }
}
