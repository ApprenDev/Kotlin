fun main() {
    val myAlbum : Album = object : Album {
        override fun play() {
            print("Harder, Faster, Stronger")
        }

        override fun showMessageError() {
            print("This is a error")
        }
    }

    myAlbum.play()

    if (1 > 5) {
        myAlbum.showMessageError()
        myAlbum.showMessageError()
        myAlbum.showMessageError()
        myAlbum.showMessageError()
        myAlbum.showMessageError()
        myAlbum.showMessageError()
        myAlbum.showMessageError()
    }

}

interface Album {
    fun play()
    fun showMessageError()
}