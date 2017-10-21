package com.site.testandroid.search

/**
 * @author Bogdan Ustyak (bogdan.ustyak@gmail.com)
 */
class MockUserSearchModel : SearchModel {

    override fun search(query: String): List<SearchResult> {
        val result = ArrayList<SearchResult>()
        result.add(SearchResult("blabbl"))
        result.add(SearchResult("User"))
        result.add(SearchResult("Lol"))
        return result
    }
}