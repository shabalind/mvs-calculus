  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  func f96(_ v0: Double) -> Double {
    let v3: Double = v0 - v0
    var v4: Double = v0
    var v7: Double = v3
    var v2: Double = v0
    var v8: Double = v0
    var v5: Double = v7
    var v21: Double = v4
    let v12: [Double] = [v2, v21, v8, v5]
    var v17: [Double] = v12
    v4 = v8
    let v23: Double = v17[3]
    v17[2] = v8
    return v23
  }
  @inline(never)
  func f0(_ v0: [[s1]], _ v1: Double) -> Double {
    let v3: Double = f96(v1)
    var v4: Double = v3
    var v10: Double = v4
    let v42: Double = v3 + v4
    let v22: [Double] = [v1, v42, v10]
    let v59: Double = v22[2]
    return v59
  }
  func benchmark() {
    let v0: [[s1]] = [[s1(p0: [s0(p0: [[0.0]], p1: [[1.0]]), s0(p0: [[2.0]], p1: [[3.0]])], p1: s0(p0: [[4.0]], p1: [[5.0]]))], [s1(p0: [s0(p0: [[6.0]], p1: [[7.0]]), s0(p0: [[8.0]], p1: [[9.0]])], p1: s0(p0: [[10.0]], p1: [[11.0]]))], [s1(p0: [s0(p0: [[12.0]], p1: [[13.0]]), s0(p0: [[14.0]], p1: [[15.0]])], p1: s0(p0: [[16.0]], p1: [[17.0]]))]]
    let v1: Double = 18.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 18.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
