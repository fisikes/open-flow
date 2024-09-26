package org.fisikes.flow.server.domain;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Project {

    private String id;
    private String projectName;

    private String gitUrl;


}
