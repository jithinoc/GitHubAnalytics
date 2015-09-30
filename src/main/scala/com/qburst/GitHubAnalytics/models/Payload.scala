package com.qburst.GitHubAnalytics.models

class Payload(payload_ref: String, payload_ref_type: String, payload_master_branch: String, payload_description: String, payload_pusher_type: String, payload_action: String, payload_number: String, payload_pull_requst: PullRequest) {
  var ref: String = payload_ref
  var ref_type: String = payload_ref_type
  var master_branch: String = payload_master_branch
  var description: String = payload_description
  var pusher_type: String = payload_pusher_type
  var action: String = payload_action
  var number: String = payload_number
  var pull_request: PullRequest = payload_pull_requst
}
