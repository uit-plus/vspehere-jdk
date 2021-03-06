package com.github.kubesys.models;

import javax.validation.constraints.Pattern;

import com.github.kubesys.annotations.ParameterDescriber;
import com.github.kubesys.utils.RegExpUtils;

public class PlugDisk {

	@Pattern(regexp = RegExpUtils.NAME_PATTERN)
	@ParameterDescriber(required = false, description = "磁盘名", constraint = "0~99999", example = "40000")
	protected String disk;

	@Pattern(regexp = RegExpUtils.DISK_SIZE_KIB_PATTERN)
	@ParameterDescriber(required = false, description = "磁盘大小，单位10G", constraint = "0~99999", example = "40000")
	protected String size;

	public String getDisk() {
		return disk;
	}

	public void setDisk(String disk) {
		this.disk = disk;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	
}
