package it.unipi.di.acube.batframework.datasetPlugins;

import it.unipi.di.acube.batframework.problems.C2WDataset;


public class GERDAQTrainADatasetTest extends DatasetTestBase{

	@Override
	public C2WDataset build() {
		return DatasetBuilder.getGerdaqTrainA();
	}

}
