  import Dispatch
  @inline(never)
  func f0(_ v0: [[Double]], _ v1: Double) -> Double {
    let v7: [Double] = v0[1]
    var v3: Double = v1
    let v4: [Double] = v0[0]
    let v8: [Double] = v0[1]
    var v15: [Double] = v7
    let v9: [Double] = v0[1]
    let v13: [[Double]] = [v8, v7, v9, v4, v8, v15]
    let v11: [Double] = v0[0]
    v15[0] = v3
    let v6: [Double] = v0[1]
    let v18: [Double] = v0[0]
    var v14: [[Double]] = v13
    let v16: Double = v6[0]
    v15[0] = v16
    v14 = v13
    v14[0] = v6
    let v30: [Double] = v0[1]
    v14[0] = v18
    v15[0] = v16
    v14[0] = v11
    let v39: Double = v30[0]
    v15[0] = v39
    let v41: [Double] = v14[3]
    let v219: Double = v41[0]
    return v219
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
