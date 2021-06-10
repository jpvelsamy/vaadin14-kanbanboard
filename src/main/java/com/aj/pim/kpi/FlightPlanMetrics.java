package com.aj.pim.kpi;

import java.io.Serializable;

public class FlightPlanMetrics implements Serializable, IJunoAsset {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5424634889003174704L;
	
	
	private int impression;
	private int view;
	private int click;
	private int leads;
	private int likez;
	private int share;
	private int comment;
	public int getImpression() {
		return impression;
	}
	public void setImpression(int impression) {
		this.impression = impression;
	}
	public int getView() {
		return view;
	}
	public void setView(int view) {
		this.view = view;
	}
	public int getClick() {
		return click;
	}
	public void setClick(int click) {
		this.click = click;
	}
	public int getLeads() {
		return leads;
	}
	public void setLeads(int leads) {
		this.leads = leads;
	}
	public int getLikez() {
		return likez;
	}
	public void setLikez(int likez) {
		this.likez = likez;
	}
	public int getShare() {
		return share;
	}
	public void setShare(int share) {
		this.share = share;
	}
	public int getComment() {
		return comment;
	}
	public void setComment(int comment) {
		this.comment = comment;
	}
	
	
	

}
