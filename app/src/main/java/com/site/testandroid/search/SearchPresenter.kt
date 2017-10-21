package com.site.testandroid.search

/**
 * @author Bogdan Ustyak (bogdan.ustyak@gmail.com)
 */
class SearchPresenter(val view: SearchView?, val model: SearchModel) {

    fun searchFor(query: String) {
        if (isValid(query)) {
            val results = this.model.search(query)
            view?.showResults(results)
        } else {
            view?.showError("Search is empty")
        }
    }

    private fun isValid(query: String): Boolean {
        return query.isNotEmpty()
    }

}