package com.ru.appdoggo.domain.usecases.friends

import com.ru.appdoggo.domain.entities.friends.FriendsEntity
import com.ru.appdoggo.domain.repository.friends.FriendsRepository
import com.ru.appdoggo.domain.usecases.UseCase
import javax.inject.Inject

class GetFriendsList @Inject constructor(
    private val friendsRepository: FriendsRepository
) : UseCase<List<FriendsEntity>, Boolean>() {

    override suspend fun run(needFetch: Boolean) = friendsRepository.getFriendsList(needFetch)
}