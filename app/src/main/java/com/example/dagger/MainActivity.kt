package com.example.dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
interface IDependency {
    fun doSomething()
}

class ExampleDependency: IDependency {
    override fun doSomething() {
//...
    }
}

class ExampleClass(private val dependency: IDependency) {

    fun doSomethingWithDependency(){
        dependency.doSomething()
    }
}