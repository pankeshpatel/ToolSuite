package fr.inria.arles.pankesh.parser.antlr;

import java.util.List;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;

import fr.inria.arles.pankesh.common.GlobalVariable;
import fr.inria.arles.pankesh.dslcompiler.DeployementConstraint;
import fr.inria.arles.pankesh.dslcompiler.Linker;
import fr.inria.arles.pankesh.dslcompiler.Mapper;
import fr.inria.arles.pankesh.semanticmodel.Device;

public class Test {

	/**
	 * @param args
	 * @throws Exception
	 */
	
	public static void main(String[] args) throws Exception {

		// if (args.length != 5) {
		//
		// System.out
		// .println("usage: java -classpath <classpath> fr.inria.arles.pankesh.parser.antlr.Test "
		// +
		// "<vocfilepath> <networkfilepath> <gendirpath> <relativepathforlogic> "
		// + "<relativepathfordevices> <relativepathforutil> ");
		// System.exit(1);
		// }

		// --- VocArchSpec NetworkSpec gen /logic /sim/device /util

		GlobalVariable.vocabSpec = args[0];
		GlobalVariable.archSpec = args[1];
		GlobalVariable.networkSpec = args[2];
		GlobalVariable.stringTemplatePath = args[3];
		GlobalVariable.activity = args[4];
		

		if (GlobalVariable.activity.equals("generateDD")) {

			// This code parses the Vocabulary Specification
			GlobalVariable.frameworkRootDir = args[5];
			
			ANTLRFileStream vocStream = new ANTLRFileStream(GlobalVariable.vocabSpec);
			VocabSpecLexer vocLexer = new VocabSpecLexer(vocStream);
			CommonTokenStream vocTokens = new CommonTokenStream(vocLexer);
			VocabSpecParser vocParser = new VocabSpecParser(vocTokens);
			vocParser.vocabSpec();
		}


		if (GlobalVariable.activity.equals("generateAF")) {
			

            GlobalVariable.frameworkRootDir = args[5];
			
			// This code parses the Vocabulary specification.
			ANTLRFileStream vocStream = new ANTLRFileStream(GlobalVariable.vocabSpec);
			VocabSpecLexer vocLexer = new VocabSpecLexer(vocStream);
			CommonTokenStream vocTokens = new CommonTokenStream(vocLexer);
			VocabSpecParser vocParser = new VocabSpecParser(vocTokens);
			vocParser.vocabSpec();

			// This code parses the Architecture specification.
			ANTLRFileStream archStream = new ANTLRFileStream(GlobalVariable.archSpec);
			ArchSpecLexer archLexer = new ArchSpecLexer(archStream);
			CommonTokenStream archTokens = new CommonTokenStream(archLexer);
			ArchSpecParser archParser = new ArchSpecParser(archTokens);
			archParser.archSpec();
		}
		
		
		
		if(GlobalVariable.activity.equals("generateMapping")) {
			
			GlobalVariable.frameworkRootDir = args[5];
			
			ANTLRFileStream vocStream = new ANTLRFileStream(GlobalVariable.vocabSpec);
			VocabSpecLexer vocLexer = new VocabSpecLexer(vocStream);
			CommonTokenStream vocTokens = new CommonTokenStream(vocLexer);
			VocabSpecParser vocParser = new VocabSpecParser(vocTokens);
			vocParser.vocabSpec();	
			
			ANTLRFileStream archStream = new ANTLRFileStream(
					GlobalVariable.archSpec);
			ArchSpecLexer archLexer = new ArchSpecLexer(archStream);
			CommonTokenStream archTokens = new CommonTokenStream(archLexer);
			ArchSpecParser archParser = new ArchSpecParser(archTokens);
			archParser.archSpec();
					
					
			List<Device> deviceList;
			List<DeployementConstraint> mappingConstraintList;
					
			mappingConstraintList = Context.getDeploymentConstrainsList();

					// This code parses the Network description.
			ANTLRFileStream networkStream = new ANTLRFileStream(GlobalVariable.networkSpec);
			NetworkSpecLexer networkLexer = new NetworkSpecLexer(networkStream);
			CommonTokenStream networkTokens = new CommonTokenStream(networkLexer);
			NetworkSpecParser networkParser = new NetworkSpecParser(networkTokens);
			networkParser.networkspec();
			deviceList = Context.getDeviceList();

			// This code maps the software compoents and devices.
			Mapper.MapperAlgo(deviceList, mappingConstraintList);			
		
		}
		
		
		if(GlobalVariable.activity.equals("linking")) {
			
			GlobalVariable.frameworkRootDir = args[5];
			
			Linker.linkerAlgo();			
		
		}
		
		
		// List<Device> deviceList;
		// List<DeployementConstraint> mappingConstraintList;
		//
		// // This code parses the Vocabulary Specification
		//
		// ANTLRFileStream vocStream = new ANTLRFileStream(
		// GlobalVariable.vocabSpec);
		// VocabSpecLexer vocLexer = new VocabSpecLexer(vocStream);
		// CommonTokenStream vocTokens = new CommonTokenStream(vocLexer);
		// VocabSpecParser vocParser = new VocabSpecParser(vocTokens);
		// vocParser.vocabSpec();
		//
		// // This code parses the Architecture Specificaton
		// ANTLRFileStream archStream = new ANTLRFileStream(
		// GlobalVariable.archSpec);
		// ArchSpecLexer archLexer = new ArchSpecLexer(archStream);
		// CommonTokenStream archTokens = new CommonTokenStream(archLexer);
		// ArchSpecParser archParser = new ArchSpecParser(archTokens);
		// archParser.archSpec();
		//
		// mappingConstraintList = Context.getDeploymentConstrainsList();
		//
		// // This code parses the Network description.
		// ANTLRFileStream networkStream = new ANTLRFileStream(
		// GlobalVariable.networkSpec);
		// NetworkSpecLexer networkLexer = new NetworkSpecLexer(networkStream);
		// CommonTokenStream networkTokens = new
		// CommonTokenStream(networkLexer);
		// NetworkSpecParser networkParser = new
		// NetworkSpecParser(networkTokens);
		// networkParser.networkspec();
		// deviceList = Context.getDeviceList();
		//
		// // This code maps the software compoents and devices.
		// Mapper.MapperAlgo(deviceList, mappingConstraintList);

	}
}
