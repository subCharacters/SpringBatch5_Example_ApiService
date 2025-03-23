package com.example.springbatch5_example_apiservice;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ApiRequestVO {
    private long id;
    private ProductVO productVO;
}
