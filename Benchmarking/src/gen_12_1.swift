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
    var p0: s1
    var p1: s1
  }
  struct s5 {
    var p0: s2
    var p1: s2
  }
  func f21(_ v0: [[Double]]) -> [[Double]] {
    let v5: [Double] = v0[0]
    var v1: [[Double]] = v0
    let v4: [[[Double]]] = [v1, v1, v0, v0]
    let v9: [[Double]] = v4[3]
    v1[0] = v5
    let v20: [Double] = v9[1]
    v1[0] = v20
    let v49: [[[[Double]]]] = [v4, v4, v4, v4, v4, v4, v4]
    let v45: [[[Double]]] = v49[3]
    let v68: [[Double]] = v45[2]
    return v68
  }
  @inline(never)
  func f0(_ v0: s5, _ v1: Double) -> Double {
    let v8: s2 = v0.p1
    let v10: s1 = v8.p0
    let v18: s0 = v10.p0
    let v22: [[Double]] = v18.p0
    let v78: [[Double]] = f21(v22)
    let v37: [Double] = v78[0]
    let v214: Double = v37[0]
    return v214
  }
  func benchmark() {
    let v0: s5 = s5(p0: s2(p0: s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]]), p1: [s0(p0: [[5.0], [6.0]], p1: [[7.0], [8.0], [9.0]]), s0(p0: [[10.0], [11.0]], p1: [[12.0], [13.0], [14.0]])]), p1: s1(p0: s0(p0: [[15.0], [16.0]], p1: [[17.0], [18.0], [19.0]]), p1: [s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0], [24.0]]), s0(p0: [[25.0], [26.0]], p1: [[27.0], [28.0], [29.0]])])), p1: s2(p0: s1(p0: s0(p0: [[30.0], [31.0]], p1: [[32.0], [33.0], [34.0]]), p1: [s0(p0: [[35.0], [36.0]], p1: [[37.0], [38.0], [39.0]]), s0(p0: [[40.0], [41.0]], p1: [[42.0], [43.0], [44.0]])]), p1: s1(p0: s0(p0: [[45.0], [46.0]], p1: [[47.0], [48.0], [49.0]]), p1: [s0(p0: [[50.0], [51.0]], p1: [[52.0], [53.0], [54.0]]), s0(p0: [[55.0], [56.0]], p1: [[57.0], [58.0], [59.0]])])))
    let v1: Double = 60.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 60.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
