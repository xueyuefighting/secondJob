package com.yonyou.scf.contract.ftp;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.pool2.KeyedPooledObjectFactory;
import org.apache.commons.pool2.impl.GenericKeyedObjectPool;
import org.apache.commons.pool2.impl.GenericKeyedObjectPoolConfig;

public class FTPClientPool extends GenericKeyedObjectPool<FTPClientConfiguration, FTPClient>{
	
	public FTPClientPool(KeyedPooledObjectFactory<FTPClientConfiguration, FTPClient> factory,
			GenericKeyedObjectPoolConfig config) {
		super(factory, config);
	}

}
