package com.qburst.GitHubAnalytics.models

class PullRequest( pull_request_url: String,
                   pull_request_id: String,
                   pull_request_html_url: String,
                   pull_request_diff_url: String,
                   pull_request_patch_url: String,
                   pull_request_issue_url: String,
                   pull_request_number: String,
                   pull_request_state: String,
                   pull_request_locked: String,
                   pull_request_title: String,
                   pull_request_user: User,
                   pull_request_body: String,
                   pull_request_created_at: String,
                   pull_request_updated_at: String,
                   pull_request_closed_at: String,
                   pull_request_merged_at: String,
                   pull_request_merge_commit_sha: String,
                   pull_request_assignee: User,
                   pull_request_commits_url: String,
                   pull_request_review_comments_url: String,
                   pull_request_review_comment_url: String,
                   pull_request_comments_url: String,
                   pull_request_statuses_url: String,
                   pull_request_head: Head,
                   pull_request_base: Base,
                   pull_request_merged: String,
                   pull_request_mergeable: String,
                   pull_request_mergeable_state: String,
                   pull_request_merged_by: User,
                   pull_request_comments: String,
                   pull_request_review_comments: String,
                   pull_request_commits: String,
                   pull_request_additions: String,
                   pull_request_deletions: String,
                   pull_request_changed_files: String
                   ) {
  var url: String = pull_request_url
  var id: String = pull_request_id
  var html_url: String = pull_request_html_url
  var diff_url: String = pull_request_diff_url
  var patch_url: String = pull_request_patch_url
  var issue_url: String = pull_request_issue_url
  var number: String = pull_request_number
  var state: String = pull_request_state
  var locked: String = pull_request_locked
  var title: String = pull_request_title
  var user: User = pull_request_user
  var body: String = pull_request_body
  var created_at: String = pull_request_created_at
  var updated_at: String = pull_request_updated_at
  var closed_at: String = pull_request_closed_at
  var merged_at: String = pull_request_merged_at
  var merge_commit_sha: String = pull_request_merge_commit_sha
  var assignee: User = pull_request_assignee
  var commits_url: String = pull_request_comments_url
  var review_comments_url: String = pull_request_review_comments_url
  var review_comment_url: String =  pull_request_review_comments_url
  var comments_url: String = pull_request_comments_url
  var statuses_url: String = pull_request_statuses_url
  var head: Head = pull_request_head
  var base: Base = pull_request_base
  var merged: String = pull_request_merged
  var mergeable: String = pull_request_mergeable
  var mergeable_state: String = pull_request_mergeable_state
  var merged_by: User = pull_request_merged_by
  var comments: String = pull_request_comments
  var review_comments: String = pull_request_review_comments
  var commits: String = pull_request_commits
  var additions: String = pull_request_additions
  var deletions: String = pull_request_deletions
  var changed_files: String = pull_request_changed_files
}
