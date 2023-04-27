package com.neutrinosys.peopledbweb.data;

import com.neutrinosys.peopledbweb.biz.model.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {
    @Query(nativeQuery = true, value = "select PHOTO_FILE_NAME from person where id in :ids")
    public Set<String> findFilenamesById(@Param("ids") Iterable<Long> ids);
}
