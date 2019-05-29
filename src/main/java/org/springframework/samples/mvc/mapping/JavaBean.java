package org.springframework.samples.mvc.mapping;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@XmlRootElement
@Data
public class JavaBean {

    private String foo = "bar";

    private String fruit = "apple";

}
