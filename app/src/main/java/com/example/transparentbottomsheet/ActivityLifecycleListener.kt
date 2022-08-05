package com.example.transparentbottomsheet

import android.app.Activity
import android.app.Application
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager

/**
 * @author v.sokolova
 */
object ActivityLifecycleListener : Application.ActivityLifecycleCallbacks {
    private const val TAG = "ActivityLifecycleCallbacks"
    override fun onActivityPaused(p0: Activity) {
        Log.d(TAG, "onActivityPaused at ${p0.localClassName}")
    }

    override fun onActivityStarted(p0: Activity) {
        Log.d(TAG, "onActivityStarted at ${p0.localClassName}")
    }

    override fun onActivityDestroyed(p0: Activity) {
        Log.d(TAG, "onActivityDestroyed at ${p0.localClassName}")
    }

    override fun onActivitySaveInstanceState(p0: Activity, p1: Bundle) {
        Log.d(TAG, "onActivitySaveInstanceState at ${p0.localClassName}")
    }

    override fun onActivityStopped(p0: Activity) {
        Log.d(TAG, "onActivityStopped at ${p0.localClassName}")
    }

    override fun onActivityCreated(p0: Activity, p1: Bundle?) {
        Log.d(TAG, "onActivityCreated at ${p0.localClassName}")
        (p0 as? FragmentActivity)
            ?.supportFragmentManager
            ?.registerFragmentLifecycleCallbacks(FragmentLifecycleListener, true)
    }

    override fun onActivityResumed(p0: Activity) {
        Log.d(TAG, "onActivityResumed at ${p0.localClassName}")
    }
}

object FragmentLifecycleListener : FragmentManager.FragmentLifecycleCallbacks() {
    private const val TAG = "FragmentLifecycleCallbacks"
    override fun onFragmentPreAttached(fm: FragmentManager, f: Fragment, context: Context) {
        Log.d(TAG, "onFragmentPreAttached at ${f.javaClass.name}")
    }

    override fun onFragmentAttached(fm: FragmentManager, f: Fragment, context: Context) {
        Log.d(TAG, "onFragmentAttached at ${f.javaClass.name}")
    }

    override fun onFragmentPreCreated(fm: FragmentManager, f: Fragment, savedInstanceState: Bundle?) {
        Log.d(TAG, "onFragmentPreCreated at ${f.javaClass.name}")
    }

    override fun onFragmentCreated(fm: FragmentManager, f: Fragment, savedInstanceState: Bundle?) {
        Log.d(TAG, "onFragmentCreated at ${f.javaClass.name}")
    }

    override fun onFragmentActivityCreated(fm: FragmentManager, f: Fragment, savedInstanceState: Bundle?) {
        Log.d(TAG, "onFragmentActivityCreated at ${f.javaClass.name}")
    }

    override fun onFragmentViewCreated(fm: FragmentManager, f: Fragment, v: View, savedInstanceState: Bundle?) {
        Log.d(TAG, "onFragmentViewCreated at ${f.javaClass.name}")
    }

    override fun onFragmentStarted(fm: FragmentManager, f: Fragment) {
        Log.d(TAG, "onFragmentStarted at ${f.javaClass.name}")
    }

    override fun onFragmentResumed(fm: FragmentManager, f: Fragment) {
        Log.d(TAG, "onFragmentResumed at ${f.javaClass.name}")
    }

    override fun onFragmentPaused(fm: FragmentManager, f: Fragment) {
        Log.d(TAG, "onFragmentPaused at ${f.javaClass.name}")
    }

    override fun onFragmentStopped(fm: FragmentManager, f: Fragment) {
        Log.d(TAG, "onFragmentStopped at ${f.javaClass.name}")
    }

    override fun onFragmentSaveInstanceState(fm: FragmentManager, f: Fragment, outState: Bundle) {
        Log.d(TAG, "onFragmentSaveInstanceState at ${f.javaClass.name}")
    }

    override fun onFragmentViewDestroyed(fm: FragmentManager, f: Fragment) {
        Log.d(TAG, "onFragmentViewDestroyed at ${f.javaClass.name}")
    }

    override fun onFragmentDestroyed(fm: FragmentManager, f: Fragment) {
        Log.d(TAG, "onFragmentDestroyed at ${f.javaClass.name}")
    }

    override fun onFragmentDetached(fm: FragmentManager, f: Fragment) {
        Log.d(TAG, "onFragmentDetached at ${f.javaClass.name}")
    }
}
