package com.siemens.depmanagement.model;

import java.util.Arrays;

public class JavaDependencyConfig {

	private String category;
	private String name;
	private String id;
	private String groupId;
	private String artifactId;
	private String scope;
	private String description;
	private SpringVersionRange versionRange;
	private String[] bomList;
	private SpecificVersionMapping specificMapping;

	public JavaDependencyConfig() {
		// to do
	}

	public String getCategory() {
		return category;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public String getGroupId() {
		return groupId;
	}

	public String getArtifactId() {
		return artifactId;
	}

	public String getScope() {
		return scope;
	}

	public SpringVersionRange getVersionRange() {
		return versionRange;
	}

	public String[] getBomList() {
		return bomList;
	}

	public SpecificVersionMapping getSpecificMapping() {
		return specificMapping;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public void setArtifactId(String artifactId) {
		this.artifactId = artifactId;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public void setVersionRange(SpringVersionRange versionRange) {
		this.versionRange = versionRange;
	}

	public void setBomList(String[] bomList) {
		this.bomList = bomList;
	}

	public void setSpecificMapping(SpecificVersionMapping specificMapping) {
		this.specificMapping = specificMapping;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "JavaDependencyConfig [category=" + category + ", name=" + name + ", id=" + id + ", groupId=" + groupId
				+ ", artifactId=" + artifactId + ", scope=" + scope + ", description=" + description + ", versionRange="
				+ versionRange + ", bomList=" + Arrays.toString(bomList) + ", specificMapping=" + specificMapping + "]";
	}

}
