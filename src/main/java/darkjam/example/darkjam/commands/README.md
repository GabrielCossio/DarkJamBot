# Commands

## Purpose

This folder contains classes that implement Discord bot commands. Each command is responsible for a specific user action (e.g., playing music, skipping tracks).

## Why This Folder?

- Groups all command logic together for easier maintenance and extensibility.
- Simplifies adding new commands without modifying unrelated code.

## Example Commands

<!-- Base commands and in the future more to come -->

- `PlayCommand.java`: Plays music from a YouTube link or search term.
- `PauseCommand.java`: Pauses the current playback.
- `QueueCommand.java`: Displays the current music queue.
- `StopCommand.java`: Stops playback and clears the queue.
