  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
    var p2: s0
  }
  struct s2 {
    var p0: [s1]
    var p1: s0
  }
  struct s5 {
    var p0: s1
    var p1: [s2]
  }
  func f10(_ v0: Double) -> Double {
    var v7: Double = v0
    v7 = v0
    var v8: Double = v7
    var v4: Double = v0
    var v10: Double = v8
    var v2: Double = v10
    var v6: Double = v4
    var v3: Double = v2
    var v1: Double = v0
    var v13: Double = v1
    var v14: Double = v13
    v4 = v6
    var v34: Double = v2
    var v23: Double = v34
    var v18: Double = v3
    let v17: [Double] = [v18, v23, v8, v4, v8]
    var v49: [Double] = v17
    v49[2] = v6
    v49[1] = v14
    let v45: Double = v49[2]
    return v45
  }
  @inline(never)
  func f0(_ v0: s5, _ v1: s0, _ v2: Double) -> Double {
    let v4: Double = f10(v2)
    let v18: Double = v4 + v2
    return v18
  }
  func benchmark() {
    let v0: s5 = s5(p0: s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0]]), p1: s0(p0: [[3.0], [4.0]], p1: [[5.0]]), p2: s0(p0: [[6.0], [7.0]], p1: [[8.0]])), p1: [s2(p0: [s1(p0: s0(p0: [[9.0], [10.0]], p1: [[11.0]]), p1: s0(p0: [[12.0], [13.0]], p1: [[14.0]]), p2: s0(p0: [[15.0], [16.0]], p1: [[17.0]])), s1(p0: s0(p0: [[18.0], [19.0]], p1: [[20.0]]), p1: s0(p0: [[21.0], [22.0]], p1: [[23.0]]), p2: s0(p0: [[24.0], [25.0]], p1: [[26.0]]))], p1: s0(p0: [[27.0], [28.0]], p1: [[29.0]])), s2(p0: [s1(p0: s0(p0: [[30.0], [31.0]], p1: [[32.0]]), p1: s0(p0: [[33.0], [34.0]], p1: [[35.0]]), p2: s0(p0: [[36.0], [37.0]], p1: [[38.0]])), s1(p0: s0(p0: [[39.0], [40.0]], p1: [[41.0]]), p1: s0(p0: [[42.0], [43.0]], p1: [[44.0]]), p2: s0(p0: [[45.0], [46.0]], p1: [[47.0]]))], p1: s0(p0: [[48.0], [49.0]], p1: [[50.0]])), s2(p0: [s1(p0: s0(p0: [[51.0], [52.0]], p1: [[53.0]]), p1: s0(p0: [[54.0], [55.0]], p1: [[56.0]]), p2: s0(p0: [[57.0], [58.0]], p1: [[59.0]])), s1(p0: s0(p0: [[60.0], [61.0]], p1: [[62.0]]), p1: s0(p0: [[63.0], [64.0]], p1: [[65.0]]), p2: s0(p0: [[66.0], [67.0]], p1: [[68.0]]))], p1: s0(p0: [[69.0], [70.0]], p1: [[71.0]]))])
    let v1: s0 = s0(p0: [[72.0], [73.0]], p1: [[74.0]])
    let v2: Double = 75.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 75.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
