/*
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.MD' which is part of this source code package.
 */
package com.example.utils;

/**
 * It contains the resource server configuration and constants
 * Like a properties file, but simpler
 */
public class ResourceServerConfig {

    //YOUR IDENTITY DOMAIN AND APPLICATION CREDENTIALS
    public static final String CLIENT_ID = "<YOUR_CLIENT_ID>";
    public static final String CLIENT_SECRET = "<YOUR_CLIENT_SECRET>";
    public static final String IDCS_URL = "<YOUR_IDCS_URL>"; "EX: https://idcs-XXX.identity.oraclecloud.com"

    //INFORMATION ABOUT THE TARGET APPLICATION
    public static final String SCOPE_AUD = "<YOUR_SCOPE_AUD>"; "EX: https://idcs-XXX.identity.oraclecloud.com"

    //TEST CLIENT CREDENTIALS
    public static final String TEST_CLIENT_ID = "<YOUR_TEST_CLIENT_ID>";
    public static final String TEST_CLIENT_SECRET = "<YOUR_TEST_CLIENT_SECRET>";
    public static final String TEST_CLIENT_SCOPE = "urn:opc:idm:__myscopes__";

    //INFORMATION ABOUT IDENTITY CLOUD SERVICES
    public static final String JWK_URL=IDCS_URL+"/admin/v1/SigningCert/jwk";
    public static final String TOKEN_URL=IDCS_URL+"/oauth2/v1/token";

    //PROXY
    public static final boolean HAS_PROXY = false;
    public static final String PROXY_HOST = "http://my.proxy.com";
    public static final int PROXY_PORT = 80;
}
