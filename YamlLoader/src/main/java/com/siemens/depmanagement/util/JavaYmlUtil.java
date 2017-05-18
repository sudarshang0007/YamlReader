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

			// versionRange
			// dependencyConfig.setVersionRange(null);

			// Specific Version Mapping
			// dependencyConfig.setSpecificMapping(null);

			list.add(dependencyConfig);
		}
		return list;
	}

}
