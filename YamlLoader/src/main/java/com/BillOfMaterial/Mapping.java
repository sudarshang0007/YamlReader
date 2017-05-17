
package com.BillOfMaterial;


public class Mapping {

private String versionRange;
private String version;
private String repositories;

public String getVersionRange() {
return versionRange;
}

@Override
public String toString() {
	return "Mapping [versionRange=" + versionRange + ", version=" + version + ", repositories=" + repositories + "]";
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

}
