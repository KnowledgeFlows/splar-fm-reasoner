package splar.plugins.reasoners.tests.sat.sat4j;

import splar.core.fm.FeatureModel;
import splar.core.fm.reasoning.FMReasoningInterface;
import splar.plugins.reasoners.sat.sat4j.FMReasoningWithSAT;
import splar.plugins.reasoners.tests.FMReasoningInterfaceTest;

public class ReasoningWithSATTest extends FMReasoningInterfaceTest {
	
	protected FMReasoningInterface createReasoner(FeatureModel model) {
		return new FMReasoningWithSAT("MiniSATHeap", model, 60000);
	}
}
