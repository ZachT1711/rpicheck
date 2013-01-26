package de.eidottermihi.rpicheck;

import java.util.Date;
import java.util.List;

import de.eidottermihi.raspitools.DiskUsageBean;

public class QueryBean {
	private Double volts;
	private Double freqArm;
	private Double freqCore;
	private Double tempCore;
	private Date lastUpdate;
	private QueryStatus status;
	private String startup;
	private String avgLoad;
	private Long totalMem;
	private Long freeMem;
	private String serialNo;
	private String ipAddr;
	private List<DiskUsageBean> disks;
	private String distri;

	public Double getVolts() {
		return volts;
	}

	public void setVolts(Double volts) {
		this.volts = volts;
	}

	public Double getFreqArm() {
		return freqArm;
	}

	public void setFreqArm(Double freqArm) {
		this.freqArm = freqArm;
	}

	public Double getFreqCore() {
		return freqCore;
	}

	public void setFreqCore(Double freqCore) {
		this.freqCore = freqCore;
	}

	public Double getTempCore() {
		return tempCore;
	}

	public void setTempCore(Double tempCore) {
		this.tempCore = tempCore;
	}

	public QueryStatus getStatus() {
		return status;
	}

	public void setStatus(QueryStatus status) {
		this.status = status;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public String getStartup() {
		return startup;
	}

	public void setStartup(String startup) {
		this.startup = startup;
	}

	public String getAvgLoad() {
		return avgLoad;
	}

	public void setAvgLoad(String avgLoad) {
		this.avgLoad = avgLoad;
	}

	public Long getTotalMem() {
		return totalMem;
	}

	public void setTotalMem(Long totalMem) {
		this.totalMem = totalMem;
	}

	public Long getFreeMem() {
		return freeMem;
	}

	public void setFreeMem(Long freeMem) {
		this.freeMem = freeMem;
	}

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getIpAddr() {
		return ipAddr;
	}

	public void setIpAddr(String ipAddr) {
		this.ipAddr = ipAddr;
	}

	public List<DiskUsageBean> getDisks() {
		return disks;
	}

	public void setDisks(List<DiskUsageBean> disks) {
		this.disks = disks;
	}

	public String getDistri() {
		return distri;
	}

	public void setDistri(String distri) {
		this.distri = distri;
	}

}
