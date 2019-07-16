package com.ssh.network.okhttp.listener;

public interface DisposeDownloadListener<T> extends DisposeDataListener<T> {
	public void onProgress(int progrss);
}
