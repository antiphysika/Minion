# Minion

Minion is a small utility library for modded Minecraft. It contains a (thus far)
relatively small number of helpers and APIs that I find useful and use often in my
modding endeavours.

So, I'm sharing it here on CurseForgein just in case it scratches anyone else's itch.

## Current Features

*Dynamic Texture Generation*

With thanks to Dynamic Asset Generator (DynAssetGen) - and a huge amount of gratitude
to its author, of course(!) - Minion is able to offer a thin wrapper around
DynAssetGen's multitude of image manipulation APIs. This started off as a single API
to generate multi-layered, overlayed textures at run-time but it will surely grow more
wrappers as time passes.

*Custom Server-side Persistent Data*

Vanilla Minecraft supports level-attached, saved data, giving modders the basics to
save and persist their own game data. However its API is, at least to me, far from
perfect. So I've tried to create a slightly improved server-persisting data storage API
with a couple of new filesystem-storage backends including raw JSON (via codecs) and
gzip-compressed JSON, which is very similar to Minecraft's own gzip-compressed NBT that
is the backing store for vanilla's SavedData subsystem.

<!--
vim: ts=2 sw=2 et fdm=marker :
-->
