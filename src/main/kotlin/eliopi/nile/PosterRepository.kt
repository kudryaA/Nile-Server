package eliopi.nile

import org.springframework.data.repository.CrudRepository
import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import javax.transaction.Transactional


interface PosterRepository: CrudRepository<Poster, Long> {
    @Modifying
    @Transactional
    @Query("DELETE FROM Poster m WHERE m.date < :date")
    fun removeOlderThan(@Param("date") date: java.sql.Date): Int
}