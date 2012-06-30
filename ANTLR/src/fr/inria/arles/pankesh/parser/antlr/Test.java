package fr.inria.arles.pankesh.parser.antlr;

import java.util.List;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;

import fr.inria.arles.pankesh.common.*;

import fr.inria.arles.pankesh.dslcompiler.DeployementConstraint;
import fr.inria.arles.pankesh.dslcompiler.Mapper;
import fr.inria.arles.pankesh.semanticmodel.Device;

public class Test {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {

		if (args.length != 3) {
			System.out
					.println("usage: java -classpath <classpath> fr.inria.arles.pankesh.parser.antlr.Test "
							+ "<vocfilepath> <networkfilepath> <gendirpath> <relativepathforlogic> "
							+ "<relativepathfordevices> <relativepathforutil> ");
			System.exit(1);
		}

		// --- VocArchSpec NetworkSpec gen /logic /sim/device /util

		GlobalVariable.vocArchSpec = args[0];
		GlobalVariable.networkSpec = args[1];
		GlobalVariable.stringTemplatePath = args[2];

		List<Device> deviceList;
		List<DeployementConstraint> mappingConstraintList;

		// This code parses the Vocabulary and Network Description
		ANTLRFileStream vocArchStream = new ANTLRFileStream(
				GlobalVariable.vocArchSpec);
		VocabArchitectSpecLexer vocArchLexer = new VocabArchitectSpecLexer(
				vocArchStream);
		CommonTokenStream vocArchTokens = new CommonTokenStream(vocArchLexer);
		VocabArchitectSpecParser vocArchParser = new VocabArchitectSpecParser(
				vocArchTokens);
		vocArchParser.vocArchSpec();
		mappingConstraintList = Context.getDeploymentConstrainsList();

		// This code parses the Network description.
		ANTLRFileStream networkStream = new ANTLRFileStream(
				GlobalVariable.networkSpec);
		NetworkSpecLexer networkLexer = new NetworkSpecLexer(networkStream);
		CommonTokenStream networkTokens = new CommonTokenStream(networkLexer);
		NetworkSpecParser networkParser = new NetworkSpecParser(networkTokens);
		networkParser.networkspec();
		deviceList = Context.getDeviceList();

		// This code maps the software compoents and devices.
		Mapper.MapperAlgo(deviceList, mappingConstraintList);

	}
}
