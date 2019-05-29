package org.springframework.samples.mvc.views;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class JavaBean {

    @NotNull
    private String foo;

    @NotNull
    private String fruit;

}
