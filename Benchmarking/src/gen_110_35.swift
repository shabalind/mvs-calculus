  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [s0]
  }
  @inline(never)
  func f0(_ v0: [s1], _ v1: Double) -> Double {
    let v8: s1 = v0[0]
    let v9: [s0] = v8.p1
    let v10: s0 = v9[0]
    let v11: s0 = v9[0]
    let v14: s0 = v9[0]
    var v21: s0 = v11
    let v17: [[Double]] = v10.p0
    v21.p0 = v17
    let v24: [[Double]] = v14.p0
    let v49: [Double] = v24[2]
    var v31: [Double] = v49
    let v54: [[Double]] = v21.p1
    let v36: [Double] = v17[2]
    let v57: [Double] = v54[0]
    let v164: [[Double]] = [v31, v31, v49, v31, v57, v36]
    let v104: [Double] = v164[0]
    let v169: Double = v104[0]
    return v169
  }
  func benchmark() {
    let v0: [s1] = [s1(p0: [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]]), s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]])], p1: [s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]])])]
    let v1: Double = 12.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 12.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
