package com.site.testandroid

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast
import com.site.testandroid.search.MockUserSearchModel
import com.site.testandroid.search.SearchPresenter
import com.site.testandroid.search.SearchResult
import com.site.testandroid.search.SearchView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), SearchView {

    val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val presenter = SearchPresenter(
                this,
                MockUserSearchModel()
        )

        btn_confirm.setOnClickListener {
            presenter.searchFor(et_search.text.toString())
        }
    }

    override fun showResults(results: List<SearchResult>) {
        results.forEach {
            Log.d(TAG, it.description)
        }
    }

    override fun showError(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
