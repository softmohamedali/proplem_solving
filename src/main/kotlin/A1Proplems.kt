object A1Proplems {
    //https://codeforces.com/contest/231/problem/A
    fun ATeam(){
        val countProplem= readLine()?.toInt()?:0
        var countProplemWillSolve=0
        for (index in 1..countProplem){
            val (a,b,c)= readLine()?.split(" ")!!.map { it.toInt() }
            var itWillSolve=a+b+c
            if (itWillSolve>=2)countProplemWillSolve++
        }
        println(countProplemWillSolve)
    }

    //https://codeforces.com/contest/405/problem/A
    fun AGravityFlip(){
        val columnCount=readLine()?.toInt()?:0

        var arr= readLine()?.split(" ")!!.map { it.toInt() }.toMutableList()
        for (index in 0 until columnCount){
            for (index in 0 until columnCount){
                if (index>0){
                    if (arr[index]<arr[index-1]){
                        val remain=arr[index-1]-arr[index]
                        arr[index-1]=arr[index-1]-remain
                        arr[index]=arr[index]+remain
                    }
                }
            }
        }
        arr.map { println(it) }
    }
}