package com.bina.home.data.repository

import androidx.paging.PagingData
import com.bina.home.data.datasource.CharacterDataSource
import com.bina.home.data.model.CharacterData
import com.bina.home.domain.model.CharacterDomain
import com.bina.home.domain.repository.HomeRepository
import io.mockk.coEvery
import io.mockk.mockk
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test

@OptIn(ExperimentalCoroutinesApi::class)
class HomeRepositoryImplTest {
    private lateinit var dataSource: CharacterDataSource
    private lateinit var repository: HomeRepository

    @Before
    fun setUp() {
        dataSource = mockk()
        repository = HomeRepositoryImpl(dataSource)
    }

    @Test
    fun `given dataSource returns data when getCharacters then emits PagingData with CharacterDomain`() = runTest {
        // Given
        val characterData = CharacterData(1, "Rick", "Alive", "Human", "img")
        val expectedDomain = CharacterDomain(1, "Rick", "Alive", "Human", "img")
        coEvery { dataSource.getCharacters("", 1) } returns listOf(characterData)

        // When
        val flow = repository.getCharacters("")
        val result = flow.first()

        // Then
        assert(result is PagingData<*>)
    }

    @Test
    fun `given dataSource throws exception when getCharacters then emits error`() = runTest {
        // Given
        coEvery { dataSource.getCharacters("", 1) } throws RuntimeException("API error")

        // When
        val flow = repository.getCharacters("")
        val result = runCatching { flow.first() }

        // Then
        assertTrue(result.isFailure)
        assertEquals("API error", result.exceptionOrNull()?.message)
    }
}
