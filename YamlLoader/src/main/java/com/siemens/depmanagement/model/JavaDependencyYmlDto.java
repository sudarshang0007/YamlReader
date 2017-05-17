package com.siemens.depmanagement.model;

import java.util.Arrays;
import java.util.List;

public class JavaDependencyYmlDto {

	private String category;
	private String name;
	private String id;
	private String groupId;
	private String artifactId;
	private String scope;
	private String versionRange;
	private String description;
	private String[] bom;
	private List<YmlMapping> mappings;

	public JavaDependencyYmlDto() {
		// Default constructor
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

	public String getVersionRange() {
		return versionRange;
	}

	public String getDescription() {
		return description;
	}

	public String[] getBom() {
		return bom;
	}

	public List<YmlMapping> getMappings() {
		return mappings;
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

	public void setVersionRange(String versionRange) {
		this.versionRange = versionRange;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setBom(String[] bom) {
		this.bom = bom;
	}

	public void setMappings(List<YmlMapping> mappings) {
		this.mappings = mappings;
	}

	@Override
	public String toString() {
		return "JavaDependencyYmlDto [group=" + category + ", \nname=" + name + ", \nid=" + id + ", \ngroupId="
				+ groupId + ", \nartifactId=" + artifactId + ", \nscope=" + scope + ", \nversionRange=" + versionRange
				+ ", \nbom=" + Arrays.toString(bom) + ", \nmappings=" + mappings + "]\n\n\n";
	}

}
