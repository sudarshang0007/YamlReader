package com.siemens.depmanagement.model;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

public class YMLLoader {
	
	
	public static void main(String[] args) {
		new YMLLoader().runner();
		
	}

	void runner() {
		ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
		InputStream stream = YMLLoader.class.getResourceAsStream("/bom.yml");

		try {
			DependencyWrapper dw = mapper.readValue(stream, DependencyWrapper.class);
			System.out.println(dw.toString());
			

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	static class DependencyWrapper {
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

}
