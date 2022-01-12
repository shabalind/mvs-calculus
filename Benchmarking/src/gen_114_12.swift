  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s2 {
    var p0: [s0]
    var p1: [s0]
  }
  @inline(never)
  func f0(_ v0: [s2], _ v1: Double) -> Double {
    let v2: s2 = v0[1]
    let v3: [s0] = v2.p1
    let v10: s0 = v3[2]
    let v23: [[Double]] = v10.p0
    let v37: [[Double]] = v10.p0
    let v16: s0 = v3[1]
    var v20: s0 = v16
    let v24: [Double] = v23[0]
    var v28: s0 = v16
    var v25: [[Double]] = v23
    v25[0] = v24
    let v21: [Double] = v37[0]
    v28.p0 = v37
    let v30: [[Double]] = v20.p0
    var v34: s0 = v20
    let v65: [[Double]] = v28.p1
    v25[0] = v21
    let v26: [[Double]] = v10.p0
    let v46: [[Double]] = v20.p0
    v34.p1 = v65
    let v75: [[Double]] = v20.p1
    let v64: [Double] = v65[0]
    v34.p1 = v65
    v28.p0 = v23
    let v136: [[Double]] = v34.p1
    v28.p0 = v46
    v20.p1 = v136
    v34.p0 = v26
    let v84: [[Double]] = v16.p1
    var v69: [[Double]] = v30
    v20.p0 = v25
    let v95: [Double] = v37[0]
    v20.p1 = v84
    v20.p0 = v69
    let v120: Double = v64[0]
    v28.p1 = v65
    v28.p1 = v75
    v69[0] = v95
    return v120
  }
  func benchmark() {
    let v0: [s2] = [s2(p0: [s0(p0: [[0.0]], p1: [[1.0], [2.0]]), s0(p0: [[3.0]], p1: [[4.0], [5.0]]), s0(p0: [[6.0]], p1: [[7.0], [8.0]])], p1: [s0(p0: [[9.0]], p1: [[10.0], [11.0]]), s0(p0: [[12.0]], p1: [[13.0], [14.0]]), s0(p0: [[15.0]], p1: [[16.0], [17.0]])]), s2(p0: [s0(p0: [[18.0]], p1: [[19.0], [20.0]]), s0(p0: [[21.0]], p1: [[22.0], [23.0]]), s0(p0: [[24.0]], p1: [[25.0], [26.0]])], p1: [s0(p0: [[27.0]], p1: [[28.0], [29.0]]), s0(p0: [[30.0]], p1: [[31.0], [32.0]]), s0(p0: [[33.0]], p1: [[34.0], [35.0]])])]
    let v1: Double = 36.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 36.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
