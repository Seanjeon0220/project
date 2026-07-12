# Contest

Competition code — not Baekjoon problems.

## `team7.py` — Discovery Day sheep-collecting bot

A grid game: sheep are scattered across a walled 50×50 field, each worth a different number of points, and rival bots are collecting them at the same time. On every turn the bot decides which square to step to.

The move function runs a BFS from its own position and from each rival, then scores every sheep by **points divided by distance** — the sheep that pays best per step, not simply the nearest or the most valuable. The important part is the filter applied first: only sheep the bot can reach strictly before any rival are considered, so it never walks toward a sheep it is going to lose. If no sheep is winnable, it falls back to the best available regardless, and steps along the BFS parent chain toward it.
