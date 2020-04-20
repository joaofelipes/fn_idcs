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
    public static final String CLIENT_ID = "e5f22f2e14ae437ab1c4ab7aa7e9d61f";
    public static final String CLIENT_SECRET = "c82d90ad-74ad-42a7-841e-4808423e2745";
    public static final String IDCS_URL = "https://idcs-eb38c77cc9b54ef3915bb1c2501a981a.identity.oraclecloud.com";

    //INFORMATION ABOUT THE TARGET APPLICATION
    public static final String SCOPE_AUD = "https://idcs-eb38c77cc9b54ef3915bb1c2501a981a.identity.oraclecloud.com:443";

    //TEST CLIENT CREDENTIALS
    public static final String TEST_CLIENT_ID = "e5f22f2e14ae437ab1c4ab7aa7e9d61f";
    public static final String TEST_CLIENT_SECRET = "c82d90ad-74ad-42a7-841e-4808423e2745";
    public static final String TEST_CLIENT_SCOPE = "urn:opc:idm:__myscopes__";

    //INFORMATION ABOUT IDENTITY CLOUD SERVICES
    public static final String JWK_URL=IDCS_URL+"/admin/v1/SigningCert/jwk";
    public static final String TOKEN_URL=IDCS_URL+"/oauth2/v1/token";

    //PROXY
    public static final boolean HAS_PROXY = false;
    public static final String PROXY_HOST = "http://my.proxy.com";
    public static final int PROXY_PORT = 80;
}
