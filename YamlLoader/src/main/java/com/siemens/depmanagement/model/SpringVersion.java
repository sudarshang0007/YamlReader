package com.siemens.depmanagement.model;

public class SpringVersion {

	private Integer majorVersion;

	private Integer minorVersion;

	private Integer patchVersion;

	private SpringVersionStage stageId;

	public SpringVersion() {
		// TODO Auto-generated constructor stub
	}

	public void setMajorVersion(Integer majorVersion) {
		this.majorVersion = majorVersion;
	}

	public void setMinorVersion(Integer minorVersion) {
		this.minorVersion = minorVersion;
	}

	public void setPatchVersion(Integer patchVersion) {
		this.patchVersion = patchVersion;
	}

	public void setStageId(SpringVersionStage stageId) {
		this.stageId = stageId;
	}


}
