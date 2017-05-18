package com.siemens.depmanagement.model;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class JavaDependencyResolver implements DependencyResolver {

	private List<JavaDependencyConfig> boms;
	private List<JavaDependencyConfig> dependencies;

	public List<JavaDependencyConfig> getBoms() {
		return boms;
	}

	public List<JavaDependencyConfig> getDependencies() {
		return dependencies;
	}

	public void setBoms(List<JavaDependencyConfig> boms) {
		this.boms = boms;
	}

	public void setDependencies(List<JavaDependencyConfig> dependencies) {
		this.dependencies = dependencies;
	}

}
