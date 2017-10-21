package com.site.testandroid.search

/**
 * @author Bogdan Ustyak (bogdan.ustyak@gmail.com)
 */
interface SearchView {
    fun showResults(results: List<SearchResult>)
    fun showError(message: String)
}