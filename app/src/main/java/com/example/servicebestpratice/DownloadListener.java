package com.example.servicebestpratice;

/*public interface DownloadListener {
    void onSuccess();
    void onFailed();
    void onPaused();
    void onCanceled();
    void onProgress(int progress);
}*/
/*回调接口，用于对下载过程中的各种状态进行监听和回调*/
public interface DownloadListener {//5个回调方法
    void onProgress(int progress);/*用于通知当前下载进度*/
    void onSuccess();/*用于通知下载成功事件*/
    void onFailed();/*用于通知下载失败事件*/
    void onPaused
            ();/*用于通知下载暂时事件*/
    void onCanceled();/*用于通知下载取消事件*/
}
