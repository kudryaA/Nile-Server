package eliopi.nile

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component
import java.sql.Date

@Component
class Service {

    @Autowired
    private lateinit var posterRepository: PosterRepository

    @Scheduled(cron = "0 0 0 * * *")
    fun deleteOldPost() {
        posterRepository.removeOlderThan(Date(java.util.Date().time))
    }
}