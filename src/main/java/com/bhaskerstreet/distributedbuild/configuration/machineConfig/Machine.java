package com.bhaskerstreet.distributedbuild.configuration.machineConfig;

import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class Machine {



    private String type;
    private String ip;
    private String host;
    private String port;
    private Integer fileTransferPort;
    private String projectRootDirectory;
    private boolean isMavenInstalled;
    private List<Projects> projects;
    private String initiatorHostAddress;
    private String public_key;
    private String private_key;
   


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getProjectRootDirectory() {
        return projectRootDirectory;
    }

    public void setProjectRootDirectory(String projectRootDirectory) {
        this.projectRootDirectory = projectRootDirectory;
    }



    public List<Projects> getProjects() {
        return projects;
    }

    public void setProjects(List<Projects> projects) {
        this.projects = projects;
    }

    public boolean getIsMavenInstalled() {
        return isMavenInstalled;
    }

    public void setIsMavenInstalled(boolean mavenInstalled) {
        isMavenInstalled = mavenInstalled;
    }

	public Integer getFileTransferPort() {
		return fileTransferPort;
	}

	public void setFileTransferPort(Integer fileTransferPort) {
		this.fileTransferPort = fileTransferPort;
	}

	public String getInitiatorHostAddress() {
		return initiatorHostAddress;
	}

	public void setInitiatorHostAddress(String initiatorHostAddress) {
		this.initiatorHostAddress = initiatorHostAddress;
	}

	public String getPublic_key() {
		return public_key;
	}

	public void setPublic_key(String public_key) {
		this.public_key = public_key;
	}

	public String getPrivate_key() {
		return private_key;
	}

	public void setPrivate_key(String private_key) {
		this.private_key = private_key;
	}

	
	
	
    
    
}
