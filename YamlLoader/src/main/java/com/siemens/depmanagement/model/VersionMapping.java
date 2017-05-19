package com.siemens.depmanagement.model;

public class VersionMapping {
	
	private String version;
	private SpringVersionRange versionRange;
	
	public VersionMapping() {
	}
	
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public SpringVersionRange getVersionRange() {
		return versionRange;
	}
	public void setVersionRange(SpringVersionRange versionRange) {
		this.versionRange = versionRange;
	}
	
	public Boolean isVersionCompatible(String bootVersion){
		return false;
	}

}
