package kz.kuz.abstractfragmentapplication

import androidx.fragment.app.Fragment

// MainActivity extends SingleFragmentActivity
class MainActivity : SingleFragmentActivity() {

    override fun createFragment(): Fragment? {
        return MainFragment()
    }
}