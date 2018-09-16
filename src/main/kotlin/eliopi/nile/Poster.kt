package eliopi.nile

import java.sql.Date
import javax.persistence.*

@Entity
class Poster() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0

    @Column
    lateinit var name: String

    @Column
    lateinit var about: String

    @Column
    lateinit var date: Date

    constructor(name: String, about: String, date: Date): this() {
        this.name = name
        this.about = about
        this.date = date
    }
}