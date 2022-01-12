  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s6 {
    var p0: s0
    var p1: s0
  }
  struct s8 {
    var p0: [s6]
    var p1: [[s6]]
  }
  func f13(_ v0: Double) -> Double {
    var v3: Double = v0
    var v4: Double = v0
    v3 = v4
    let v6: [Double] = [v0, v0, v0, v3, v3, v0, v0]
    var v7: [Double] = v6
    var v2: [Double] = v7
    let v38: Double = v2[5]
    return v38
  }
  @inline(never)
  func f0(_ v0: [s8], _ v1: Double) -> Double {
    var v6: Double = v1
    let v22: Double = f13(v6)
    let v28: Double = v22 - v1
    return v28
  }
  func benchmark() {
    let v0: [s8] = [s8(p0: [s6(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0]]), p1: s0(p0: [[3.0]], p1: [[4.0], [5.0]]))], p1: [[s6(p0: s0(p0: [[6.0]], p1: [[7.0], [8.0]]), p1: s0(p0: [[9.0]], p1: [[10.0], [11.0]]))], [s6(p0: s0(p0: [[12.0]], p1: [[13.0], [14.0]]), p1: s0(p0: [[15.0]], p1: [[16.0], [17.0]]))]]), s8(p0: [s6(p0: s0(p0: [[18.0]], p1: [[19.0], [20.0]]), p1: s0(p0: [[21.0]], p1: [[22.0], [23.0]]))], p1: [[s6(p0: s0(p0: [[24.0]], p1: [[25.0], [26.0]]), p1: s0(p0: [[27.0]], p1: [[28.0], [29.0]]))], [s6(p0: s0(p0: [[30.0]], p1: [[31.0], [32.0]]), p1: s0(p0: [[33.0]], p1: [[34.0], [35.0]]))]]), s8(p0: [s6(p0: s0(p0: [[36.0]], p1: [[37.0], [38.0]]), p1: s0(p0: [[39.0]], p1: [[40.0], [41.0]]))], p1: [[s6(p0: s0(p0: [[42.0]], p1: [[43.0], [44.0]]), p1: s0(p0: [[45.0]], p1: [[46.0], [47.0]]))], [s6(p0: s0(p0: [[48.0]], p1: [[49.0], [50.0]]), p1: s0(p0: [[51.0]], p1: [[52.0], [53.0]]))]])]
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
