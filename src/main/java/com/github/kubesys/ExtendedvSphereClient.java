/*
 * Copyright (2019, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.kubesys;


import org.apache.log4j.Logger;

import com.github.kubesys.impls.VirtualMachineDiskImpl;
import com.github.kubesys.impls.VirtualMachineImpl;
import com.github.kubesys.impls.VirtualMachineNetworkImpl;
import com.github.kubesys.impls.VirtualMachinePoolImpl;
import com.vmware.vapi.bindings.StubConfiguration;
import com.vmware.vapi.protocol.HttpConfiguration;
import com.vmware.vapi.protocol.HttpConfiguration.SslConfiguration;

import vmware.samples.common.SslUtil;
import vmware.samples.common.authentication.VapiAuthenticationHelper;
import vmware.samples.common.authentication.VimAuthenticationHelper;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * 
 * @version 1.0.0
 * @since 2019/9/3
 *
 *        <code>ExtendedKubernetesClient<code> extends
 *        <code>DefaultKubernetesClient<code> to provide the lifecycle of
 *        VirtualMachine, VirtualMachinePool, VirtualMachineDisk,
 *        VirtualMachineImage, VirtualMachineSnapshot, VirtualMachineNetwork
 * 
 */
public class ExtendedvSphereClient {

	/**
	 * m_logger
	 */
	public final static Logger m_logger = Logger.getLogger(ExtendedvSphereClient.class.getName());

	protected VimAuthenticationHelper vimAuthHelper;

	protected VapiAuthenticationHelper vapiAuthHelper;

	protected StubConfiguration sessionStubConfig;

	public ExtendedvSphereClient(String server, String username, String password) throws Exception {
		super();
		this.vapiAuthHelper = new VapiAuthenticationHelper();
		this.vimAuthHelper = new VimAuthenticationHelper();
		HttpConfiguration httpConfig = buildHttpConfiguration();
		this.sessionStubConfig = vapiAuthHelper
				.loginByUsernameAndPassword(server, username, password, httpConfig);
		this.vimAuthHelper.loginByUsernameAndPassword(server, username, password);
	}

	protected HttpConfiguration buildHttpConfiguration() throws Exception {
		HttpConfiguration httpConfig = new HttpConfiguration.Builder()
					.setSslConfiguration(buildSslConfiguration())
					.getConfig();

		return httpConfig;
	}

	protected SslConfiguration buildSslConfiguration() throws Exception {
		SslUtil.trustAllHttpsCertificates();
		return new SslConfiguration.Builder().disableCertificateValidation().disableHostnameVerification().getConfig();
	}
	
	public VimAuthenticationHelper getVimAuthHelper() {
		return vimAuthHelper;
	}

	public void setVimAuthHelper(VimAuthenticationHelper vimAuthHelper) {
		this.vimAuthHelper = vimAuthHelper;
	}

	public VapiAuthenticationHelper getVapiAuthHelper() {
		return vapiAuthHelper;
	}

	public void setVapiAuthHelper(VapiAuthenticationHelper vapiAuthHelper) {
		this.vapiAuthHelper = vapiAuthHelper;
	}

	public StubConfiguration getSessionStubConfig() {
		return sessionStubConfig;
	}

	public void setSessionStubConfig(StubConfiguration sessionStubConfig) {
		this.sessionStubConfig = sessionStubConfig;
	}

	public VirtualMachineImpl virtualmachines() {
		return new VirtualMachineImpl(this);
	}
	
	public VirtualMachineNetworkImpl virtualmachinenetworks() {
		return new VirtualMachineNetworkImpl(this);
	}
	
	public VirtualMachinePoolImpl virtualmachinepools() {
		return new VirtualMachinePoolImpl(this);
	}
	
	public VirtualMachineDiskImpl virtualmachinedisks() {
		return new VirtualMachineDiskImpl(this);
	}

	public static void main(String[] args) throws Exception {
		ExtendedvSphereClient client = new ExtendedvSphereClient("133.133.135.35", "administrator@vsphere.test", "Onceas2020!234");

		
//		System.out.println(client.virtualmachinepools().listDataCeneters());
//		System.out.println(client.virtualmachinepools().listMetrics());
//		System.out.println(client.virtualmachinepools().getDataCeneter("datacenter-2"));
//		System.out.println(client.virtualmachinepools().listDatastores());
//		System.out.println(client.virtualmachinepools().getDatastore("datastore-10"));
		System.out.println(client.virtualmachinepools().listClusters());
		System.out.println(client.virtualmachinepools().getCluster("domain-c16"));
		System.out.println(client.virtualmachinepools().listPools());
		System.out.println(client.virtualmachinepools().getPool("resgroup-26").getCpuAllocation().getReservation());
		
//		System.out.println(client.virtualmachinepools().getPool("resgroup-17"));
//		System.out.println(client.virtualmachinepools().listHosts("domain-c16"));
//		System.out.println(client.virtualmachinepools().listFolders());
//		System.out.println(client.virtualmachinenetworks().list());
		
//		System.out.println(NetworkHelper.getStandardNetworkBacking(
//				client.getVapiAuthHelper().getStubFactory(), 
//				client.getSessionStubConfig(), 
//				"Datacenter",
//				"VM Network"));
		
		//		System.out.println(client.virtualmachinepools().listPools());
//		System.out.println(client.virtualmachinepools().listFolders());
//		System.out.println(client.virtualmachines().list());
//		System.out.println(client.virtualmachines().stopVMById("vm-12"));
//		System.out.println(client.virtualmachines().getVMById("vm-12"));
//		System.out.println(client.virtualmachines().getVM("测试1").getDisks());
//		System.out.println(client.virtualmachinedisks().list("vm-12"));
//		System.out.println(client.virtualmachinedisks().get("vm-15", "2000"));
//		System.out.println(client.virtualmachines().plugDisk("vm-15", "test2,size=10"));
//		System.out.println(client.virtualmachines().deleteDisk("vm-15", "2001"));
		//System.out.println(client.virtualmachines().cloneVM("vm-15", "clone"));
		//System.out.println(client.virtualmachines().setVMResource("vm-15", "));
 
//		PlugNIC nic = new PlugNIC();
//		nic.setType("l2bridge");
//		System.out.println(client.virtualmachines().plugNIC("network-11", nic));
//		System.out.println(client.virtualmachines().getVMById("vm-21"));
//		System.out.println(client.virtualmachines().stopVMById("vm-21"));
//		System.out.println(client.virtualmachines().setCPU("vm-21", 2l)); // 在虚拟机运行使改变CPU内存只能将数值调大
//		System.out.println(client.virtualmachines().setMemory("vm-21", 8*1024l)); // 在虚拟机运行使改变CPU内存只能将数值调大
	}
}
