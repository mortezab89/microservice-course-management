package com.sha.microservicecoursemanagement.repository;

import com.sha.microservicecoursemanagement.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    @Query("select t from Transaction t where t.userId = :userId")
    List<Transaction> findAllByUserId(@Param("userId") Long userId);

    @Query("select t from Transaction t where t.course.id = :courseId")
    List<Transaction> findAllByCourseId(@Param("courseId") Long courseId);


}
