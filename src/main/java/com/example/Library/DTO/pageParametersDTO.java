package com.example.Library.DTO;

import lombok.Data;

@Data

public class pageParametersDTO {

    String sortField;
    String sortDirection;
    Integer page;
    Integer limit;

    public pageParametersDTO(String sortField, String sortDirection, Integer page, Integer limit) {
        this.sortField = sortField==null?"id":sortField;
        this.sortDirection = sortDirection==null?"asc":sortDirection;
        this.page = page==null?0:page;
        this.limit = limit==null?100:limit;
    }
}
