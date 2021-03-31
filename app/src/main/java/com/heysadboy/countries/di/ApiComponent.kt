package com.heysadboy.countries.di

import com.heysadboy.countries.model.CountriesService
import com.heysadboy.countries.viewmodel.ListViewModel
import dagger.Component

@Component(modules = [ApiModule::class])
interface ApiComponent {

    fun inject(service: CountriesService)

    fun inject(viewModel: ListViewModel)
}