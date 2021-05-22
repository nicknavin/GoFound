package com.app.gofound.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.databinding.Observable
import com.app.gofound.R
import com.app.gofound.databinding.ActivityDemoBinding
import com.app.gofound.pojo.Persons
import com.saifi369.databindingobservables.PrimitiveObservablePerson

class DemoActivity : AppCompatActivity()
{
    private lateinit var binding:ActivityDemoBinding
     val countt:Int?=null;

    val person= PrimitiveObservablePerson("Navin",35)
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
       binding= DataBindingUtil.setContentView(this,R.layout.activity_demo)
       binding.persons=person
        binding.demoactivity=this//this is most improtnat thing
//        binding.btn.setOnClickListener(View.OnClickListener
//        {
//            person.age++
//            person.name="nimade"
//            Toast.makeText(this,"My age is ${person.age}",Toast.LENGTH_SHORT).show()
//        })

    }

//    fun clickButton(view: View)
//    {
//        person.age++
//        person.name="nimade"
//        Toast.makeText(this,"My age is ${person.age}",Toast.LENGTH_SHORT).show()
//    }
 fun clickButton(view: View)
    {
        person.age.set(person.age.get()+1)
        person.name.set("nimade")
        Toast.makeText(this,"My age is ${person.age}",Toast.LENGTH_SHORT).show()
    }

}