package java.com.expenseplanner.enterprise.dao;

import java.util.List;
import java.util.Optional;
import java.com.expenseplanner.enterprise.model.Expense;

public interface ExpenseRepository {
    List<Expense> findAll();
    Optional<Expense> findById(Long id);
    Expense save(Expense expense);
    void deleteById(Long id);
}
