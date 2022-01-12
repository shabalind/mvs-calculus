  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s2 {
    var p0: [s0]
    var p1: s0
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: s2, _ v2: s2, _ v3: Double) -> Double {
    let v6: s0 = v1.p1
    let v9: [[Double]] = v6.p1
    let v5: [[Double]] = v6.p0
    let v12: [Double] = v5[0]
    let v41: [Double] = v9[0]
    let v29: Double = v41[0]
    var v49: [Double] = v12
    v49[0] = v3
    var v27: [Double] = v49
    v49[0] = v29
    let v145: Double = v27[0]
    v49[0] = v3
    return v145
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0]], p1: [[1.0]])
    let v1: s2 = s2(p0: [s0(p0: [[2.0]], p1: [[3.0]]), s0(p0: [[4.0]], p1: [[5.0]])], p1: s0(p0: [[6.0]], p1: [[7.0]]))
    let v2: s2 = s2(p0: [s0(p0: [[8.0]], p1: [[9.0]]), s0(p0: [[10.0]], p1: [[11.0]])], p1: s0(p0: [[12.0]], p1: [[13.0]]))
    let v3: Double = 14.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 14.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
