package com.allenwhm.cs;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/**
 * @author allenwhm
 * @date 2019-03-10 11:33
 **/
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class Value {

    private Long id;
    private String quote;
}
