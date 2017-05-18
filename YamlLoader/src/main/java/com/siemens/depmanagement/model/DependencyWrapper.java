package com.siemens.depmanagement.model;

import java.util.List;

public class DependencyWrapper {
	
	public DependencyWrapper() {
	}

	List<JavaDependencyYmlDto> boms;
	List<JavaDependencyYmlDto> deps;

	public List<JavaDependencyYmlDto> getBoms() {
		return boms;
	}

	public void setBoms(List<JavaDependencyYmlDto> boms) {
		this.boms = boms;
	}

	public List<JavaDependencyYmlDto> getDeps() {
		return deps;
	}

	public void setDeps(List<JavaDependencyYmlDto> deps) {
		this.deps = deps;
	}

	@Override
	public String toString() {
		return "DependencyWrapper [boms=" + boms + ", deps=" + deps + "]";
	}

}
