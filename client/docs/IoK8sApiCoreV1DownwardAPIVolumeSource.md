
# IoK8sApiCoreV1DownwardAPIVolumeSource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**defaultMode** | **Integer** | Optional: mode bits to use on created files by default. Must be a value between 0 and 0777. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set. |  [optional]
**items** | [**List&lt;IoK8sApiCoreV1DownwardAPIVolumeFile&gt;**](IoK8sApiCoreV1DownwardAPIVolumeFile.md) | Items is a list of downward API volume file |  [optional]



