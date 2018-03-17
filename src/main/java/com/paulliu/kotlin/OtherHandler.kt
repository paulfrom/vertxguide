package com.paulliu.kotlin

import com.google.gson.Gson
import io.vertx.rxjava.ext.web.RoutingContext

/**
 * usage:
 * <p>
 * </p>
 * User:liusonglin; Date:2017/12/22;ProjectName:vertxguide;
 */
fun otherHandler(context:RoutingContext){

    var tem:Demo = Gson().fromJson(context.bodyAsString)
    if(tem==null){
        context.response().end("tem cannot be null")
        return
    }else{
        println(tem)
    }
}

inline fun<reified T:Any> Gson.fromJson(json:String):T{
    return Gson().fromJson(json,T::class.java)
}