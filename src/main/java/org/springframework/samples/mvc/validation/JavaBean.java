package org.springframework.samples.mvc.validation;

import java.util.Date;

import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.Data;

@Data
public class JavaBean {

    @NotNull
    @Max(5)
    private Integer number;

    @NotNull
    @Future
    @DateTimeFormat(iso = ISO.DATE)
    private Date date;

}
