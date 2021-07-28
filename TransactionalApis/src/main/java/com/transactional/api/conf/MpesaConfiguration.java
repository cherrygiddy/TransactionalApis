package com.transactional.api.conf;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data
@Configuration
@ConfigurationProperties(prefix = "mpesa.daraja")
public class MpesaConfiguration {

	private String consumerKey;
    private String consumerSecret;
    private String grantType;
    private String oauthEndpoint;

    @Override
    public String toString() {
        return String.format("{consumerKey='%s', consumerSecret='%s', grantType='%s', oauthEndpoint='%s'}",
                consumerKey, consumerSecret, grantType, oauthEndpoint);
    }

	public Object getConsumerSecret() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getConsumerKey() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getOauthEndpoint() {
		// TODO Auto-generated method stub
		return null;
	}
}

