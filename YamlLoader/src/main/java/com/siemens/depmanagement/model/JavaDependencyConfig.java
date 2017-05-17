package com.siemens.depmanagement.model;

import java.util.Arrays;

public class JavaDependencyConfig {

	private String category;
	private String name;
	private String id;
	private String groupId;
	private String artifactId;
	private String scope;
	private SpringVersionRange versionRange;
	private String[] bomList;
	private SpecificVersionMapping specificMapping;
	
	public JavaDependencyConfig() {
	}

	
	
	@Override
	public String toString() {
		return "JavaDependencyConfig [category=" + category + ", name=" + name + ", id=" + id + ", groupId=" + groupId
				+ ", artifactId=" + artifactId + ", scope=" + scope + ", versionRange=" + versionRange + ", bomList="
				+ Arrays.toString(bomList) + ", specificMapping=" + specificMapping + "]";
	}
	
	

}
