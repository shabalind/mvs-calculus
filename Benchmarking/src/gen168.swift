  import Dispatch
  func f103(_ v0: Double) -> Double {
    var v3: Double = v0
    var v4: Double = v0
    let v5: Double = v3 + v4
    let v9: [Double] = [v0, v0]
    var v2: [Double] = v9
    let v11: Double = v9[1]
    let v13: Double = v9[0]
    v2[1] = v11
    v2[0] = v13
    var v14: [Double] = v2
    v14[1] = v5
    v14[0] = v11
    v14[1] = v13
    var v18: [Double] = v14
    let v53: Double = v18[0]
    return v53
  }
  @inline(never)
  func f0(_ v0: [[Double]], _ v1: Double) -> Double {
    let v2: [Double] = v0[1]
    let v4: Double = v1 - v1
    let v3: Double = v4 + v4
    let v11: Double = v2[0]
    let v7: Double = f103(v11)
    var v13: [Double] = v2
    let v16: [Double] = v0[1]
    v13[0] = v4
    v13[0] = v3
    var v18: [Double] = v13
    v13[0] = v7
    let v26: Double = v16[0]
    v13 = v18
    var v47: [Double] = v13
    v47[0] = v26
    let v108: Double = v47[0]
    return v108
  }
  func benchmark() {
    let v0: [[Double]] = [[0.0], [1.0]]
    let v1: Double = 2.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 2.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
