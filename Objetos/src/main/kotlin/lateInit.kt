class DataBase{
    fun openConnection(){
        println("Conexão Estabelecida.")

    }
}


class Server {
    lateinit var db: DataBase

    fun initServer(){
        if(!::db.isInitialized){
            db = DataBase()
        }
        db.openConnection()

    }
}

fun main() {
    val server = Server()
    server.initServer()
}