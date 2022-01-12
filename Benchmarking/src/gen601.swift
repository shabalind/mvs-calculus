  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  @inline(never)
  func f0(_ v0: [[s0]], _ v1: Double) -> Double {
    var v8: [[s0]] = v0
    let v5: [s0] = v0[2]
    v8[1] = v5
    let v7: [s0] = v8[2]
    v8 = v0
    v8[2] = v5
    let v3: s0 = v7[0]
    let v6: [[Double]] = v3.p1
    let v9: [[Double]] = v3.p0
    let v12: [Double] = v6[0]
    v8[0] = v7
    let v11: [s0] = v8[0]
    var v10: [Double] = v12
    v10[0] = v1
    let v36: [s0] = v8[1]
    v8[1] = v11
    v10[0] = v1
    v8[2] = v36
    v10[0] = v1
    let v18: Double = v10[0]
    let v39: [Double] = v9[1]
    v10[0] = v18
    let v48: Double = v39[0]
    let v44: Double = v18 - v48
    let v54: [s0] = v0[1]
    v8[2] = v54
    v10[0] = v1
    return v44
  }
  func benchmark() {
    let v0: [[s0]] = [[s0(p0: [[0.0], [1.0]], p1: [[2.0]])], [s0(p0: [[3.0], [4.0]], p1: [[5.0]])], [s0(p0: [[6.0], [7.0]], p1: [[8.0]])]]
    let v1: Double = 9.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 9.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
