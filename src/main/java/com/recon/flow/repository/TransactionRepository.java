package com.recon.flow.Repository;
import com.recon.flow.Entity.Transactions;
import org.springframework.data.jpa.repository.JpaRepository



public interface TransactionRepository extends JpaRepository<Transactions,Long> {
}
