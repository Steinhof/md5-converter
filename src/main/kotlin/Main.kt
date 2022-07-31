import java.nio.file.Files
import java.nio.file.Paths
import java.security.MessageDigest
import kotlin.io.path.writeLines
import org.apache.commons.codec.digest.DigestUtils

fun main(args: Array<String>) {
    val file = Files.readAllLines(Paths.get("w"))
    val newFile = Files.createFile(Paths.get("md5.txt"))

    newFile.writeLines(file.map { DigestUtils.md5Hex(it) })
}