package com.xgb.heliPay.incoming.entity;


import org.apache.commons.lang.StringUtils;

public class ModifyMerchantInfoParam {

    /**
     * 子商户编号
     */
    private String merchantNo;
    
    /**
     * 订单号, 可以为空, 只有 需要审核的字段才需要此订单号
     */
    private String orderNo;

    private Info infos;


    public static class Info {

        private String idCardStartDate;

        private String idCardEndDate;

        private String regionCode;

        private String address;

        private String businessLicense;

        private String busLiceStartDate;

        private String busLiceEndDate;

        private String accountIdCard;

        private String mcc;
        
        /**
         * 法人证件号
         */
        private String legalPersonID;

        /**
         * 法人姓名
         */
        private String legalPerson;

        /**
         * 结算周期
         */
        private String settlementPeriod;

        public String getIdCardStartDate() {
            return idCardStartDate;
        }

        public void setIdCardStartDate(String idCardStartDate) {
            this.idCardStartDate = StringUtils.defaultIfEmpty(idCardStartDate, null);
        }

        public String getIdCardEndDate() {
            return idCardEndDate;
        }

        public void setIdCardEndDate(String idCardEndDate) {
            this.idCardEndDate = StringUtils.defaultIfEmpty(idCardEndDate, null);
        }

        public String getRegionCode() {
            return regionCode;
        }

        public void setRegionCode(String regionCode) {
            this.regionCode = StringUtils.defaultIfEmpty(regionCode, null);
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = StringUtils.defaultIfEmpty(address, null);
        }

        public String getBusinessLicense() {
            return businessLicense;
        }

        public void setBusinessLicense(String businessLicense) {
            this.businessLicense = StringUtils.defaultIfEmpty(businessLicense, null);
        }

        public String getBusLiceStartDate() {
            return busLiceStartDate;
        }

        public void setBusLiceStartDate(String busLiceStartDate) {
            this.busLiceStartDate = StringUtils.defaultIfEmpty(busLiceStartDate, null);
        }

        public String getBusLiceEndDate() {
            return busLiceEndDate;
        }

        public void setBusLiceEndDate(String busLiceEndDate) {
            this.busLiceEndDate = StringUtils.defaultIfEmpty(busLiceEndDate, null);
        }

        public String getAccountIdCard() {
            return accountIdCard;
        }

        public void setAccountIdCard(String accountIdCard) {
            this.accountIdCard = StringUtils.defaultIfEmpty(accountIdCard, null);
        }

        public String getMcc() {
            return mcc;
        }

        public void setMcc(String mcc) {
            this.mcc = StringUtils.defaultIfEmpty(mcc, null);
        }

		public String getLegalPersonID() {
			return legalPersonID;
		}

		public void setLegalPersonID(String legalPersonID) {
			this.legalPersonID = StringUtils.defaultIfEmpty(legalPersonID, null);
		}

		public String getLegalPerson() {
			return legalPerson;
		}

		public void setLegalPerson(String legalPerson) {
			this.legalPerson = StringUtils.defaultIfEmpty(legalPerson, null);
		}

        public String getSettlementPeriod() {
            return settlementPeriod;
        }

        public void setSettlementPeriod(String settlementPeriod) {
            this.settlementPeriod = settlementPeriod;
        }
    }


    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = StringUtils.defaultIfEmpty(orderNo, null);
	}

	public Info getInfos() {
        return infos;
    }

    public void setInfos(Info infos) {
        this.infos = infos;
    }
}
