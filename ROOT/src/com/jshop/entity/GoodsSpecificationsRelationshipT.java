package com.jshop.entity;

// Generated 2012-10-10 12:34:32 by Hibernate Tools 3.4.0.CR1

/**
 * GoodsSpecificationsRelationshipT generated by hbm2java
 */
public class GoodsSpecificationsRelationshipT implements java.io.Serializable {

	private String goodsSetId;
	private String specidicationsId;

	public GoodsSpecificationsRelationshipT() {
	}

	public GoodsSpecificationsRelationshipT(String goodsSetId,
			String specidicationsId) {
		this.goodsSetId = goodsSetId;
		this.specidicationsId = specidicationsId;
	}

	public String getGoodsSetId() {
		return this.goodsSetId;
	}

	public void setGoodsSetId(String goodsSetId) {
		this.goodsSetId = goodsSetId;
	}

	public String getSpecidicationsId() {
		return this.specidicationsId;
	}

	public void setSpecidicationsId(String specidicationsId) {
		this.specidicationsId = specidicationsId;
	}

}
