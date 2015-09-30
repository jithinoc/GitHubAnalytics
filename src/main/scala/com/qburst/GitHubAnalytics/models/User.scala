package com.qburst.GitHubAnalytics.models

class User(userLogin: String, userId: String, userAvatarUrl: String, userGravatarId: String, userUrl: String, userHtmlUrl: String, userFollowersUrl: String, userFollowingUrl: String, usergistsUrl: String, userStarredUrl: String, userSubscriptionsUrl: String, userOrganizationsUrl: String, userReposUrl: String, userEventsUrl: String, userReceivedEventsUrl: String, userType: String, userSiteAdmin: String) {
  var login: String = userLogin
  var id: String = userId
  var avatar_url: String = userAvatarUrl
  var gravatar_id: String = userGravatarId
  var url: String = userUrl
  var html_url: String = userHtmlUrl
  var followers_url: String = userFollowersUrl
  var following_url: String = userFollowingUrl
  var gists_url: String = usergistsUrl
  var starred_url: String = userStarredUrl
  var subscriptions_url: String = userSubscriptionsUrl
  var organizations_url: String = userOrganizationsUrl
  var repos_url: String = userReposUrl
  var events_url: String = userEventsUrl
  var received_events_url: String = userReceivedEventsUrl
  var `type`: String = userType
  var site_admin: String = userSiteAdmin
}
