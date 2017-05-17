package com.BillOfMaterial;

import java.util.List;

public class Bom {

	private String name;
	private String groupId;
	private String artifactId;
	private Integer order;
	private List<Mapping> mappings = null;
	private List<String> additionalBoms;
	private String version;

	public List<String> getAdditionalBoms() {
		return additionalBoms;
	}

	public void setAdditionalBoms(List<String> additionalBoms) {
		this.additionalBoms = additionalBoms;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getArtifactId() {
		return artifactId;
	}

	public void setArtifactId(String artifactId) {
		this.artifactId = artifactId;
	}

	public Integer getOrder() {
		return order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}

	public List<Mapping> getMappings() {
		return mappings;
	}

	public void setMappings(List<Mapping> mappings) {
		this.mappings = mappings;
	}

	
	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "Bom [name=" + name + ", groupId=" + groupId + ", artifactId=" + artifactId + ", order=" + order
				+ ", mappings=" + mappings + ", additionalBoms=" + additionalBoms + "]";
	}

}
