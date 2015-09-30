package com.qburst.GitHubAnalytics.models

class Base(headLabel: String, headRef: String, headSha: String, headUser: User, headRepo: Repo) {
  var label: String = headLabel
  var ref: String = headRef
  var sha: String = headSha
  var user: User = headUser
  var repo: Repo = headRepo
}
