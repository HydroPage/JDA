/*
 * Copyright 2015-2020 Austin Keener, Michael Ritter, Florian Spieß, and the JDA contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.dv8tion.jda.api.events.emote;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.entities.Emote;

import javax.annotation.Nonnull;

/**
 * Indicates that a new {@link net.dv8tion.jda.api.entities.Emote Emote} was added to a {@link net.dv8tion.jda.api.entities.Guild Guild}.
 *
 * <h2>Requirements</h2>
 *
 * <p>This event requires the {@link net.dv8tion.jda.api.utils.cache.CacheFlag#EMOTE EMOTE} CacheFlag to be enabled, which requires
 * the {@link net.dv8tion.jda.api.requests.GatewayIntent#GUILD_EMOJIS GUILD_EMOJIS} intent
 */
public class EmoteAddedEvent extends GenericEmoteEvent
{
    public EmoteAddedEvent(@Nonnull JDA api, long responseNumber, @Nonnull Emote emote)
    {
        super(api, responseNumber, emote);
    }
}
