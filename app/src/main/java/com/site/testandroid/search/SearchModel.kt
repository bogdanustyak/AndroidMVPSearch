package com.site.testandroid.search

/**
 * @author Bogdan Ustyak (bogdan.ustyak@gmail.com)
 */
interface SearchModel {
    fun search(query: String): List<SearchResult>
}