package uz.gita.mobilbanking.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import uz.gita.mobilbanking.data.source.local.LocalStorage
import uz.gita.mobilbanking.data.source.remote.api.AuthApi
import uz.gita.mobilbanking.data.source.remote.api.ProfileApi
import uz.gita.mobilbanking.domain.repository.AuthRepository
import uz.gita.mobilbanking.domain.repository.ProfileRepository
import uz.gita.mobilbanking.domain.repository.impl.AuthRepositoryImpl
import uz.gita.mobilbanking.domain.repository.impl.ProfileRepositoryImpl
import javax.inject.Named

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {

    @Binds
   // @Named ()
    fun provideAuthRepository(impl: AuthRepositoryImpl): AuthRepository

    @Binds
    fun provideProfileRepository(impl: ProfileRepositoryImpl): ProfileRepository

}