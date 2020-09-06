package com.example.crm.controller.mapper;

import com.example.crm.controller.dto.ProductDTO;
import com.example.crm.model.ProductEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface ProductMapper {

    @Mappings({@Mapping(source = "entity.purchasePrice", target = "purchasePrice"),
            @Mapping(source = "entity.salePrice", target = "salePrice")})
    ProductDTO createDTO(ProductEntity entity);

    @Mappings({@Mapping(source = "dto.purchasePrice", target = "purchasePrice"),
            @Mapping(source = "dto.salePrice", target = "salePrice")})
    ProductEntity createEntity(ProductDTO dto);
}
