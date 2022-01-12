  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [[s0]]
  }
  struct s2 {
    var p0: [[s0]]
    var p1: s1
  }
  struct s4 {
    var p0: [s0]
    var p1: s2
  }
  @inline(never)
  func f0(_ v0: s4, _ v1: s1, _ v2: [s0], _ v3: Double) -> Double {
    let v13: s0 = v2[0]
    let v12: [[Double]] = v13.p0
    let v20: s0 = v2[0]
    let v21: [[Double]] = v20.p1
    var v35: [[Double]] = v21
    let v80: [Double] = v35[0]
    var v43: [Double] = v80
    let v88: Double = v80[0]
    let v76: [Double] = v12[0]
    let v64: [Double] = v35[0]
    let v65: [Double] = v12[0]
    v35[1] = v43
    let v62: Double = v43[0]
    var v70: [Double] = v80
    let v86: Double = v64[0]
    v43[0] = v88
    let v140: Double = v70[0]
    v70[0] = v86
    v35[1] = v76
    v43[0] = v140
    v35[0] = v65
    return v62
  }
  func benchmark() {
    let v0: s4 = s4(p0: [s0(p0: [[0.0]], p1: [[1.0], [2.0]]), s0(p0: [[3.0]], p1: [[4.0], [5.0]]), s0(p0: [[6.0]], p1: [[7.0], [8.0]])], p1: s2(p0: [[s0(p0: [[9.0]], p1: [[10.0], [11.0]])], [s0(p0: [[12.0]], p1: [[13.0], [14.0]])]], p1: s1(p0: s0(p0: [[15.0]], p1: [[16.0], [17.0]]), p1: [[s0(p0: [[18.0]], p1: [[19.0], [20.0]])], [s0(p0: [[21.0]], p1: [[22.0], [23.0]])]])))
    let v1: s1 = s1(p0: s0(p0: [[24.0]], p1: [[25.0], [26.0]]), p1: [[s0(p0: [[27.0]], p1: [[28.0], [29.0]])], [s0(p0: [[30.0]], p1: [[31.0], [32.0]])]])
    let v2: [s0] = [s0(p0: [[33.0]], p1: [[34.0], [35.0]])]
    let v3: Double = 36.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 36.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
