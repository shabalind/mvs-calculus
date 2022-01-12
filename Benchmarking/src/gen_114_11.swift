  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [Double]
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: Double) -> Double {
    let v8: [Double] = [v1, v1, v1, v1]
    let v2: [Double] = [v1, v1]
    let v16: Double = v8[3]
    let v19: Double = v2[0]
    var v10: [Double] = v8
    let v15: Double = v10[2]
    let v24: [Double] = [v16, v19, v19, v15, v15, v19]
    v10 = v8
    var v27: [Double] = v24
    let v70: Double = v27[4]
    v10[1] = v16
    v10[0] = v1
    return v70
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0], [1.0]], p1: [2.0]), s0(p0: [[3.0], [4.0]], p1: [5.0])]
    let v1: Double = 6.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 6.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
