package kr.co.taek.dev.jpa.example.adapter.outbound.jpa.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import org.hibernate.annotations.JdbcTypeCode
import org.hibernate.type.SqlTypes

@Entity
class TestEntity(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    @JdbcTypeCode(SqlTypes.JSON)
    val dto: TestDto = TestDto(),
)

class TestDto(
    val test: String = "",
)
