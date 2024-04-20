package com.example.Library;

import com.example.Library.DTO.pageParametersDTO;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public class SystemUtil {

    public static Pageable CreatePage(pageParametersDTO pageParam){
        Sort.Direction direction =  (pageParam.getSortDirection().equals("asc") ? Sort.Direction.ASC : Sort.Direction.DESC);
        Pageable paginate = PageRequest.of(pageParam.getPage(), pageParam.getLimit(), Sort.by(direction, pageParam.getSortField()));
        return paginate;
    }
}
