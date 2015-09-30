package com.qburst.GitHubAnalytics.models

class Actor(actorId: String, actorLogin: String, actorGravatarId: String, actorUrl: String, actorAvatarUrl: String) {
  var id: String = actorId
  var login: String = actorLogin
  var gravatar_id: String = actorGravatarId
  var url: String = actorUrl
  var avatar_url: String = actorAvatarUrl
}
