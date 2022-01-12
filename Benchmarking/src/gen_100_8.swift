  import Dispatch
  func f44(_ v0: [Double]) -> [Double] {
    var v7: [Double] = v0
    var v4: [Double] = v0
    var v3: [Double] = v4
    let v5: Double = v7[0]
    let v1: Double = v7[0]
    v4 = v7
    let v2: Double = v7[0]
    let v12: Double = v5 * v1
    v3[0] = v2
    var v11: Double = v12
    v3 = v0
    var v14: Double = v5
    var v18: Double = v1
    var v13: Double = v11
    v3[0] = v13
    v3 = v4
    v3[0] = v13
    v13 = v18
    v7[0] = v12
    var v27: [Double] = v3
    v27[0] = v11
    v27[0] = v14
    v3[0] = v12
    var v37: [Double] = v27
    return v37
  }
  @inline(never)
  func f0(_ v0: [[Double]], _ v1: Double) -> Double {
    let v5: [Double] = v0[2]
    let v16: [Double] = [v1]
    let v12: Double = v5[0]
    let v17: [Double] = f44(v5)
    let v14: Double = v16[0]
    var v28: [Double] = v17
    v28[0] = v12
    let v58: Double = v28[0]
    v28[0] = v14
    return v58
  }
  func benchmark() {
    let v0: [[Double]] = [[0.0], [1.0], [2.0]]
    let v1: Double = 3.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 3.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
