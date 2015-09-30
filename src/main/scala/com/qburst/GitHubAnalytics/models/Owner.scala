package com.qburst.GitHubAnalytics.models

class Owner(ownerLogin: String, ownerId: String, ownerAvatarUrl: String, ownerGravatarId: String, ownerUrl: String, ownerHtmlUrl: String, ownerFollowersUrl: String, ownerFollowingUrl: String, ownergistsUrl: String, ownerStarredUrl: String, ownerSubscriptionsUrl: String, ownerOrganizationsUrl: String, ownerReposUrl: String, ownerEventsUrl: String, ownerReceivedEventsUrl: String, ownerType: String, ownerSiteAdmin: String) {
  var login: String = ownerLogin
  var id: String = ownerId
  var avatar_url: String = ownerAvatarUrl
  var gravatar_id: String = ownerGravatarId
  var url: String = ownerUrl
  var html_url: String = ownerHtmlUrl
  var followers_url: String = ownerFollowersUrl
  var following_url: String = ownerFollowingUrl
  var gists_url: String = ownergistsUrl
  var starred_url: String = ownerStarredUrl
  var subscriptions_url: String = ownerSubscriptionsUrl
  var organizations_url: String = ownerOrganizationsUrl
  var repos_url: String = ownerReposUrl
  var events_url: String = ownerEventsUrl
  var received_events_url: String = ownerReceivedEventsUrl
  var `type`: String = ownerType
  var site_admin: String = ownerSiteAdmin
}