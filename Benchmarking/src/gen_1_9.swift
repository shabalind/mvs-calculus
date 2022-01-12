  import Dispatch
  @inline(never)
  func f0(_ v0: [[Double]], _ v1: Double) -> Double {
    let v4: [Double] = v0[0]
    var v7: [Double] = v4
    var v13: [Double] = v7
    v7[0] = v1
    v7[0] = v1
    var v9: [Double] = v13
    var v20: [Double] = v9
    var v23: [Double] = v20
    var v51: [Double] = v23
    let v120: Double = v51[0]
    return v120
  }
  func benchmark() {
    let v0: [[Double]] = [[0.0]]
    let v1: Double = 1.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 1.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
