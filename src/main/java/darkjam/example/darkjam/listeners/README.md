# Listeners

## Purpose

This folder contains event listeners that handle Discord events like messages, reactions, or voice state changes.

## Why This Folder?

- Separates event-driven logic from commands and services.
- Enables easier customization of bot behavior for various events.

## Example Listeners

- `MessageListener.java`: Processes text messages to detect commands.
- `GuildVoiceListener.java`: Manages user activity in voice channels (Ex: auto-disconnect).
