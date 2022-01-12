  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s2 {
    var p0: s0
    var p1: s0
  }
  struct s5 {
    var p0: s2
  }
  func f31(_ v0: s5) -> s5 {
    let v3: s2 = v0.p0
    let v7: s5 = s5(p0: v3)
    let v14: s2 = v7.p0
    let v21: [s2] = [v3, v3, v14, v3]
    let v26: s2 = v21[0]
    var v36: s5 = v0
    let v24: s2 = v21[2]
    v36.p0 = v26
    v36.p0 = v24
    var v107: s5 = v36
    return v107
  }
  @inline(never)
  func f0(_ v0: [s5], _ v1: Double) -> Double {
    let v9: s5 = v0[2]
    let v8: s5 = v0[2]
    let v16: s2 = v9.p0
    let v11: s5 = f31(v8)
    let v10: s2 = v11.p0
    let v32: s2 = v9.p0
    var v45: s2 = v16
    v45 = v10
    let v52: s0 = v32.p0
    let v31: s0 = v45.p1
    let v79: [[Double]] = v31.p0
    var v74: s0 = v52
    var v87: [[Double]] = v79
    let v47: [[Double]] = v74.p0
    let v118: [Double] = v87[2]
    let v66: [Double] = v47[2]
    v87[0] = v66
    var v78: [[Double]] = v47
    let v129: [Double] = v79[2]
    v78[2] = v129
    let v132: Double = v118[0]
    let v134: [Double] = v78[0]
    v87[2] = v134
    return v132
  }
  func benchmark() {
    let v0: [s5] = [s5(p0: s2(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]]), p1: s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]]))), s5(p0: s2(p0: s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]]), p1: s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]]))), s5(p0: s2(p0: s0(p0: [[16.0], [17.0], [18.0]], p1: [[19.0]]), p1: s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0]])))]
    let v1: Double = 24.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 24.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
