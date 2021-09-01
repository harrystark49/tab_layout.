package com.example.tab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.get
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var list=ArrayList<frag_model>()
        list.add(frag_model(f1(),"f1"))
        list.add(frag_model(f2(),"f2"))
        var adap=frag_adapter(supportFragmentManager,list)
        pageview.adapter=adap
        tab_id.setupWithViewPager(pageview)
        tab_id.getTabAt(0)?.setText("fragment1")
       // tab_id.getTabAt(1)?.setText("fragment1")
        tab_id.getTabAt(1)?.setIcon(R.drawable.ic_launcher_background)?.setText("frament1")

    }
}