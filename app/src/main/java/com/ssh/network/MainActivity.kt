package com.ssh.network

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

//    private val url = "$host/signup"
//
//    fun signUpRequest(name: String, email: String, teamwork: String, password: String,
//                      failure: (httpException: HttpException) -> Unit,
//                      success: (data: String, code: Int) -> Unit) {
//
//        val mMap = HashMap<String, String>()
//        mMap["name"] = name
//        mMap["email"] = email
//        mMap["teamwork"] = teamwork
//        mMap["password"] = password
//        mMap["key"] = key
//
//        NetManger.getRequest(OKHttpRequest::class.java).doPost(url, mMap, object : IResponseListener {
//            override fun onResponse(response: String, code: Int) {
//                success(response, code)
//            }
//
//            override fun onFail(httpException: HttpException) {
//                failure(httpException)
//            }
//        })
//
//    }
}
