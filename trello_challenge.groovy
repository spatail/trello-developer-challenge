def letters = 'acdegilmnoprstuw'
def hash = 25377615533200L
def result = []

while (hash != 7) {
    //def idx = (0..<letters.size()).find { (hash - it) % 37 == 0 }
    def idx = (int) (hash % 37)
    hash = (long) ((hash - idx) / 37)
    result << letters[idx]
}

def createHash = { String s ->
    def h = 7L;
    (0..<s.length()).each {
        h = (h * 37 + letters.indexOf(s[it]))
    }
    println h;
}

println result.reverse().join()
println createHash(result.reverse().join())
