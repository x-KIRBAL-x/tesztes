Feature: Test search

  Background:
    Given open home page

  Scenario:
    Given fill "//*[@id=\"search_query_top\"]" search with ""
    Given click on search button
    Given "Please enter a search keyword" message is show




#    Given Click On xpath "//*[@id=\"searchbox\"]/button"