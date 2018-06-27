package org.ac.ads.adsapi.mule;

import org.ac.ads.adsapi.endpoint.UserEndPoint;

public class UserAdapterImpl implements UserEndPoint {

	@Override
	public Boolean isValidAccountNumber(Long accountNumber) {
		return true;
	}

}
