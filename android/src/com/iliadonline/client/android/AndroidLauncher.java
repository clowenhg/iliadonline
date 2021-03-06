package com.iliadonline.client.android;

import tv.ouya.console.api.CancelIgnoringOuyaResponseListener;
import tv.ouya.console.api.GamerInfo;
import tv.ouya.console.api.OuyaFacade;
import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.iliadonline.client.IliadClient;

public class AndroidLauncher extends AndroidApplication {
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		
		CancelIgnoringOuyaResponseListener<GamerInfo> gamerInfoListener = new CancelIgnoringOuyaResponseListener<GamerInfo>()
		{
			@Override
			public void onSuccess(GamerInfo result)
			{
				
			}

			@Override
			public void onFailure(int errorCode, String errorMessage,
					Bundle errorBundle)
			{
				
			}
		};
		
		OuyaFacade.getInstance().requestGamerInfo(gamerInfoListener);
		
		super.onCreate(savedInstanceState);
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
		initialize(new IliadClient(), config);
	}
}
