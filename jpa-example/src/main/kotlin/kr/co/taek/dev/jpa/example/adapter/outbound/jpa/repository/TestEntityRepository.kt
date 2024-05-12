package kr.co.taek.dev.jpa.example.adapter.outbound.jpa.repository

import kr.co.taek.dev.jpa.example.adapter.outbound.jpa.entity.TestEntity
import org.springframework.data.jpa.repository.JpaRepository

interface TestEntityRepository : JpaRepository<TestEntity, Long>
