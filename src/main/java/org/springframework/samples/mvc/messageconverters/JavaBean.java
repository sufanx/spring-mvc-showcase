package org.springframework.samples.mvc.messageconverters;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
public class JavaBean {

    @NotNull
    private String foo;

    @NotNull
    private String fruit;

}
