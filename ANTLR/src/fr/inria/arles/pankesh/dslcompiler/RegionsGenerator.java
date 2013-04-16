package fr.inria.arles.pankesh.dslcompiler;

import java.util.ArrayList;
import java.util.List;

import fr.inria.arles.pankesh.codegenerator.CompilationUnit;
import fr.inria.arles.pankesh.codegenerator.JavaFrameworkFromST;
import fr.inria.arles.pankesh.codegenerator.SourceFileDumper;
import fr.inria.arles.pankesh.common.GlobalVariable;
import fr.inria.arles.pankesh.semanticmodel.PrimitiveType;
import fr.inria.arles.pankesh.semanticmodel.RegionFields;
import fr.inria.arles.pankesh.semanticmodel.Regions;

public class RegionsGenerator {

	private List<RegionFields> regions = new ArrayList<RegionFields>();
	private Regions region;

	public RegionsGenerator() {
		region = new Regions(getRegionType());
	}

	public void addRegion(String regionLabel, String regionType) {
		RegionFields Field = new RegionFields(regionLabel, new PrimitiveType(regionType));
		regions.add(Field);

	}

	private List<RegionFields> getRegionType() {
		return regions;
	}

	public void generateCode() {
		// Regions region = new Regions(getRegionType());

		if (GlobalVariable.activity.equals("generateDD")) {
			generateRegionCode(region, "RegionID");
			generateRegionCode(region, "RegionLabel");
			generateRegionCode(region, "DSConvert");

		}
	}

	private void generateRegionCode(Regions region, String className) {

		/*
		 * JavaFrameworkFromST generatedRegion = new JavaFrameworkFromST();
		 * CompilationUnit generatedCU = generatedRegion
		 * .buildAbstractClassOFRegion(region, className); SourceFileDumper
		 * dumpGeneratedRegion = new SourceFileDumper();
		 * dumpGeneratedRegion.dumpCompilationUnit(generatedCU);
		 */

	}

}
