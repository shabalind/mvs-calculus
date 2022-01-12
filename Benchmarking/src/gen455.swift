  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
    var p3: [[Double]]
  }
  struct s2 {
    var p0: [s0]
    var p1: s0
  }
  func f85(_ v0: Double) -> Double {
    var v5: Double = v0
    let v1: [Double] = [v0, v5]
    let v6: Double = v1[0]
    let v7: Double = v1[1]
    let v10: Double = v1[0]
    let v14: Double = v1[1]
    let v9: Double = v1[0]
    let v12: [Double] = [v6, v5]
    let v34: Double = v12[1]
    let v18: [Double] = [v14, v0, v10, v0, v6, v34]
    var v28: [Double] = v18
    v28[2] = v7
    let v19: Double = v28[4]
    var v38: [Double] = v28
    let v42: Double = v38[2]
    v38[1] = v19
    v5 = v9
    return v42
  }
  @inline(never)
  func f0(_ v0: [s2], _ v1: Double) -> Double {
    var v3: Double = v1
    v3 = v1
    let v2: Double = f85(v1)
    let v5: Double = f85(v1)
    v3 = v5
    var v14: Double = v3
    let v28: Double = v2 / v14
    return v28
  }
  func benchmark() {
    let v0: [s2] = [s2(p0: [s0(p0: [[0.0]], p1: [[1.0]], p2: [[2.0]], p3: [[3.0]])], p1: s0(p0: [[4.0]], p1: [[5.0]], p2: [[6.0]], p3: [[7.0]])), s2(p0: [s0(p0: [[8.0]], p1: [[9.0]], p2: [[10.0]], p3: [[11.0]])], p1: s0(p0: [[12.0]], p1: [[13.0]], p2: [[14.0]], p3: [[15.0]]))]
    let v1: Double = 16.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 16.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
