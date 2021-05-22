package com.app.gofound.view.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableArrayList
import androidx.databinding.ObservableArrayMap
import com.app.gofound.R
import com.app.gofound.databinding.ActivityDemoSecondBinding
import com.saifi369.databindingobservables.PrimitiveObservablePerson

class DemoSecondActivity : AppCompatActivity()
{

    lateinit var binding:ActivityDemoSecondBinding

    val listData:ObservableArrayList<String> = ObservableArrayList()

    val mapData:ObservableArrayMap<String,Any> = ObservableArrayMap()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= DataBindingUtil.setContentView(this,R.layout.activity_demo_second)
        listData.add("Navin")
      //  listData.add("Nimade")
        mapData.put("key0","JAN")
        mapData.put("key1","FABsdfasad")
        mapData.put("key2","FAfsadfBfsadfsad")
        mapData.put("key3","sdfa FAB")
        mapData.put("key4","FAB dsaf")
        binding.datamap=mapData
        binding.data=listData
        binding.handler=this
    }

  public  var count:Int =0
    var key:String="key"
    fun clickButton(view: View)
    {
//        count++
        var key:String="key"+""+count

        mapData.put(key,"Navin")
//        listData.add("Navin $count")

        Toast.makeText(this,"My age is ${mapData.get(key)}", Toast.LENGTH_SHORT).show()
//        Toast.makeText(this,"My age is ${listData.get(count)}", Toast.LENGTH_SHORT).show()

    }


}