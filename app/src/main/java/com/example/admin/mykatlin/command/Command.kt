package com.example.admin.mykatlin.command

/**
 * Created by admin on 2017/11/1.
 */
public interface Command<T> {
    fun execute(): T
}