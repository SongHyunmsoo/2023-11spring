package org.choongang.entities;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@EqualsAndHashCode
@AllArgsConstructor @NoArgsConstructor
public class BoardViewId implements Serializable {

    private Long seq;
    private int uid;

}
