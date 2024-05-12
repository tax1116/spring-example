package kr.co.taek.dev.jpa.example

import kr.co.taek.dev.jpa.example.adapter.outbound.jpa.entity.TestDto
import kr.co.taek.dev.jpa.example.adapter.outbound.jpa.entity.TestEntity
import kr.co.taek.dev.jpa.example.adapter.outbound.jpa.repository.TestEntityRepository
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.test.context.junit.jupiter.SpringExtension

@ExtendWith(SpringExtension::class)
@DataJpaTest
class TestEntityTest {

    @Autowired
    private lateinit var testEntityRepository: TestEntityRepository

    @Test
    fun saveTest() {
        // given
        val testEntity = TestEntity(
            dto = TestDto("test")
        )

        // when
        testEntityRepository.save(testEntity)

        // then
        val savedTestEntity = testEntityRepository.findById(testEntity.id)
        assertThat(savedTestEntity).isNotNull
        assertThat(savedTestEntity.get().dto.test).isEqualTo("test")
    }
}
