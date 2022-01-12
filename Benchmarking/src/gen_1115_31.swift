  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  struct s4 {
    var p0: [s1]
    var p1: [s1]
  }
  @inline(never)
  func f0(_ v0: [s4], _ v1: Double) -> Double {
    let v7: s4 = v0[0]
    let v15: [s1] = v7.p0
    let v10: s1 = v15[1]
    var v18: s1 = v10
    let v22: s0 = v18.p0
    let v32: [[Double]] = v22.p0
    let v41: [[Double]] = v22.p0
    let v57: [Double] = v41[0]
    let v78: [Double] = v32[0]
    let v67: Double = v78[0]
    let v69: s0 = v10.p0
    v18.p0 = v69
    let v80: Double = v57[0]
    let v244: Double = v67 / v80
    var v170: Double = v244
    return v170
  }
  func benchmark() {
    let v0: [s4] = [s4(p0: [s1(p0: s0(p0: [[0.0]], p1: [[1.0]]), p1: [s0(p0: [[2.0]], p1: [[3.0]]), s0(p0: [[4.0]], p1: [[5.0]]), s0(p0: [[6.0]], p1: [[7.0]])]), s1(p0: s0(p0: [[8.0]], p1: [[9.0]]), p1: [s0(p0: [[10.0]], p1: [[11.0]]), s0(p0: [[12.0]], p1: [[13.0]]), s0(p0: [[14.0]], p1: [[15.0]])])], p1: [s1(p0: s0(p0: [[16.0]], p1: [[17.0]]), p1: [s0(p0: [[18.0]], p1: [[19.0]]), s0(p0: [[20.0]], p1: [[21.0]]), s0(p0: [[22.0]], p1: [[23.0]])]), s1(p0: s0(p0: [[24.0]], p1: [[25.0]]), p1: [s0(p0: [[26.0]], p1: [[27.0]]), s0(p0: [[28.0]], p1: [[29.0]]), s0(p0: [[30.0]], p1: [[31.0]])]), s1(p0: s0(p0: [[32.0]], p1: [[33.0]]), p1: [s0(p0: [[34.0]], p1: [[35.0]]), s0(p0: [[36.0]], p1: [[37.0]]), s0(p0: [[38.0]], p1: [[39.0]])])])]
    let v1: Double = 40.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 40.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
