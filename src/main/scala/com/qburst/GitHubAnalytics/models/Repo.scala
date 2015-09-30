package com.qburst.GitHubAnalytics.models

class Repo( repo_id: String,
            repo_name: String,
            repo_full_name: String,
            repo_owner: Owner,
            repo_private: String,
            repo_html_url: String,
            repo_description: String,
            repo_fork: String,
            repo_url: String,
            repo_forks_url: String,
            repo_keys_url: String,
            repo_collaborators_url: String,
            repo_teams_url: String,
            repo_hooks_url: String,
            repo_issue_events_url: String,
            repo_events_url: String,
            repo_assignees_url: String,
            repo_branches_url: String,
            repo_tags_url: String,
            repo_blobs_url: String,
            repo_git_tags_url: String,
            repo_git_refs_url: String,
            repo_trees_url: String,
            repo_statuses_url: String,
            repo_languages_url: String,
            repo_stargazers_url: String,
            repo_contributors_url: String,
            repo_subscribers_url: String,
            repo_subscription_url: String,
            repo_commits_url: String,
            repo_git_commits_url: String,
            repo_comments_url: String,
            repo_issue_comment_url: String,
            repo_contents_url: String,
            repo_compare_url: String,
            repo_merges_url: String,
            repo_archive_url: String,
            repo_downloads_url: String,
            repo_issues_url: String,
            repo_pulls_url: String,
            repo_milestones_url: String,
            repo_notifications_url: String,
            repo_labels_url: String,
            repo_releases_url: String,
            repo_created_at: String,
            repo_updated_at: String,
            repo_pushed_at: String,
            repo_git_url: String,
            repo_ssh_url: String,
            repo_clone_url: String,
            repo_svn_url: String,
            repo_homepage: String,
            repo_size: String,
            repo_stargazers_count: String,
            repo_watchers_count: String,
            repo_language: String,
            repo_has_issues: String,
            repo_has_downloads: String,
            repo_has_wiki: String,
            repo_has_pages: String,
            repo_forks_count: String,
            repo_mirror_url: String,
            repo_open_issues_count: String,
            repo_forks: String,
            repo_open_issues: String,
            repo_watchers: String,
            repo_default_branch: String
            ) {

  var id: String = repo_id
  var name: String = repo_name
  var full_name: String = repo_full_name
  var owner: Owner = repo_owner
  var `private`: String = repo_private
  var html_url: String = repo_html_url
  var description: String = repo_description
  var fork: String = repo_fork
  var url: String = repo_url
  var forks_url: String = repo_forks_url
  var keys_url: String = repo_keys_url
  var collaborators_url: String = repo_collaborators_url
  var teams_url: String = repo_teams_url
  var hooks_url: String = repo_hooks_url
  var issue_events_url: String = repo_issue_events_url
  var events_url: String = repo_events_url
  var assignees_url: String = repo_assignees_url
  var branches_url: String = repo_branches_url
  var tags_url: String = repo_tags_url
  var blobs_url: String = repo_blobs_url
  var git_tags_url: String = repo_git_tags_url
  var git_refs_url: String = repo_git_refs_url
  var trees_url: String = repo_trees_url
  var statuses_url: String = repo_statuses_url
  var languages_url: String =  repo_languages_url
  var stargazers_url: String = repo_stargazers_url
  var contributors_url: String = repo_contributors_url
  var subscribers_url: String = repo_subscribers_url
  var subscription_url: String = repo_subscription_url
  var commits_url: String = repo_commits_url
  var git_commits_url: String = repo_git_commits_url
  var comments_url: String = repo_comments_url
  var issue_comment_url: String = repo_issue_comment_url
  var contents_url: String = repo_contents_url
  var compare_url: String = repo_compare_url
  var merges_url: String = repo_merges_url
  var archive_url: String = repo_archive_url
  var downloads_url: String = repo_downloads_url
  var issues_url: String = repo_issues_url
  var pulls_url: String = repo_pulls_url
  var milestones_url: String = repo_milestones_url
  var notifications_url: String = repo_notifications_url
  var labels_url: String = repo_labels_url
  var releases_url: String = repo_releases_url
  var created_at: String = repo_created_at
  var updated_at: String = repo_updated_at
  var pushed_at: String =repo_pulls_url
  var git_url: String = repo_git_url
  var ssh_url: String = repo_ssh_url
  var clone_url: String = repo_clone_url
  var svn_url: String = repo_svn_url
  var homepage: String = repo_homepage
  var size: String = repo_size
  var stargazers_count: String = repo_stargazers_count
  var watchers_count: String = repo_watchers_count
  var language: String = repo_language
  var has_issues: String = repo_has_issues
  var has_downloads: String = repo_has_downloads
  var has_wiki: String = repo_has_wiki
  var has_pages: String = repo_has_pages
  var forks_count: String = repo_forks_count
  var mirror_url: String = repo_mirror_url
  var open_issues_count: String = repo_open_issues_count
  var forks: String = repo_forks
  var open_issues: String = repo_open_issues
  var watchers: String = repo_watchers
  var default_branch: String = repo_default_branch
}
