package com.qburst.GitHubAnalytics.models

class Event(eventId: String, eventType: String, eventActor: Actor, eventRepo: Repo, eventPayload: Payload, event_public: String, event_created_at: String) {
  var id: String = eventId
  var `type`: String = eventType
  var actor: Actor = eventActor
  var repo: Repo = eventRepo
  var payload: Payload = eventPayload
  var public: String = event_public
  var created_at: String = event_created_at
}
