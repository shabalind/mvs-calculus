  import Dispatch
  @inline(never)
  func f0(_ v0: [[Double]], _ v1: [[Double]], _ v2: Double) -> Double {
    var v7: Double = v2
    let v8: [Double] = v1[1]
    let v5: [Double] = v1[1]
    let v9: Double = v8[0]
    let v13: [Double] = [v7, v9, v9]
    let v28: Double = v5[0]
    let v21: Double = v13[0]
    var v50: [Double] = v13
    v50[0] = v28
    let v72: Double = v50[0]
    v7 = v21
    var v208: Double = v72
    return v208
  }
  func benchmark() {
    let v0: [[Double]] = [[0.0], [1.0]]
    let v1: [[Double]] = [[2.0], [3.0], [4.0]]
    let v2: Double = 5.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 5.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
