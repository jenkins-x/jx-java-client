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
import org.openapitools.client.model.IoK8sApiCoreV1AWSElasticBlockStoreVolumeSource;
import org.openapitools.client.model.IoK8sApiCoreV1AzureDiskVolumeSource;
import org.openapitools.client.model.IoK8sApiCoreV1AzureFileVolumeSource;
import org.openapitools.client.model.IoK8sApiCoreV1CephFSVolumeSource;
import org.openapitools.client.model.IoK8sApiCoreV1CinderVolumeSource;
import org.openapitools.client.model.IoK8sApiCoreV1ConfigMapVolumeSource;
import org.openapitools.client.model.IoK8sApiCoreV1DownwardAPIVolumeSource;
import org.openapitools.client.model.IoK8sApiCoreV1EmptyDirVolumeSource;
import org.openapitools.client.model.IoK8sApiCoreV1FCVolumeSource;
import org.openapitools.client.model.IoK8sApiCoreV1FlexVolumeSource;
import org.openapitools.client.model.IoK8sApiCoreV1FlockerVolumeSource;
import org.openapitools.client.model.IoK8sApiCoreV1GCEPersistentDiskVolumeSource;
import org.openapitools.client.model.IoK8sApiCoreV1GitRepoVolumeSource;
import org.openapitools.client.model.IoK8sApiCoreV1GlusterfsVolumeSource;
import org.openapitools.client.model.IoK8sApiCoreV1HostPathVolumeSource;
import org.openapitools.client.model.IoK8sApiCoreV1ISCSIVolumeSource;
import org.openapitools.client.model.IoK8sApiCoreV1NFSVolumeSource;
import org.openapitools.client.model.IoK8sApiCoreV1PersistentVolumeClaimVolumeSource;
import org.openapitools.client.model.IoK8sApiCoreV1PhotonPersistentDiskVolumeSource;
import org.openapitools.client.model.IoK8sApiCoreV1PortworxVolumeSource;
import org.openapitools.client.model.IoK8sApiCoreV1ProjectedVolumeSource;
import org.openapitools.client.model.IoK8sApiCoreV1QuobyteVolumeSource;
import org.openapitools.client.model.IoK8sApiCoreV1RBDVolumeSource;
import org.openapitools.client.model.IoK8sApiCoreV1ScaleIOVolumeSource;
import org.openapitools.client.model.IoK8sApiCoreV1SecretVolumeSource;
import org.openapitools.client.model.IoK8sApiCoreV1StorageOSVolumeSource;
import org.openapitools.client.model.IoK8sApiCoreV1VsphereVirtualDiskVolumeSource;

/**
 * Volume represents a named volume in a pod that may be accessed by any container in the pod.
 */
@ApiModel(description = "Volume represents a named volume in a pod that may be accessed by any container in the pod.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-03-28T12:38:15.775957Z[Europe/London]")
public class IoK8sApiCoreV1Volume {
  public static final String SERIALIZED_NAME_AWS_ELASTIC_BLOCK_STORE = "awsElasticBlockStore";
  @SerializedName(SERIALIZED_NAME_AWS_ELASTIC_BLOCK_STORE)
  private IoK8sApiCoreV1AWSElasticBlockStoreVolumeSource awsElasticBlockStore = null;

  public static final String SERIALIZED_NAME_AZURE_DISK = "azureDisk";
  @SerializedName(SERIALIZED_NAME_AZURE_DISK)
  private IoK8sApiCoreV1AzureDiskVolumeSource azureDisk = null;

  public static final String SERIALIZED_NAME_AZURE_FILE = "azureFile";
  @SerializedName(SERIALIZED_NAME_AZURE_FILE)
  private IoK8sApiCoreV1AzureFileVolumeSource azureFile = null;

  public static final String SERIALIZED_NAME_CEPHFS = "cephfs";
  @SerializedName(SERIALIZED_NAME_CEPHFS)
  private IoK8sApiCoreV1CephFSVolumeSource cephfs = null;

  public static final String SERIALIZED_NAME_CINDER = "cinder";
  @SerializedName(SERIALIZED_NAME_CINDER)
  private IoK8sApiCoreV1CinderVolumeSource cinder = null;

  public static final String SERIALIZED_NAME_CONFIG_MAP = "configMap";
  @SerializedName(SERIALIZED_NAME_CONFIG_MAP)
  private IoK8sApiCoreV1ConfigMapVolumeSource configMap = null;

  public static final String SERIALIZED_NAME_DOWNWARD_A_P_I = "downwardAPI";
  @SerializedName(SERIALIZED_NAME_DOWNWARD_A_P_I)
  private IoK8sApiCoreV1DownwardAPIVolumeSource downwardAPI = null;

  public static final String SERIALIZED_NAME_EMPTY_DIR = "emptyDir";
  @SerializedName(SERIALIZED_NAME_EMPTY_DIR)
  private IoK8sApiCoreV1EmptyDirVolumeSource emptyDir = null;

  public static final String SERIALIZED_NAME_FC = "fc";
  @SerializedName(SERIALIZED_NAME_FC)
  private IoK8sApiCoreV1FCVolumeSource fc = null;

  public static final String SERIALIZED_NAME_FLEX_VOLUME = "flexVolume";
  @SerializedName(SERIALIZED_NAME_FLEX_VOLUME)
  private IoK8sApiCoreV1FlexVolumeSource flexVolume = null;

  public static final String SERIALIZED_NAME_FLOCKER = "flocker";
  @SerializedName(SERIALIZED_NAME_FLOCKER)
  private IoK8sApiCoreV1FlockerVolumeSource flocker = null;

  public static final String SERIALIZED_NAME_GCE_PERSISTENT_DISK = "gcePersistentDisk";
  @SerializedName(SERIALIZED_NAME_GCE_PERSISTENT_DISK)
  private IoK8sApiCoreV1GCEPersistentDiskVolumeSource gcePersistentDisk = null;

  public static final String SERIALIZED_NAME_GIT_REPO = "gitRepo";
  @SerializedName(SERIALIZED_NAME_GIT_REPO)
  private IoK8sApiCoreV1GitRepoVolumeSource gitRepo = null;

  public static final String SERIALIZED_NAME_GLUSTERFS = "glusterfs";
  @SerializedName(SERIALIZED_NAME_GLUSTERFS)
  private IoK8sApiCoreV1GlusterfsVolumeSource glusterfs = null;

  public static final String SERIALIZED_NAME_HOST_PATH = "hostPath";
  @SerializedName(SERIALIZED_NAME_HOST_PATH)
  private IoK8sApiCoreV1HostPathVolumeSource hostPath = null;

  public static final String SERIALIZED_NAME_ISCSI = "iscsi";
  @SerializedName(SERIALIZED_NAME_ISCSI)
  private IoK8sApiCoreV1ISCSIVolumeSource iscsi = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NFS = "nfs";
  @SerializedName(SERIALIZED_NAME_NFS)
  private IoK8sApiCoreV1NFSVolumeSource nfs = null;

  public static final String SERIALIZED_NAME_PERSISTENT_VOLUME_CLAIM = "persistentVolumeClaim";
  @SerializedName(SERIALIZED_NAME_PERSISTENT_VOLUME_CLAIM)
  private IoK8sApiCoreV1PersistentVolumeClaimVolumeSource persistentVolumeClaim = null;

  public static final String SERIALIZED_NAME_PHOTON_PERSISTENT_DISK = "photonPersistentDisk";
  @SerializedName(SERIALIZED_NAME_PHOTON_PERSISTENT_DISK)
  private IoK8sApiCoreV1PhotonPersistentDiskVolumeSource photonPersistentDisk = null;

  public static final String SERIALIZED_NAME_PORTWORX_VOLUME = "portworxVolume";
  @SerializedName(SERIALIZED_NAME_PORTWORX_VOLUME)
  private IoK8sApiCoreV1PortworxVolumeSource portworxVolume = null;

  public static final String SERIALIZED_NAME_PROJECTED = "projected";
  @SerializedName(SERIALIZED_NAME_PROJECTED)
  private IoK8sApiCoreV1ProjectedVolumeSource projected = null;

  public static final String SERIALIZED_NAME_QUOBYTE = "quobyte";
  @SerializedName(SERIALIZED_NAME_QUOBYTE)
  private IoK8sApiCoreV1QuobyteVolumeSource quobyte = null;

  public static final String SERIALIZED_NAME_RBD = "rbd";
  @SerializedName(SERIALIZED_NAME_RBD)
  private IoK8sApiCoreV1RBDVolumeSource rbd = null;

  public static final String SERIALIZED_NAME_SCALE_I_O = "scaleIO";
  @SerializedName(SERIALIZED_NAME_SCALE_I_O)
  private IoK8sApiCoreV1ScaleIOVolumeSource scaleIO = null;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private IoK8sApiCoreV1SecretVolumeSource secret = null;

  public static final String SERIALIZED_NAME_STORAGEOS = "storageos";
  @SerializedName(SERIALIZED_NAME_STORAGEOS)
  private IoK8sApiCoreV1StorageOSVolumeSource storageos = null;

  public static final String SERIALIZED_NAME_VSPHERE_VOLUME = "vsphereVolume";
  @SerializedName(SERIALIZED_NAME_VSPHERE_VOLUME)
  private IoK8sApiCoreV1VsphereVirtualDiskVolumeSource vsphereVolume = null;

  public IoK8sApiCoreV1Volume awsElasticBlockStore(IoK8sApiCoreV1AWSElasticBlockStoreVolumeSource awsElasticBlockStore) {
    this.awsElasticBlockStore = awsElasticBlockStore;
    return this;
  }

   /**
   * Get awsElasticBlockStore
   * @return awsElasticBlockStore
  **/
  @ApiModelProperty(value = "")
  public IoK8sApiCoreV1AWSElasticBlockStoreVolumeSource getAwsElasticBlockStore() {
    return awsElasticBlockStore;
  }

  public void setAwsElasticBlockStore(IoK8sApiCoreV1AWSElasticBlockStoreVolumeSource awsElasticBlockStore) {
    this.awsElasticBlockStore = awsElasticBlockStore;
  }

  public IoK8sApiCoreV1Volume azureDisk(IoK8sApiCoreV1AzureDiskVolumeSource azureDisk) {
    this.azureDisk = azureDisk;
    return this;
  }

   /**
   * Get azureDisk
   * @return azureDisk
  **/
  @ApiModelProperty(value = "")
  public IoK8sApiCoreV1AzureDiskVolumeSource getAzureDisk() {
    return azureDisk;
  }

  public void setAzureDisk(IoK8sApiCoreV1AzureDiskVolumeSource azureDisk) {
    this.azureDisk = azureDisk;
  }

  public IoK8sApiCoreV1Volume azureFile(IoK8sApiCoreV1AzureFileVolumeSource azureFile) {
    this.azureFile = azureFile;
    return this;
  }

   /**
   * Get azureFile
   * @return azureFile
  **/
  @ApiModelProperty(value = "")
  public IoK8sApiCoreV1AzureFileVolumeSource getAzureFile() {
    return azureFile;
  }

  public void setAzureFile(IoK8sApiCoreV1AzureFileVolumeSource azureFile) {
    this.azureFile = azureFile;
  }

  public IoK8sApiCoreV1Volume cephfs(IoK8sApiCoreV1CephFSVolumeSource cephfs) {
    this.cephfs = cephfs;
    return this;
  }

   /**
   * Get cephfs
   * @return cephfs
  **/
  @ApiModelProperty(value = "")
  public IoK8sApiCoreV1CephFSVolumeSource getCephfs() {
    return cephfs;
  }

  public void setCephfs(IoK8sApiCoreV1CephFSVolumeSource cephfs) {
    this.cephfs = cephfs;
  }

  public IoK8sApiCoreV1Volume cinder(IoK8sApiCoreV1CinderVolumeSource cinder) {
    this.cinder = cinder;
    return this;
  }

   /**
   * Get cinder
   * @return cinder
  **/
  @ApiModelProperty(value = "")
  public IoK8sApiCoreV1CinderVolumeSource getCinder() {
    return cinder;
  }

  public void setCinder(IoK8sApiCoreV1CinderVolumeSource cinder) {
    this.cinder = cinder;
  }

  public IoK8sApiCoreV1Volume configMap(IoK8sApiCoreV1ConfigMapVolumeSource configMap) {
    this.configMap = configMap;
    return this;
  }

   /**
   * Get configMap
   * @return configMap
  **/
  @ApiModelProperty(value = "")
  public IoK8sApiCoreV1ConfigMapVolumeSource getConfigMap() {
    return configMap;
  }

  public void setConfigMap(IoK8sApiCoreV1ConfigMapVolumeSource configMap) {
    this.configMap = configMap;
  }

  public IoK8sApiCoreV1Volume downwardAPI(IoK8sApiCoreV1DownwardAPIVolumeSource downwardAPI) {
    this.downwardAPI = downwardAPI;
    return this;
  }

   /**
   * Get downwardAPI
   * @return downwardAPI
  **/
  @ApiModelProperty(value = "")
  public IoK8sApiCoreV1DownwardAPIVolumeSource getDownwardAPI() {
    return downwardAPI;
  }

  public void setDownwardAPI(IoK8sApiCoreV1DownwardAPIVolumeSource downwardAPI) {
    this.downwardAPI = downwardAPI;
  }

  public IoK8sApiCoreV1Volume emptyDir(IoK8sApiCoreV1EmptyDirVolumeSource emptyDir) {
    this.emptyDir = emptyDir;
    return this;
  }

   /**
   * Get emptyDir
   * @return emptyDir
  **/
  @ApiModelProperty(value = "")
  public IoK8sApiCoreV1EmptyDirVolumeSource getEmptyDir() {
    return emptyDir;
  }

  public void setEmptyDir(IoK8sApiCoreV1EmptyDirVolumeSource emptyDir) {
    this.emptyDir = emptyDir;
  }

  public IoK8sApiCoreV1Volume fc(IoK8sApiCoreV1FCVolumeSource fc) {
    this.fc = fc;
    return this;
  }

   /**
   * Get fc
   * @return fc
  **/
  @ApiModelProperty(value = "")
  public IoK8sApiCoreV1FCVolumeSource getFc() {
    return fc;
  }

  public void setFc(IoK8sApiCoreV1FCVolumeSource fc) {
    this.fc = fc;
  }

  public IoK8sApiCoreV1Volume flexVolume(IoK8sApiCoreV1FlexVolumeSource flexVolume) {
    this.flexVolume = flexVolume;
    return this;
  }

   /**
   * Get flexVolume
   * @return flexVolume
  **/
  @ApiModelProperty(value = "")
  public IoK8sApiCoreV1FlexVolumeSource getFlexVolume() {
    return flexVolume;
  }

  public void setFlexVolume(IoK8sApiCoreV1FlexVolumeSource flexVolume) {
    this.flexVolume = flexVolume;
  }

  public IoK8sApiCoreV1Volume flocker(IoK8sApiCoreV1FlockerVolumeSource flocker) {
    this.flocker = flocker;
    return this;
  }

   /**
   * Get flocker
   * @return flocker
  **/
  @ApiModelProperty(value = "")
  public IoK8sApiCoreV1FlockerVolumeSource getFlocker() {
    return flocker;
  }

  public void setFlocker(IoK8sApiCoreV1FlockerVolumeSource flocker) {
    this.flocker = flocker;
  }

  public IoK8sApiCoreV1Volume gcePersistentDisk(IoK8sApiCoreV1GCEPersistentDiskVolumeSource gcePersistentDisk) {
    this.gcePersistentDisk = gcePersistentDisk;
    return this;
  }

   /**
   * Get gcePersistentDisk
   * @return gcePersistentDisk
  **/
  @ApiModelProperty(value = "")
  public IoK8sApiCoreV1GCEPersistentDiskVolumeSource getGcePersistentDisk() {
    return gcePersistentDisk;
  }

  public void setGcePersistentDisk(IoK8sApiCoreV1GCEPersistentDiskVolumeSource gcePersistentDisk) {
    this.gcePersistentDisk = gcePersistentDisk;
  }

  public IoK8sApiCoreV1Volume gitRepo(IoK8sApiCoreV1GitRepoVolumeSource gitRepo) {
    this.gitRepo = gitRepo;
    return this;
  }

   /**
   * Get gitRepo
   * @return gitRepo
  **/
  @ApiModelProperty(value = "")
  public IoK8sApiCoreV1GitRepoVolumeSource getGitRepo() {
    return gitRepo;
  }

  public void setGitRepo(IoK8sApiCoreV1GitRepoVolumeSource gitRepo) {
    this.gitRepo = gitRepo;
  }

  public IoK8sApiCoreV1Volume glusterfs(IoK8sApiCoreV1GlusterfsVolumeSource glusterfs) {
    this.glusterfs = glusterfs;
    return this;
  }

   /**
   * Get glusterfs
   * @return glusterfs
  **/
  @ApiModelProperty(value = "")
  public IoK8sApiCoreV1GlusterfsVolumeSource getGlusterfs() {
    return glusterfs;
  }

  public void setGlusterfs(IoK8sApiCoreV1GlusterfsVolumeSource glusterfs) {
    this.glusterfs = glusterfs;
  }

  public IoK8sApiCoreV1Volume hostPath(IoK8sApiCoreV1HostPathVolumeSource hostPath) {
    this.hostPath = hostPath;
    return this;
  }

   /**
   * Get hostPath
   * @return hostPath
  **/
  @ApiModelProperty(value = "")
  public IoK8sApiCoreV1HostPathVolumeSource getHostPath() {
    return hostPath;
  }

  public void setHostPath(IoK8sApiCoreV1HostPathVolumeSource hostPath) {
    this.hostPath = hostPath;
  }

  public IoK8sApiCoreV1Volume iscsi(IoK8sApiCoreV1ISCSIVolumeSource iscsi) {
    this.iscsi = iscsi;
    return this;
  }

   /**
   * Get iscsi
   * @return iscsi
  **/
  @ApiModelProperty(value = "")
  public IoK8sApiCoreV1ISCSIVolumeSource getIscsi() {
    return iscsi;
  }

  public void setIscsi(IoK8sApiCoreV1ISCSIVolumeSource iscsi) {
    this.iscsi = iscsi;
  }

  public IoK8sApiCoreV1Volume name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Volume&#39;s name. Must be a DNS_LABEL and unique within the pod. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Volume's name. Must be a DNS_LABEL and unique within the pod. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IoK8sApiCoreV1Volume nfs(IoK8sApiCoreV1NFSVolumeSource nfs) {
    this.nfs = nfs;
    return this;
  }

   /**
   * Get nfs
   * @return nfs
  **/
  @ApiModelProperty(value = "")
  public IoK8sApiCoreV1NFSVolumeSource getNfs() {
    return nfs;
  }

  public void setNfs(IoK8sApiCoreV1NFSVolumeSource nfs) {
    this.nfs = nfs;
  }

  public IoK8sApiCoreV1Volume persistentVolumeClaim(IoK8sApiCoreV1PersistentVolumeClaimVolumeSource persistentVolumeClaim) {
    this.persistentVolumeClaim = persistentVolumeClaim;
    return this;
  }

   /**
   * Get persistentVolumeClaim
   * @return persistentVolumeClaim
  **/
  @ApiModelProperty(value = "")
  public IoK8sApiCoreV1PersistentVolumeClaimVolumeSource getPersistentVolumeClaim() {
    return persistentVolumeClaim;
  }

  public void setPersistentVolumeClaim(IoK8sApiCoreV1PersistentVolumeClaimVolumeSource persistentVolumeClaim) {
    this.persistentVolumeClaim = persistentVolumeClaim;
  }

  public IoK8sApiCoreV1Volume photonPersistentDisk(IoK8sApiCoreV1PhotonPersistentDiskVolumeSource photonPersistentDisk) {
    this.photonPersistentDisk = photonPersistentDisk;
    return this;
  }

   /**
   * Get photonPersistentDisk
   * @return photonPersistentDisk
  **/
  @ApiModelProperty(value = "")
  public IoK8sApiCoreV1PhotonPersistentDiskVolumeSource getPhotonPersistentDisk() {
    return photonPersistentDisk;
  }

  public void setPhotonPersistentDisk(IoK8sApiCoreV1PhotonPersistentDiskVolumeSource photonPersistentDisk) {
    this.photonPersistentDisk = photonPersistentDisk;
  }

  public IoK8sApiCoreV1Volume portworxVolume(IoK8sApiCoreV1PortworxVolumeSource portworxVolume) {
    this.portworxVolume = portworxVolume;
    return this;
  }

   /**
   * Get portworxVolume
   * @return portworxVolume
  **/
  @ApiModelProperty(value = "")
  public IoK8sApiCoreV1PortworxVolumeSource getPortworxVolume() {
    return portworxVolume;
  }

  public void setPortworxVolume(IoK8sApiCoreV1PortworxVolumeSource portworxVolume) {
    this.portworxVolume = portworxVolume;
  }

  public IoK8sApiCoreV1Volume projected(IoK8sApiCoreV1ProjectedVolumeSource projected) {
    this.projected = projected;
    return this;
  }

   /**
   * Get projected
   * @return projected
  **/
  @ApiModelProperty(value = "")
  public IoK8sApiCoreV1ProjectedVolumeSource getProjected() {
    return projected;
  }

  public void setProjected(IoK8sApiCoreV1ProjectedVolumeSource projected) {
    this.projected = projected;
  }

  public IoK8sApiCoreV1Volume quobyte(IoK8sApiCoreV1QuobyteVolumeSource quobyte) {
    this.quobyte = quobyte;
    return this;
  }

   /**
   * Get quobyte
   * @return quobyte
  **/
  @ApiModelProperty(value = "")
  public IoK8sApiCoreV1QuobyteVolumeSource getQuobyte() {
    return quobyte;
  }

  public void setQuobyte(IoK8sApiCoreV1QuobyteVolumeSource quobyte) {
    this.quobyte = quobyte;
  }

  public IoK8sApiCoreV1Volume rbd(IoK8sApiCoreV1RBDVolumeSource rbd) {
    this.rbd = rbd;
    return this;
  }

   /**
   * Get rbd
   * @return rbd
  **/
  @ApiModelProperty(value = "")
  public IoK8sApiCoreV1RBDVolumeSource getRbd() {
    return rbd;
  }

  public void setRbd(IoK8sApiCoreV1RBDVolumeSource rbd) {
    this.rbd = rbd;
  }

  public IoK8sApiCoreV1Volume scaleIO(IoK8sApiCoreV1ScaleIOVolumeSource scaleIO) {
    this.scaleIO = scaleIO;
    return this;
  }

   /**
   * Get scaleIO
   * @return scaleIO
  **/
  @ApiModelProperty(value = "")
  public IoK8sApiCoreV1ScaleIOVolumeSource getScaleIO() {
    return scaleIO;
  }

  public void setScaleIO(IoK8sApiCoreV1ScaleIOVolumeSource scaleIO) {
    this.scaleIO = scaleIO;
  }

  public IoK8sApiCoreV1Volume secret(IoK8sApiCoreV1SecretVolumeSource secret) {
    this.secret = secret;
    return this;
  }

   /**
   * Get secret
   * @return secret
  **/
  @ApiModelProperty(value = "")
  public IoK8sApiCoreV1SecretVolumeSource getSecret() {
    return secret;
  }

  public void setSecret(IoK8sApiCoreV1SecretVolumeSource secret) {
    this.secret = secret;
  }

  public IoK8sApiCoreV1Volume storageos(IoK8sApiCoreV1StorageOSVolumeSource storageos) {
    this.storageos = storageos;
    return this;
  }

   /**
   * Get storageos
   * @return storageos
  **/
  @ApiModelProperty(value = "")
  public IoK8sApiCoreV1StorageOSVolumeSource getStorageos() {
    return storageos;
  }

  public void setStorageos(IoK8sApiCoreV1StorageOSVolumeSource storageos) {
    this.storageos = storageos;
  }

  public IoK8sApiCoreV1Volume vsphereVolume(IoK8sApiCoreV1VsphereVirtualDiskVolumeSource vsphereVolume) {
    this.vsphereVolume = vsphereVolume;
    return this;
  }

   /**
   * Get vsphereVolume
   * @return vsphereVolume
  **/
  @ApiModelProperty(value = "")
  public IoK8sApiCoreV1VsphereVirtualDiskVolumeSource getVsphereVolume() {
    return vsphereVolume;
  }

  public void setVsphereVolume(IoK8sApiCoreV1VsphereVirtualDiskVolumeSource vsphereVolume) {
    this.vsphereVolume = vsphereVolume;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1Volume ioK8sApiCoreV1Volume = (IoK8sApiCoreV1Volume) o;
    return Objects.equals(this.awsElasticBlockStore, ioK8sApiCoreV1Volume.awsElasticBlockStore) &&
        Objects.equals(this.azureDisk, ioK8sApiCoreV1Volume.azureDisk) &&
        Objects.equals(this.azureFile, ioK8sApiCoreV1Volume.azureFile) &&
        Objects.equals(this.cephfs, ioK8sApiCoreV1Volume.cephfs) &&
        Objects.equals(this.cinder, ioK8sApiCoreV1Volume.cinder) &&
        Objects.equals(this.configMap, ioK8sApiCoreV1Volume.configMap) &&
        Objects.equals(this.downwardAPI, ioK8sApiCoreV1Volume.downwardAPI) &&
        Objects.equals(this.emptyDir, ioK8sApiCoreV1Volume.emptyDir) &&
        Objects.equals(this.fc, ioK8sApiCoreV1Volume.fc) &&
        Objects.equals(this.flexVolume, ioK8sApiCoreV1Volume.flexVolume) &&
        Objects.equals(this.flocker, ioK8sApiCoreV1Volume.flocker) &&
        Objects.equals(this.gcePersistentDisk, ioK8sApiCoreV1Volume.gcePersistentDisk) &&
        Objects.equals(this.gitRepo, ioK8sApiCoreV1Volume.gitRepo) &&
        Objects.equals(this.glusterfs, ioK8sApiCoreV1Volume.glusterfs) &&
        Objects.equals(this.hostPath, ioK8sApiCoreV1Volume.hostPath) &&
        Objects.equals(this.iscsi, ioK8sApiCoreV1Volume.iscsi) &&
        Objects.equals(this.name, ioK8sApiCoreV1Volume.name) &&
        Objects.equals(this.nfs, ioK8sApiCoreV1Volume.nfs) &&
        Objects.equals(this.persistentVolumeClaim, ioK8sApiCoreV1Volume.persistentVolumeClaim) &&
        Objects.equals(this.photonPersistentDisk, ioK8sApiCoreV1Volume.photonPersistentDisk) &&
        Objects.equals(this.portworxVolume, ioK8sApiCoreV1Volume.portworxVolume) &&
        Objects.equals(this.projected, ioK8sApiCoreV1Volume.projected) &&
        Objects.equals(this.quobyte, ioK8sApiCoreV1Volume.quobyte) &&
        Objects.equals(this.rbd, ioK8sApiCoreV1Volume.rbd) &&
        Objects.equals(this.scaleIO, ioK8sApiCoreV1Volume.scaleIO) &&
        Objects.equals(this.secret, ioK8sApiCoreV1Volume.secret) &&
        Objects.equals(this.storageos, ioK8sApiCoreV1Volume.storageos) &&
        Objects.equals(this.vsphereVolume, ioK8sApiCoreV1Volume.vsphereVolume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awsElasticBlockStore, azureDisk, azureFile, cephfs, cinder, configMap, downwardAPI, emptyDir, fc, flexVolume, flocker, gcePersistentDisk, gitRepo, glusterfs, hostPath, iscsi, name, nfs, persistentVolumeClaim, photonPersistentDisk, portworxVolume, projected, quobyte, rbd, scaleIO, secret, storageos, vsphereVolume);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1Volume {\n");
    
    sb.append("    awsElasticBlockStore: ").append(toIndentedString(awsElasticBlockStore)).append("\n");
    sb.append("    azureDisk: ").append(toIndentedString(azureDisk)).append("\n");
    sb.append("    azureFile: ").append(toIndentedString(azureFile)).append("\n");
    sb.append("    cephfs: ").append(toIndentedString(cephfs)).append("\n");
    sb.append("    cinder: ").append(toIndentedString(cinder)).append("\n");
    sb.append("    configMap: ").append(toIndentedString(configMap)).append("\n");
    sb.append("    downwardAPI: ").append(toIndentedString(downwardAPI)).append("\n");
    sb.append("    emptyDir: ").append(toIndentedString(emptyDir)).append("\n");
    sb.append("    fc: ").append(toIndentedString(fc)).append("\n");
    sb.append("    flexVolume: ").append(toIndentedString(flexVolume)).append("\n");
    sb.append("    flocker: ").append(toIndentedString(flocker)).append("\n");
    sb.append("    gcePersistentDisk: ").append(toIndentedString(gcePersistentDisk)).append("\n");
    sb.append("    gitRepo: ").append(toIndentedString(gitRepo)).append("\n");
    sb.append("    glusterfs: ").append(toIndentedString(glusterfs)).append("\n");
    sb.append("    hostPath: ").append(toIndentedString(hostPath)).append("\n");
    sb.append("    iscsi: ").append(toIndentedString(iscsi)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nfs: ").append(toIndentedString(nfs)).append("\n");
    sb.append("    persistentVolumeClaim: ").append(toIndentedString(persistentVolumeClaim)).append("\n");
    sb.append("    photonPersistentDisk: ").append(toIndentedString(photonPersistentDisk)).append("\n");
    sb.append("    portworxVolume: ").append(toIndentedString(portworxVolume)).append("\n");
    sb.append("    projected: ").append(toIndentedString(projected)).append("\n");
    sb.append("    quobyte: ").append(toIndentedString(quobyte)).append("\n");
    sb.append("    rbd: ").append(toIndentedString(rbd)).append("\n");
    sb.append("    scaleIO: ").append(toIndentedString(scaleIO)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    storageos: ").append(toIndentedString(storageos)).append("\n");
    sb.append("    vsphereVolume: ").append(toIndentedString(vsphereVolume)).append("\n");
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

