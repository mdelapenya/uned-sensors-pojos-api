/**
 *    Copyright 2017-today Manuel de la Peña
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package es.mdelapenya.uned.master.is.ubicomp.sensors.pojo;

import java.io.Serializable;

/**
 * @author Manuel de la Peña
 */
public class SensorMetric implements Metric, Serializable {

	public SensorMetric() {
	}

	public SensorMetric(
		String sensorId, String applicationId, double latitude,
		double longitude, double metric, String metricName, String metricUnits,
		long timestamp) {

		this.sensorId = sensorId;
		this.applicationId = applicationId;
		this.latitude = latitude;
		this.longitude = longitude;
		this.metric = metric;
		this.metricName = metricName;
		this.metricUnits = metricUnits;
		this.timestamp = timestamp;

	}

	public String getApplicationId() {
		return applicationId;
	}

	public double getLatitude() {
		return latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	@Override
	public String getSensorId() {
		return sensorId;
	}

	public double getMetric() {
		return metric;
	}

	public String getMetricName() {
		return metricName;
	}

	public String getMetricUnits() {
		return metricUnits;
	}

	public long getTimestamp() {
		return timestamp;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(41);

		sb.append("{");

		sb.append(ESCAPED_QUOTE);
		sb.append("latitude");
		sb.append(ESCAPED_QUOTE);
		sb.append(":");
		sb.append(ESCAPED_QUOTE);
		sb.append(getLatitude());
		sb.append(ESCAPED_QUOTE);

		sb.append(", ");

		sb.append(ESCAPED_QUOTE);
		sb.append("longitude");
		sb.append(ESCAPED_QUOTE);
		sb.append(":");
		sb.append(ESCAPED_QUOTE);
		sb.append(getLongitude());
		sb.append(ESCAPED_QUOTE);

		sb.append(", ");

		sb.append(ESCAPED_QUOTE);
		sb.append("sensorId");
		sb.append(ESCAPED_QUOTE);
		sb.append(":");
		sb.append(ESCAPED_QUOTE);
		sb.append(getSensorId());
		sb.append(ESCAPED_QUOTE);

		sb.append(", ");

		sb.append(ESCAPED_QUOTE);
		sb.append("applicationId");
		sb.append(ESCAPED_QUOTE);
		sb.append(":");
		sb.append(ESCAPED_QUOTE);
		sb.append(getApplicationId());
		sb.append(ESCAPED_QUOTE);

		sb.append(", ");

		sb.append(ESCAPED_QUOTE);
		sb.append("metricName");
		sb.append(ESCAPED_QUOTE);
		sb.append(":");
		sb.append(ESCAPED_QUOTE);
		sb.append(getMetricName());
		sb.append(ESCAPED_QUOTE);

		sb.append(", ");

		sb.append(ESCAPED_QUOTE);
		sb.append("metric");
		sb.append(ESCAPED_QUOTE);
		sb.append(":");
		sb.append(ESCAPED_QUOTE);
		sb.append(getMetric());
		sb.append(ESCAPED_QUOTE);

		sb.append(", ");

		sb.append(ESCAPED_QUOTE);
		sb.append("metricUnits");
		sb.append(ESCAPED_QUOTE);
		sb.append(":");
		sb.append(ESCAPED_QUOTE);
		sb.append(getMetricUnits());
		sb.append(ESCAPED_QUOTE);

		sb.append(", ");

		sb.append(ESCAPED_QUOTE);
		sb.append("timestamp");
		sb.append(ESCAPED_QUOTE);
		sb.append(":");
		sb.append(ESCAPED_QUOTE);
		sb.append(getTimestamp());
		sb.append(ESCAPED_QUOTE);

		sb.append("}");

		return sb.toString();
	}

	private static final String ESCAPED_QUOTE = "\"";

	private String applicationId;
	private double latitude;
	private double longitude;
	private double metric;
	private String metricName;
	private String metricUnits;
	private String sensorId;
	private long timestamp;

}
