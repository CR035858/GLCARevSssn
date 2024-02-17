package com.gl.model;

public class TrainDetails {

		String trainId;
		String trainName;
		String sourceCity;
		String destinationCity;
		int routeNo;
		int distanceInKms;
		
		public TrainDetails() {
			super();
		}

		public TrainDetails(String trainId, String trainName, String sourceCity, String destinationCity, int routeNo,
				int distanceInKms) {
			super();
			this.trainId = trainId;
			this.trainName = trainName;
			this.sourceCity = sourceCity;
			this.destinationCity = destinationCity;
			this.routeNo = routeNo;
			this.distanceInKms = distanceInKms;
		}

		public String getTrainId() {
			return trainId;
		}

		public void setTrainId(String trainId) {
			this.trainId = trainId;
		}

		public String getTrainName() {
			return trainName;
		}

		public void setTrainName(String trainName) {
			this.trainName = trainName;
		}

		public String getSourceCity() {
			return sourceCity;
		}

		public void setSourceCity(String sourceCity) {
			this.sourceCity = sourceCity;
		}

		public String getDestinationCity() {
			return destinationCity;
		}

		public void setDestinationCity(String destinationCity) {
			this.destinationCity = destinationCity;
		}

		public int getRouteNo() {
			return routeNo;
		}

		public void setRouteNo(int routeNo) {
			this.routeNo = routeNo;
		}

		public int getDistanceInKms() {
			return distanceInKms;
		}

		public void setDistanceInKms(int distanceInKms) {
			this.distanceInKms = distanceInKms;
		}

		@Override
		public String toString() {
			return "TrainDetails [trainId=" + trainId + ", trainName=" + trainName + ", sourceCity=" + sourceCity
					+ ", destinationCity=" + destinationCity + ", routeNo=" + routeNo + ", distanceInKms="
					+ distanceInKms + "]";
		}
		
		
		
		
}
