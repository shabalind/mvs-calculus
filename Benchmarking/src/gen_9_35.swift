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
    var p0: [s0]
  }
  struct s6 {
    var p0: s2
    var p1: s5
  }
  @inline(never)
  func f0(_ v0: [s6], _ v1: Double) -> Double {
    let v6: s6 = v0[2]
    let v3: s5 = v6.p1
    let v11: [s0] = v3.p0
    let v13: s0 = v11[0]
    let v39: [[Double]] = v13.p1
    let v59: [Double] = v39[0]
    let v61: s0 = v11[0]
    let v48: [[Double]] = v61.p0
    let v68: [Double] = v48[2]
    let v136: Double = v59[0]
    var v174: [Double] = v68
    v174[0] = v136
    let v284: Double = v174[0]
    return v284
  }
  func benchmark() {
    let v0: [s6] = [s6(p0: s2(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0], [5.0]]), p1: s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0], [10.0], [11.0]])), p1: s5(p0: [s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0], [16.0], [17.0]])])), s6(p0: s2(p0: s0(p0: [[18.0], [19.0], [20.0]], p1: [[21.0], [22.0], [23.0]]), p1: s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0], [28.0], [29.0]])), p1: s5(p0: [s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0], [35.0]])])), s6(p0: s2(p0: s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0], [40.0], [41.0]]), p1: s0(p0: [[42.0], [43.0], [44.0]], p1: [[45.0], [46.0], [47.0]])), p1: s5(p0: [s0(p0: [[48.0], [49.0], [50.0]], p1: [[51.0], [52.0], [53.0]])]))]
    let v1: Double = 54.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 54.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
