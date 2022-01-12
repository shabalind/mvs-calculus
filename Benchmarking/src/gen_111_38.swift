  import Dispatch
  @inline(never)
  func f0(_ v0: [[Double]], _ v1: Double) -> Double {
    var v7: Double = v1
    let v5: [Double] = [v1, v7, v1]
    v7 = v1
    var v6: [Double] = v5
    v6[0] = v1
    v6 = v5
    let v13: Double = v6[1]
    v6[2] = v7
    v6[1] = v13
    v6[1] = v1
    var v14: [Double] = v6
    let v22: Double = v5[2]
    let v20: Double = v6[1]
    v6[0] = v1
    let v34: Double = v6[0]
    v6[2] = v34
    v7 = v20
    var v46: [Double] = v14
    v6[0] = v22
    let v62: Double = v46[0]
    return v62
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
