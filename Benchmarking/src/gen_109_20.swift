  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  struct s2 {
    var p0: [s0]
    var p1: s0
    var p2: [[s1]]
    var p3: [s1]
    var p4: [[s0]]
    var p5: s0
  }
  struct s3 {
    var p0: s0
    var p1: s0
  }
  struct s5 {
    var p0: s0
    var p1: [s2]
  }
  struct s6 {
    var p0: s1
    var p1: s5
  }
  @inline(never)
  func f0(_ v0: s6, _ v1: Double) -> Double {
    let v2: s1 = v0.p0
    let v12: s0 = v2.p0
    let v13: s3 = s3(p0: v12, p1: v12)
    let v14: s0 = v13.p1
    var v22: s0 = v14
    let v10: [[Double]] = v22.p1
    let v25: [Double] = v10[0]
    let v63: Double = v25[0]
    var v39: [Double] = v25
    let v27: Double = v39[0]
    v39[0] = v63
    return v27
  }
  func benchmark() {
    let v0: s6 = s6(p0: s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0]]), p1: [s0(p0: [[3.0], [4.0]], p1: [[5.0]])]), p1: s5(p0: s0(p0: [[6.0], [7.0]], p1: [[8.0]]), p1: [s2(p0: [s0(p0: [[9.0], [10.0]], p1: [[11.0]]), s0(p0: [[12.0], [13.0]], p1: [[14.0]])], p1: s0(p0: [[15.0], [16.0]], p1: [[17.0]]), p2: [[s1(p0: s0(p0: [[18.0], [19.0]], p1: [[20.0]]), p1: [s0(p0: [[21.0], [22.0]], p1: [[23.0]])])], [s1(p0: s0(p0: [[24.0], [25.0]], p1: [[26.0]]), p1: [s0(p0: [[27.0], [28.0]], p1: [[29.0]])])], [s1(p0: s0(p0: [[30.0], [31.0]], p1: [[32.0]]), p1: [s0(p0: [[33.0], [34.0]], p1: [[35.0]])])]], p3: [s1(p0: s0(p0: [[36.0], [37.0]], p1: [[38.0]]), p1: [s0(p0: [[39.0], [40.0]], p1: [[41.0]])]), s1(p0: s0(p0: [[42.0], [43.0]], p1: [[44.0]]), p1: [s0(p0: [[45.0], [46.0]], p1: [[47.0]])]), s1(p0: s0(p0: [[48.0], [49.0]], p1: [[50.0]]), p1: [s0(p0: [[51.0], [52.0]], p1: [[53.0]])])], p4: [[s0(p0: [[54.0], [55.0]], p1: [[56.0]])], [s0(p0: [[57.0], [58.0]], p1: [[59.0]])], [s0(p0: [[60.0], [61.0]], p1: [[62.0]])]], p5: s0(p0: [[63.0], [64.0]], p1: [[65.0]]))]))
    let v1: Double = 66.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 66.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
