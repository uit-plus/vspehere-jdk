
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DynamicData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DynamicData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DynamicData")
@XmlSeeAlso({
    ClusterEnterMaintenanceResult.class,
    LocalizedMethodFault.class,
    DistributedVirtualSwitchManagerCompatibilityResult.class,
    UserSession.class,
    HostImageProfileSummary.class,
    IscsiMigrationDependency.class,
    ProfileDescription.class,
    PhysicalNicHintInfo.class,
    EntityPrivilege.class,
    SystemEventInfo.class,
    HostVMotionCompatibility.class,
    VirtualMachineConfigOptionDescriptor.class,
    HostDateTimeSystemTimeZone.class,
    LicenseUsageInfo.class,
    HostConnectInfo.class,
    CryptoManagerKmipServerCertInfo.class,
    HostServiceTicket.class,
    KernelModuleInfo.class,
    VStorageObjectStateInfo.class,
    VirtualNicManagerNetConfig.class,
    CryptoKeyResult.class,
    HostUnresolvedVmfsVolume.class,
    LicenseManagerLicenseInfo.class,
    ServiceContent.class,
    OvfValidateHostResult.class,
    AlarmState.class,
    PerfProviderSummary.class,
    VslmTagEntry.class,
    EventArgDesc.class,
    VirtualMachineConfigOption.class,
    DiagnosticManagerLogDescriptor.class,
    ResourceConfigOption.class,
    RetrieveResult.class,
    VirtualMachineMksTicket.class,
    UpdateSet.class,
    VsanPolicySatisfiability.class,
    VmfsDatastoreOption.class,
    StoragePlacementResult.class,
    HostDiskDimensionsChs.class,
    ProfileProfileStructure.class,
    VirtualDiskId.class,
    VStorageObjectSnapshotInfo.class,
    GuestAliases.class,
    AnswerFile.class,
    HostNasVolumeUserInfo.class,
    HostStorageArrayTypePolicyOption.class,
    VsanHostDiskResult.class,
    Permission.class,
    IscsiStatus.class,
    OvfParseDescriptorResult.class,
    HostUnresolvedVmfsResolutionResult.class,
    HostDiskPartitionInfo.class,
    ProductComponentInfo.class,
    HealthUpdateInfo.class,
    KmipClusterInfo.class,
    GuestListFileInfo.class,
    DistributedVirtualSwitchProductSpec.class,
    HostVsanInternalSystemVsanPhysicalDiskDiagnosticsResult.class,
    CustomizationSpecItem.class,
    IpPoolManagerIpAllocation.class,
    IscsiPortInfo.class,
    SoftwarePackage.class,
    FileTransferInformation.class,
    DatabaseSizeEstimate.class,
    VStorageObject.class,
    IpPool.class,
    HostBootDeviceInfo.class,
    CustomFieldDef.class,
    SessionManagerLocalTicket.class,
    OvfCreateImportSpecResult.class,
    VirtualDiskVFlashCacheConfigInfo.class,
    ProfileExpressionMetadata.class,
    HostTpmAttestationReport.class,
    TaskInfo.class,
    HostDiagnosticPartition.class,
    VslmInfrastructureObjectPolicy.class,
    HttpNfcLeaseManifestEntry.class,
    HealthUpdate.class,
    StoragePerformanceSummary.class,
    ProfileMetadata.class,
    ComplianceResult.class,
    VchaClusterConfigInfo.class,
    LicenseFeatureInfo.class,
    ClusterHostRecommendation.class,
    HostPathSelectionPolicyOption.class,
    DistributedVirtualPort.class,
    IoFilterQueryIssueResult.class,
    GuestRegValueSpec.class,
    OvfCreateDescriptorResult.class,
    VmfsConfigOption.class,
    GuestRegKeyRecordSpec.class,
    VStorageObjectAssociations.class,
    ExtensionManagerIpAllocationUsage.class,
    LicenseAvailabilityInfo.class,
    PerfCompositeMetric.class,
    DiskChangeInfo.class,
    PlacementResult.class,
    LicenseAssignmentManagerLicenseAssignment.class,
    ID.class,
    DistributedVirtualSwitchHostProductSpec.class,
    SessionManagerGenericServiceTicket.class,
    AnswerFileStatusResult.class,
    HostAccessControlEntry.class,
    HostDiagnosticPartitionCreateDescription.class,
    HostProfileManagerConfigTaskList.class,
    VsanUpgradeSystemPreflightCheckResult.class,
    ServiceManagerServiceInfo.class,
    ProfilePolicyMetadata.class,
    PerfCounterInfo.class,
    GuestProcessInfo.class,
    HostVsanInternalSystemDeleteVsanObjectsResult.class,
    VirtualMachineTicket.class,
    PerfMetricId.class,
    HostCapability.class,
    VchaClusterHealth.class,
    VsanUpgradeSystemUpgradeStatus.class,
    DiagnosticManagerLogHeader.class,
    ClusterResourceUsageSummary.class,
    ConfigTarget.class,
    HostVsanInternalSystemVsanObjectOperationResult.class,
    VsanHostClusterStatus.class,
    ObjectContent.class,
    HostNetworkConfigResult.class,
    DVSManagerDvsConfigTarget.class,
    UserPrivilegeResult.class,
    StorageIORMConfigOption.class,
    GuestMappedAliases.class,
    Extension.class,
    HostSpecification.class,
    HostDiagnosticPartitionCreateOption.class,
    CryptoKeyId.class,
    VAppOvfSectionInfo.class,
    HealthSystemRuntime.class,
    ResourceConfigSpec.class,
    HostVFlashManagerVFlashConfigInfo.class,
    ClusterOrchestrationInfo.class,
    HostInternetScsiHbaIPv6Properties.class,
    HostOpaqueSwitchPhysicalNicZone.class,
    FaultToleranceDiskSpec.class,
    FcoeConfigVlanRange.class,
    HostDiskMappingInfo.class,
    SoftwarePackageCapability.class,
    DVPortState.class,
    KmipServerStatus.class,
    HostDatastoreBrowserSearchSpec.class,
    KeyProviderId.class,
    VVolHostPE.class,
    VirtualMachineConfigSpec.class,
    ClusterEVCManagerCheckResult.class,
    DistributedVirtualSwitchManagerHostContainer.class,
    NvdimmDimmInfo.class,
    HostGraphicsInfo.class,
    NumericRange.class,
    HostVmfsRescanResult.class,
    ClusterDrsMigration.class,
    UpdateVirtualMachineFilesResult.class,
    TaskFilterSpec.class,
    NetIpConfigInfoIpAddress.class,
    ClusterActionHistory.class,
    VirtualMachineFlagInfo.class,
    FaultToleranceVMConfigSpec.class,
    NvdimmNamespaceInfo.class,
    VsanHostDecommissionMode.class,
    VirtualMachineForkConfigInfo.class,
    VirtualMachineProfileDetails.class,
    HostPnicNetworkResourceInfo.class,
    PerformanceDescription.class,
    PropertyChange.class,
    HostProfileValidationFailureInfo.class,
    HttpNfcLeaseDatastoreLeaseInfo.class,
    HostFirewallRule.class,
    HostCacheConfigurationInfo.class,
    WaitOptions.class,
    PodDiskLocator.class,
    VmConfigFileEncryptionInfo.class,
    HostFlagInfo.class,
    HostRuntimeInfoNetStackInstanceRuntimeInfo.class,
    VMwareDvsIpfixCapability.class,
    VMwareDvsLagIpfixConfig.class,
    HostPortGroupConfig.class,
    ComplianceProfile.class,
    VsanNewPolicyBatch.class,
    VsanPolicyChangeBatch.class,
    StorageIOAllocationOption.class,
    DistributedVirtualSwitchPortConnection.class,
    HostSnmpDestination.class,
    HostReliableMemoryInfo.class,
    AlarmSetting.class,
    HostGraphicsConfig.class,
    InventoryDescription.class,
    HostFirewallRulesetIpList.class,
    VmConfigFileQueryFilter.class,
    DistributedVirtualSwitchHostMemberRuntimeState.class,
    ComputeResourceHostSPBMLicenseInfo.class,
    DvsVnicAllocatedResource.class,
    PlacementRankSpec.class,
    HostVirtualSwitch.class,
    HostNumaNode.class,
    HostPciPassthruInfo.class,
    StorageDrsVmConfigInfo.class,
    VsanHostConfigInfoClusterInfo.class,
    HostNetStackInstance.class,
    CryptoKeyPlain.class,
    IoFilterHostIssue.class,
    HostDiskMappingPartitionOption.class,
    HostFirewallInfo.class,
    ProfileProfileStructureProperty.class,
    DiagnosticManagerBundleInfo.class,
    UserSearchResult.class,
    PhysicalNicSpec.class,
    VsanHostDiskMapping.class,
    VirtualMachineRuntimeInfoDasProtectionState.class,
    HostMountInfo.class,
    HostSystemComplianceCheckState.class,
    StorageDrsPodConfigSpec.class,
    VirtualAppLinkInfo.class,
    PlacementAffinityRule.class,
    VirtualMachineConfigInfoDatastoreUrlPair.class,
    DVSFeatureCapability.class,
    HostDateTimeInfo.class,
    CustomizationUserData.class,
    CustomizationOptions.class,
    LicenseReservationInfo.class,
    VirtualMachineFileInfo.class,
    ReplicationConfigSpec.class,
    HostTpmEventLogEntry.class,
    ClusterNetworkConfigSpec.class,
    HostVMotionNetConfig.class,
    AutoStartDefaults.class,
    FailoverNodeInfo.class,
    DVPortgroupConfigSpec.class,
    HostStorageSystemScsiLunResult.class,
    FcoeConfig.class,
    DasHeartbeatDatastoreInfo.class,
    ClusterVmOrchestrationInfo.class,
    ClusterDasVmConfigInfo.class,
    HostFileSystemVolumeInfo.class,
    HostDiskConfigurationResult.class,
    DvsApplyOperationFaultFaultOnObject.class,
    HostMemberRuntimeInfo.class,
    GuestDiskInfo.class,
    HostNicTeamingPolicy.class,
    DatacenterConfigInfo.class,
    HostDhcpServiceSpec.class,
    HostEsxAgentHostManagerConfigInfo.class,
    CustomizationIPSettingsIpV6AddressSpec.class,
    NvdimmNamespaceDeleteSpec.class,
    OvfConsumerOstNode.class,
    VAppPropertyInfo.class,
    StorageIORMInfo.class,
    VirtualMachineFileLayoutExDiskUnit.class,
    ClusterDrsRecommendation.class,
    LocalizableMessage.class,
    VchaNodeRuntimeInfo.class,
    CustomizationSpec.class,
    HostNtpConfig.class,
    EventDescription.class,
    PropertyFilterSpec.class,
    VirtualMachineIdeDiskDevicePartitionInfo.class,
    VirtualMachineRelocateSpec.class,
    HostInternetScsiHbaDigestProperties.class,
    HostConfigSummary.class,
    HostMultipathStateInfoPath.class,
    DistributedVirtualSwitchHostMemberConfigSpec.class,
    CustomizationGuiRunOnce.class,
    HttpNfcLeaseInfo.class,
    BaseConfigInfo.class,
    DVPortConfigSpec.class,
    KeyValue.class,
    LicenseManagerEvaluationInfo.class,
    HostVmciAccessManagerAccessSpec.class,
    AutoStartPowerInfo.class,
    CheckResult.class,
    HostInternetScsiHbaIscsiIpv6Address.class,
    HostFileAccess.class,
    DeviceGroupId.class,
    NetIpRouteConfigInfoIpRoute.class,
    HostNumericSensorInfo.class,
    HostVirtualNicConnection.class,
    VirtualMachineFileLayoutExSnapshotLayout.class,
    ProfileMetadataProfileSortSpec.class,
    HostPciDevice.class,
    HostVFlashManagerVFlashResourceRunTimeInfo.class,
    VirtualMachineQuestionInfo.class,
    HostLowLevelProvisioningManagerFileDeleteResult.class,
    HostPatchManagerStatus.class,
    ClusterProactiveDrsConfigInfo.class,
    ClusterVmComponentProtectionSettings.class,
    VVolVmConfigFileUpdateResult.class,
    HostInternetScsiHbaAuthenticationCapabilities.class,
    HostScsiTopologyInterface.class,
    ImportOperationBulkFaultFaultOnImport.class,
    DvsResourceRuntimeInfo.class,
    HostVirtualSwitchBeaconConfig.class,
    ExtendedEventPair.class,
    HostConnectSpec.class,
    AnswerFileUpdateFailure.class,
    NetDhcpConfigInfoDhcpOptions.class,
    HostActiveDirectory.class,
    AuthorizationPrivilege.class,
    VAppIPAssignmentInfo.class,
    HostScsiDiskPartition.class,
    HostVvolVolumeSpecification.class,
    HostVirtualSwitchSpec.class,
    GuestAuthAliasInfo.class,
    HostLowLevelProvisioningManagerSnapshotLayoutSpec.class,
    MissingProperty.class,
    VirtualMachineWipeResult.class,
    HostProxySwitch.class,
    HostCpuPackage.class,
    DatastoreOption.class,
    VsanHostMembershipInfo.class,
    ClusterConfigInfo.class,
    ResourceAllocationOption.class,
    HostPlugStoreTopology.class,
    StorageIORMConfigSpec.class,
    HostDiskPartitionBlockRange.class,
    GuestRegValueNameSpec.class,
    HostUnresolvedVmfsVolumeResolveStatus.class,
    LinkLayerDiscoveryProtocolInfo.class,
    VirtualDiskOptionVFlashCacheConfigOption.class,
    VirtualMachineStorageSummary.class,
    VirtualMachineFileLayout.class,
    VAppEntityConfigInfo.class,
    TaskFilterSpecByEntity.class,
    FaultDomainId.class,
    DatastoreVVolContainerFailoverPair.class,
    HostNetworkConfig.class,
    SelectionSpec.class,
    AnswerFileCreateSpec.class,
    PodStorageDrsEntry.class,
    PhysicalNicConfig.class,
    HostHardwareSummary.class,
    HostLicenseSpec.class,
    VStorageObjectAssociationsVmDiskAssociations.class,
    TaskFilterSpecByTime.class,
    ClusterDrsFaults.class,
    HostResignatureRescanResult.class,
    DVPortConfigInfo.class,
    HostFeatureCapability.class,
    HostPatchManagerResult.class,
    HostFileSystemMountInfo.class,
    HostLocalFileSystemVolumeSpec.class,
    DatacenterConfigSpec.class,
    PlacementSpec.class,
    ClusterDasConfigInfo.class,
    HostPowerPolicy.class,
    HostInternetScsiHbaTargetSet.class,
    HostVFlashManagerVFlashCacheConfigInfo.class,
    DatabaseSizeParam.class,
    HostConfigChange.class,
    HostInternetScsiHbaSendTarget.class,
    DVSCapability.class,
    HostIpRouteOp.class,
    ProfileDescriptionSection.class,
    VirtualMachineConsolePreferences.class,
    HostFirewallConfigRuleSetConfig.class,
    VmConfigInfo.class,
    VsanHostConfigInfoStorageInfo.class,
    DVPortStatus.class,
    HostDatastoreSystemDatastoreResult.class,
    VchaClusterConfigSpec.class,
    ExtensionPrivilegeInfo.class,
    DVSRollbackCapability.class,
    EventDescriptionEventDetail.class,
    NetIpRouteConfigInfo.class,
    VirtualMachineSnapshotInfo.class,
    NetBIOSConfigInfo.class,
    VmPodConfigForPlacement.class,
    DVSNetworkResourcePoolConfigSpec.class,
    DvsHostInfrastructureTrafficResourceAllocation.class,
    DistributedVirtualSwitchHostMemberConfigInfo.class,
    StorageRequirement.class,
    ExtensionServerInfo.class,
    VirtualHardware.class,
    VslmCreateSpec.class,
    HttpNfcLeaseDeviceUrl.class,
    EnumDescription.class,
    StorageDrsAutomationConfig.class,
    VirtualMachineVMCIDeviceFilterInfo.class,
    ExtensionResourceInfo.class,
    HostVFlashManagerVFlashCacheConfigSpec.class,
    AboutInfo.class,
    PhysicalNic.class,
    HttpNfcLeaseHostInfo.class,
    HostNetworkPolicy.class,
    PropertyFilterUpdate.class,
    CustomizationLicenseFilePrintData.class,
    DVSSummary.class,
    DistributedVirtualSwitchPortConnectee.class,
    StorageResourceManagerStorageProfileStatistics.class,
    HostServiceConfig.class,
    HostDhcpService.class,
    StoragePlacementSpec.class,
    NetIpRouteConfigSpecIpRouteSpec.class,
    VsanUpgradeSystemNetworkPartitionInfo.class,
    HostPortGroupSpec.class,
    HostMaintenanceSpec.class,
    PerfSampleInfo.class,
    ClusterDasAamNodeState.class,
    DistributedVirtualSwitchPortCriteria.class,
    GuestNicInfo.class,
    HostStorageSystemDiskLocatorLedResult.class,
    HostSystemResourceInfo.class,
    HostSslThumbprintInfo.class,
    GuestInfoNamespaceGenerationInfo.class,
    HostDiskDimensions.class,
    HostPlugStoreTopologyPath.class,
    AuthorizationRole.class,
    HostTpmAttestationInfo.class,
    FileQueryFlags.class,
    HostDevice.class,
    StorageDrsPodConfigInfo.class,
    ClusterRecommendation.class,
    HostVMotionInfo.class,
    VMwareDvsLacpGroupSpec.class,
    ProfilePropertyPath.class,
    HostPlugStoreTopologyTarget.class,
    DVSVmVnicNetworkResourcePool.class,
    ScsiLunDescriptor.class,
    ScsiLunDurableName.class,
    ClusterNotAttemptedVmInfo.class,
    OvfFile.class,
    HostProtocolEndpoint.class,
    ExtensionHealthInfo.class,
    HostDiskPartitionLayout.class,
    VirtualMachineRelocateSpecDiskLocator.class,
    EventFilterSpecByTime.class,
    GuestInfo.class,
    ModeInfo.class,
    ScheduledTaskDescription.class,
    FcoeConfigFcoeCapabilities.class,
    AlarmFilterSpec.class,
    VirtualMachineMetadataManagerVmMetadataOwner.class,
    DvsTrafficRuleset.class,
    ClusterVmToolsMonitoringSettings.class,
    ExtExtendedProductInfo.class,
    StorageIOAllocationInfo.class,
    HostPlugStoreTopologyDevice.class,
    HostFeatureMask.class,
    HostNicOrderPolicy.class,
    OvfNetworkInfo.class,
    ReplicationSpec.class,
    OvfCreateDescriptorParams.class,
    VirtualMachineVMCIDeviceFilterSpec.class,
    HostDiskPartitionAttributes.class,
    ConflictingConfigurationConfig.class,
    ProfilePolicy.class,
    HttpNfcLeaseSourceFile.class,
    HostOpaqueNetworkInfo.class,
    HostFirewallRulesetIpNetwork.class,
    ObjectSpec.class,
    ReplicationInfoDiskSettings.class,
    AlarmDescription.class,
    HostIpConfig.class,
    HostFirewallRulesetRulesetSpec.class,
    VMwareVspanPort.class,
    DatastoreMountPathDatastorePair.class,
    ClusterPowerOnVmResult.class,
    HostMultipathInfoLogicalUnitPolicy.class,
    HostProfileManagerCompositionValidationResult.class,
    NvdimmHealthInfo.class,
    VmDiskFileEncryptionInfo.class,
    PhysicalNicLinkInfo.class,
    NetIpRouteConfigInfoGateway.class,
    ComplianceFailure.class,
    VMwareDvsLacpCapability.class,
    HttpNfcLeaseCapabilities.class,
    HostProfileManagerCompositionResultResultElement.class,
    OvfNetworkMapping.class,
    NvdimmSummary.class,
    PerfQuerySpec.class,
    ClusterEVCManagerEVCState.class,
    PhysicalNicHint.class,
    VirtualMachineLegacyNetworkSwitchInfo.class,
    DvsVmVnicResourcePoolConfigSpec.class,
    UsbScanCodeSpecModifierType.class,
    ClusterUsageSummary.class,
    VsanHostRuntimeInfo.class,
    ExtSolutionManagerInfoTabInfo.class,
    CustomizationIPSettings.class,
    HostFirewallDefaultPolicy.class,
    ClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots.class,
    HostLowLevelProvisioningManagerFileReserveSpec.class,
    TaskFilterSpecByUsername.class,
    FaultToleranceConfigInfo.class,
    HostIpmiInfo.class,
    HostMultipathInfoLogicalUnitStorageArrayTypePolicy.class,
    ClusterDasAdvancedRuntimeInfo.class,
    VirtualMachineCloneSpec.class,
    DistributedVirtualPortgroupInfo.class,
    ComplianceLocator.class,
    VirtualDeviceConnectOption.class,
    VmfsUnmapBandwidthSpec.class,
    PasswordField.class,
    HostInternetScsiHbaDiscoveryProperties.class,
    HostLowLevelProvisioningManagerFileReserveResult.class,
    OptionValue.class,
    HostStorageOperationalInfo.class,
    HostNetworkTrafficShapingPolicy.class,
    ComputeResourceConfigInfo.class,
    PerformanceManagerCounterLevelMapping.class,
    OvfDeploymentOption.class,
    PowerSystemCapability.class,
    CustomizationSpecInfo.class,
    DvsFilterParameter.class,
    NetIpRouteConfigSpec.class,
    HostRuntimeInfo.class,
    VmConfigSpec.class,
    HostScsiTopologyTarget.class,
    VirtualMachineUsageOnDatastore.class,
    HostProfileManagerCompositionValidationResultResultElement.class,
    DVSNetworkResourceManagementCapability.class,
    NetIpRouteConfigSpecGatewaySpec.class,
    HostService.class,
    ExtManagedEntityInfo.class,
    HostMultipathStateInfo.class,
    ReplicationVmProgressInfo.class,
    VirtualMachineFileLayoutSnapshotLayout.class,
    HostSystemIdentificationInfo.class,
    KernelModuleSectionInfo.class,
    HostNetworkSecurityPolicy.class,
    HostNetworkResourceRuntime.class,
    NetIpConfigInfo.class,
    StorageDrsPlacementRankVmSpec.class,
    ReplicationGroupId.class,
    DVSNetworkResourcePoolAllocationInfo.class,
    ClusterDasFdmHostState.class,
    StorageDrsIoLoadBalanceConfig.class,
    LicenseDiagnostics.class,
    SDDCBase.class,
    EventFilterSpecByUsername.class,
    StorageDrsSpaceLoadBalanceConfig.class,
    HostVirtualNicConfig.class,
    DistributedVirtualSwitchHostMember.class,
    HostSystemInfo.class,
    NetDhcpConfigSpec.class,
    VirtualMachineDefaultPowerOpInfo.class,
    HostForceMountedInfo.class,
    ComplianceFailureComplianceFailureValues.class,
    DvsVmVnicNetworkResourcePoolRuntimeInfo.class,
    HostDatastoreSystemCapabilities.class,
    PhysicalNicCdpInfo.class,
    HostIpRouteEntry.class,
    LinkDiscoveryProtocolConfig.class,
    HostInternetScsiHbaIPCapabilities.class,
    HostPatchManagerLocator.class,
    UsbScanCodeSpecKeyEvent.class,
    DistributedVirtualSwitchInfo.class,
    OvfResourceMap.class,
    LatencySensitivity.class,
    ClusterDasData.class,
    StorageDrsPodSelectionSpec.class,
    HostMultipathInfoLogicalUnit.class,
    DvsVmVnicResourceAllocation.class,
    VMwareIpfixConfig.class,
    IpPoolAssociation.class,
    HostDeploymentInfo.class,
    HostConnectInfoNetworkInfo.class,
    VnicPortArgument.class,
    Tag.class,
    PerformanceStatisticsDescription.class,
    HostSecuritySpec.class,
    VsanHostClusterStatusStateCompletionEstimate.class,
    AuthorizationDescription.class,
    HostVirtualNic.class,
    HostBootDevice.class,
    HostCertificateManagerCertificateInfo.class,
    HostProxySwitchSpec.class,
    AlarmSpec.class,
    VASAStorageArray.class,
    ResourcePoolQuickStats.class,
    CustomizationIdentitySettings.class,
    ProfileUpdateFailedUpdateFailure.class,
    ScheduledHardwareUpgradeInfo.class,
    VsanPolicyCost.class,
    HostVffsSpec.class,
    OvfManagerCommonParams.class,
    HostActiveDirectorySpec.class,
    ProfileExecuteError.class,
    ClusterDrsVmConfigInfo.class,
    FaultToleranceSecondaryOpResult.class,
    ProfilePolicyOptionMetadata.class,
    CustomizationIdentification.class,
    VimVasaProviderStatePerArray.class,
    VirtualMachineMetadataManagerVmMetadataInput.class,
    DVSCreateSpec.class,
    DVSBackupRestoreCapability.class,
    HostPatchManagerStatusPrerequisitePatch.class,
    UpdateVirtualMachineFilesResultFailedVmFileInfo.class,
    DvsNetworkRuleQualifier.class,
    VStorageObjectSnapshotInfoVStorageObjectSnapshot.class,
    HostNetworkConfigNetStackSpec.class,
    FaultsByVM.class,
    MethodActionArgument.class,
    GuestOsDescriptor.class,
    KmipServerSpec.class,
    ClusterDrsFaultsFaultsByVm.class,
    HostBIOSInfo.class,
    HostScsiTopology.class,
    ClusterFailoverHostAdmissionControlInfoHostStatus.class,
    VirtualMachineSnapshotTree.class,
    HostDiskDimensionsLba.class,
    HostSubSpecification.class,
    VirtualMachineFileLayoutExFileInfo.class,
    VAppProductInfo.class,
    ClusterDasAdmissionControlInfo.class,
    NetDnsConfigInfo.class,
    VirtualMachineProfileDetailsDiskProfileDetails.class,
    EntityBackup.class,
    SharesInfo.class,
    HostDiskMappingPartitionInfo.class,
    HostPortGroup.class,
    NetIpStackInfo.class,
    HostProxySwitchHostLagConfig.class,
    DVPortgroupConfigInfo.class,
    ProfileMetadataProfileOperationMessage.class,
    HostInternetScsiHbaAuthenticationProperties.class,
    HostUnresolvedVmfsExtent.class,
    PropertySpec.class,
    VirtualMachineMemoryReservationSpec.class,
    HostNatServiceConfig.class,
    SelectionSet.class,
    HostPersistentMemoryInfo.class,
    VirtualMachineGuestSummary.class,
    HostVirtualNicSpec.class,
    OvfFileItem.class,
    HostIpRouteConfig.class,
    NetIpConfigSpecIpAddressSpec.class,
    VsanHostRuntimeInfoDiskIssue.class,
    HostSystemHealthInfo.class,
    ApplyHostProfileConfigurationResult.class,
    VirtualDeviceConnectInfo.class,
    VchaClusterRuntimeInfo.class,
    HostDnsConfig.class,
    DistributedVirtualSwitchKeyedOpaqueBlob.class,
    VirtualMachineFileLayoutEx.class,
    VAppCloneSpecResourceMap.class,
    CustomizationPassword.class,
    HostMultipathInfoPath.class,
    VsanClusterConfigInfo.class,
    VchaClusterNetworkSpec.class,
    HostNumaInfo.class,
    VmConfigFileQueryFlags.class,
    NetIpConfigSpec.class,
    MultipleCertificatesVerifyFaultThumbprintData.class,
    VasaProviderContainerSpec.class,
    SharesOption.class,
    ClusterConfigSpec.class,
    HostDatastoreBrowserSearchResults.class,
    HostCpuIdInfo.class,
    HostLowLevelProvisioningManagerDiskLayoutSpec.class,
    ProfileDeferredPolicyOptionParameter.class,
    VirtualMachineNetworkShaperInfo.class,
    HostPlacedVirtualNicIdentifier.class,
    HostPatchManagerPatchManagerOperationSpec.class,
    ClusterDasVmSettings.class,
    ProfileExecuteResult.class,
    VsanHostClusterStatusState.class,
    ClusterGroupInfo.class,
    HostListSummaryQuickStats.class,
    ClusterDpmConfigInfo.class,
    HostConfigManager.class,
    HostSystemReconnectSpec.class,
    HostVsanInternalSystemCmmdsQuery.class,
    ToolsConfigInfo.class,
    HostLicenseConnectInfo.class,
    HostFirewallRuleset.class,
    GuestRegKeySpec.class,
    PolicyOption.class,
    HostMemberHealthCheckResult.class,
    VirtualMachineFileLayoutDiskLayout.class,
    VVolVmConfigFileUpdateResultFailedVmConfigFileInfo.class,
    ClusterVmReadiness.class,
    NvdimmRegionInfo.class,
    PrivilegeAvailability.class,
    DVSRuntimeInfo.class,
    CryptoManagerKmipCertificateInfo.class,
    DistributedVirtualSwitchHostMemberPnicSpec.class,
    HostListSummaryGatewaySummary.class,
    HostNatServiceSpec.class,
    HostLowLevelProvisioningManagerVmRecoveryInfo.class,
    ClusterDasAdmissionControlPolicy.class,
    VslmInfrastructureObjectPolicySpec.class,
    HostNetCapabilities.class,
    NetIpStackInfoDefaultRouter.class,
    DatacenterMismatchArgument.class,
    TaskDescription.class,
    HostNatService.class,
    HostSystemSwapConfiguration.class,
    PlacementRankResult.class,
    HostIpConfigIpV6Address.class,
    DatastoreHostMount.class,
    HostSnmpConfigSpec.class,
    ClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots.class,
    ScheduledTaskSpec.class,
    HostCpuInfo.class,
    HostVMotionConfig.class,
    DistributedVirtualSwitchManagerImportResult.class,
    HostIpRouteTableConfig.class,
    NetDhcpConfigInfo.class,
    HostProfileManagerHostToConfigSpecMap.class,
    VirtualMachineDeviceRuntimeInfoDeviceRuntimeState.class,
    HostConfigSpec.class,
    IoFilterInfo.class,
    HostInternetScsiHbaDiscoveryCapabilities.class,
    CustomizationGuiUnattended.class,
    ClusterDasFailoverLevelAdvancedRuntimeInfoSlotInfo.class,
    KmipServerInfo.class,
    HostStorageDeviceInfo.class,
    FcoeConfigFcoeSpecification.class,
    VirtualMachineRuntimeInfo.class,
    VsanClusterConfigInfoHostDefaultInfo.class,
    RetrieveOptions.class,
    VirtualMachineMemoryReservationInfo.class,
    StoragePodSummary.class,
    VMwareDVSPvlanConfigSpec.class,
    HostPlugStoreTopologyAdapter.class,
    VirtualEthernetCardResourceAllocation.class,
    VslmMigrateSpec.class,
    CustomizationAdapterMapping.class,
    HostVirtualSwitchConfig.class,
    HostNatServiceNameServiceSpec.class,
    ComputeResourceSummary.class,
    HostVFlashManagerVFlashResourceConfigSpec.class,
    VsanHostVsanDiskInfo.class,
    HostDhcpServiceConfig.class,
    VmDiskFileQueryFlags.class,
    HostVFlashManagerVFlashResourceConfigInfo.class,
    ServiceConsoleReservationInfo.class,
    ClusterDasHostInfo.class,
    NetIpStackInfoNetToMedia.class,
    GuestProgramSpec.class,
    VirtualMachineFileLayoutExDiskLayout.class,
    VsanHostConfigInfo.class,
    VimVasaProvider.class,
    HostVirtualNicIpRouteSpec.class,
    ToolsConfigInfoToolsLastInstallInfo.class,
    ProfileCreateSpec.class,
    GuestFileAttributes.class,
    HostGatewaySpec.class,
    HostFileSystemVolume.class,
    ClusterDrsConfigInfo.class,
    HostLicensableResourceInfo.class,
    HostStorageSystemVmfsVolumeResult.class,
    HostLowLevelProvisioningManagerFileDeleteSpec.class,
    HostNetworkInfo.class,
    HostDiagnosticPartitionCreateSpec.class,
    DVSConfigSpec.class,
    VMwareDvsLagVlanConfig.class,
    EntityBackupConfig.class,
    TaskReason.class,
    NvdimmSystemInfo.class,
    VirtualMachineProfileRawData.class,
    HostHardwareStatusInfo.class,
    HostSriovDevicePoolInfo.class,
    HostInternetScsiHbaDigestCapabilities.class,
    NvdimmGuid.class,
    FaultToleranceMetaSpec.class,
    VirtualMachineQuickStats.class,
    HostPciPassthruConfig.class,
    IscsiDependencyEntity.class,
    ClusterDasHostRecommendation.class,
    VirtualMachineBootOptions.class,
    HostVirtualNicOpaqueNetworkSpec.class,
    HostServiceInfo.class,
    VAppCloneSpecNetworkMappingPair.class,
    HostHardwareInfo.class,
    PrivilegePolicyDef.class,
    HostIpRouteTableInfo.class,
    VirtualMachineConfigInfo.class,
    ClusterDpmHostConfigInfo.class,
    HostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption.class,
    HostDatastoreConnectInfo.class,
    HostIpConfigIpV6AddressConfiguration.class,
    FaultsByHost.class,
    OptionType.class,
    EventFilterSpec.class,
    VirtualMachinePropertyRelation.class,
    DvsHostInfrastructureTrafficResource.class,
    LicenseSource.class,
    ProfileParameterMetadata.class,
    EventAlarmExpressionComparison.class,
    VirtualMachineSummary.class,
    DVSHealthCheckConfig.class,
    VirtualMachineGuestQuiesceSpec.class,
    VsanHostDiskMapInfo.class,
    ServiceLocatorCredential.class,
    ProfileExpression.class,
    OvfConsumerOvfSection.class,
    HostLowLevelProvisioningManagerVmMigrationStatus.class,
    ChangesInfoEventArgument.class,
    DatastoreSummary.class,
    EnvironmentBrowserConfigOptionQuerySpec.class,
    VMwareDVSVspanConfigSpec.class,
    HostVirtualNicManagerNicTypeSelection.class,
    HostFibreChannelOverEthernetHbaLinkInfo.class,
    VirtualMachineVMCIDeviceOptionFilterSpecOption.class,
    DvsTrafficRule.class,
    VsanHostConfigInfoNetworkInfoPortConfig.class,
    RetrieveVStorageObjSpec.class,
    VimVasaProviderInfo.class,
    ResourcePoolSummary.class,
    PerfMetricSeries.class,
    VirtualMachineProfileSpec.class,
    DvsOutOfSyncHostArgument.class,
    VsanHostConfigInfoNetworkInfo.class,
    GuestAuthentication.class,
    OpaqueNetworkCapability.class,
    VMwareDVSPvlanMapEntry.class,
    StorageDrsConfigSpec.class,
    PhysicalNicCdpDeviceCapability.class,
    AlarmTriggeringActionTransitionSpec.class,
    HostDatastoreSystemVvolDatastoreSpec.class,
    HostVirtualSwitchBridge.class,
    CustomizationGlobalIPSettings.class,
    HostListSummary.class,
    NvdimmNamespaceCreateSpec.class,
    HostFaultToleranceManagerComponentHealthInfo.class,
    CustomizationName.class,
    VchaClusterDeploymentSpec.class,
    HostDiskPartitionSpec.class,
    HostTargetTransport.class,
    VirtualMachineDisplayTopology.class,
    DVSUplinkPortPolicy.class,
    HostNasVolumeSpec.class,
    WitnessNodeInfo.class,
    HostConfigInfo.class,
    HostVFlashResourceConfigurationResult.class,
    IpPoolIpPoolConfigInfo.class,
    ExtensionTaskTypeInfo.class,
    HbrManagerVmReplicationCapability.class,
    HostFeatureVersionInfo.class,
    DVSConfigInfo.class,
    DistributedVirtualSwitchHostMemberBacking.class,
    NodeDeploymentSpec.class,
    NetDnsConfigSpec.class,
    HostCacheConfigurationSpec.class,
    ApplyStorageRecommendationResult.class,
    GuestScreenInfo.class,
    HostNetOffloadCapabilities.class,
    DistributedVirtualSwitchManagerDvsProductSpec.class,
    ArrayUpdateSpec.class,
    VirtualMachineMetadataManagerVmMetadataResult.class,
    ExtensionEventTypeInfo.class,
    VirtualDeviceConfigSpec.class,
    VirtualMachineCapability.class,
    DatastoreInfo.class,
    UsbScanCodeSpec.class,
    VirtualMachineBootOptionsBootableDevice.class,
    VirtualDeviceConfigSpecBackingSpec.class,
    CustomFieldValue.class,
    SessionManagerServiceRequestSpec.class,
    ComputeResourceConfigSpec.class,
    HostPortGroupPort.class,
    VirtualMachineConfigSummary.class,
    NetworkSummary.class,
    HostUnresolvedVmfsResignatureSpec.class,
    VMwareVspanSession.class,
    HostVmfsSpec.class,
    NodeNetworkSpec.class,
    HostUnresolvedVmfsResolutionSpec.class,
    DVSHostLocalPortInfo.class,
    HostPlugStoreTopologyPlugin.class,
    DvsNetworkRuleAction.class,
    ProfileConfigInfo.class,
    VirtualMachineStorageInfo.class,
    HostHyperThreadScheduleInfo.class,
    SourceNodeSpec.class,
    Relation.class,
    FaultToleranceConfigSpec.class,
    ManagedByInfo.class,
    GuestFileInfo.class,
    DVPortgroupPolicy.class,
    KeyAnyValue.class,
    VsanHostFaultDomainInfo.class,
    NetDhcpConfigSpecDhcpOptionsSpec.class,
    ExtensionOvfConsumerInfo.class,
    VirtualDiskSpec.class,
    DistributedVirtualSwitchPortStatistics.class,
    GuestStackInfo.class,
    DVSNetworkResourcePool.class,
    DistributedVirtualSwitchManagerHostDvsFilterSpec.class,
    DVSContactInfo.class,
    InheritablePolicy.class,
    HostVirtualNicManagerInfo.class,
    HostHardwareElementInfo.class,
    HostNasVolumeConfig.class,
    DVSHealthCheckCapability.class,
    HostHostBusAdapter.class,
    VsanHostDiskMapResult.class,
    HostAuthenticationStoreInfo.class,
    Action.class,
    CryptoManagerKmipClusterStatus.class,
    HostSharedGpuCapabilities.class,
    HostAuthenticationManagerInfo.class,
    StorageDrsConfigInfo.class,
    NvdimmInterleaveSetInfo.class,
    HostGraphicsConfigDeviceType.class,
    VsanHostIpConfig.class,
    ExtensionClientInfo.class,
    ProfileApplyProfileProperty.class,
    ClusterAttemptedVmInfo.class,
    VirtualHardwareOption.class,
    VslmCreateSpecBackingSpec.class,
    ResourcePoolRuntimeInfo.class,
    ClusterSlotPolicy.class,
    MissingObject.class,
    CustomizationIpGenerator.class,
    HostDateTimeConfig.class,
    Capability.class,
    HostNicFailureCriteria.class,
    NegatableExpression.class,
    HostRuntimeInfoNetworkRuntimeInfo.class,
    VirtualMachineFeatureRequirement.class,
    HostServiceSourcePackage.class,
    ResourceAllocationInfo.class,
    PerfInterval.class,
    HostScsiTopologyLun.class,
    VirtualMachineSriovDevicePoolInfo.class,
    VmfsDatastoreBaseOption.class,
    HostMemorySpec.class,
    ObjectUpdate.class,
    DiskChangeExtent.class,
    ProfileParameterMetadataParameterRelationMetadata.class,
    ImportSpec.class,
    VsanUpgradeSystemUpgradeHistoryItem.class,
    VirtualDiskDeltaDiskFormatsSupported.class,
    HostDigestInfo.class,
    CustomizationIpV6Generator.class,
    ClusterAction.class,
    HostOpaqueSwitch.class,
    HostSystemSwapConfigurationSystemSwapOption.class,
    PerfEntityMetricBase.class,
    PowerSystemInfo.class,
    HostAccountSpec.class,
    HostProfileManagerCompositionResult.class,
    VmDiskFileQueryFilter.class,
    VirtualMachineTargetInfo.class,
    VirtualMachineInstantCloneSpec.class,
    DVPortSetting.class,
    ScsiLunCapabilities.class,
    VirtualDeviceOption.class,
    AlarmAction.class,
    BatchResult.class,
    VAppCloneSpec.class,
    DVSPolicy.class,
    HostAutoStartManagerConfig.class,
    HostDiskMappingOption.class,
    CryptoManagerKmipServerStatus.class,
    BaseConfigInfoBackingInfo.class,
    AnswerFileStatusError.class,
    DvsOperationBulkFaultFaultOnHost.class,
    VirtualMachineMetadataManagerVmMetadata.class,
    HostInternetScsiHbaIPProperties.class,
    FileQuery.class,
    HostSnmpSystemAgentLimits.class,
    HostEnterMaintenanceResult.class,
    EventFilterSpecByEntity.class,
    ServiceLocator.class,
    VirtualMachineDatastoreVolumeOption.class,
    CryptoSpec.class,
    TaskScheduler.class,
    VirtualDeviceBackingInfo.class,
    VirtualMachineDeviceRuntimeInfo.class,
    VirtualMachineGuestIntegrityInfo.class,
    HostFirewallConfig.class,
    HbrManagerReplicationVmInfo.class,
    OvfOptionInfo.class,
    VirtualMachineMessage.class,
    HostNatServicePortForwardSpec.class,
    VirtualDeviceBusSlotOption.class,
    HostSystemRemediationState.class,
    HostProxySwitchConfig.class,
    VMwareDVSVspanCapability.class,
    HostProfilesEntityCustomizations.class,
    GuestRegKeyNameSpec.class,
    ExtSolutionManagerInfo.class,
    ResourcePoolResourceUsage.class,
    VsanUpgradeSystemPreflightCheckIssue.class,
    VirtualMachineAffinityInfo.class,
    ClusterRuleInfo.class,
    AlarmExpression.class,
    HostTpmEventDetails.class,
    HostMultipathInfo.class,
    VirtualDeviceBusSlotInfo.class,
    FileInfo.class,
    VirtualDeviceBackingOption.class,
    VirtualDevice.class,
    VmfsDatastoreSpec.class,
    EventArgument.class,
    DatastoreCapability.class,
    ExtensionFaultTypeInfo.class,
    VirtualMachineConfigInfoOverheadInfo.class,
    ClusterDasAdvancedRuntimeInfoVmcpCapabilityInfo.class,
    GuestAuthSubject.class,
    LocalizationManagerMessageCatalog.class,
    HostInternetScsiHbaStaticTarget.class,
    ApplyProfile.class,
    Description.class,
    Event.class,
    ClusterInfraUpdateHaConfigInfo.class,
    HostCpuPowerManagementInfo.class,
    GuestRegValueDataSpec.class,
    VMwareDvsLacpGroupConfig.class
})
public class DynamicData {


}