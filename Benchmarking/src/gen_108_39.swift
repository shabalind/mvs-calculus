  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [[s0]]
  }
  struct s2 {
    var p0: s0
    var p1: [s0]
  }
  struct s4 {
    var p0: s2
    var p1: s0
  }
  struct s5 {
    var p0: s1
    var p1: s4
  }
  @inline(never)
  func f0(_ v0: [s5], _ v1: Double) -> Double {
    let v5: s5 = v0[0]
    let v3: s4 = v5.p1
    let v15: s2 = v3.p0
    let v13: s0 = v15.p0
    let v22: s0 = v3.p1
    let v53: [[Double]] = v22.p0
    let v39: [Double] = v53[0]
    let v52: [Double] = v53[1]
    let v49: [[Double]] = v13.p0
    let v58: [Double] = v53[1]
    let v61: [Double] = v49[1]
    let v101: [[Double]] = [v39, v61, v58, v52, v61, v61]
    let v79: [Double] = v101[0]
    let v106: Double = v79[0]
    return v106
  }
  func benchmark() {
    let v0: [s5] = [s5(p0: s1(p0: [s0(p0: [[0.0], [1.0]], p1: [[2.0]]), s0(p0: [[3.0], [4.0]], p1: [[5.0]]), s0(p0: [[6.0], [7.0]], p1: [[8.0]])], p1: [[s0(p0: [[9.0], [10.0]], p1: [[11.0]])]]), p1: s4(p0: s2(p0: s0(p0: [[12.0], [13.0]], p1: [[14.0]]), p1: [s0(p0: [[15.0], [16.0]], p1: [[17.0]]), s0(p0: [[18.0], [19.0]], p1: [[20.0]])]), p1: s0(p0: [[21.0], [22.0]], p1: [[23.0]]))), s5(p0: s1(p0: [s0(p0: [[24.0], [25.0]], p1: [[26.0]]), s0(p0: [[27.0], [28.0]], p1: [[29.0]]), s0(p0: [[30.0], [31.0]], p1: [[32.0]])], p1: [[s0(p0: [[33.0], [34.0]], p1: [[35.0]])]]), p1: s4(p0: s2(p0: s0(p0: [[36.0], [37.0]], p1: [[38.0]]), p1: [s0(p0: [[39.0], [40.0]], p1: [[41.0]]), s0(p0: [[42.0], [43.0]], p1: [[44.0]])]), p1: s0(p0: [[45.0], [46.0]], p1: [[47.0]]))), s5(p0: s1(p0: [s0(p0: [[48.0], [49.0]], p1: [[50.0]]), s0(p0: [[51.0], [52.0]], p1: [[53.0]]), s0(p0: [[54.0], [55.0]], p1: [[56.0]])], p1: [[s0(p0: [[57.0], [58.0]], p1: [[59.0]])]]), p1: s4(p0: s2(p0: s0(p0: [[60.0], [61.0]], p1: [[62.0]]), p1: [s0(p0: [[63.0], [64.0]], p1: [[65.0]]), s0(p0: [[66.0], [67.0]], p1: [[68.0]])]), p1: s0(p0: [[69.0], [70.0]], p1: [[71.0]])))]
    let v1: Double = 72.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 72.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
