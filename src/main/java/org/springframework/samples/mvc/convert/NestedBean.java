package org.springframework.samples.mvc.convert;

import java.util.List;
import java.util.Map;

import lombok.Data;

@Data
public class NestedBean {

    private String foo;

    private List<NestedBean> list;

    private Map<String, NestedBean> map;

}