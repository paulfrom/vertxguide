package com.paulliu.kotlin.process

import java.io.BufferedReader
import java.io.File
import java.io.FileInputStream
import java.io.InputStreamReader
import java.nio.ByteBuffer
import java.nio.channels.FileChannel
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths

/**
 * usage:
 * <p>
 * </p>
 * User:liusonglin; Date:2018/2/5;ProjectName:vertxguide;
 */
fun file(path:String):Unit{

    val path = Paths.get(path)

    Files.newInputStream(path).use {
        val reader = InputStreamReader(it, "GBK")
        val bufreader = BufferedReader(reader);
        bufreader.lines().forEach({

        })
    }
}

fun main(args: Array<String>) {
    file("/Users/liusonglin/Documents/电信/红包/1月红包发展清单.txt")
}