  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: s1
    var p1: s1
  }
  struct s3 {
    var p0: [s2]
    var p1: s2
  }
  struct s4 {
    var p0: s2
    var p1: [s2]
  }
  @inline(never)
  func f0(_ v0: [s3], _ v1: [s4], _ v2: Double) -> Double {
    let v4: s4 = v1[1]
    let v5: s2 = v4.p0
    let v14: s1 = v5.p1
    let v17: s0 = v14.p0
    let v11: [[Double]] = v17.p0
    let v27: s0 = v14.p1
    let v61: [Double] = v11[0]
    let v57: [Double] = v11[0]
    let v69: [[Double]] = v27.p0
    let v150: [Double] = v69[0]
    let v77: [[Double]] = [v150, v61, v61, v150, v150, v150, v57]
    let v80: [Double] = v77[0]
    let v124: Double = v80[0]
    return v124
  }
  func benchmark() {
    let v0: [s3] = [s3(p0: [s2(p0: s1(p0: s0(p0: [[0.0]], p1: [[1.0]]), p1: s0(p0: [[2.0]], p1: [[3.0]])), p1: s1(p0: s0(p0: [[4.0]], p1: [[5.0]]), p1: s0(p0: [[6.0]], p1: [[7.0]]))), s2(p0: s1(p0: s0(p0: [[8.0]], p1: [[9.0]]), p1: s0(p0: [[10.0]], p1: [[11.0]])), p1: s1(p0: s0(p0: [[12.0]], p1: [[13.0]]), p1: s0(p0: [[14.0]], p1: [[15.0]])))], p1: s2(p0: s1(p0: s0(p0: [[16.0]], p1: [[17.0]]), p1: s0(p0: [[18.0]], p1: [[19.0]])), p1: s1(p0: s0(p0: [[20.0]], p1: [[21.0]]), p1: s0(p0: [[22.0]], p1: [[23.0]]))))]
    let v1: [s4] = [s4(p0: s2(p0: s1(p0: s0(p0: [[24.0]], p1: [[25.0]]), p1: s0(p0: [[26.0]], p1: [[27.0]])), p1: s1(p0: s0(p0: [[28.0]], p1: [[29.0]]), p1: s0(p0: [[30.0]], p1: [[31.0]]))), p1: [s2(p0: s1(p0: s0(p0: [[32.0]], p1: [[33.0]]), p1: s0(p0: [[34.0]], p1: [[35.0]])), p1: s1(p0: s0(p0: [[36.0]], p1: [[37.0]]), p1: s0(p0: [[38.0]], p1: [[39.0]]))), s2(p0: s1(p0: s0(p0: [[40.0]], p1: [[41.0]]), p1: s0(p0: [[42.0]], p1: [[43.0]])), p1: s1(p0: s0(p0: [[44.0]], p1: [[45.0]]), p1: s0(p0: [[46.0]], p1: [[47.0]])))]), s4(p0: s2(p0: s1(p0: s0(p0: [[48.0]], p1: [[49.0]]), p1: s0(p0: [[50.0]], p1: [[51.0]])), p1: s1(p0: s0(p0: [[52.0]], p1: [[53.0]]), p1: s0(p0: [[54.0]], p1: [[55.0]]))), p1: [s2(p0: s1(p0: s0(p0: [[56.0]], p1: [[57.0]]), p1: s0(p0: [[58.0]], p1: [[59.0]])), p1: s1(p0: s0(p0: [[60.0]], p1: [[61.0]]), p1: s0(p0: [[62.0]], p1: [[63.0]]))), s2(p0: s1(p0: s0(p0: [[64.0]], p1: [[65.0]]), p1: s0(p0: [[66.0]], p1: [[67.0]])), p1: s1(p0: s0(p0: [[68.0]], p1: [[69.0]]), p1: s0(p0: [[70.0]], p1: [[71.0]])))])]
    let v2: Double = 72.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 72.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
