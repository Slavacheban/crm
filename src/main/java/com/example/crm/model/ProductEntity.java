package com.example.crm.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "product")
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class ProductEntity extends BaseEntity {
    @Column(name = "purchase_price")
    private Long purchasePrice;
    @Column(name = "sale_price")
    private Long salePrice;
}
