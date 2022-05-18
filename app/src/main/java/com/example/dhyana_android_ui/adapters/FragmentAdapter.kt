package com.example.dhyana_android_ui.adapters

    import androidx.fragment.app.Fragment
    import androidx.fragment.app.FragmentManager
    import androidx.fragment.app.FragmentStatePagerAdapter

    class FragmentAdapter(
        val arrayList: ArrayList<Fragment>,
        val fragmentManager: FragmentManager
    ) : FragmentStatePagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

        override fun getCount(): Int {
            return arrayList.size
        }

        override fun getItem(position: Int): Fragment {
            return arrayList[position]
        }
    }
