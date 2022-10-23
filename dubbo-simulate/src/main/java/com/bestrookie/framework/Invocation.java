package com.bestrookie.framework;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @author bestrookie
 * @version 1.0
 * @date 2022/10/23 13:31
 */
@Data
@AllArgsConstructor
public class Invocation implements Serializable {
    private String interfaceName;
    private String methodName;
    private Class[] paramsTypes;
    private Object[] params;
}
