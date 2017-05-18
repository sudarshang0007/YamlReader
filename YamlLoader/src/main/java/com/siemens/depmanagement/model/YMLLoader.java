package com.siemens.depmanagement.model;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.siemens.depmanagement.util.JavaYmlUtil;

public class YMLLoader {

	public static void main(String[] args) {

		Logger logger = Logger.getLogger(YMLLoader.class);
		DependencyWrapper dw = null;

		// Read Yml into DTO
		ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
		InputStream stream = YMLLoader.class.getResourceAsStream("/bom.yml");

		try {
			dw = mapper.readValue(stream, DependencyWrapper.class);

		} catch (IOException e) {
			logger.error(e);
		}

		// DTO To domain OBject
		if (dw != null) {
			
			JavaYmlUtil ymlUtil = new JavaYmlUtil();
			JavaDependencyResolver resolver =  (JavaDependencyResolver) ymlUtil.getJavaDependencies(dw);
		
			System.out.println(resolver.getBoms().size());
			System.out.println(resolver.getDependencies().size());
		}

	}
}
