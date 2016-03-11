package com.linkedin.camus.etl.kafka.common;

import com.linkedin.camus.etl.DestinationFileAggregator;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.mapreduce.JobContext;

public class EmptyDestinationFileAggregator implements DestinationFileAggregator {

    @Override
    public void addDestinationFile(Path path) {
        // do nothing
    }

    @Override
    public void setJobContext(JobContext job) {
        // do nothing
    }

    @Override
    public JobContext getJobContext() {
        return null;
    }
}
