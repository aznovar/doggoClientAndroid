package com.ru.appdoggo.domain.usecases.friends

import com.ru.appdoggo.domain.entities.friends.FriendsEntity
import com.ru.appdoggo.domain.repository.friends.FriendsRepository
import com.ru.appdoggo.domain.type.None
import com.ru.appdoggo.domain.usecases.UseCase
import javax.inject.Inject

class GetListOfFriendshipRequests @Inject constructor(
    private val friendsRepository: FriendsRepository
) : UseCase<List<FriendsEntity>, None>() {

    override suspend fun run(params: None) = friendsRepository.getListOfFriendshipRequests()
}
