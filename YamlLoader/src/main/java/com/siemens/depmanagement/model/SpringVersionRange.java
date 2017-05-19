 package com.siemens.depmanagement.model;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class SpringVersionRange {

	private Boolean isInclusiveStart;
	private Boolean isInclusiveEnd;
	private Boolean any;
	private List<SpringVersion> version;
	
	
	public Boolean getIsInclusiveStart() {
		return isInclusiveStart;
	}
	public Boolean getIsInclusiveEnd() {
		return isInclusiveEnd;
	}
	public Boolean getAny() {
		return any;
	}
	public List<SpringVersion> getVersion() {
		return version;
	}
	public void setIsInclusiveStart(Boolean isInclusiveStart) {
		this.isInclusiveStart = isInclusiveStart;
	}
	public void setIsInclusiveEnd(Boolean isInclusiveEnd) {
		this.isInclusiveEnd = isInclusiveEnd;
	}
	public void setAny(Boolean any) {
		this.any = any;
	}
	public void setVersion(List<SpringVersion> version) {
		this.version = version;
	}
    
	
	
}
