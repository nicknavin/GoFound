package com.app.gofound.pojo

import androidx.databinding.Bindable
import androidx.databinding.Observable
import androidx.databinding.PropertyChangeRegistry
import com.app.gofound.BR

data class Persons (var pName:String, var pAge:Int) :Observable
{
    @get:Bindable
    var name:String=pName
    set(value) {
        field=value
        listener.notifyChange(this,BR.name)
    }

    @get:Bindable
    var age:Int=pAge
    set(value) {
        field=value
        listener.notifyChange(this,BR.age)
    }

val listener:PropertyChangeRegistry= PropertyChangeRegistry()

    override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
//        TODO("Not yet implemented")
        listener.add(callback)
    }

    override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
//        TODO("Not yet implemented")
        listener.add(callback)
    }
}