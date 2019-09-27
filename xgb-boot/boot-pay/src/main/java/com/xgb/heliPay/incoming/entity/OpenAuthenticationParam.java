package com.xgb.heliPay.incoming.entity;

import com.xgb.heliPay.incoming.enums.AuthenticationType;
import com.xgb.heliPay.incoming.enums.ProductEnumType;

public class OpenAuthenticationParam extends CommonOpenProductParam {

    private AuthenticationType authenticationType;

    private Boolean authenticated;

    public OpenAuthenticationParam() {
        setProductType(ProductEnumType.AUTHENTICATION);
    }

    public AuthenticationType getAuthenticationType() {
        return authenticationType;
    }

    public void setAuthenticationType(AuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
    }

    public Boolean getAuthenticated() {
        return authenticated;
    }

    public void setAuthenticated(Boolean authenticated) {
        this.authenticated = authenticated;
    }
}
