package com.hr.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhang
 * @since 2022-04-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Menus2 implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer oid;

    private String mname;

    private String murl;

    private Integer mid;


}
