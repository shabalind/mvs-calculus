  import Dispatch
  @inline(never)
  func f0(_ v0: [[Double]], _ v1: [[Double]], _ v2: [[Double]], _ v3: Double) -> Double {
    let v4: [Double] = v2[2]
    let v19: Double = v4[0]
    var v34: Double = v19
    let v50: Double = v19 * v19
    let v92: [Double] = [v50, v50, v34, v3, v3]
    let v84: Double = v92[1]
    var v132: [Double] = v92
    v132[3] = v84
    var v347: [Double] = v132
    let v441: Double = v347[1]
    return v441
  }
  func benchmark() {
    let v0: [[Double]] = [[0.0]]
    let v1: [[Double]] = [[1.0], [2.0]]
    let v2: [[Double]] = [[3.0], [4.0], [5.0]]
    let v3: Double = 6.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 6.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
