package com.siemens.depmanagement.util;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.siemens.depmanagement.model.DependencyResolver;
import com.siemens.depmanagement.model.DependencyWrapper;
import com.siemens.depmanagement.model.JavaDependencyConfig;
import com.siemens.depmanagement.model.JavaDependencyResolver;
import com.siemens.depmanagement.model.JavaDependencyYmlDto;
import com.siemens.depmanagement.model.SpringVersion;
import com.siemens.depmanagement.model.SpringVersionRange;
import com.siemens.depmanagement.model.SpringVersionStage;
import com.siemens.depmanagement.model.YmlMapping;

@Component
public class JavaYmlUtil {

	Logger logger = Logger.getLogger(JavaYmlUtil.class);

	public JavaYmlUtil() {
		// to do
	}

	public DependencyResolver getJavaDependencies(DependencyWrapper wrapper) {

		JavaDependencyResolver resolver = new JavaDependencyResolver();

		List<JavaDependencyYmlDto> boms = null;
		List<JavaDependencyYmlDto> dependencies = null;

		List<JavaDependencyConfig> bomList = new ArrayList<>();
		List<JavaDependencyConfig> depList = new ArrayList<>();

		if (wrapper != null) {
			boms = wrapper.getBoms();
			dependencies = wrapper.getDeps();
			bomList = parseDependencies(boms);
			depList = parseDependencies(dependencies);
		}
		resolver.setBoms(bomList);
		resolver.setDependencies(depList);

		return resolver;
	}

	private List<JavaDependencyConfig> parseDependencies(List<JavaDependencyYmlDto> ymlListDTO) {

		List<JavaDependencyConfig> list = new ArrayList<>();
		JavaDependencyConfig dependencyConfig = new JavaDependencyConfig();

		for (JavaDependencyYmlDto yml : ymlListDTO) {

			dependencyConfig.setId(yml.getId());
			dependencyConfig.setCategory(yml.getCategory());
			dependencyConfig.setName(yml.getName());
			dependencyConfig.setGroupId(yml.getGroupId());
			dependencyConfig.setArtifactId(yml.getArtifactId());
			dependencyConfig.setScope(yml.getScope());
			dependencyConfig.setDescription(yml.getDescription());
			dependencyConfig.setBomList(yml.getBom());

			// dependencyConfig.setVersionRange(null);
			if (yml.getVersionRange() != null) {
				dependencyConfig.setVersionRange(getVersionRange(yml.getVersionRange()));
			}

			// Specific Version Mapping
			// dependencyConfig.setSpecificMapping(null);

			list.add(dependencyConfig);
		}
		return list;
	}

	private SpringVersionRange getVersionRange(String version) {

		SpringVersionRange versionRange = new SpringVersionRange();
		SpringVersion firstVersion = new SpringVersion();
		SpringVersion secondVersion = new SpringVersion();

		String[] versionSet = version.split(",");
		logger.info("size of splitted array :" + versionSet.length);

		if (versionSet.length > 1) {

			versionRange.setIsInclusiveStart(versionSet[0].contains("[") ? true : false);
			versionSet[0] = versionSet[0].replace('[', ' ').replace('(', ' ').trim();

			versionRange.setIsInclusiveEnd(versionSet[1].contains("]") ? true : false);
			versionSet[1] = versionSet[1].replace(']', ' ').replace(')', ' ').trim();

			System.out.println(versionSet[0]);

			String[] startVersion = versionSet[0].split("\\.");
			firstVersion.setMajorVersion(Integer.parseInt(startVersion[0]));
			firstVersion.setMinorVersion(Integer.parseInt(startVersion[1]));
			firstVersion.setPatchVersion(Integer.parseInt(startVersion[2]));
			firstVersion.setStageId(SpringVersionStage
					.valueOf(startVersion[3].length() == 2 ? startVersion[3].substring(0, 1) : startVersion[3].length() == 2 ? startVersion[3].substring(0, 2) : startVersion[3]));

			String[] endVersion = versionSet[1].split("\\.");
			secondVersion.setMajorVersion(Integer.parseInt(endVersion[0]));
			secondVersion.setMinorVersion(Integer.parseInt(endVersion[1]));
			secondVersion.setPatchVersion(Integer.parseInt(endVersion[2]));
			secondVersion.setStageId(SpringVersionStage
					.valueOf(endVersion[3].length() == 3 ? endVersion[3].substring(0, 2) : endVersion[3]));

			versionRange.getVersion().add(firstVersion);
			versionRange.getVersion().add(secondVersion);

		} else {

		}

		return versionRange;
	}

}
