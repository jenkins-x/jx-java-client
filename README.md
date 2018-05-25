# Jenkins X Java Client

This library implements a Java client for working with [Jenkins X](https://jenkins-x.io/) for use in things like:

* Jenkins plugins such as [jx-resources]
* IDE plugins such as for IDEA or eclipse 
* other Java tools that want to intergrate closely with Jenkins X

## Using the PipelineClient

You can create and use a client like this:

```java

PipelineClient client = PipelineClient.newInstance();

// load and start watching pipelnes
client.start();

List<PipelineActivity> pipelines = client.getPipelines();

// stop watching
client.close();
```

You can also listen to `PipelineActivity` resources being added/updated/deleted via a listener...

```java
Watcher<PipelineActivity> listener = new Watcher<PipelineActivity>() {
    @Override
    public void eventReceived(Action action, PipelineActivity pipelineActivity) {
        // on add/modify/delete of a pipeline
    }

    @Override
    public void onClose(KubernetesClientException e) {       
    }
};
client.addListener(listener);
```


                          