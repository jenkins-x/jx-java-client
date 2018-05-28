/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.jenkins.x.client.tree;

import io.jenkins.x.client.kube.PipelineActivity;
import io.jenkins.x.client.kube.PipelineActivitySpec;
import io.jenkins.x.client.kube.PipelineActivityStep;

import java.util.List;

import static io.jenkins.x.client.util.Times.elapsedTime;

/**
 */
public class BuildNode extends TreeNode<String, StageNode> {
    private PipelineActivity pipeline;

    public BuildNode(BranchNode branchNode, String build) {
        super(branchNode, build);
    }

    @Override
    public String getIconPath() {
        switch (getStatus()) {
            case "Succeeded":
                return "images/atomist_build_passed.png";
            case "Failed":
            case "Error":
                return "images/atomist_build_failed.png";
            case "Running":
                return "images/spinner.gif";
            case "Aborted":
                return "images/circle-64.png";
        }
        return "";
    }

    @Override
    public String getTooltip() {
        PipelineActivitySpec step = getSpec();
        return "#" + getBuild() + ": " + getStatus() + elapsedTime(" Duration: ", step.getStartedTimestamp(), step.getCompletedTimestamp());
    }

    public PipelineActivity getPipeline() {
        if (pipeline == null) {
            pipeline = new PipelineActivity();
        }
        return pipeline;
    }

    public void setPipeline(PipelineActivity pipeline) {
        this.pipeline = pipeline;
    }

    public PipelineActivitySpec getSpec() {
        PipelineActivitySpec spec = getPipeline().getSpec();
        if (spec == null) {
            spec = new PipelineActivitySpec();
            pipeline.setSpec(spec);
        }
        return spec;
    }

    public String getBuild() {
        return getSpec().getBuild();
    }

    public String getVersion() {
        return getSpec().getVersion();
    }

    public String getBuildUrl() {
        return getSpec().getBuildUrl();
    }

    public String getBuildLogsUrl() {
        return getSpec().getBuildLogsUrl();
    }

    public String getGitUrl() {
        return getSpec().getGitUrl();
    }

    public String getGitRepository() {
        return getSpec().getGitRepository();
    }

    public String getGitOwner() {
        return getSpec().getGitOwner();
    }

    public String getReleaseNotesUrl() {
        return getSpec().getReleaseNotesUrl();
    }

    public String getStatus() {
        return getSpec().getStatus();
    }

    public String getStartedTimestamp() {
        return getSpec().getStartedTimestamp();
    }

    public String getCompletedTimestamp() {
        return getSpec().getCompletedTimestamp();
    }

    public List<PipelineActivityStep> getSteps() {
        return getSpec().getSteps();
    }


}
