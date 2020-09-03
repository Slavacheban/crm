package com.example.crm.listener;

import com.example.crm.model.BaseEntity;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.util.Date;

public class DateEntityListener {
    @PrePersist
    public void prePersist(BaseEntity entity) {
        entity.setCreateDate(new Date());
    }

    @PreUpdate
    public void preUpdate(BaseEntity entity) {
        entity.setUpdateDate(new Date());
    }
}
