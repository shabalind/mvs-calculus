  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  struct s2 {
    var p0: [s1]
  }
  struct s4 {
    var p0: [[s1]]
    var p1: s2
  }
  struct s5 {
    var p0: Double
    var p1: [s4]
  }
  struct s6 {
    var p0: s0
    var p1: s4
  }
  struct s8 {
    var p0: [s5]
    var p1: [s0]
  }
  @inline(never)
  func f0(_ v0: s6, _ v1: [s8], _ v2: Double) -> Double {
    let v3: s8 = v1[0]
    let v5: s4 = v0.p1
    let v12: s8 = v1[0]
    let v8: s0 = v0.p0
    let v6: [s5] = v3.p0
    var v14: s8 = v3
    v14.p0 = v6
    v14.p0 = v6
    let v18: [s0] = v3.p1
    var v20: [s8] = v1
    var v17: [s8] = v1
    let v16: s8 = v20[0]
    v20[0] = v3
    let v26: [s0] = v14.p1
    let v27: s0 = v26[0]
    v14.p0 = v6
    let v11: [[s1]] = v5.p0
    var v25: s0 = v8
    v20 = v17
    v14.p1 = v26
    v20[0] = v14
    let v41: [s1] = v11[0]
    v20 = v1
    let v39: s0 = v18[2]
    let v42: [[Double]] = v39.p1
    let v45: [s5] = v16.p0
    let v38: s1 = v41[0]
    let v50: [[Double]] = v25.p0
    v17[1] = v16
    var v71: [[Double]] = v50
    let v74: [[Double]] = v25.p1
    v25.p0 = v50
    let v78: [Double] = v42[0]
    let v65: [s0] = v38.p0
    v17 = v20
    let v89: [Double] = v71[0]
    v14.p0 = v45
    let v69: Double = v89[0]
    let v84: Double = v2 - v69
    v25.p0 = v74
    v17[1] = v12
    let v112: s0 = v65[0]
    let v106: [[Double]] = v112.p1
    let v253: [[Double]] = v27.p0
    v25.p0 = v253
    v25.p0 = v106
    v71[0] = v78
    return v84
  }
  func benchmark() {
    let v0: s6 = s6(p0: s0(p0: [[0.0]], p1: [[1.0]]), p1: s4(p0: [[s1(p0: [s0(p0: [[2.0]], p1: [[3.0]])], p1: s0(p0: [[4.0]], p1: [[5.0]]))]], p1: s2(p0: [s1(p0: [s0(p0: [[6.0]], p1: [[7.0]])], p1: s0(p0: [[8.0]], p1: [[9.0]])), s1(p0: [s0(p0: [[10.0]], p1: [[11.0]])], p1: s0(p0: [[12.0]], p1: [[13.0]]))])))
    let v1: [s8] = [s8(p0: [s5(p0: 14.0, p1: [s4(p0: [[s1(p0: [s0(p0: [[15.0]], p1: [[16.0]])], p1: s0(p0: [[17.0]], p1: [[18.0]]))]], p1: s2(p0: [s1(p0: [s0(p0: [[19.0]], p1: [[20.0]])], p1: s0(p0: [[21.0]], p1: [[22.0]])), s1(p0: [s0(p0: [[23.0]], p1: [[24.0]])], p1: s0(p0: [[25.0]], p1: [[26.0]]))]))])], p1: [s0(p0: [[27.0]], p1: [[28.0]]), s0(p0: [[29.0]], p1: [[30.0]]), s0(p0: [[31.0]], p1: [[32.0]])]), s8(p0: [s5(p0: 33.0, p1: [s4(p0: [[s1(p0: [s0(p0: [[34.0]], p1: [[35.0]])], p1: s0(p0: [[36.0]], p1: [[37.0]]))]], p1: s2(p0: [s1(p0: [s0(p0: [[38.0]], p1: [[39.0]])], p1: s0(p0: [[40.0]], p1: [[41.0]])), s1(p0: [s0(p0: [[42.0]], p1: [[43.0]])], p1: s0(p0: [[44.0]], p1: [[45.0]]))]))])], p1: [s0(p0: [[46.0]], p1: [[47.0]]), s0(p0: [[48.0]], p1: [[49.0]]), s0(p0: [[50.0]], p1: [[51.0]])])]
    let v2: Double = 52.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 52.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
