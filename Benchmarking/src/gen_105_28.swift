  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: [s1]
    var p1: s0
  }
  @inline(never)
  func f0(_ v0: [s2], _ v1: Double) -> Double {
    let v2: s2 = v0[0]
    let v8: s2 = v0[0]
    let v10: s0 = v2.p1
    let v17: s0 = v8.p1
    let v24: [[Double]] = v17.p0
    var v3: [[Double]] = v24
    let v16: [Double] = v3[0]
    let v14: [Double] = v3[0]
    let v9: [[Double]] = v10.p1
    let v15: [Double] = v9[1]
    let v35: [Double] = v3[0]
    let v50: [[Double]] = [v15, v15, v35, v14, v16]
    let v49: [Double] = v50[4]
    let v96: Double = v49[0]
    return v96
  }
  func benchmark() {
    let v0: [s2] = [s2(p0: [s1(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]]), p1: s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]])), s1(p0: s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]]), p1: s0(p0: [[12.0]], p1: [[13.0], [14.0], [15.0]]))], p1: s0(p0: [[16.0]], p1: [[17.0], [18.0], [19.0]]))]
    let v1: Double = 20.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 20.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
