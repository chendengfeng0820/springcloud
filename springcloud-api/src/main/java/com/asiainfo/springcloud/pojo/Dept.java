package com.asiainfo.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author: cdf
 * @create: 2020-05-31 13:16
 **/
@Data
@NoArgsConstructor
@Accessors(chain = true)
public class Dept {
	private Long deptno;
	private String dname;
	private String db_source;

	public Dept(String dname) {
		this.dname = dname;
	}
}
