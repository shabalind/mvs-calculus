  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s4 {
    var p0: [s0]
    var p1: [s0]
  }
  struct s5 {
    var p0: [s0]
    var p1: [[s4]]
  }
  func f26(_ v0: s5, _ v1: s0) -> s0 {
    let v5: [s5] = [v0, v0, v0, v0, v0]
    let v10: s5 = v5[3]
    let v11: [[s4]] = v10.p1
    let v14: [s4] = v11[1]
    let v24: s4 = v14[0]
    let v41: s4 = v14[0]
    var v38: s4 = v41
    let v87: [s0] = v38.p1
    let v56: [s0] = v24.p1
    v38.p1 = v87
    let v119: [s0] = v38.p0
    v38.p1 = v56
    let v90: s0 = v119[0]
    return v90
  }
  @inline(never)
  func f0(_ v0: s4, _ v1: s5, _ v2: s0, _ v3: Double) -> Double {
    let v9: s0 = f26(v1, v2)
    let v40: [[Double]] = v9.p1
    let v149: [Double] = v40[1]
    let v157: Double = v149[0]
    return v157
  }
  func benchmark() {
    let v0: s4 = s4(p0: [s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]]), s0(p0: [[4.0], [5.0]], p1: [[6.0], [7.0]])], p1: [s0(p0: [[8.0], [9.0]], p1: [[10.0], [11.0]])])
    let v1: s5 = s5(p0: [s0(p0: [[12.0], [13.0]], p1: [[14.0], [15.0]]), s0(p0: [[16.0], [17.0]], p1: [[18.0], [19.0]]), s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0]])], p1: [[s4(p0: [s0(p0: [[24.0], [25.0]], p1: [[26.0], [27.0]]), s0(p0: [[28.0], [29.0]], p1: [[30.0], [31.0]])], p1: [s0(p0: [[32.0], [33.0]], p1: [[34.0], [35.0]])])], [s4(p0: [s0(p0: [[36.0], [37.0]], p1: [[38.0], [39.0]]), s0(p0: [[40.0], [41.0]], p1: [[42.0], [43.0]])], p1: [s0(p0: [[44.0], [45.0]], p1: [[46.0], [47.0]])])]])
    let v2: s0 = s0(p0: [[48.0], [49.0]], p1: [[50.0], [51.0]])
    let v3: Double = 52.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 52.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
