package com.bestrookie.framework;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @author bestrookie
 * @version 1.0
 * @date 2022/10/23 20:49
 */
@Data
@AllArgsConstructor
public class URL implements Serializable {
    private String hostName;
    private Integer port;
}
