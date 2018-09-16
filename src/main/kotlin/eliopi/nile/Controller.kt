package eliopi.nile

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.sql.Date

@RestController
class Controller {

    @Autowired
    private lateinit var posterRepository: PosterRepository

    private val day = 1000 * 60 * 60 * 24

    @RequestMapping("/view")
    fun view(@RequestParam("id") id: Long): Poster? {
        val poster = posterRepository.findById(id)
        return if (poster.isPresent) {
            poster.get()
        } else {
            null
        }
    }

    @RequestMapping("/add")
    fun add(@RequestParam("name") name: String, @RequestParam("about") about: String): Poster =
            posterRepository.save(Poster(name, about, Date(java.util.Date().time + 2 * day)))


}