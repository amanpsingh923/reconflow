package com.recon.flow.Entity;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "Transactions")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Builder
public class Transactions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    @Column(name = "Amount",nullable = false)
    private BigDecimal amount;

    @Column(name = "PostDate",nullable = false)
    private Date postDate;
}
