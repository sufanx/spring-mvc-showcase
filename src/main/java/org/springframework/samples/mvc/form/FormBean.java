package org.springframework.samples.mvc.form;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Past;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;
import org.springframework.samples.mvc.convert.MaskFormat;

import lombok.Data;

@Data
public class FormBean {

    @NotEmpty
    private String name;

    @Min(21)
    private int age;

    @DateTimeFormat(iso = ISO.DATE)
    @Past
    private Date birthDate;

    @MaskFormat("(###) ###-####")
    private String phone;

    @NumberFormat(pattern = "$###,###.00")
    private BigDecimal currency;

    @NumberFormat(style = Style.PERCENT)
    private BigDecimal percent;

    private InquiryType inquiry;

    private String inquiryDetails;

    private boolean subscribeNewsletter;

    private Map<String, String> additionalInfo;

}
