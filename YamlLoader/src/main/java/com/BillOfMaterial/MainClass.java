package com.BillOfMaterial;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

public class MainClass {

	public static void main(String[] args) {
		new MainClass().runner();
	}

	void runner() {
		ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
		InputStream stream = MainClass.class.getResourceAsStream("/bom.yml");

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

		List<Bom> boms;
		List<Bom> deps;

		public List<Bom> getBoms() {
			return boms;
		}

		public void setBoms(List<Bom> boms) {
			this.boms = boms;
		}

		public List<Bom> getDeps() {
			return deps;
		}

		public void setDeps(List<Bom> deps) {
			this.deps = deps;
		}

		@Override
		public String toString() {
			return "DependencyWrapper [boms=" + boms + ", deps=" + deps + "]";
		}

	}
}
