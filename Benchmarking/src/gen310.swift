  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [[s0]]
  }
  struct s7 {
    var p0: s1
  }
  @inline(never)
  func f0(_ v0: [s7], _ v1: Double) -> Double {
    let v15: s7 = v0[0]
    let v10: s1 = v15.p0
    let v36: [[s0]] = v10.p1
    let v31: Double = v1 + v1
    let v26: [s0] = v36[0]
    let v53: s0 = v26[0]
    let v74: [[Double]] = v53.p0
    let v92: [Double] = v74[0]
    let v103: Double = v31 + v1
    var v55: [Double] = v92
    var v88: [Double] = v55
    v55[0] = v103
    let v217: Double = v88[0]
    v55[0] = v31
    return v217
  }
  func benchmark() {
    let v0: [s7] = [s7(p0: s1(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]]), p1: [[s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]])], [s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]])], [s0(p0: [[12.0]], p1: [[13.0], [14.0], [15.0]])]])), s7(p0: s1(p0: s0(p0: [[16.0]], p1: [[17.0], [18.0], [19.0]]), p1: [[s0(p0: [[20.0]], p1: [[21.0], [22.0], [23.0]])], [s0(p0: [[24.0]], p1: [[25.0], [26.0], [27.0]])], [s0(p0: [[28.0]], p1: [[29.0], [30.0], [31.0]])]]))]
    let v1: Double = 32.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 32.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
