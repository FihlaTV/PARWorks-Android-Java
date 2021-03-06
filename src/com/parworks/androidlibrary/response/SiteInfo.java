/*
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.parworks.androidlibrary.response;

/**
 * An object specifying all the information about an ARSite. This contains all
 * of the attributes returned by the Get Site Info endpoint.
 * 
 * @author Adam Hickey
 * 
 */
public class SiteInfo {

	public enum FeatureType {
		SIFT, SURF, FREAK
	}

	private String mName;
	private String mId;
	private String mChannel;
	private String mDescription;
	private String mGeoHash;
	private BaseImageState mSiteState;
	private double mLatitude;
	private double mLongitude;
	private OverlayState mBimState;
	private String mFeatureType;
	private String mS3Bucket;
	private String mLastModificationTime;
	private String mOwnerApiKey;
	private int mTotalImages;
	private FeatureType mFeatureDescriptorType;
	private String mProcessingProfile;

	public enum OverlayState {
		PROCESSING, PROCESSED, PROCESSING_FAILED, NOT_PROCESSED
	}

	public enum BaseImageState {
		PROCESSING, PROCESSED, PROCESSING_FAILED, NOT_PROCESSED
	}

	public SiteInfo() {
	}

	public SiteInfo(String name, String id, String channel, String description,
			String geoHash, BaseImageState siteState, double lat, double lon,
			OverlayState bimState, String featureType, String s3Bucket,
			String lastModificationTime) {
		mName = name;
		mId = id;
		mChannel = channel;
		mDescription = description;
		mGeoHash = geoHash;
		mSiteState = siteState;
		mLatitude = lat;
		mLongitude = lon;
		mBimState = bimState;
		mFeatureType = featureType;
		mS3Bucket = s3Bucket;
		mLastModificationTime = lastModificationTime;
	}

	public void setOwnerApiKey(String ownerApiKey) {
		mOwnerApiKey = ownerApiKey;
	}

	public String getOwnerApiKey() {
		return mOwnerApiKey;
	}

	public String getName() {
		return mName;
	}

	public void setName(String name) {
		this.mName = name;
	}

	public String getId() {
		return mId;
	}

	public void setId(String id) {
		this.mId = id;
	}

	public String getChannel() {
		return mChannel;
	}

	public void setChannel(String channel) {
		this.mChannel = channel;
	}

	public String getDescription() {
		return mDescription;
	}

	public void setDescription(String description) {
		this.mDescription = description;
	}

	public String getGeoHash() {
		return mGeoHash;
	}

	public void setGeoHash(String geoHash) {
		this.mGeoHash = geoHash;
	}

	public BaseImageState getSiteState() {
		return mSiteState;
	}

	public void setSiteState(BaseImageState siteState) {
		this.mSiteState = siteState;
	}

	public double getLat() {
		return mLatitude;
	}

	public void setLat(double lat) {
		this.mLatitude = lat;
	}

	public double getLon() {
		return mLongitude;
	}

	public void setLon(double lon) {
		this.mLongitude = lon;
	}

	public OverlayState getBimState() {
		return mBimState;
	}

	public void setBimState(OverlayState bimState) {
		this.mBimState = bimState;
	}

	public String getFeatureType() {
		return mFeatureType;
	}

	public void setFeatureType(String featureType) {
		this.mFeatureType = featureType;
	}

	public String getS3Bucket() {
		return mS3Bucket;
	}

	public void setS3Bucket(String s3Bucket) {
		this.mS3Bucket = s3Bucket;
	}

	public String getLastModificationTime() {
		return mLastModificationTime;
	}

	public void setLastModificationTime(String lastModificationTime) {
		this.mLastModificationTime = lastModificationTime;
	}

	public int getTotalImages() {
		return mTotalImages;
	}

	public void setTotalImages(int totalImages) {
		this.mTotalImages = totalImages;
	}

	public FeatureType getFeatureDescriptorType() {
		return mFeatureDescriptorType;
	}

	public void setFeatureDescriptorType(FeatureType featureDescriptorType) {
		mFeatureDescriptorType = featureDescriptorType;
	}

	public String getProcessingProfile() {
		return mProcessingProfile;
	}

	public void setProcessingProfile(String processingProfile) {
		mProcessingProfile = processingProfile;
	}

}
