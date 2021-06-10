package com.aj.pim.kpi;

import java.io.Serializable;
import java.util.Collection;

public class JunoAsset implements Serializable{

	private static final long serialVersionUID = 374400431957816256L;
	
	private String id;
	
	private String assetName;
	
	private String assetLevel="CAMPAIGN";//AD_PLAN AND ADCOPY AND LANDING_PAGE
	
	private String sourcePlatform="FB";//GOOG, LI, TW
	
	private FlightPlanMetrics metrics;
	
	private Collection<JunoAsset> assetLineItem;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAssetName() {
		return assetName;
	}

	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}

	public String getAssetLevel() {
		return assetLevel;
	}

	public void setAssetLevel(String assetLevel) {
		this.assetLevel = assetLevel;
	}

	public String getSourcePlatform() {
		return sourcePlatform;
	}

	public void setSourcePlatform(String sourcePlatform) {
		this.sourcePlatform = sourcePlatform;
	}

	public FlightPlanMetrics getMetrics() {
		return metrics;
	}

	public void setMetrics(FlightPlanMetrics metrics) {
		this.metrics = metrics;
	}

	public Collection<JunoAsset> getAssetLineItem() {
		return assetLineItem;
	}

	public void setAssetLineItem(Collection<JunoAsset> assetLineItem) {
		this.assetLineItem = assetLineItem;
	}
	
	

}
