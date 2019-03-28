/*
 * Jenkins X
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.client.model.IoK8sApimachineryPkgApisMetaV1Initializers;
import org.openapitools.client.model.IoK8sApimachineryPkgApisMetaV1OwnerReference;
import org.threeten.bp.OffsetDateTime;

/**
 * ObjectMeta is metadata that all persisted resources must have, which includes all objects users must create.
 */
@ApiModel(description = "ObjectMeta is metadata that all persisted resources must have, which includes all objects users must create.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-03-28T12:38:15.775957Z[Europe/London]")
public class IoK8sApimachineryPkgApisMetaV1ObjectMeta {
  public static final String SERIALIZED_NAME_ANNOTATIONS = "annotations";
  @SerializedName(SERIALIZED_NAME_ANNOTATIONS)
  private Map<String, String> annotations = null;

  public static final String SERIALIZED_NAME_CLUSTER_NAME = "clusterName";
  @SerializedName(SERIALIZED_NAME_CLUSTER_NAME)
  private String clusterName;

  public static final String SERIALIZED_NAME_CREATION_TIMESTAMP = "creationTimestamp";
  @SerializedName(SERIALIZED_NAME_CREATION_TIMESTAMP)
  private OffsetDateTime creationTimestamp;

  public static final String SERIALIZED_NAME_DELETION_GRACE_PERIOD_SECONDS = "deletionGracePeriodSeconds";
  @SerializedName(SERIALIZED_NAME_DELETION_GRACE_PERIOD_SECONDS)
  private Long deletionGracePeriodSeconds;

  public static final String SERIALIZED_NAME_DELETION_TIMESTAMP = "deletionTimestamp";
  @SerializedName(SERIALIZED_NAME_DELETION_TIMESTAMP)
  private OffsetDateTime deletionTimestamp;

  public static final String SERIALIZED_NAME_FINALIZERS = "finalizers";
  @SerializedName(SERIALIZED_NAME_FINALIZERS)
  private List<String> finalizers = null;

  public static final String SERIALIZED_NAME_GENERATE_NAME = "generateName";
  @SerializedName(SERIALIZED_NAME_GENERATE_NAME)
  private String generateName;

  public static final String SERIALIZED_NAME_GENERATION = "generation";
  @SerializedName(SERIALIZED_NAME_GENERATION)
  private Long generation;

  public static final String SERIALIZED_NAME_INITIALIZERS = "initializers";
  @SerializedName(SERIALIZED_NAME_INITIALIZERS)
  private IoK8sApimachineryPkgApisMetaV1Initializers initializers = null;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private Map<String, String> labels = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_OWNER_REFERENCES = "ownerReferences";
  @SerializedName(SERIALIZED_NAME_OWNER_REFERENCES)
  private List<IoK8sApimachineryPkgApisMetaV1OwnerReference> ownerReferences = null;

  public static final String SERIALIZED_NAME_RESOURCE_VERSION = "resourceVersion";
  @SerializedName(SERIALIZED_NAME_RESOURCE_VERSION)
  private String resourceVersion;

  public static final String SERIALIZED_NAME_SELF_LINK = "selfLink";
  @SerializedName(SERIALIZED_NAME_SELF_LINK)
  private String selfLink;

  public static final String SERIALIZED_NAME_UID = "uid";
  @SerializedName(SERIALIZED_NAME_UID)
  private String uid;

  public IoK8sApimachineryPkgApisMetaV1ObjectMeta annotations(Map<String, String> annotations) {
    this.annotations = annotations;
    return this;
  }

  public IoK8sApimachineryPkgApisMetaV1ObjectMeta putAnnotationsItem(String key, String annotationsItem) {
    if (this.annotations == null) {
      this.annotations = new HashMap<String, String>();
    }
    this.annotations.put(key, annotationsItem);
    return this;
  }

   /**
   * Annotations is an unstructured key value map stored with a resource that may be set by external tools to store and retrieve arbitrary metadata. They are not queryable and should be preserved when modifying objects. More info: http://kubernetes.io/docs/user-guide/annotations
   * @return annotations
  **/
  @ApiModelProperty(value = "Annotations is an unstructured key value map stored with a resource that may be set by external tools to store and retrieve arbitrary metadata. They are not queryable and should be preserved when modifying objects. More info: http://kubernetes.io/docs/user-guide/annotations")
  public Map<String, String> getAnnotations() {
    return annotations;
  }

  public void setAnnotations(Map<String, String> annotations) {
    this.annotations = annotations;
  }

  public IoK8sApimachineryPkgApisMetaV1ObjectMeta clusterName(String clusterName) {
    this.clusterName = clusterName;
    return this;
  }

   /**
   * The name of the cluster which the object belongs to. This is used to distinguish resources with same name and namespace in different clusters. This field is not set anywhere right now and apiserver is going to ignore it if set in create or update request.
   * @return clusterName
  **/
  @ApiModelProperty(value = "The name of the cluster which the object belongs to. This is used to distinguish resources with same name and namespace in different clusters. This field is not set anywhere right now and apiserver is going to ignore it if set in create or update request.")
  public String getClusterName() {
    return clusterName;
  }

  public void setClusterName(String clusterName) {
    this.clusterName = clusterName;
  }

  public IoK8sApimachineryPkgApisMetaV1ObjectMeta creationTimestamp(OffsetDateTime creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

   /**
   * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
   * @return creationTimestamp
  **/
  @ApiModelProperty(value = "Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.")
  public OffsetDateTime getCreationTimestamp() {
    return creationTimestamp;
  }

  public void setCreationTimestamp(OffsetDateTime creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
  }

  public IoK8sApimachineryPkgApisMetaV1ObjectMeta deletionGracePeriodSeconds(Long deletionGracePeriodSeconds) {
    this.deletionGracePeriodSeconds = deletionGracePeriodSeconds;
    return this;
  }

   /**
   * Number of seconds allowed for this object to gracefully terminate before it will be removed from the system. Only set when deletionTimestamp is also set. May only be shortened. Read-only.
   * @return deletionGracePeriodSeconds
  **/
  @ApiModelProperty(value = "Number of seconds allowed for this object to gracefully terminate before it will be removed from the system. Only set when deletionTimestamp is also set. May only be shortened. Read-only.")
  public Long getDeletionGracePeriodSeconds() {
    return deletionGracePeriodSeconds;
  }

  public void setDeletionGracePeriodSeconds(Long deletionGracePeriodSeconds) {
    this.deletionGracePeriodSeconds = deletionGracePeriodSeconds;
  }

  public IoK8sApimachineryPkgApisMetaV1ObjectMeta deletionTimestamp(OffsetDateTime deletionTimestamp) {
    this.deletionTimestamp = deletionTimestamp;
    return this;
  }

   /**
   * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
   * @return deletionTimestamp
  **/
  @ApiModelProperty(value = "Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.")
  public OffsetDateTime getDeletionTimestamp() {
    return deletionTimestamp;
  }

  public void setDeletionTimestamp(OffsetDateTime deletionTimestamp) {
    this.deletionTimestamp = deletionTimestamp;
  }

  public IoK8sApimachineryPkgApisMetaV1ObjectMeta finalizers(List<String> finalizers) {
    this.finalizers = finalizers;
    return this;
  }

  public IoK8sApimachineryPkgApisMetaV1ObjectMeta addFinalizersItem(String finalizersItem) {
    if (this.finalizers == null) {
      this.finalizers = new ArrayList<String>();
    }
    this.finalizers.add(finalizersItem);
    return this;
  }

   /**
   * Must be empty before the object is deleted from the registry. Each entry is an identifier for the responsible component that will remove the entry from the list. If the deletionTimestamp of the object is non-nil, entries in this list can only be removed.
   * @return finalizers
  **/
  @ApiModelProperty(value = "Must be empty before the object is deleted from the registry. Each entry is an identifier for the responsible component that will remove the entry from the list. If the deletionTimestamp of the object is non-nil, entries in this list can only be removed.")
  public List<String> getFinalizers() {
    return finalizers;
  }

  public void setFinalizers(List<String> finalizers) {
    this.finalizers = finalizers;
  }

  public IoK8sApimachineryPkgApisMetaV1ObjectMeta generateName(String generateName) {
    this.generateName = generateName;
    return this;
  }

   /**
   * GenerateName is an optional prefix, used by the server, to generate a unique name ONLY IF the Name field has not been provided. If this field is used, the name returned to the client will be different than the name passed. This value will also be combined with a unique suffix. The provided value has the same validation rules as the Name field, and may be truncated by the length of the suffix required to make the value unique on the server.  If this field is specified and the generated name exists, the server will NOT return a 409 - instead, it will either return 201 Created or 500 with Reason ServerTimeout indicating a unique name could not be found in the time allotted, and the client should retry (optionally after the time indicated in the Retry-After header).  Applied only if Name is not specified. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#idempotency
   * @return generateName
  **/
  @ApiModelProperty(value = "GenerateName is an optional prefix, used by the server, to generate a unique name ONLY IF the Name field has not been provided. If this field is used, the name returned to the client will be different than the name passed. This value will also be combined with a unique suffix. The provided value has the same validation rules as the Name field, and may be truncated by the length of the suffix required to make the value unique on the server.  If this field is specified and the generated name exists, the server will NOT return a 409 - instead, it will either return 201 Created or 500 with Reason ServerTimeout indicating a unique name could not be found in the time allotted, and the client should retry (optionally after the time indicated in the Retry-After header).  Applied only if Name is not specified. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#idempotency")
  public String getGenerateName() {
    return generateName;
  }

  public void setGenerateName(String generateName) {
    this.generateName = generateName;
  }

  public IoK8sApimachineryPkgApisMetaV1ObjectMeta generation(Long generation) {
    this.generation = generation;
    return this;
  }

   /**
   * A sequence number representing a specific generation of the desired state. Populated by the system. Read-only.
   * @return generation
  **/
  @ApiModelProperty(value = "A sequence number representing a specific generation of the desired state. Populated by the system. Read-only.")
  public Long getGeneration() {
    return generation;
  }

  public void setGeneration(Long generation) {
    this.generation = generation;
  }

  public IoK8sApimachineryPkgApisMetaV1ObjectMeta initializers(IoK8sApimachineryPkgApisMetaV1Initializers initializers) {
    this.initializers = initializers;
    return this;
  }

   /**
   * Get initializers
   * @return initializers
  **/
  @ApiModelProperty(value = "")
  public IoK8sApimachineryPkgApisMetaV1Initializers getInitializers() {
    return initializers;
  }

  public void setInitializers(IoK8sApimachineryPkgApisMetaV1Initializers initializers) {
    this.initializers = initializers;
  }

  public IoK8sApimachineryPkgApisMetaV1ObjectMeta labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public IoK8sApimachineryPkgApisMetaV1ObjectMeta putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<String, String>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

   /**
   * Map of string keys and values that can be used to organize and categorize (scope and select) objects. May match selectors of replication controllers and services. More info: http://kubernetes.io/docs/user-guide/labels
   * @return labels
  **/
  @ApiModelProperty(value = "Map of string keys and values that can be used to organize and categorize (scope and select) objects. May match selectors of replication controllers and services. More info: http://kubernetes.io/docs/user-guide/labels")
  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }

  public IoK8sApimachineryPkgApisMetaV1ObjectMeta name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name must be unique within a namespace. Is required when creating resources, although some resources may allow a client to request the generation of an appropriate name automatically. Name is primarily intended for creation idempotence and configuration definition. Cannot be updated. More info: http://kubernetes.io/docs/user-guide/identifiers#names
   * @return name
  **/
  @ApiModelProperty(value = "Name must be unique within a namespace. Is required when creating resources, although some resources may allow a client to request the generation of an appropriate name automatically. Name is primarily intended for creation idempotence and configuration definition. Cannot be updated. More info: http://kubernetes.io/docs/user-guide/identifiers#names")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IoK8sApimachineryPkgApisMetaV1ObjectMeta namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

   /**
   * Namespace defines the space within each name must be unique. An empty namespace is equivalent to the \&quot;default\&quot; namespace, but \&quot;default\&quot; is the canonical representation. Not all objects are required to be scoped to a namespace - the value of this field for those objects will be empty.  Must be a DNS_LABEL. Cannot be updated. More info: http://kubernetes.io/docs/user-guide/namespaces
   * @return namespace
  **/
  @ApiModelProperty(value = "Namespace defines the space within each name must be unique. An empty namespace is equivalent to the \"default\" namespace, but \"default\" is the canonical representation. Not all objects are required to be scoped to a namespace - the value of this field for those objects will be empty.  Must be a DNS_LABEL. Cannot be updated. More info: http://kubernetes.io/docs/user-guide/namespaces")
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public IoK8sApimachineryPkgApisMetaV1ObjectMeta ownerReferences(List<IoK8sApimachineryPkgApisMetaV1OwnerReference> ownerReferences) {
    this.ownerReferences = ownerReferences;
    return this;
  }

  public IoK8sApimachineryPkgApisMetaV1ObjectMeta addOwnerReferencesItem(IoK8sApimachineryPkgApisMetaV1OwnerReference ownerReferencesItem) {
    if (this.ownerReferences == null) {
      this.ownerReferences = new ArrayList<IoK8sApimachineryPkgApisMetaV1OwnerReference>();
    }
    this.ownerReferences.add(ownerReferencesItem);
    return this;
  }

   /**
   * List of objects depended by this object. If ALL objects in the list have been deleted, this object will be garbage collected. If this object is managed by a controller, then an entry in this list will point to this controller, with the controller field set to true. There cannot be more than one managing controller.
   * @return ownerReferences
  **/
  @ApiModelProperty(value = "List of objects depended by this object. If ALL objects in the list have been deleted, this object will be garbage collected. If this object is managed by a controller, then an entry in this list will point to this controller, with the controller field set to true. There cannot be more than one managing controller.")
  public List<IoK8sApimachineryPkgApisMetaV1OwnerReference> getOwnerReferences() {
    return ownerReferences;
  }

  public void setOwnerReferences(List<IoK8sApimachineryPkgApisMetaV1OwnerReference> ownerReferences) {
    this.ownerReferences = ownerReferences;
  }

  public IoK8sApimachineryPkgApisMetaV1ObjectMeta resourceVersion(String resourceVersion) {
    this.resourceVersion = resourceVersion;
    return this;
  }

   /**
   * An opaque value that represents the internal version of this object that can be used by clients to determine when objects have changed. May be used for optimistic concurrency, change detection, and the watch operation on a resource or set of resources. Clients must treat these values as opaque and passed unmodified back to the server. They may only be valid for a particular resource or set of resources.  Populated by the system. Read-only. Value must be treated as opaque by clients and . More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#concurrency-control-and-consistency
   * @return resourceVersion
  **/
  @ApiModelProperty(value = "An opaque value that represents the internal version of this object that can be used by clients to determine when objects have changed. May be used for optimistic concurrency, change detection, and the watch operation on a resource or set of resources. Clients must treat these values as opaque and passed unmodified back to the server. They may only be valid for a particular resource or set of resources.  Populated by the system. Read-only. Value must be treated as opaque by clients and . More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#concurrency-control-and-consistency")
  public String getResourceVersion() {
    return resourceVersion;
  }

  public void setResourceVersion(String resourceVersion) {
    this.resourceVersion = resourceVersion;
  }

  public IoK8sApimachineryPkgApisMetaV1ObjectMeta selfLink(String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

   /**
   * SelfLink is a URL representing this object. Populated by the system. Read-only.
   * @return selfLink
  **/
  @ApiModelProperty(value = "SelfLink is a URL representing this object. Populated by the system. Read-only.")
  public String getSelfLink() {
    return selfLink;
  }

  public void setSelfLink(String selfLink) {
    this.selfLink = selfLink;
  }

  public IoK8sApimachineryPkgApisMetaV1ObjectMeta uid(String uid) {
    this.uid = uid;
    return this;
  }

   /**
   * UID is the unique in time and space value for this object. It is typically generated by the server on successful creation of a resource and is not allowed to change on PUT operations.  Populated by the system. Read-only. More info: http://kubernetes.io/docs/user-guide/identifiers#uids
   * @return uid
  **/
  @ApiModelProperty(value = "UID is the unique in time and space value for this object. It is typically generated by the server on successful creation of a resource and is not allowed to change on PUT operations.  Populated by the system. Read-only. More info: http://kubernetes.io/docs/user-guide/identifiers#uids")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApimachineryPkgApisMetaV1ObjectMeta ioK8sApimachineryPkgApisMetaV1ObjectMeta = (IoK8sApimachineryPkgApisMetaV1ObjectMeta) o;
    return Objects.equals(this.annotations, ioK8sApimachineryPkgApisMetaV1ObjectMeta.annotations) &&
        Objects.equals(this.clusterName, ioK8sApimachineryPkgApisMetaV1ObjectMeta.clusterName) &&
        Objects.equals(this.creationTimestamp, ioK8sApimachineryPkgApisMetaV1ObjectMeta.creationTimestamp) &&
        Objects.equals(this.deletionGracePeriodSeconds, ioK8sApimachineryPkgApisMetaV1ObjectMeta.deletionGracePeriodSeconds) &&
        Objects.equals(this.deletionTimestamp, ioK8sApimachineryPkgApisMetaV1ObjectMeta.deletionTimestamp) &&
        Objects.equals(this.finalizers, ioK8sApimachineryPkgApisMetaV1ObjectMeta.finalizers) &&
        Objects.equals(this.generateName, ioK8sApimachineryPkgApisMetaV1ObjectMeta.generateName) &&
        Objects.equals(this.generation, ioK8sApimachineryPkgApisMetaV1ObjectMeta.generation) &&
        Objects.equals(this.initializers, ioK8sApimachineryPkgApisMetaV1ObjectMeta.initializers) &&
        Objects.equals(this.labels, ioK8sApimachineryPkgApisMetaV1ObjectMeta.labels) &&
        Objects.equals(this.name, ioK8sApimachineryPkgApisMetaV1ObjectMeta.name) &&
        Objects.equals(this.namespace, ioK8sApimachineryPkgApisMetaV1ObjectMeta.namespace) &&
        Objects.equals(this.ownerReferences, ioK8sApimachineryPkgApisMetaV1ObjectMeta.ownerReferences) &&
        Objects.equals(this.resourceVersion, ioK8sApimachineryPkgApisMetaV1ObjectMeta.resourceVersion) &&
        Objects.equals(this.selfLink, ioK8sApimachineryPkgApisMetaV1ObjectMeta.selfLink) &&
        Objects.equals(this.uid, ioK8sApimachineryPkgApisMetaV1ObjectMeta.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotations, clusterName, creationTimestamp, deletionGracePeriodSeconds, deletionTimestamp, finalizers, generateName, generation, initializers, labels, name, namespace, ownerReferences, resourceVersion, selfLink, uid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApimachineryPkgApisMetaV1ObjectMeta {\n");
    
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
    sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
    sb.append("    deletionGracePeriodSeconds: ").append(toIndentedString(deletionGracePeriodSeconds)).append("\n");
    sb.append("    deletionTimestamp: ").append(toIndentedString(deletionTimestamp)).append("\n");
    sb.append("    finalizers: ").append(toIndentedString(finalizers)).append("\n");
    sb.append("    generateName: ").append(toIndentedString(generateName)).append("\n");
    sb.append("    generation: ").append(toIndentedString(generation)).append("\n");
    sb.append("    initializers: ").append(toIndentedString(initializers)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    ownerReferences: ").append(toIndentedString(ownerReferences)).append("\n");
    sb.append("    resourceVersion: ").append(toIndentedString(resourceVersion)).append("\n");
    sb.append("    selfLink: ").append(toIndentedString(selfLink)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

