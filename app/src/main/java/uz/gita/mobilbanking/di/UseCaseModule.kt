package uz.gita.mobilbanking.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import uz.gita.mobilbanking.data.source.local.LocalStorage
import uz.gita.mobilbanking.domain.repository.impl.AuthRepositoryImpl
import uz.gita.mobilbanking.domain.repository.impl.ProfileRepositoryImpl
import uz.gita.mobilbanking.domain.usecase.auth.LoginUseCase
import uz.gita.mobilbanking.domain.usecase.auth.RegisterUseCase
import uz.gita.mobilbanking.domain.usecase.auth.ResetUseCase
import uz.gita.mobilbanking.domain.usecase.auth.VerifyUseCase
import uz.gita.mobilbanking.domain.usecase.auth.impl.LoginUseCaseImpl
import uz.gita.mobilbanking.domain.usecase.auth.impl.RegisterUseCaseImpl
import uz.gita.mobilbanking.domain.usecase.auth.impl.ResetUseCaseImpl
import uz.gita.mobilbanking.domain.usecase.auth.impl.VerifyUseCaseImpl
import uz.gita.mobilbanking.domain.usecase.onCreated.PinUseCase
import uz.gita.mobilbanking.domain.usecase.onCreated.SplashUseCase
import uz.gita.mobilbanking.domain.usecase.onCreated.impl.PinUseCaseImpl
import uz.gita.mobilbanking.domain.usecase.onCreated.impl.SplashUseCaseImpl
import uz.gita.mobilbanking.domain.usecase.setting.PersonalUseCase
import uz.gita.mobilbanking.domain.usecase.setting.SettingsUseCase
import uz.gita.mobilbanking.domain.usecase.setting.impl.PersonalUseCaseImpl
import uz.gita.mobilbanking.domain.usecase.setting.impl.SettingsUseCaseImpl

@Module
@InstallIn(ViewModelComponent::class)
interface UseCaseModule {

    @Binds
    fun provideSplashUseCase(impl: SplashUseCaseImpl):
            SplashUseCase

    @Binds
    fun providePinUsaCase(impl:PinUseCaseImpl):
            PinUseCase

    @Binds
    fun provideLoginUseCase(impl: LoginUseCaseImpl):
            LoginUseCase

    @Binds
    fun provideRegisterUseCase(impl: RegisterUseCaseImpl):
            RegisterUseCase

    @Binds
    fun provideResetUsaCase(impl: ResetUseCaseImpl):
            ResetUseCase

    @Binds
    fun provideVerifyUsaCase(impl: VerifyUseCaseImpl):
            VerifyUseCase

    @Binds
    fun providePersonalUsaCase(impl: PersonalUseCaseImpl):
            PersonalUseCase

    @Binds
    fun provideSettingUsaCase(impl: SettingsUseCaseImpl):
            SettingsUseCase
}