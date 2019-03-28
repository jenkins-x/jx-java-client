
# IoK8sApiBatchV1JobCondition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lastProbeTime** | [**OffsetDateTime**](OffsetDateTime.md) | Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers. |  [optional]
**lastTransitionTime** | [**OffsetDateTime**](OffsetDateTime.md) | Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers. |  [optional]
**message** | **String** | Human readable message indicating details about last transition. |  [optional]
**reason** | **String** | (brief) reason for the condition&#39;s last transition. |  [optional]
**status** | **String** | Status of the condition, one of True, False, Unknown. | 
**type** | **String** | Type of job condition, Complete or Failed. | 



