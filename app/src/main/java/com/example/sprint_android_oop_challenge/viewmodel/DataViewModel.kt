package com.example.sprint_android_oop_challenge.viewmodel

import android.view.View
import android.widget.Button
import com.example.sprint_android_oop_challenge.model.*
import com.example.sprint_android_oop_challenge.model.Unit
import com.example.sprint_android_oop_challenge.view.ItemDetailFragment

class DataViewModel {

    val dataList: MutableList<Empire> = ArrayList()
    val dataMap: MutableMap<String, Empire> = HashMap()

    init {
        dataList.add(Unit("Archer", "Age of Kings", false, "Quick and light. Weak at close range; excels at battle from distance"))
        dataList.add(Unit("Arbalest", "Age of Kings", false, "Upgraded crossbowman"))
        dataList.add(Civilization("Aztecs", "The Conquerors", false, "Infantry and Monk"))
        dataList.add(Civilization("Britons", "Age of Kings", false, "Foot Archer"))
        dataList.add(Structure("Barracks", "Age of Kings", false, "Dark"))
        dataList.add(Structure("Dock", "Age of Kings", false, "Dark"))
        dataList.add(Technology("Crossbowman", "Age of Kings", false, "35"))
        dataList.add(Technology("Thumb Ring", "Age of Kings", false, "45"))

        dataMap[dataList[0].name] = dataList[0]
        dataMap[dataList[1].name] = dataList[1]
        dataMap[dataList[2].name] = dataList[2]
        dataMap[dataList[3].name] = dataList[3]
        dataMap[dataList[4].name] = dataList[4]
        dataMap[dataList[5].name] = dataList[5]
        dataMap[dataList[6].name] = dataList[6]
        dataMap[dataList[7].name] = dataList[7]

    }

    fun clickListener(view: Button, item: Empire?, fragmentListener: ItemDetailFragment.FragmentListener?){
        item?.let{
            fragmentListener?.showToast(it)
            if(item?.isFavorite == true){
                item?.isFavorite = false
            } else {
                item?.isFavorite = true
            }
            view.text = item?.isFavorite.toString()
            fragmentListener?.showToast(it)
        }
    }
}
