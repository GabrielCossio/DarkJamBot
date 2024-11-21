# YouTube

## Purpose

This folder contains classes and services for interacting with the YouTube API, searching for videos, and streaming audio.

## Why This Folder?

- Groups YouTube-specific logic separately to decouple it from bot commands and music playback.
- Provides a clean interface for fetching and managing YouTube content.

## Subfolders

- **api/**: Handles direct calls to the YouTube API (e.g., video search).
- **models/**: Defines data models for YouTube responses (e.g., video metadata).
- **services/**: Encapsulates YouTube-related business logic, like searching and audio streaming.

## Example Files

- `YouTubeSearchClient.java`: Wraps YouTube API search functionality.
- `YouTubeVideo.java`: Represents metadata for a YouTube video (title, URL, duration).
- `YouTubeSearchService.java`: Simplifies searching for videos using the API.
