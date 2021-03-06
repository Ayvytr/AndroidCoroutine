package com.ayvytr.coroutines

import android.app.Application
import com.ayvytr.logger.L
import com.ayvytr.network.ApiClient

/**
 * @author admin
 */

class App: Application() {
    override fun onCreate() {
        super.onCreate()
        //初始化，默认开启了OKhttp缓存，cache=null关闭
        ApiClient.init("https://gank.io/api/", cache = null)
        L.settings().showLog(BuildConfig.DEBUG)
        //覆盖重写自定义全局网络异常转为ResponseMessage
//        ApiClient.throwable2ResponseMessage = {
//            ResponseMessage("哈哈", throwable = it)
//        }
    }
}