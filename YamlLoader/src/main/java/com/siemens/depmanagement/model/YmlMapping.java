package com.siemens.depmanagement.model;

public class YmlMapping {

private String versionRange;
private String version;
private String repositories;


public YmlMapping(String versionRange, String version, String repositories) {
	super();
	this.versionRange = versionRange;
	this.version = version;
	this.repositories = repositories;
}

public YmlMapping() {
	// TODO Auto-generated constructor stub
}

public String getVersionRange() {
return versionRange;
}

public void setVersionRange(String versionRange) {
this.versionRange = versionRange;
}

public String getVersion() {
return version;
}

public void setVersion(String version) {
this.version = version;
}

public String getRepositories() {
return repositories;
}

public void setRepositories(String repositories) {
this.repositories = repositories;
}

@Override
public String toString() {
	return "Mapping [versionRange=" + versionRange + ", version=" + version + ", repositories=" + repositories + "]";
}

}