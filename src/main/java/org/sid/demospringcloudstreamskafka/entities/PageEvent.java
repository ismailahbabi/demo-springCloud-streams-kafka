package org.sid.demospringcloudstreamskafka.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data @ToString @AllArgsConstructor @NoArgsConstructor
public class PageEvent {
    private String name;
    private  String user;
    private Date date;
    private long duration;
}
