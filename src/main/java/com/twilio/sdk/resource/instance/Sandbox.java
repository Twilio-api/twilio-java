package com.twilio.sdk.resource.instance;

import com.twilio.sdk.TwilioRestClient;
import com.twilio.sdk.resource.InstanceResource;

import java.util.Date;
import java.util.Map;

// TODO: Auto-generated Javadoc
/**
 * The Class Sandbox.
 * 
 * For more information see <a href="https://www.twilio.com/docs/api/rest/sandbox">https://www.twilio.com/docs/api/rest/sandbox</a>
 */
public class Sandbox extends InstanceResource {
	//private static final String SID_PROPERTY = "sid";

	/**
	 * Instantiates a new sandbox.
	 *
	 * @param client the client
	 */
	public Sandbox(TwilioRestClient client) {
		super(client);
	}

	/**
	 * Instantiates a new sandbox.
	 *
	 * @param client the client
	 * @param properties the properties
	 */
	public Sandbox(TwilioRestClient client, Map<String, Object> properties) {
		super(client, properties);
	}

	/* (non-Javadoc)
	 * @see com.twilio.sdk.resource.Resource#getResourceLocation()
	 */
	@Override
	protected String getResourceLocation() {
		return "/" + TwilioRestClient.DEFAULT_VERSION + "/Accounts/"
				+ this.getRequestAccountSid() + "/Sandbox.json";
	}

	/*
	 * Property getters
	 */
	
	/**
	 * Gets the date created.
	 *
	 * @return the date created
	 */
	public Date getDateCreated() {
		return getDateProperty("date_created");
	}

	/**
	 * Gets the date updated.
	 *
	 * @return the date updated
	 */
	public Date getDateUpdated() {
		return getDateProperty("date_updated");
	}
	
	/**
	 * Gets the phone number.
	 *
	 * @return the phone number
	 */
	public String getPhoneNumber() {
		return this.getProperty("phone_number");
	}

	/**
	 * Gets the application sid.
	 *
	 * @return the application sid
	 */
	public String getApplicationSid() {
		return this.getProperty("application_sid");
	}

	/**
	 * Gets the api version.
	 *
	 * @return the api version
	 */
	public String getApiVersion() {
		return this.getProperty("api_version");
	}
	
	/**
	 * Gets the voice url.
	 *
	 * @return the voice url
	 */
	public String getVoiceUrl() {
		return this.getProperty("voice_url");
	}

	/**
	 * Gets the voice method.
	 *
	 * @return the voice method
	 */
	public String getVoiceMethod() {
		return this.getProperty("voice_method");
	}

	/**
	 * Gets the sms url.
	 *
	 * @return the sms url
	 */
	public String getSmsUrl() {
		return this.getProperty("sms_url");
	}

	/**
	 * Gets the sms method.
	 *
	 * @return the sms method
	 */
	public String getSmsMethod() {
		return this.getProperty("sms_method");
	}
	
	/**
	 * Gets the pin.
	 *
	 * @return the pin
	 */
	public String getPin() {
		return this.getProperty("pin");
	}
}
