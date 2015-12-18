package com.example.expservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import android.widget.Toast;

public class ExpService extends Service {

	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return new MyBinder() ;
	}

	@Override
	public void onCreate() {
		super.onCreate();
		Toast.makeText(this, "ExpService_onCreate", 500).show();
	}

	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		Toast.makeText(this, "ExpService_onStartCommand", 500).show();
		return super.onStartCommand(intent, flags, startId);
	}

	@Override
	public void onDestroy() {
		Toast.makeText(this, "ExpService_onDestroy", 500).show();
		super.onDestroy();
	}

	public class MyBinder extends TestService.Stub {

		@Override
		public void startService(String value) throws RemoteException {
			Log.i("info", "startService:" + value);
		}

		@Override
		public void stopService(String value) throws RemoteException {
			Log.i("info", "stopService:" + value);
		}

	}
}
